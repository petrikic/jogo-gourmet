package test;

import org.junit.Assert;
import org.junit.Test;

import jogoGourmet.Node;

public class NodeTest {
	
	@Test
	public void testInstanceNode() {
		Node node = new Node("churrasco");
		Assert.assertNotNull(node);
	}
	
	@Test
	public void  testGetYesNode() {
		Node node = new Node("massa");
		Node yNode = new Node("lasanha");
		node.setYesNode(yNode);
		Assert.assertEquals(yNode, node.getYesNode());
	}
	
	@Test
	public void testSetYesNode() {
		Node node = new Node("pizza");
		Node yNode = new Node("churrasco");
		node.setYesNode(yNode);
		Assert.assertEquals(yNode, node.getYesNode());
	}
	
	@Test
	public void testGetNoNode() {
		Node node = new Node("massa");
		Node nNode = new Node("lasanha");
		node.setNoNode(nNode);
		Assert.assertEquals(nNode, node.getNoNode());
	}
	
	@Test
	public void testSetNoNode() {
		Node node = new Node("pizza");
		Node nNode = new Node("churrasco");
		node.setNoNode(nNode);
		Assert.assertEquals(nNode, node.getNoNode());
	}
	
	@Test
	public void testGetParentNode() {
		Node node = new Node("massa");
		Node pNode = new Node("lasanha");
		pNode.setYesNode(node);
		Assert.assertEquals(pNode, node.getParentNode());
	}
	
	@Test
	public void testGetQuestion() {
		String param = "churrasco";
		Node node = new Node(param);
		Assert.assertEquals(param, node.getQuestion());
	}
	
	@Test
	public void testIsYesNode() {
		Node node = new Node("massa");
		Node pNode = new Node("lasanha");
		pNode.setYesNode(node);
		Assert.assertTrue(node.isYesNode());
	}
	
	@Test
	public void testIsLeaf() {
		Node node = new Node("churrasco");
		Assert.assertTrue(node.isLeaf());
	}
}
