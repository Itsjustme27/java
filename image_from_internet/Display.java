import javax.swing.*;
import java.net.URL;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class Display {
	public static void main(String[] args) {
		try{
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(500, 400);
			String path = "https://letsenhance.io/static/8f5e523ee6b2479e26ecc91b9c25261e/1015f/MainAfter.jpg";
			URL url = new URL(path);
			BufferedImage image = ImageIO.read(url);
			JLabel  label = new JLabel(new ImageIcon(image));
			JPanel panel = new JPanel();
			JTextField textArea = new JTextField(20);
			JButton button = new JButton("Display Image!");

			panel.add(textArea);
			panel.add(button);
			panel.add(label);
			frame.add(panel);
			frame.setVisible(true);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
