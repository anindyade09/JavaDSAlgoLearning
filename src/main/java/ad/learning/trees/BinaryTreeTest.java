package ad.learning.trees;

/*

     5
   /   \
  3     7
 / \   / \
2   4 6   8

*/
public class BinaryTreeTest {
	public static void main(String[] args) {
		Node root = new Node(5);
		
		root.left = new Node(3);
		root.left.left = new Node(2);
		root.left.right = new Node(4);
		
		root.right = new Node(7);
		root.right.left = new Node(6);
		root.right.right = new Node(8);
		
		System.out.println(root.isBST());
	}
	
}
