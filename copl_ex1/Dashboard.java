package copl_ex1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	JLabel lbluserT;
	private JLabel lblNewLabel_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Dashboard() {
		setTitle("Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 258);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 182, 193));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome back!");
		lblNewLabel.setFont(new Font("Microsoft Himalaya", Font.BOLD, 63));
		lblNewLabel.setBounds(170, 62, 587, 53);
		contentPane.add(lblNewLabel);
		
		lbluserT = new JLabel();
		lbluserT.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lbluserT.setBounds(170, 113, 151, 29);
		contentPane.add(lbluserT);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\ICONS COPL\\usher.png"));
		lblNewLabel_1.setBounds(22, 34, 138, 150);
		contentPane.add(lblNewLabel_1);
	}
}