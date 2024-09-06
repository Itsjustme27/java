import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LibraryRegistration {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Library Management System");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		
		JLabel fNameLabel = new JLabel("First Name: ");
		JLabel lNameLabel = new JLabel("Last Name: " );
		JLabel genderLabel = new JLabel("Gender: ");
		JLabel programLabel = new JLabel("Program: ");
		
		JTextField fNameField = new JTextField(20);
		JTextField lNameField = new JTextField(20);
		
		JRadioButton maleBtn = new JRadioButton("Male");
		JRadioButton femaleBtn = new JRadioButton("Female");
		
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(maleBtn);
		genderGroup.add(femaleBtn);
		
		String[] programs = {"BCSIT", "BBA", "BHM"};
		
		JComboBox<String> programDropdown = new JComboBox<>(programs);
		
		String programSelected = (String) programDropdown.getSelectedItem();
		
		
		JButton addBtn = new JButton("Add");
		JButton displayBtn = new JButton("Display");
		
		addBtn.addActionListener(e -> {
			String selectedGender = (maleBtn.isSelected()) ? "Male" : (femaleBtn.isSelected()) ? "Female" : "None";
			try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.dat"))) {
				dos.writeUTF("First Name: " + fNameField.getText());
				dos.writeUTF("Last Name: " + lNameField.getText());
				dos.writeUTF("Gender: " + selectedGender);
				dos.writeUTF("Program: " + programSelected);
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		});
		
		displayBtn.addActionListener(e -> {
			String selectedGender = (maleBtn.isSelected()) ? "Male" : (femaleBtn.isSelected()) ? "Female" : "None";
			JOptionPane.showMessageDialog(frame, "First Name: " + fNameField.getText() + "\n" +
												 "LastName: " + lNameField.getText() + "\n" +
												 "Gender: " + selectedGender + "\n" + 
												 "Program: " + programSelected
			);
		});
		
		JPanel genderPanel = new JPanel();
		genderPanel.add(maleBtn);
		genderPanel.add(femaleBtn);
		genderPanel.setLayout(new FlowLayout());
		
		panel.add(fNameLabel);
		panel.add(fNameField);
		panel.add(lNameLabel);
		panel.add(lNameField);
		panel.add(genderLabel);
		panel.add(genderPanel);
		panel.add(programLabel);
		panel.add(programDropdown);
		panel.add(addBtn);
		panel.add(displayBtn);
		frame.add(panel);
		frame.setVisible(true);
	}
}
