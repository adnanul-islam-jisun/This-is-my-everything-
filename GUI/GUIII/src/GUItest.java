import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Choice;
import java.awt.List;
import java.awt.Panel;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Scrollbar;
import javax.swing.JRadioButton;

public class GUItest extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	GUItest(String str){
		super(str);
		setBounds(50,100,750,550);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 21, 690, 203);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 35, 94, 36);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(114, 38, 200, 36);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(325, 35, 94, 36);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(416, 38, 248, 36);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Title:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(55, 92, 94, 36);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(114, 95, 200, 36);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nickname:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(325, 92, 86, 36);
		panel.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(421, 98, 243, 30);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Format:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(37, 138, 67, 36);
		panel.add(lblNewLabel_4);
		
		Choice choice = new Choice();
		choice.setBounds(114, 150, 550, 30);
		choice.add("Item1");
		choice.add("Item2");
		choice.add("Item3");
		choice.add("Item4");
		panel.add(choice);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 234, 690, 208);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		Label label = new Label("E-Address:");
		label.setFont(new Font("Dialog", Font.PLAIN, 14));
		label.setBounds(21, 27, 116, 34);
		panel_1.add(label);
		
		TextField textField_4 = new TextField();
		textField_4.setBounds(113, 27, 387, 34);
		panel_1.add(textField_4);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(531, 10, 107, 34);
		panel_1.add(btnNewButton);
		
		TextField textField_5 = new TextField();
		textField_5.setBounds(133, 82, 367, 82);
		panel_1.add(textField_5);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds(503, 82, 21, 82);
		panel_1.add(scrollbar);
		
		JButton btnNewButton_1 = new JButton("Edit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(531, 54, 107, 34);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Remove");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(531, 98, 107, 34);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("As Default");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_3.setBounds(531, 142, 107, 34);
		panel_1.add(btnNewButton_3);
		
		JLabel lblNewLabel_5 = new JLabel("Main Format:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(21, 170, 116, 38);
		panel_1.add(lblNewLabel_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("HTML");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(143, 177, 103, 21);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Plain Text");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_1.setBounds(248, 177, 103, 21);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Cusom");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_2.setBounds(386, 180, 103, 21);
		panel_1.add(rdbtnNewRadioButton_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(234, 446, 476, 60);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("OK");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setBounds(220, 10, 85, 40);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Cancel");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_5.setBounds(328, 13, 85, 37);
		panel_2.add(btnNewButton_5);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
					
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}


	public static void main(String[] args) {
		new GUItest("Jakaria 011221093");
	
	}

}
