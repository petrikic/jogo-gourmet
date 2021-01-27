package jogoGourmet;

public class Node implements BinaryNode {
	private Node yesNode;
	private Node noNode;
	private Node parentNode;
	private String question;
	private boolean isYesNode;
	
	public Node(String question) {
		this.question = question;
		this.isYesNode = true;
	}
	
	@Override
	public Node getYesNode() {
		return this.yesNode;
	}
	
	@Override
	public void setYesNode(Node yesNode) {
		this.yesNode = yesNode;
		yesNode.setParentNode(this, true);
	}
	
	@Override
	public Node getNoNode() {
		return this.noNode;
	}
	
	@Override
	public void setNoNode(Node noNode) {
		this.noNode = noNode;
		noNode.setParentNode(this, false);
	}

	private void setParentNode(Node node, boolean isYesNode) {
		this.parentNode = node;
		this.isYesNode = isYesNode;
	}
	
	public Node getParentNode() {
		return this.parentNode;
	}
	
	public String getQuestion() {
		return this.question;
	}
	
	public boolean isYesNode() {
		return this.isYesNode;
	}
	
	@Override
	public boolean isLeaf() {
		return noNode == null && yesNode == null;
	}
}
