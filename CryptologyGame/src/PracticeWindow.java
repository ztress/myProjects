import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PracticeWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PracticeWindow window = new PracticeWindow();
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
	public PracticeWindow() {
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
		
		JCheckBox phiCheckbox = new JCheckBox("Phi Function");
		phiCheckbox.setBounds(271, 282, 196, 29);
		panel.add(phiCheckbox);
		
		JLabel lblNewLabel = new JLabel("Choose Your Problems");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(112, 57, 761, 86);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Type");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(157, 206, 139, 35);
		panel.add(lblNewLabel_1);
		
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
		
		JCheckBox rootsCheckbox = new JCheckBox("Roots Mod N");
		rootsCheckbox.setBounds(271, 393, 196, 29);
		panel.add(rootsCheckbox);
		
		JCheckBox inversesCheckbox = new JCheckBox("Inverses Mod N");
		inversesCheckbox.setBounds(271, 356, 196, 29);
		panel.add(inversesCheckbox);
		
		JCheckBox arithmeticCheckbox = new JCheckBox("Arithmetic Mod N");
		arithmeticCheckbox.setBounds(271, 319, 196, 29);
		panel.add(arithmeticCheckbox);
		
		JCheckBox indexCheckbox = new JCheckBox("Index of Coincidence");
		indexCheckbox.setBounds(271, 430, 196, 29);
		panel.add(indexCheckbox);
		
		JCheckBox elGammalCheckbox = new JCheckBox("El Gammal Cipher");
		elGammalCheckbox.setBounds(40, 467, 161, 29);
		panel.add(elGammalCheckbox);
		
		JCheckBox primitiveCheckbox = new JCheckBox("Primitive Roots");
		primitiveCheckbox.setBounds(271, 467, 196, 29);
		panel.add(primitiveCheckbox);
		
		JCheckBox multCheckbox = new JCheckBox("Multiplicative Inverses");
		multCheckbox.setBounds(271, 504, 196, 29);
		panel.add(multCheckbox);
		
		JLabel lblStyle = new JLabel("Style");
		lblStyle.setHorizontalAlignment(SwingConstants.CENTER);
		lblStyle.setForeground(Color.WHITE);
		lblStyle.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblStyle.setBounds(717, 206, 139, 35);
		panel.add(lblStyle);
		
		JCheckBox calcCheckbox = new JCheckBox("Calculator");
		calcCheckbox.setBounds(728, 282, 145, 29);
		panel.add(calcCheckbox);
		
		JCheckBox noCalcCheckbox = new JCheckBox("No Calculator");
		noCalcCheckbox.setBounds(728, 319, 145, 29);
		panel.add(noCalcCheckbox);
	}
}
