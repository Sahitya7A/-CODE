import java.util.*;

class BinarySearchTree {
	class Node 
	{
		int val;
		Node left, right;

		public Node(int item)
		{
			val = item;
			left = right = null;
		}
	}

	Node root;

    BinarySearchTree() 
    { 
         root = null; 
    }

    public void insert(int key)
	{
        Node node=new Node(key);
        if(root==null) {
            root = node;
            return;
        }
        Node prev=null;
        Node temp=root;
        while (temp!=null)
		{
            if(temp.val>key){
                prev=temp;
                temp=temp.left;
            }
            else if (temp.val<key){
                prev=temp;
                temp=temp.right;
            }
        }
        if(prev.val>key)
            prev.left=node;
        else prev.right=node;
    }
  
	public void inorder()
	{
        Node temp=root;
        Stack<Node> stack=new Stack<>();
        while (temp!=null||!stack.isEmpty()
		{
            if(temp!=null)
			{
                stack.add(temp);
                temp=temp.left;
            }
            else {
                temp=stack.pop();
                System.out.print(temp.val+" ");
                temp=temp.right;
            }
        }
    }

    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */


        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.print("Inorder: ");
		tree.inorder();
    }
}