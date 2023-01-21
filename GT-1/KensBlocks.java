/*
Little Ken is playing building blocks.As he is too young to play he ends up dropping the blocks than actually building. Assuming all blocks are cubes. Assuming the floor to be the number line (x-axis) , he drops the cubes in the order they are given.

The i-th cube dropped (positions[i] = (x, side-lenght) ), where the base of the cube will be started from x point on the x-axis on the ground.

The block is dropped with the bottom edge parallel to the number line, and from a higher height than all currently landed cubes. We wait for each cube to stick before dropping the next.

The bubes are sticky on their bottom surface and will remain fixed to any positive length surface they touch (either the number line or another cube). Cubes dropped adjacent to each other will not stick together prematurely.

Return a list of heights hts[]. Each height hts[k] represents the current Maximum height of any cube structure we have dropped, after dropping cubes represented by hts[0],hts[1], so on ..hts[k]


Input Format:
-------------
Line-1: An integer N, number of Building-Blocks. 
Next N Lines: Two space separated integers, x-axis value, side-length.

Output Format:
--------------
Print the list of Max heights of the structure formed.


Sample Input-1:
---------------
4
1 3
2 4
5 3
8 3

Sample Output-1:
----------------
[3, 7, 10, 10]


Sample Input-2:
---------------
3
10 10
20 10
30 20

Sample Output-2:
----------------
[10, 10, 20]

******* Testcases *******
case =1
input =3
1 2
3 5
4 6
output =[2, 5, 11]

case =2
input =4 
1 3
2 4
3 7
4 10
output =[3, 7, 14, 24]

case =3
input =6
1 5
3 7
4 6
7 10
8 16
9 20
output =[5, 12, 18, 28, 44, 64]

case =4
input =4
2 3
4 5
6 7
7 8
output =[3, 8, 15, 23]

case =5
input =6
3 4
5 6
6 8
8 10
9 12
10 15
output =[4, 10, 18, 28, 40, 55]

case =6
input =4
1 1
2 1
3 1
4 1
output =[1, 1, 1, 1]

case =7
input =5
1 3
2 10
3 5
4 2
7 8
output =[3, 13, 18, 20, 26]

case =8
input =4
1 4
3 8
4 9
5 12
output =[4, 12, 21, 33]

case =9
input =4
1 3
2 4
5 3
8 3
output =[3, 7, 10, 10]

case =10
input =3
10 10
20 10
30 20
output =[10, 10, 20]

*/
import java.util.*;

class KensBlocks {
    class Node{
        int max;
        int[] range = new int[2];
        boolean isLeaf;
        Node left, right;
        Node(int max, int n1, int n2, boolean isLeaf){
            this.max = max;
            range[0] = n1;
            range[1] = n2;
            this.isLeaf = isLeaf;
        }
        Node(int max, int[] range, boolean isLeaf){
            this(max, range[0], range[1],isLeaf);
        }
    }
    //search will return the max height in the given range
    private int search(Node node, int[] range){
        if(node == null) return 0;
        if(range[0] > node.range[1] || range[1] < node.range[0]) return 0;
        if(node.isLeaf) return node.max;
        else {
            return Math.max(search(node.left, range), search(node.right, range));
        }
    }
    
    private Node update(Node node, int[] range, int val){
        if(node == null) return new Node(val, range, true);
        if(node.range[0] == range[0] && node.range[1] == range[1]) return new Node(val, range, true);
        if(node.isLeaf){
            if(node.range[0] == range[0]){
                node.left = new Node(val, range, true);
                node.right = new Node(node.max, range[1] + 1, node.range[1], true);
            }else if(node.range[1] == range[1]){
                node.left = new Node(node.max, node.range[0], range[0] - 1, true);
                node.right = new Node(val, range, true);
            }else{
                node.left = new Node(node.max, node.range[0], range[1], true);
                node.right = new Node(node.max, range[1] + 1, node.range[1], true);
                node.left = update(node.left, range, val);
            }
            node.isLeaf = false;
        }else{
            if(node.left.range[1] >= range[0])
                node.left = update(node.left, new int[]{range[0], Math.min(range[1], node.left.range[1])},val);
            if(node.right.range[0] <= range[1]){
                node.right = update(node.right, new int[]{Math.max(range[0], node.right.range[0]), range[1]}, val);
            }
        }
        node.max = Math.max(node.max, val);
        return node;
    }
    public List<Integer> maxHeights(int[][] positions) {
        List<Integer> res = new ArrayList<>();
        if(positions.length == 0) return res;
        //find the range of segment tree first
        int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
        for(int[] arr : positions) {min = Math.min(arr[0], min);max = Math.max(arr[1],max);}
        Node root = new Node(0,min,max,true);
        
        for(int[] arr : positions){
            int[] range = new int[]{arr[0], arr[0] + arr[1] - 1};
            int val = search(root, range) + arr[1];
            root = update(root, range, val);
            res.add(root.max);
        }
        return res;
    }
	
	public static void main(String args[] ) {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();   
		int[][] grid=new int[N][2];
		for(int i=0; i<N; i++)
		{
			   grid[i][0] = scan.nextInt();
			   grid[i][1] = scan.nextInt();
		}
		System.out.println(new KensBlocks().maxHeights(grid));
	}
}