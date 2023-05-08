import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class MainPage extends JFrame{

	public MainPage() {
		getContentPane().setBackground(new Color(250, 240, 230));
		getContentPane().setForeground(new Color(224, 255, 255));
		setSize(1042, 709);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(58, 99, 899, 414);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(954, 99, 30, 414);
		getContentPane().add(scrollBar);
		
	}
}
