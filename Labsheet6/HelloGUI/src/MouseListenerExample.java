// Create a Java Swing application with a JButton. Use a MouseListener to detect when the mouse
// enters and exits the button, changing its text to "Mouse Entered" and "Mouse Exited" respectively.

import java.awt.event.*;
import javax.swing.*;

public class MouseListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Listener Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        JButton button = new JButton("Mouse Exited");

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setText("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setText("Mouse Exited");
            }
        });

        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
