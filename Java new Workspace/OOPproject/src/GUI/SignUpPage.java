package GUI;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class SignUpPage extends JFrame { 
	String name;
	String id;
	private JTextField nameup;
	private JTextField idup;
	FileHandel file=new FileHandel();
	
	
	public SignUpPage(String in) {
		super(in);
		getContentPane().setBackground(new Color(250, 240, 230));
		getContentPane().setForeground(new Color(224, 255, 255));
		setSize(756, 698);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBounds(135, 95, 457, 439);
		panel.setLayout(null);
		panel.setBackground(new Color(245, 222, 179));
		
		nameup = new JTextField();
		
		nameup.setColumns(10);
		nameup.setBounds(116, 150, 228, 44);
		
		panel.add(nameup);
		
		idup = new JTextField();
		idup.setColumns(10);
		idup.setBounds(116, 216, 228, 44);
		
		panel.add(idup);
		
		JLabel lblSignupForm = new JLabel("SignUp Form");
		lblSignupForm.setToolTipText("");
		lblSignupForm.setForeground(Color.BLACK);
		lblSignupForm.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblSignupForm.setBounds(154, 24, 155, 59);
		panel.add(lblSignupForm);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(35, 150, 75, 44);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(35, 211, 71, 44);
		panel.add(lblNewLabel_2);
		
		JButton btnLogin = new JButton("LogIn");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginFrame("LogIn Page");
				dispose();
				
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogin.setBackground(new Color(248, 248, 255));
		btnLogin.setBounds(172, 347, 87, 33);
		panel.add(btnLogin);
		
		JLabel lblNewLabel_3 = new JLabel("member?");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(98, 344, 75, 39);
		panel.add(lblNewLabel_3);
		
		JButton signup = new JButton("Sign Up");
		signup.setFont(new Font("Tahoma", Font.BOLD, 12));
		signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					id=idup.getText();
					name = nameup.getText();
					file.Input(name, id);
					JOptionPane.showMessageDialog(null, "Data Enter Complete",
				               "Data Enter", JOptionPane.PLAIN_MESSAGE);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		getContentPane().setLayout(null);
		signup.setBounds(172, 270, 111, 33);
		panel.add(signup);
		getContentPane().add(panel);
		setVisible(true);
		
	}
}
