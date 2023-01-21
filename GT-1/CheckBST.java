/*
In a joint family, every person assigned with an ID, an integer value.
and the entire family is arranged in the form of tree.

You will be given the family tree,
Your task is to check whether the family tree is a Binary Search Tree or not.
if it is a BST, read the range [low, high] integer values, 
and print the nodes data between the given range.
Otherwise, print "false".

Implement the class Solution:
	- public boolean checkBST(BinaryTreeNode t) : return boolean value.
	- public void printRange(BinaryTreeNode t, int low,int high):
			print the list of nodes data using in-order traversal

NOTE: 
	- In the given tree, please consider '-1' as null.

Input Format:
-------------
Line-1: space separated integers, values of the tree.
Line-2(if it is BST): print the node data values in the given range [low, high].

Output Format:
--------------
Print the list of nodes in the range(low, high), if tree is BST.
Otherwise, print "false"


Sample Input-1:
---------------
1 2 3 4 5 -1 7

Sample Output-1:
----------------
false


Sample Input-2:
---------------
4 2 6 1 3 -1 7
2 6

Sample Output-2:
----------------
2 3 4 6


******* Testcases *******
case =1
input =8 3 10 1 6 -1 14 -1 -1 4 7
1 10
output =1 3 4 6 7 8 10

case =2
input =4 2 6 1 3 5 7
2 7
output =2 3 4 5 6 7

case =3
input =6 3 9 2 4
3 9
output =3 4 6 9

case =4
input =15 13 20 12 14 18 22 10 -1 -1 -1 -1 -1 21 23
13 18
output =13 14 15 18

case =5
input =50 30 70 23 35 -1 -1 11 25 31 42
11 25
output =11 23 25

case =6
input =1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
output =false

case =7
input =45 32 47 22 35 46 62 6 30 -1 -1 -1 -1 -1 80
6 62
output =6 22 30 32 35 45 46 47 62

case =8
input =12 16 17 18 14 5 9 13 15 17 19 10 8 6 3 2 4 11
output =false

case =9
input =1 2 3 4 5 -1 7
output =false

case =10
input =4 2 6 1 3 -1 7
2 6
output =2 3 4 6

*/

import java.util.*;

class BinaryTreeNode{
	public int data; 
	public BinaryTreeNode left, right; 
	public BinaryTreeNode(int data){
		this.data = data; 
		left = null; 
		right = null; 
	}
}

class Solution {
	private int prev=Integer.MIN_VALUE;
	public boolean checkBST(BinaryTreeNode t) {
        return isBST(t);
    }
    public boolean isBST(BinaryTreeNode t){
        if(t==null || t.data == -1)
            return true;
        if(!isBST(t.left))
			return false;
		if(t.data<prev && t.data!=-1)
			return false;
		prev = t.data;
		return isBST(t.right);
    }
	
	public void printRange(BinaryTreeNode t, int low,int high) {
		if(t == null || t.data==-1)
			return;
		if(t.data>=low)
			printRange(t.left,low,high);
		if(t.data>=low && t.data<=high)
			System.out.print(t.data+" ");
		if(t.data <= high)
			printRange(t.right,low,high);
	}
}

public class CheckBST{
	static BinaryTreeNode root;
	static BinaryTreeNode temp = root;
	void insert(BinaryTreeNode temp, int key)
    {
 
        if (temp == null) {
            root = new BinaryTreeNode(key);
            return;
        }
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.add(temp);
 
        // Do level order traversal until we find
        // an empty place.
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
 
            if (temp.left == null) {
                temp.left = new BinaryTreeNode(key);
                break;
            }
            else
                q.add(temp.left);
 
            if (temp.right == null) {
                temp.right = new BinaryTreeNode(key);
                break;
            }
            else
                q.add(temp.right);
        }
    }
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str[]=sc.nextLine().split(" ");
		CheckBST cs=new CheckBST();
		root=new BinaryTreeNode(Integer.parseInt(str[0]));
		for(int i=1; i<str.length; i++)
			cs.insert(root,Integer.parseInt(str[i]));
		Solution sol= new Solution();
		boolean res=sol.checkBST(root);
		if(res){
			int low=sc.nextInt();
			int high=sc.nextInt();
			sol.printRange(root,low,high);
		}
		else
			System.out.println(res);
	}
}