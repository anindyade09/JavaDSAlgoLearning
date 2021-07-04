package ad.learning.trees;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NodeTest {
	
	Node root = new Node(5);

	@Before
	public void setUp() throws Exception {
		/*
	     5
	   /   \
	  3     7
	 / \   / \
	2   4 6   8
	*/
		
		// Creating the tree as mentioned above
		root.left = new Node(3);
		root.right = new Node(7);

		root.left.left = new Node(2);
		root.left.right = new Node(4);

		root.right.left = new Node(6);
		root.right.right = new Node(8);
	}

	@Test
	public void testLevelOrder() {
		root.traverseLevelOrder();
	}

}
