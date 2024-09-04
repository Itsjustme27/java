import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Currency {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Currency Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 200);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());			
		JLabel nprLabel = new JLabel("Nepali Rupees: ");
		JLabel inrLabel = new JLabel("Indian Rupees: ");
		JLabel usdLabel = new JLabel("Dollar: ");
		
		JButton convertBtn = new JButton("Convert");
		
		JTextField nepaliTxt = new JTextField(20);
		JTextField indianTxt = new JTextField(20);
		JTextField usdTxt = new JTextField(20);
		
		indianTxt.setEditable(false);
		usdTxt.setEditable(false);
		convertBtn.addActionListener(e -> {
			int nepaliValue = Integer.parseInt(nepaliTxt.getText());
			double usdValue = nepaliValue / 133.89;
			double indianValue = nepaliValue / 1.60;
			String indianCurr = String.valueOf(indianValue);
			String usdCurr = String.valueOf(usdValue);
			
			indianTxt.setText(indianCurr);
			usdTxt.setText(usdCurr);
			
		});
		
		panel.add(nprLabel);
		panel.add(nepaliTxt);
		panel.add(inrLabel);
		panel.add(indianTxt);
		panel.add(usdLabel);
		panel.add(usdTxt);
		panel.add(convertBtn);
		frame.add(panel);
		frame.setVisible(true);
	}
}
