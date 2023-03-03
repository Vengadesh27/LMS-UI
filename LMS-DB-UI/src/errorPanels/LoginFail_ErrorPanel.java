package errorPanels;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFail_ErrorPanel {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFail_ErrorPanel window = new LoginFail_ErrorPanel();
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
	public LoginFail_ErrorPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(232, 232, 232));
		frame.setAlwaysOnTop(true);
		frame.setUndecorated(true);
		frame.setBounds(750, 300, 350, 184);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Wrong User Credentials  ");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblNewLabel.setBounds(8, 56, 334, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblLoginFailed = new JLabel("LogIn Failed !");
		lblLoginFailed.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginFailed.setForeground(new Color(255, 0, 0));
		lblLoginFailed.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblLoginFailed.setBounds(8, 87, 334, 35);
		frame.getContentPane().add(lblLoginFailed);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 0));
		panel.setBounds(0, 0, 350, 35);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblWarningMessage = new JLabel("WARNING MESSAGE");
		lblWarningMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblWarningMessage.setForeground(new Color(0, 0, 0));
		lblWarningMessage.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		lblWarningMessage.setBounds(8, 0, 334, 35);
		panel.add(lblWarningMessage);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 64));
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		btnNewButton.setBounds(83, 132, 191, 35);
		frame.getContentPane().add(btnNewButton);
	}
}
