// Create a Java Swing application that contains a JTextField. Use a KeyListener to detect when a key
// is typed, and display the typed character in a JLabel.

import javax.swing.*;
import java.awt.event.*;


public class KeyListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Key Listener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Type something to change this text");
        JTextField textField = new JTextField(1);

        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                label.setText("Typed Key: "  + keyChar);
            }
        });

        panel.add(label);
        panel.add(textField);
        frame.add(panel);
        frame.setVisible(true);
    }
}
