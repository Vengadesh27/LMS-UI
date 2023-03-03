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
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class Main extends JFrame {

	private JPanel contentPane;
	loginpage_LMS login = new loginpage_LMS ();
	JLayeredPane main_panel = new JLayeredPane();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	 
	public void switchPanels(JPanel panel) {
		//JLayeredPane jl = new JLayeredPane();
		main_panel.removeAll();
		main_panel.add(panel);
		main_panel.repaint();
		main_panel.revalidate();
	}
	public Main() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1250, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel Sidepanel = new JPanel();
		Sidepanel.setBackground(new Color(0, 0, 64));
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(Sidepanel, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(main_panel, GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(Sidepanel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(main_panel, GroupLayout.PREFERRED_SIZE, 658, Short.MAX_VALUE)
					.addContainerGap())
		);
		main_panel.setLayout(new CardLayout(0, 0));
		
		JPanel Home_panel = new JPanel();
		Home_panel.setBackground(new Color(64, 128, 128));
		main_panel.add(Home_panel, "name_365505215745600");
		
		JPanel HeaderPanel = new JPanel();
		HeaderPanel.setBackground(Color.YELLOW);
		
		JLabel lblNewLabel = new JLabel("Welcome , ");
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		JLabel lblLibraryManagementSystem = new JLabel("Library Management System");
		lblLibraryManagementSystem.setForeground(Color.BLACK);
		lblLibraryManagementSystem.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		JLabel label_uname = new JLabel("Admin");
		label_uname.setHorizontalAlignment(SwingConstants.RIGHT);
		label_uname.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		JLabel UserIcon = new JLabel("");
		UserIcon.setIcon(new ImageIcon(Main.class.getResource("/images/icons8-user-48.png")));
		UserIcon.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_HeaderPanel = new GroupLayout(HeaderPanel);
		gl_HeaderPanel.setHorizontalGroup(
			gl_HeaderPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_HeaderPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblLibraryManagementSystem, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
					.addComponent(label_uname, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(UserIcon, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_HeaderPanel.setVerticalGroup(
			gl_HeaderPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_HeaderPanel.createSequentialGroup()
					.addGroup(gl_HeaderPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_HeaderPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblLibraryManagementSystem, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
							.addComponent(label_uname, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
						.addComponent(UserIcon, GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE))
					.addContainerGap())
		);
		HeaderPanel.setLayout(gl_HeaderPanel);
		GroupLayout gl_Home_panel = new GroupLayout(Home_panel);
		gl_Home_panel.setHorizontalGroup(
			gl_Home_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(HeaderPanel, GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE)
		);
		gl_Home_panel.setVerticalGroup(
			gl_Home_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Home_panel.createSequentialGroup()
					.addComponent(HeaderPanel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(615, Short.MAX_VALUE))
		);
		Home_panel.setLayout(gl_Home_panel);
		
		JPanel Add_book_panel = new JPanel();
		Add_book_panel.setBackground(new Color(226, 226, 226));
		main_panel.add(Add_book_panel, "name_365509162520500");
		
		JLabel lblNewLabel_2 = new JLabel("Book Name");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_4 = new JLabel("ADD BOOKS TO LIBRARY");
		lblNewLabel_2_4.setForeground(new Color(0, 0, 128));
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4.setFont(new Font("Arial", Font.BOLD, 20));
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(new Color(0, 0, 0));
		
		JTextArea textArea = new JTextArea();
		
		JLabel lblNewLabel_2_4_1 = new JLabel("PREVIEW BOOK DETAILS");
		lblNewLabel_2_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_2_4_1.setFont(new Font("Arial", Font.BOLD, 20));
		
		JLabel lblNewLabel_2_1 = new JLabel("Author Name");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("ISBN");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		
		JLabel lblNewLabel_2_3 = new JLabel("Quantity");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		
		JLabel lblNewLabel_2_5 = new JLabel("Publisher Name");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_5.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		GroupLayout gl_Add_book_panel = new GroupLayout(Add_book_panel);
		gl_Add_book_panel.setHorizontalGroup(
			gl_Add_book_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Add_book_panel.createSequentialGroup()
					.addGroup(gl_Add_book_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Add_book_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2_4, GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
						.addGroup(gl_Add_book_panel.createSequentialGroup()
							.addGap(39)
							.addGroup(gl_Add_book_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Add_book_panel.createSequentialGroup()
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
									.addGap(36))
								.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Add_book_panel.createSequentialGroup()
									.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
									.addGap(33))
								.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Add_book_panel.createSequentialGroup()
									.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
									.addGap(33))
								.addComponent(lblNewLabel_2_3, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Add_book_panel.createSequentialGroup()
									.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
									.addGap(33))
								.addGroup(gl_Add_book_panel.createSequentialGroup()
									.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
									.addGap(33))
								.addComponent(lblNewLabel_2_5, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))))
					.addGap(0)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_Add_book_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2_4_1, GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_Add_book_panel.setVerticalGroup(
			gl_Add_book_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Add_book_panel.createSequentialGroup()
					.addGroup(gl_Add_book_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_Add_book_panel.createSequentialGroup()
							.addGap(26)
							.addComponent(lblNewLabel_2_4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(50)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_2_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_2_3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_2_5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addGap(584))
						.addGroup(gl_Add_book_panel.createSequentialGroup()
							.addGap(27)
							.addComponent(lblNewLabel_2_4_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addGap(79)
							.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
							.addGap(631))
						.addGroup(gl_Add_book_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)))
					.addGap(0))
		);
		Add_book_panel.setLayout(gl_Add_book_panel);
		
		JPanel Add_student_panel = new JPanel();
		Add_student_panel.setBackground(new Color(128, 128, 255));
		main_panel.add(Add_student_panel, "name_366704410192300");
		
		JPanel issueBook_panel = new JPanel();
		issueBook_panel.setBackground(new Color(255, 0, 128));
		main_panel.add(issueBook_panel, "name_366708598451700");
		
		JPanel returnBook_panel = new JPanel();
		returnBook_panel.setBackground(new Color(0, 0, 160));
		main_panel.add(returnBook_panel, "name_366768370595700");
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setIcon(new ImageIcon(Main.class.getResource("/images/icons8-home-page-48.png")));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Home_panel);
				
			}
		});
		
		JButton btnAddBooks = new JButton("ADD BOOKS");
		btnAddBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			switchPanels(Add_book_panel);
				//Add_book_panel.setVisible(true);
			}
		});
		btnAddBooks.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddBooks.setIcon(new ImageIcon(Main.class.getResource("/images/icons8-add-book-48.png")));
		btnAddBooks.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		btnAddBooks.setBorder(null);
		btnAddBooks.setBackground(Color.WHITE);
		
		JButton btnAddStudent = new JButton("ADD STUDENT");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(Add_student_panel);
			}
		});
		btnAddStudent.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddStudent.setIcon(new ImageIcon(Main.class.getResource("/images/icons8-person-student-48.png")));
		btnAddStudent.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		btnAddStudent.setBorder(null);
		btnAddStudent.setBackground(Color.WHITE);
		
		JButton btnIssueBook = new JButton("ISSUE  BOOK");
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(issueBook_panel);
			}
		});
		btnIssueBook.setHorizontalAlignment(SwingConstants.LEFT);
		btnIssueBook.setIcon(new ImageIcon(Main.class.getResource("/images/icons8-borrow-book-40.png")));
		btnIssueBook.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		btnIssueBook.setBorder(null);
		btnIssueBook.setBackground(Color.WHITE);
		
		JButton btnReturnBook = new JButton("RETURN BOOK");
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(returnBook_panel);
			}
		});
		btnReturnBook.setHorizontalAlignment(SwingConstants.LEFT);
		btnReturnBook.setIcon(new ImageIcon(Main.class.getResource("/images/icons8-return-book-40.png")));
		btnReturnBook.setFont(new Font("Segoe UI Variable", Font.BOLD, 18));
		btnReturnBook.setBorder(null);
		btnReturnBook.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_1 = new JLabel("ALPHA");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setIcon(new ImageIcon(Main.class.getResource("/images/icons8-book-shelf-100.png")));
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
