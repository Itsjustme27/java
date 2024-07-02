// Create a simple Java Swing application that opens a window with the title "Hello GUI". The window
// should have a fixed size of 400x300 pixels and close when the user clicks the close button.
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        frame.setVisible(true);
    }
}