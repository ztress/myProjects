import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainScreen {

	private JFrame frame;

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
		frame.setBounds(100, 100, 828, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 803, 514);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cryptology Game");
		lblNewLabel.setBounds(95, 16, 591, 96);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 64));
		lblNewLabel.setForeground(Color.WHITE);
		panel.add(lblNewLabel);
		
		JButton btnPractice = new JButton("Practice");
		btnPractice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				String[] args = new String[0];
                PracticeWindow.main(args); // Runs the main of Practice Window
			}
		});
		btnPractice.setFont(new Font("Tahoma", Font.BOLD, 36));
		btnPractice.setBounds(238, 378, 261, 58);
		panel.add(btnPractice);
	}
}
