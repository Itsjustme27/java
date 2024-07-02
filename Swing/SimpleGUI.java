import javax.swing.*;
import java.awt.event.*;

public class SimpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter your name: ");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Submit");
        JButton button2 = new JButton("Click");

        button.addActionListener(e -> {
            String name = textField.getText();
            JOptionPane.showMessageDialog(frame, "Hello, " + name);
        });

        // Add action listener for button2 (Click button)
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 2 clicked!");
            }
        });

        // Add mouse listener for button2 (Click button)
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked on button 2!");
            }
        });

        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(button2);
        frame.add(panel);

        frame.setVisible(true);
    }
}
