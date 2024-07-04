// Create a simple Swing application that simulates a login form. The form should contain JTextField for
// username, JPasswordField for password, and a JButton for submitting. When the button is clicked,
// check if the username is "admin" and the password is "password". Display a message dialog
// indicating success or failure.

import javax.swing.*;

public class login {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();

        JLabel nameLabel = new JLabel("Enter your username: ");
        JLabel passwordLabel = new JLabel("Enter your password: ");

        JTextField userName = new JTextField(20);
        JPasswordField password = new JPasswordField(20);

        JButton login = new JButton("Login");

        login.addActionListener(e -> {
            String username = userName.getText();
            char[] pass = password.getPassword();
            String passString = new String(pass);
            if(username.equals("admin") && passString.equals("password")) {
                JOptionPane.showMessageDialog(frame, "Login Successful! " + "Welcome " + username);
                
            } else {
                JOptionPane.showMessageDialog(frame, "Login Failed! Username OR Password is incorrect!");
            }
        });

        panel.add(nameLabel);
        panel.add(userName);
        panel.add(passwordLabel);
        panel.add(password);
        panel.add(login);

        frame.add(panel);
        frame.setVisible(true);
    }
}
