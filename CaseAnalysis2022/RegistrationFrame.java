import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationFrame {
    static JFrame frame;
    public static void main(String[] args) {
        frame = new JFrame("Registration Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        
        JPanel panel = new JPanel();

        JLabel idLabel = new JLabel("ID");
        JLabel nameLabel = new JLabel("Name");
        JLabel mobileLabel = new JLabel("Mobile");
        JLabel addressLabel = new JLabel("Address");

        JTextField idField = new JTextField(20);
        JTextField nameField = new JTextField(20);
        JTextField mobileField = new JTextField(20);
        JTextField addressField = new JTextField(20);

        JButton addButton = new JButton("Add");
        JButton resetButton = new JButton("Reset");
        JButton closeButton = new JButton("Close");

        addButton.addActionListener(e-> {
            JOptionPane.showMessageDialog(frame, "ID: " + idField.getText() + " " + 
                                            "Name: " + nameField.getText() + " "
                                            +"Mobile: " + mobileField.getText() + " "
                                            +"Address: " + addressField.getText()); 
        });
   
        resetButton.addActionListener(e-> {
            idField.setText(null);
            nameField.setText(null);
            mobileField.setText(null);
            addressField.setText(null);
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

        panel.setLayout(new GridLayout(3,2));
        panel.add(idLabel);
        panel.add(idField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(mobileLabel);
        panel.add(mobileField);
        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(addButton);
        panel.add(resetButton);
        panel.add(closeButton);
        frame.add(panel);
        frame.setVisible(true);
    }
}
