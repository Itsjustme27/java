// Create a Java Swing application that contains a JButton labeled "Click Me". When the button is
// clicked, a message dialog should display "Button Clicked".

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ClickMe {
    public static void main(String[] args) {
        JFrame frame= new JFrame("Click Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        JPanel panel = new JPanel();
        JButton button = new JButton("Click me");
    
        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(button, "Button Clicked!");
        });
        
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}