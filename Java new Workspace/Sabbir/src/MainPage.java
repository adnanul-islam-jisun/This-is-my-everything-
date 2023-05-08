import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class MainPage extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table_1;
	
	
	public MainPage() {
		
		
	     setBounds(100, 100, 950, 680);
	    // setDefaultCloseOperation(ABORT);
		initcomponent();
		setVisible(true);
	}
	
	
	
	
	public void initcomponent() {
getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(39, 43, 414, 573);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(28, 81, 87, 43);
		panel.add(lblNewLabel);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAuthor.setBounds(28, 153, 87, 43);
		panel.add(lblAuthor);
		
		JLabel lblPublisher = new JLabel("Publisher");
		lblPublisher.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPublisher.setBounds(28, 219, 87, 43);
		panel.add(lblPublisher);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice.setBounds(28, 298, 87, 43);
		panel.add(lblPrice);
		
		textField = new JTextField();
		textField.setBounds(125, 83, 242, 43);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(125, 153, 242, 43);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(125, 219, 242, 43);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(125, 298, 242, 43);
		panel.add(textField_3);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id,Au,Pu,pr;
				try {
					//file2 = new FileWriter("C:\\Users\\adnan\\OneDrive\\Desktop\\New1.txt",true); 
					FileWriter writer=new FileWriter("C:\\Users\\adnan\\OneDrive\\Desktop\\New1.txt",true);
					PrintWriter print =new PrintWriter(writer);
					
					
					id=textField.getText();
					Au=textField_1.getText();
					Pu=textField_2.getText();
					pr=textField_3.getText();
					print.println(id+" "+Au+" "+Pu+" "+pr);
					print.close();
					writer.close();
					
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					
					//file2.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(79, 401, 110, 43);
		panel.add(btnNewButton);
		
		JButton btnLoaddata = new JButton("LoadData");
		btnLoaddata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id,Au,Pu,pr;
				
				try {
					File file = new File("C:\\Users\\adnan\\OneDrive\\Desktop\\New1.txt");
					Scanner scan=new Scanner(file);
					DefaultTableModel model=(DefaultTableModel) table_1.getModel();
					model.setRowCount(0);
					while(scan.hasNext()) {
						
					
					id=scan.next();
					Au=scan.next();
					Pu=scan.next();
					pr=scan.next();
					String[] dataRow= {id,Au,Pu,pr};
					
					model.addRow(dataRow);
					
					}
					scan.close();
					file.exists();
					
				}catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				
				
				
				
				
			}
		});
		btnLoaddata.setBackground(Color.LIGHT_GRAY);
		btnLoaddata.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLoaddata.setBounds(218, 401, 110, 43);
		panel.add(btnLoaddata);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(489, 43, 429, 573);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(56, 51, 343, 434);
		panel_1.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"bookID", "author", "publisher", "Price"
			}
		));
		table_1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		scrollPane.setViewportView(table_1);
	}
			public static void main(String[] args) {
				
				new MainPage(); 
				
				
			}
}
