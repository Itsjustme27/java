import javax.swing.*;
import java.awt.BorderLayout;


public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout");

        JButton button1 = new JButton("NORTH");
        JButton button2 = new JButton("SOUTH");
        JButton button3 = new JButton("EAST");
        JButton button4 = new JButton("WEST");
        JButton button5 = new JButton("CENTER");
        
        //setLayout
        frame.setLayout(new BorderLayout(20,15));
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(button3, BorderLayout.EAST);
        frame.add(button4, BorderLayout.WEST);
        frame.add(button5, BorderLayout.CENTER);

        frame.setSize(300, 300);
        frame.setVisible(true);
    
    }
    

}