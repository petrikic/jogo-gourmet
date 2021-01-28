package jogoGourmet;

import javax.swing.JFrame;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CreateGameInterface extends JFrame {
	private BinaryTree binaryTree;
	private static final long serialVersionUID = 1L;
	private final String message = "O prato que você pensou é ";
	private final String foodQuestion = "Qual prato você pensou?";
	
	public static void main(String args[]) {
		CreateGameInterface gameInterface = new CreateGameInterface();
		gameInterface.createInterface();
	}
	
	private CreateGameInterface() {
		setupTree();
	}
	
	private void setupTree() {
		Node root = new Node("massa");
		Node yesNode = new Node("lasanha");
		Node noNode = new Node("bolo de chocolate");
		binaryTree = new BinaryTree(root, yesNode, noNode);
	}

	private void createInterface() {
		this.setTitle("Jogo Gourmet");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, 3));
        panel.setBorder(new EmptyBorder(20, 50, 20, 50));
        JButton button = new JButton("OK");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				showDialog();
				
			}
		});
        JLabel label = new JLabel("Pense em um prato que gosta");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setBorder(new EmptyBorder(0,0,10,0));
        panel.add(label);
        panel.add(button);
        this.setContentPane(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
	}
	
	private void showDialog() {
		String question = binaryTree.getNodeValue();
		boolean response = JOptionPane.showConfirmDialog(this,
				this.message + question + "?", "Confirm", JOptionPane.YES_OPTION) == 0;
		boolean isLeaf = binaryTree.anwser(response);
		
		if(isLeaf) {
			compareDish();
		} else {			
			showDialog();
		}
	}
	
	private void compareDish() {
		String question = binaryTree.getNodeValue();
		int response = JOptionPane.showConfirmDialog(this,
				this.message + question + "?", "Confirm", JOptionPane.YES_OPTION);
		if(response == 0) {
			JOptionPane.showMessageDialog(this,
					"Acertei de novo!", "Jogo Gourmet",JOptionPane.INFORMATION_MESSAGE);
		} else {
			String food = JOptionPane.showInputDialog(this, foodQuestion, "Desisto", JOptionPane.QUESTION_MESSAGE);
			String message = JOptionPane.showInputDialog(this,
					food + " é _______ mas " + question + " não.", "Desisto", JOptionPane.QUESTION_MESSAGE);
			binaryTree.addNode(message, food);
		}
		binaryTree.resetIterator();
	}
}
