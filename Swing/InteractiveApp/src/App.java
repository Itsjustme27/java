import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Interactive App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));
		
		JLabel label = new JLabel("Enter text: ");
		JTextField textField = new JTextField(20);
		JTextArea textArea = new JTextArea(5, 20);
		JButton button = new JButton("Show Text");
		
		button.addActionListener(e -> {
			String text = textField.getText();
			textArea.setText(text);
		});
		
		textField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if(!Character.isLetterOrDigit(keyChar)) {
					e.consume();
				}
			}
		});
		
		panel.add(label);
		panel.add(textField);
		panel.add(button);
		panel.add(new JScrollPane(textArea));
		
		frame.add(panel);
		frame.setVisible(true);
	}
}
