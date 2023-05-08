package GUI;



import javax.swing.JFrame;
import javax.management.remote.SubjectDelegationPermission;
import javax.sql.rowset.JoinRowSet;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;


public class LoginFrame extends JFrame {
	private JTextField Name;
	private JTextField ID;
	String name;
	String id;
	
	FileHandel file = new FileHandel();
	
	public LoginFrame(String in) {
		super(in);
		getContentPane().setBackground(new Color(250, 240, 230));
		getContentPane().setForeground(new Color(224, 255, 255));
		setSize(756, 698);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 222, 179));
		panel.setBounds(144, 113, 457, 439);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		Name = new JTextField();
		
		
		Name.setBounds(116, 150, 228, 44);
		panel.add(Name);
		Name.setColumns(10);
		
		ID = new JTextField();
		
		ID.setBounds(116, 228, 228, 44);
		panel.add(ID);
		ID.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Login Form");
		lblNewLabel.setBounds(154, 24, 145, 59);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(35, 150, 75, 44);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(35, 228, 75, 44);
		panel.add(lblNewLabel_2);
		
		JButton SignUp = new JButton("Signe UP");
		SignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SignUpPage("Sign Up Page");
				dispose();
			}
		});
		SignUp.setBackground(new Color(248, 248, 255));
		SignUp.setFont(new Font("Tahoma", Font.PLAIN, 10));
		SignUp.setBounds(183, 335, 86, 33);
		panel.add(SignUp);
		
		JLabel lblNewLabel_3 = new JLabel("Not a member?");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(74, 330, 110, 39);
		panel.add(lblNewLabel_3);
		
		JButton sigin = new JButton("Sign In");
		sigin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					id=ID.getText();
					name= Name.getText();
					boolean t= file.Check(name, id);
					if(t) {
						
						JOptionPane.showMessageDialog(null, "User logged in successfully",
					               "Data Check", JOptionPane.PLAIN_MESSAGE);
					}
					else if(!t) 
					{
						JOptionPane.showMessageDialog(null, "Username or password not matching",
					               "Data Check", JOptionPane.ERROR_MESSAGE);
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		sigin.setFont(new Font("Tahoma", Font.BOLD, 15));
		sigin.setBounds(183, 282, 111, 33);
		panel.add(sigin);
		
		
		setVisible(true);
		
		
	}
}
