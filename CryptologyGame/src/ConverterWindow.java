import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ConverterWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConverterWindow window = new ConverterWindow();
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
	public ConverterWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 990, 639);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 968, 583);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cipher Converters");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(112, 57, 761, 86);
		panel.add(lblNewLabel);
		
		JCheckBox shiftCheckbox = new JCheckBox("Shift Cipher");
		shiftCheckbox.setBounds(40, 282, 161, 29);
		panel.add(shiftCheckbox);
		
		JCheckBox affineCheckbox = new JCheckBox("Affine Cipher");
		affineCheckbox.setBounds(40, 319, 161, 29);
		panel.add(affineCheckbox);
		
		JCheckBox vigenereCheckbox = new JCheckBox("Vigenere Cipher");
		vigenereCheckbox.setBounds(40, 356, 161, 29);
		panel.add(vigenereCheckbox);
		
		JCheckBox hillCheckbox = new JCheckBox("Hill Cipher");
		hillCheckbox.setBounds(40, 393, 161, 29);
		panel.add(hillCheckbox);
		
		JCheckBox RsaCheckbox = new JCheckBox("RSA Cipher");
		RsaCheckbox.setBounds(40, 430, 161, 29);
		panel.add(RsaCheckbox);
		
		JCheckBox elGammalCheckbox = new JCheckBox("El Gammal Cipher");
		elGammalCheckbox.setBounds(40, 467, 161, 29);
		panel.add(elGammalCheckbox);
	}
}
