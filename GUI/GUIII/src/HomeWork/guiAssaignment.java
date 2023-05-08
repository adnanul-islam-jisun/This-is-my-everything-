package HomeWork;

import java.awt.FlowLayout;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class guiAssaignment extends JFrame {

	private JTextField JTextField;
	private JTextField tf1;
	private JTextField tf2;
	guiAssaignment(){
		initcomponent();
		setVisible(true);
	}
	void initcomponent(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 200, 400, 200);
		setTitle("F");
		getContentPane().setLayout(null);
		
		tf1 = new JTextField();
		tf1.setBounds(59, 43, 96, 19);
		getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(237, 43, 96, 19);
		getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JButton btn = new JButton("Swap");
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String  name = tf1.getText();
				String id = tf2.getText();
				
				String temp = name;
				name  = id ; 
				id =  temp;
				
				int btn = 1;
				if (btn == 1) {

					tf1.setText(name);
					tf2.setText(id);
					
//					
					And c = new And();
				
					guiAssaignment guiAssaignment = new guiAssaignment();
					c.setVisible(true);
					
					
					setVisible(false);
					
					
					

				}
				
				
				
			}
		});
		btn.setBounds(154, 118, 85, 21);
		getContentPane().add(btn);
		JTextField = new JTextField();
		
	}
	public static void main(String[] args) {
		
		new guiAssaignment();	
	}
}
