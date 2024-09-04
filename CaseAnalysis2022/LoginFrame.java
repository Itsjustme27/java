import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();

        JLabel userLabel = new JLabel("User Name");
        JLabel passwordLabel = new JLabel("Password");

        JTextField userField = new JTextField(20);
        JPasswordField passwordField = new JPasswordField(20);

        JButton loginButton = new JButton("Login");
        JButton resetButton = new JButton("Reset");
        JButton closeButton = new JButton("Close");


        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RegistrationFrame.frame.setVisible(true);
                frame.setVisible(false);
            }
        });

        resetButton.addActionListener(e -> {
            userField.setText(null);
            passwordField.setText(null);
        }); 

        closeButton.addActionListener(e -> {
                        // Show a confirmation dialog
                        int response = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);


                        // If the user clicks "Yes"
                        if (response == JOptionPane.YES_OPTION) {
                            // Close the program
                            System.exit(0);
                        }
        });
            

        panel.add(userLabel);
        panel.add(userField);
        panel.setLayout(new GridLayout(5,3));
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(resetButton);
        panel.add(closeButton);
        frame.add(panel);
        frame.setVisible(true);
    }
}