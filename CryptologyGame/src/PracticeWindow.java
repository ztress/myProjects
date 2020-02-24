import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;

import com.sun.javafx.collections.MappingChange.Map;

import javax.swing.event.ChangeEvent;
import java.awt.event.ItemListener;
import java.awt.font.TextAttribute;
import java.awt.event.ItemEvent;

import java.awt.font.TextAttribute;

public class PracticeWindow {

	private JFrame frame;
	static int[] type = new int[12];	// Array that holds selections for each type of problem checkbox 
	static int[] style = new int[2];	// Array that holds selections for each style checkbox (Calc vs no calc)
	

	/**
	 * Launch the application.
	 */
	public static int[] getType()
	{
		return type;
	}
	
	public static int[] getStyle()
	{
		return style;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PracticeWindow window = new PracticeWindow();
					window.frame.setVisible(true);
					
					for(int i=0; i<type.length; i++)
					{
						type[i] = 0;
					}
					
					style[0] = 0;
					style[1] = 0;
					
					
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
		
		
		// When the state of any checkbox is changed, its value in the respective array is changed
		// 1 represents selected, 0 not selected
		
		JLabel lblNewLabel = new JLabel("Choose Your Problems");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(112, 57, 761, 86);
		panel.add(lblNewLabel);
		
		JLabel lblType = new JLabel("Type");
		lblType.setHorizontalAlignment(SwingConstants.CENTER);
		lblType.setText("<HTML><U>Type</U></HTML>");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblType.setForeground(Color.WHITE);
		lblType.setBounds(157, 206, 139, 35);
		panel.add(lblType);
		
		JCheckBox shiftCheckbox = new JCheckBox("Shift Cipher");
		shiftCheckbox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(shiftCheckbox.isSelected())
				{
					type[0] = 1;
				}
				else
				{
					type[0] = 0;
				}
			}
		});
		shiftCheckbox.setBounds(40, 282, 161, 29);
		panel.add(shiftCheckbox);
		
		JCheckBox affineCheckbox = new JCheckBox("Affine Cipher");
		affineCheckbox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(affineCheckbox.isSelected())
				{
					type[1] = 1;
				}
				else
				{
					type[1] = 0;
				}
			}
		});
	
		affineCheckbox.setBounds(40, 319, 161, 29);
		panel.add(affineCheckbox);
		
		JCheckBox vigenereCheckbox = new JCheckBox("Vigenere Cipher");
		vigenereCheckbox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(vigenereCheckbox.isSelected())
				{
					type[2] = 1;
				}
				else
				{
					type[2] = 0;
				}
			}
		});
		vigenereCheckbox.setBounds(40, 356, 161, 29);
		panel.add(vigenereCheckbox);
		
		JCheckBox hillCheckbox = new JCheckBox("Hill Cipher");
		hillCheckbox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(hillCheckbox.isSelected())
				{
					type[3] = 1;
				}
				else
				{
					type[3] = 0;
				}
			}
		});
		hillCheckbox.setBounds(40, 393, 161, 29);
		panel.add(hillCheckbox);
		
		JCheckBox RsaCheckbox = new JCheckBox("RSA Cipher");
		RsaCheckbox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(RsaCheckbox.isSelected())
				{
					type[4] = 1;
				}
				else
				{
					type[4] = 0;
				}
			}
		});
		RsaCheckbox.setBounds(40, 430, 161, 29);
		panel.add(RsaCheckbox);
		
		JCheckBox phiCheckbox = new JCheckBox("Phi Function");
		phiCheckbox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(phiCheckbox.isSelected())
				{
					type[6] = 1;
				}
				else
				{
					type[6] = 0;
				}
			}
		});
		phiCheckbox.setBounds(271, 282, 196, 29);
		panel.add(phiCheckbox);
		
		JCheckBox rootsCheckbox = new JCheckBox("Roots Mod N");
		rootsCheckbox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(rootsCheckbox.isSelected())
				{
					type[9] = 1;
				}
				else
				{
					type[9] = 0;
				}
			}
		});
		rootsCheckbox.setBounds(271, 393, 196, 29);
		panel.add(rootsCheckbox);
		
		JCheckBox inversesCheckbox = new JCheckBox("Inverses Mod N");
		inversesCheckbox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(inversesCheckbox.isSelected())
				{
					type[8] = 1;
				}
				else
				{
					type[8] = 0;
				}
			}
		});
		inversesCheckbox.setBounds(271, 356, 196, 29);
		panel.add(inversesCheckbox);
		
		JCheckBox arithmeticCheckbox = new JCheckBox("Arithmetic Mod N");
		arithmeticCheckbox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(arithmeticCheckbox.isSelected())
				{
					type[7] = 1;
				}
				else
				{
					type[7] = 0;
				}
			}
		});
		arithmeticCheckbox.setBounds(271, 319, 196, 29);
		panel.add(arithmeticCheckbox);
		
		JCheckBox indexCheckbox = new JCheckBox("Index of Coincidence");
		indexCheckbox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(indexCheckbox.isSelected())
				{
					type[10] = 1;
				}
				else
				{
					type[10] = 0;
				}
			}
		});
		indexCheckbox.setBounds(271, 430, 196, 29);
		panel.add(indexCheckbox);
		
		JCheckBox elGammalCheckbox = new JCheckBox("El Gammal Cipher");
		elGammalCheckbox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(elGammalCheckbox.isSelected())
				{
					type[5] = 1;
				}
				else
				{
					type[5] = 0;
				}
			}
		});
		elGammalCheckbox.setBounds(40, 467, 161, 29);
		panel.add(elGammalCheckbox);
		
		JCheckBox primitiveCheckbox = new JCheckBox("Primitive Roots");
		primitiveCheckbox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(primitiveCheckbox.isSelected())
				{
					type[11] = 1;
				}
				else
				{
					type[11] = 0;
				}
			}
		});
		primitiveCheckbox.setBounds(271, 467, 196, 29);
		panel.add(primitiveCheckbox);
		
		JLabel lblStyle = new JLabel("Style");
		lblStyle.setText("<HTML><U>Style</U></HTML>");
		lblStyle.setHorizontalAlignment(SwingConstants.CENTER);
		lblStyle.setForeground(Color.WHITE);
		lblStyle.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblStyle.setBounds(717, 206, 139, 35);
		panel.add(lblStyle);
		
		JCheckBox calcCheckbox = new JCheckBox("Calculator");
		calcCheckbox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(calcCheckbox.isSelected())
				{
					style[0] = 1;
				}
				else
				{
					style[0] = 0;
				}
			}
		});
		calcCheckbox.setBounds(728, 282, 145, 29);
		panel.add(calcCheckbox);
		
		JCheckBox noCalcCheckbox = new JCheckBox("No Calculator");
		noCalcCheckbox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(noCalcCheckbox.isSelected())
				{
					style[1] = 1;
				}
				else
				{
					style[1] = 0;
				}
			}
		});
		noCalcCheckbox.setBounds(728, 319, 145, 29);
		panel.add(noCalcCheckbox);
		
		// Start button moves the application to the Questions window
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean a = false;
				boolean b = false;
				System.out.println("style 0: " + style[0]);
				System.out.println("style 1: " + style[1]);
				
		
				for(int i=0; i<12; i++)	// Checks every checkbox
				{
					if(type[i] == 1)
					{
						a = true;
					}
				}
				
	
				if(style[0] == 1 || style[1] == 1)
				{
					b = true;
				}
		
				// At least one type checkbox and one style checkbox must be selected to begin
				if(a && b)
				{
					frame.setVisible(false);
					String[] args = new String[0];
					Questions q = new Questions(type, style);
					q.setStyle(style);
					q.setType(type);
	                Questions.main(args); // Runs the main of Practice Window
				}
				else
				{
					 JOptionPane.showMessageDialog(frame, "You must selection at least one type and at least one style of question");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 48));
		btnNewButton.setBounds(665, 467, 208, 66);
		panel.add(btnNewButton);
		
		// Back button sends the application back to the main screen
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				String[] args = new String[0];
				
                MainScreen.main(args); // Goes back to the main screen
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 28));
		button.setBounds(15, 16, 125, 43);
		panel.add(button);
	}
}
