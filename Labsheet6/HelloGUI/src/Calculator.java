// Build a simple calculator application using Java Swing that allows the user to add, subtract, multiply,
// and divide two numbers. Use JTextField for input and JButton for operations. 

import javax.swing.*;


public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();

        JLabel num1Label = new JLabel("Enter number 1: ");
        JLabel num2Label = new JLabel("Enter number 2: ");
        JLabel resultLabel = new JLabel("Result: ");

        JButton addButton = new JButton("Addition");
        JButton subtractButton = new JButton("Subtraction");
        JButton multiplyButton = new JButton("Multiply");
        JButton divideButton = new JButton("Divide");

        JTextField textField = new JTextField(1);
        JTextField textField2 = new JTextField(1);

        addButton.addActionListener(e -> {
            int num1 = Integer.parseInt(textField.getText());
            int num2 = Integer.parseInt(textField2.getText());
            int sum = num1 + num2;
            resultLabel.setText("resultLabel : " + sum);
        });

        subtractButton.addActionListener(e -> {
            int num1 = Integer.parseInt(textField.getText());
            int num2 = Integer.parseInt(textField.getText());
            int diff = num1 - num2;
            resultLabel.setText("resultLabel : " + diff);
        });

        multiplyButton.addActionListener(e -> {
            int num1 = Integer.parseInt(textField.getText());
            int num2 = Integer.parseInt(textField.getText());
            int multi = num1 * num2;
            resultLabel.setText("resultLabel : " + multi);
        });

        divideButton.addActionListener(e -> {
            int num1 = Integer.parseInt(textField.getText());
            int num2 = Integer.parseInt(textField.getText());
            int div = num1 + num2;
            resultLabel.setText("resultLabel : " + div);
        });

        panel.add(num1Label);
        panel.add(textField);
        panel.add(num2Label);
        panel.add(textField2);
        panel.add(resultLabel);

        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);

        frame.add(panel);
        frame.setVisible(true);
        
    }
}