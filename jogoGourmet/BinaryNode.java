package jogoGourmet;

public interface BinaryNode {
	
	public Node getYesNode();
	public void setYesNode(Node yesNode);
	public Node getNoNode();
	public void setNoNode(Node noNode);
	public boolean isLeaf();
	
}
