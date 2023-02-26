package LMS_Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class MainScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel Sidepanel = new JPanel();
		Sidepanel.setBackground(new Color(0, 0, 64));
		
		JPanel HomePanel = new JPanel();
		HomePanel.setBackground(new Color(255, 255, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(Sidepanel, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(HomePanel, GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(Sidepanel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
				.addComponent(HomePanel, GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
		);
		
		JPanel HeaderPanel = new JPanel();
		HeaderPanel.setBackground(new Color(255, 255, 0));
		
		JPanel panel = new JPanel();
		GroupLayout gl_HomePanel = new GroupLayout(HomePanel);
		gl_HomePanel.setHorizontalGroup(
			gl_HomePanel.createParallelGroup(Alignment.LEADING)
				.addComponent(HeaderPanel, GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
		);
		gl_HomePanel.setVerticalGroup(
			gl_HomePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_HomePanel.createSequentialGroup()
					.addComponent(HeaderPanel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE))
		);
		
		JLabel UserIcon = new JLabel("");
		UserIcon.setHorizontalAlignment(SwingConstants.CENTER);
		UserIcon.setIcon(new ImageIcon(MainScreen.class.getResource("/images/icons8-user-48.png")));
		
		JLabel lblNewLabel = new JLabel("Welcome , ");
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		JLabel lblLibraryManagementSystem = new JLabel("Library Management System");
		lblLibraryManagementSystem.setForeground(new Color(0, 0, 0));
		lblLibraryManagementSystem.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		JLabel lblAdmin = new JLabel("Admin");
		lblAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmin.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		GroupLayout gl_HeaderPanel = new GroupLayout(HeaderPanel);
		gl_HeaderPanel.setHorizontalGroup(
			gl_HeaderPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_HeaderPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblLibraryManagementSystem, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 411, Short.MAX_VALUE)
					.addComponent(lblAdmin, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(UserIcon, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_HeaderPanel.setVerticalGroup(
			gl_HeaderPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_HeaderPanel.createSequentialGroup()
					.addGroup(gl_HeaderPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblAdmin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
						.addComponent(UserIcon, GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_HeaderPanel.createSequentialGroup()
					.addGroup(gl_HeaderPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblLibraryManagementSystem, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
					.addContainerGap())
		);
		HeaderPanel.setLayout(gl_HeaderPanel);
		HomePanel.setLayout(gl_HomePanel);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setIcon(new ImageIcon(MainScreen.class.getResource("/images/icons8-home-page-48.png")));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnAddBooks = new JButton("ADD BOOKS");
		btnAddBooks.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddBooks.setIcon(new ImageIcon(MainScreen.class.getResource("/images/icons8-add-book-48.png")));
		btnAddBooks.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		btnAddBooks.setBorder(null);
		btnAddBooks.setBackground(Color.WHITE);
		
		JButton btnAddStudent = new JButton("ADD STUDENT");
		btnAddStudent.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddStudent.setIcon(new ImageIcon(MainScreen.class.getResource("/images/icons8-person-student-48.png")));
		btnAddStudent.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		btnAddStudent.setBorder(null);
		btnAddStudent.setBackground(Color.WHITE);
		
		JButton btnIssueBook = new JButton("ISSUE  BOOK");
		btnIssueBook.setHorizontalAlignment(SwingConstants.LEFT);
		btnIssueBook.setIcon(new ImageIcon(MainScreen.class.getResource("/images/icons8-borrow-book-40.png")));
		btnIssueBook.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		btnIssueBook.setBorder(null);
		btnIssueBook.setBackground(Color.WHITE);
		
		JButton btnReturnBook = new JButton("RETURN BOOK");
		btnReturnBook.setHorizontalAlignment(SwingConstants.LEFT);
		btnReturnBook.setIcon(new ImageIcon(MainScreen.class.getResource("/images/icons8-return-book-40.png")));
		btnReturnBook.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		btnReturnBook.setBorder(null);
		btnReturnBook.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_1 = new JLabel("ALPHA");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setIcon(new ImageIcon(MainScreen.class.getResource("/images/icons8-book-shelf-100.png")));
		GroupLayout gl_Sidepanel = new GroupLayout(Sidepanel);
		gl_Sidepanel.setHorizontalGroup(
			gl_Sidepanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Sidepanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Sidepanel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
						.addComponent(btnAddBooks, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAddStudent, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnReturnBook, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
				.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
		);
		gl_Sidepanel.setVerticalGroup(
			gl_Sidepanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Sidepanel.createSequentialGroup()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnAddBooks, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnAddStudent, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnReturnBook, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(240, Short.MAX_VALUE))
		);
		Sidepanel.setLayout(gl_Sidepanel);
		contentPane.setLayout(gl_contentPane);
	}

}
