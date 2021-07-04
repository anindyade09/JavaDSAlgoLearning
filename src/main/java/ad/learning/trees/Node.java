package ad.learning.trees;

import java.util.LinkedList;
import java.util.Queue;

public class Node {
	public int data;
	public Node left;
	public Node right;

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}
	
	/**
	 * Traverse the Tree in Pre-Order.
	 */
	public void traversePreOrder() {
		preOrder(this);
	}

	/**
	 * Traverse the Tree in Pre-Order.
	 * @param node Root of the tree.
	 */
	private void preOrder(Node node) {
		if(null == node) return;
		
		//Print node
		System.out.println(node.data);
		
		//Go to left child node
		preOrder(node.left);
		
		//Go to right child node
		preOrder(node.right);
	}
	
	/**
	 * Traverse the Tree in Level order.
	 */
	public void traverseLevelOrder() {
		levelOrder(this);
	}

	/**
	 * Traverse the sub-tree starting from the node provided in Level Order.
	 * @param node Node (or maybe the root) of the Tree.
	 */
	private void levelOrder(Node node) {
		// If input node / tree is null just return and end the program
		if (null == node)
			return;

		// Queue to keep the Nodes in one level
		Queue<Node> toVisit = new LinkedList<Node>();
		toVisit.add(node); // Adding the first Root node as passed

		// Pop and display Node data and add its children to the Queue till it is Empty
		while (!toVisit.isEmpty()) {
			Node current = toVisit.remove();
			System.out.println(current.data);

			// Add child nodes to the queue if exists for current node
			if (null != current.left) {
				toVisit.add(current.left);
			}
			if (null != current.right) {
				toVisit.add(current.right);
			}
		}

	}

	/**
	 * Checks if the Tree with this Node as Root is valid Binary tree.
	 * @return True if Tree being tested is valid Binary tree. False otherwise.
	 */
	public boolean isBST() {
		return isBST(this, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	/**
	 * Checks if the Tree is a valid Binary tree.
	 * @param node Root of the tree to be tested.
	 * @param minValue Starting value of window of valid values. Start value: Integer.MIN_VALUE.
	 * @param maxValue Ending value of window of valid values. Start value: Integer.MAX_VALUE
	 * @return True if Tree being tested is valid Binary tree. False otherwise.
	 */
	private boolean isBST(Node node, int minValue, int maxValue) {
		if(null == node) 
			return true; //End condition
		
		if(node.getData() < minValue || node.getData() > maxValue)
			return false;
		
		//Note: if Node value is equal, it can be only a left child of root.
		return isBST(node.left, Integer.MIN_VALUE, node.getData()) 
				&& isBST(node.right, node.getData() + 1, Integer.MAX_VALUE);
	}
}