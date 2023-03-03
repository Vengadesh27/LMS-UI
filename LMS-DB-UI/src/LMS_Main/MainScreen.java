package LMS_Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.CardLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainScreen {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
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
	public MainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel SidePanel = new JPanel();
		SidePanel.setBackground(new Color(0, 0, 64));
		
		JLayeredPane Main_Panel = new JLayeredPane();
		Main_Panel.setLayout(new CardLayout(0, 0));
		
		JPanel Home = new JPanel();
		Home.setBackground(new Color(255, 255, 255));
		Main_Panel.add(Home, "name_532175605404600");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 0));
		GroupLayout gl_Home = new GroupLayout(Home);
		gl_Home.setHorizontalGroup(
			gl_Home.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
		);
		gl_Home.setVerticalGroup(
			gl_Home.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Home.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(628, Short.MAX_VALUE))
		);
		Home.setLayout(gl_Home);
		
		JPanel Add_Book = new JPanel();
		Add_Book.setBackground(new Color(0, 0, 255));
		Main_Panel.add(Add_Book, "name_532190679733000");
		
		JPanel Add_student = new JPanel();
		Main_Panel.add(Add_student, "name_532194472337799");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(SidePanel, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(Main_Panel, GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(SidePanel, GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
				.addComponent(Main_Panel, GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
