package LMS_Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class loginpage_LMS {

	private JFrame frame;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txt_username;
	private JTextField txt_password;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage_LMS window = new loginpage_LMS();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginpage_LMS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(0, 0, 64));
		frame.setBounds(100, 100, 1068, 659);
		frame.setExtendedState(0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(0, 0, 64));
		lblNewLabel_1.setBounds(8, 12, 658, 552);
		lblNewLabel_1.setIcon(new ImageIcon(loginpage_LMS.class.getResource("/images/main logo bg.png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("LIBRARY MANAGEMENT SYSTEM");
		lblNewLabel_3.setBounds(8, 574, 658, 75);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 24));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblNewLabel_3);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(674, -24, 394, 683);
		frame.getContentPane().add(tabbedPane);
		
		JPanel Login = new JPanel();
		Login.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("New tab", null, Login, null);
		Login.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(352, 0, 34, 31);
		Login.add(btnNewButton_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Welcome Back !");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setForeground(Color.BLACK);
		lblNewLabel_4_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 25));
		lblNewLabel_4_1.setBounds(8, 251, 378, 41);
		Login.add(lblNewLabel_4_1);
		
		JLabel lblLogInTo_1_1 = new JLabel("Log in or register to continue ");
		lblLogInTo_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogInTo_1_1.setForeground(Color.GRAY);
		lblLogInTo_1_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		lblLogInTo_1_1.setBounds(8, 298, 378, 25);
		Login.add(lblLogInTo_1_1);
		
		JLabel lblUserName_2_1 = new JLabel("User Name");
		lblUserName_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblUserName_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		lblUserName_2_1.setBounds(36, 341, 155, 29);
		Login.add(lblUserName_2_1);
		
		txt_username = new JTextField();
		txt_username.setHorizontalAlignment(SwingConstants.CENTER);
		txt_username.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		txt_username.setColumns(10);
		txt_username.setBorder(null);
		txt_username.setBackground(SystemColor.menu);
		txt_username.setBounds(36, 376, 318, 34);
		Login.add(txt_username);
		
		JLabel lblUserName_1_1_1 = new JLabel("Password");
		lblUserName_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblUserName_1_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		lblUserName_1_1_1.setBounds(36, 416, 155, 29);
		Login.add(lblUserName_1_1_1);
		
		txt_password = new JTextField();
		txt_password.setHorizontalAlignment(SwingConstants.CENTER);
		txt_password.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		txt_password.setColumns(10);
		txt_password.setBorder(null);
		txt_password.setBackground(SystemColor.menu);
		txt_password.setBounds(36, 451, 318, 34);
		Login.add(txt_password);
		
		JButton login_btn = new JButton("Log in ");
		login_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainScreen m = new MainScreen();
				m.setVisible(true);
				frame.setVisible(false);
			}
		});
		login_btn.setForeground(Color.WHITE);
		login_btn.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		login_btn.setBorder(null);
		login_btn.setBackground(new Color(0, 0, 128));
		login_btn.setBounds(36, 514, 318, 36);
		Login.add(login_btn);
		
		JButton Register_btn = new JButton("Register");
		Register_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		Register_btn.setForeground(Color.WHITE);
		Register_btn.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		Register_btn.setBorder(null);
		Register_btn.setBackground(Color.RED);
		Register_btn.setBounds(36, 568, 318, 36);
		Login.add(Register_btn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(loginpage_LMS.class.getResource("/images/login image.jpg")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(8, 30, 373, 193);
		Login.add(lblNewLabel);
		
		JPanel Registration = new JPanel();
		Registration.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("New tab", null, Registration, null);
		Registration.setLayout(null);
		
		JLabel lblUserName_2 = new JLabel("User Name");
		lblUserName_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblUserName_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		lblUserName_2.setBounds(35, 177, 155, 29);
		Registration.add(lblUserName_2);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(SystemColor.menu);
		textField_2.setBounds(35, 212, 318, 34);
		Registration.add(textField_2);
		
		JLabel lblUserName_1_1 = new JLabel("Password");
		lblUserName_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblUserName_1_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		lblUserName_1_1.setBounds(35, 252, 155, 29);
		Registration.add(lblUserName_1_1);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBackground(SystemColor.menu);
		textField_3.setBounds(35, 287, 318, 34);
		Registration.add(textField_3);
		
		JButton login_btn_1 = new JButton("Register");
		login_btn_1.setForeground(Color.WHITE);
		login_btn_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		login_btn_1.setBorder(null);
		login_btn_1.setBackground(new Color(0, 0, 128));
		login_btn_1.setBounds(35, 452, 318, 36);
		Registration.add(login_btn_1);
		
		JButton Register_btn_1 = new JButton("Back to login");
		Register_btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		Register_btn_1.setForeground(Color.WHITE);
		Register_btn_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		Register_btn_1.setBorder(null);
		Register_btn_1.setBackground(Color.RED);
		Register_btn_1.setBounds(35, 506, 318, 36);
		Registration.add(Register_btn_1);
		
		JButton btnNewButton_1_1 = new JButton("X");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(355, 0, 34, 31);
		Registration.add(btnNewButton_1_1);
		
		JLabel lblUserName_1_1_2 = new JLabel("Conform Password");
		lblUserName_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblUserName_1_1_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		lblUserName_1_1_2.setBounds(35, 341, 189, 29);
		Registration.add(lblUserName_1_1_2);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBackground(SystemColor.menu);
		textField_4.setBounds(35, 376, 318, 34);
		Registration.add(textField_4);
		
		JLabel lblUserName_2_2 = new JLabel("CREATE ACCOUNT");
		lblUserName_2_2.setForeground(new Color(0, 0, 128));
		lblUserName_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName_2_2.setFont(new Font("Arial Black", Font.BOLD, 21));
		lblUserName_2_2.setBounds(8, 68, 373, 45);
		Registration.add(lblUserName_2_2);
	}
}
