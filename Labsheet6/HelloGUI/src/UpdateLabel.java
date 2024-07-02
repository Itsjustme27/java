// Write a Java Swing application that contains a JLabel and a JTextField. When the user types in the
// text field, the label should update to display the text entered.
import javax.swing.*;


public class UpdateLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Enter Name");
        JTextField textField = new JTextField(20);

        textField.addActionListener(e-> {
            String name = textField.getText();
            label.setText(name);
        });

        panel.add(label);
        panel.add(textField);
        frame.add(panel);
        frame.setVisible(true);
    }
}
