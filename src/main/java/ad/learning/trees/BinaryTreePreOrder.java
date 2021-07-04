package ad.learning.trees;

public class BinaryTreePreOrder {
	
	
/*
     5
   /   \
  3     7
 / \   / \
2   4 6   8
*/
	public static void main(String[] args) {
		//Creating the tree as mentioned above
		Node root = new Node(5);
		root.left = new Node(3);
		root.right = new Node(7);
		
		root.left.left = new Node(2);
		root.left.right = new Node(4);
		
		root.right.left = new Node(6);
		root.right.right = new Node(8);
		
		
		//Traverse Tree Pre-order
		root.traversePreOrder();

	}

}
