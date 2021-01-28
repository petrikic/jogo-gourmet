package jogoGourmet;

public class BinaryTree implements BinaryIterator {
	private Node rootNode;
	private Node iterator;
	
	public BinaryTree(Node root, Node yesNode, Node noNode) {
		this.iterator = this.rootNode = root;
		rootNode.setYesNode(yesNode);
		rootNode.setNoNode(noNode);
	}
	
	public String getNodeValue() {
		return iterator.getQuestion();
	}
	
	public boolean anwser(boolean response) {
		moveIterator(response);
		return iterator.isLeaf();
	}
	
	@Override
	public void moveIterator(boolean moveToYes) {
		if(iterator.isLeaf())
			return;
		if(moveToYes) {
			iterator = iterator.getYesNode();
		} else {
			iterator = iterator.getNoNode();
		}
	}
	
	@Override
	public void resetIterator() {
		this.iterator = this.rootNode;
	}
	
	public void addNode(String message, String food) {
		if(!iterator.isLeaf())
			return;
		Node messageNode = new Node(message);
		Node foodNode = new Node(food);
		if(iterator.isYesNode()) {
			iterator.getParentNode().setYesNode(messageNode);
		} else {
			iterator.getParentNode().setNoNode(messageNode);
		}
		messageNode.setYesNode(foodNode);
		messageNode.setNoNode(iterator);
	}
	
}
