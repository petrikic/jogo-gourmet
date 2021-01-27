package test;

import org.junit.Assert;
import org.junit.Test;

import jogoGourmet.BinaryTree;

public class BinaryTreeTest {
	
	@Test
	public void testInstanceBinaryTree() {
		BinaryTree binaryTree = new BinaryTree();
		Assert.assertNotNull(binaryTree);
	}
	
	@Test
	public void testGetNodeValue() {
		BinaryTree binaryTree = new BinaryTree();
		Assert.assertEquals("massa", binaryTree.getNodeValue());
	}
	
	@Test
	public void testAnwser() {
		BinaryTree binaryTree = new BinaryTree();
		String value = binaryTree.getNodeValue();
		boolean response = binaryTree.anwser(true);
		Assert.assertNotEquals(value, binaryTree.getNodeValue());
		Assert.assertNotNull(response);
	}
	
	@Test
	public void testMoveIterator() {
		BinaryTree binaryTree = new BinaryTree();
		String value = binaryTree.getNodeValue();
		binaryTree.moveIterator(true);
		Assert.assertNotEquals(value, binaryTree.getNodeValue());
	}
	
	@Test
	public void testResetIterator() {
		BinaryTree binaryTree = new BinaryTree();
		String value = binaryTree.getNodeValue();
		binaryTree.moveIterator(true);
		binaryTree.resetIterator();
		Assert.assertEquals(value, binaryTree.getNodeValue());
	}
	
	@Test
	public void testAddNode() {
		BinaryTree binaryTree = new BinaryTree();
		String value = binaryTree.getNodeValue();
		binaryTree.moveIterator(true);
		binaryTree.addNode("com palitinho", "espetinho");
		Assert.assertNotEquals(value, binaryTree.getNodeValue());
	}
	

}
