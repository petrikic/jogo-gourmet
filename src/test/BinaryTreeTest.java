package test;

import org.junit.Assert;
import org.junit.Test;

import jogoGourmet.BinaryTree;
import jogoGourmet.Node;

public class BinaryTreeTest {
	
	@Test
	public void testInstanceBinaryTree() {
		Node root = new Node("massa");
		Node yesNode = new Node("lasanha");
		Node noNode = new Node("bolo de chocolate");
		BinaryTree binaryTree = new BinaryTree(root, yesNode, noNode);
		Assert.assertNotNull(binaryTree);
	}
	
	@Test
	public void testGetNodeValue() {
		Node root = new Node("massa");
		Node yesNode = new Node("lasanha");
		Node noNode = new Node("bolo de chocolate");
		BinaryTree binaryTree = new BinaryTree(root, yesNode, noNode);
		Assert.assertEquals("massa", binaryTree.getNodeValue());
	}
	
	@Test
	public void testAnwser() {
		Node root = new Node("massa");
		Node yesNode = new Node("lasanha");
		Node noNode = new Node("bolo de chocolate");
		BinaryTree binaryTree = new BinaryTree(root, yesNode, noNode);
		String value = binaryTree.getNodeValue();
		boolean response = binaryTree.anwser(true);
		Assert.assertNotEquals(value, binaryTree.getNodeValue());
		Assert.assertNotNull(response);
	}
	
	@Test
	public void testMoveIterator() {
		Node root = new Node("massa");
		Node yesNode = new Node("lasanha");
		Node noNode = new Node("bolo de chocolate");
		BinaryTree binaryTree = new BinaryTree(root, yesNode, noNode);
		String value = binaryTree.getNodeValue();
		binaryTree.moveIterator(true);
		Assert.assertNotEquals(value, binaryTree.getNodeValue());
	}
	
	@Test
	public void testResetIterator() {
		Node root = new Node("massa");
		Node yesNode = new Node("lasanha");
		Node noNode = new Node("bolo de chocolate");
		BinaryTree binaryTree = new BinaryTree(root, yesNode, noNode);
		String value = binaryTree.getNodeValue();
		binaryTree.moveIterator(true);
		binaryTree.resetIterator();
		Assert.assertEquals(value, binaryTree.getNodeValue());
	}
	
	@Test
	public void testAddNode() {
		Node root = new Node("massa");
		Node yesNode = new Node("lasanha");
		Node noNode = new Node("bolo de chocolate");
		BinaryTree binaryTree = new BinaryTree(root, yesNode, noNode);
		String value = binaryTree.getNodeValue();
		binaryTree.moveIterator(true);
		binaryTree.addNode("com palitinho", "espetinho");
		Assert.assertNotEquals(value, binaryTree.getNodeValue());
	}
	

}
