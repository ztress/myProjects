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

import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Questions {

	private static JFrame frame;
	private int[] type = PracticeWindow.getType();	// Gets type array from previous window
	private int[] style = PracticeWindow.getStyle(); // Gets style array from previous window
	private Map<Integer, HashMap<String, String>> questionListCalc = new HashMap<Integer, HashMap<String, String>>();	// A dictionary containing questions for the calculator selection
	private Map<Integer, HashMap<String, String>> questionListNoCalc = new HashMap<Integer, HashMap<String, String>>(); // A dictionary containing questions for the no-calculator selection
	private static Map<String, String> activeQuestions = new HashMap<String, String>();		// Reflects questions that can be chosen due to selections made by user
	private static String question;
	
	private static Map<String, String> q0 = new HashMap<String, String>();	// Shift Cipher questions with no calculator
	private static Map<String, String> q1 = new HashMap<String, String>();	// Affine Cipher questions with no calculator
	private static Map<String, String> q2 = new HashMap<String, String>();	// Vigenere Cipher questions with no calculator
	private static Map<String, String> q3 = new HashMap<String, String>();	// Hill Cipher questions with no calculator
	private static Map<String, String> q4 = new HashMap<String, String>();	// RSA Cipher questions with no calculator
	private static Map<String, String> q5 = new HashMap<String, String>();	// El Gammal Cipher questions with no calculator
	private static Map<String, String> q6 = new HashMap<String, String>();	// Phi Function questions with no calculator
	private static Map<String, String> q7 = new HashMap<String, String>();	// Arithmetic Mod N questions with no calculator
	private static Map<String, String> q8 = new HashMap<String, String>();	// Inverses Mod N questions with no calculator
	private static Map<String, String> q9 = new HashMap<String, String>();	// Roots Mod N questions with no calculator
	private static Map<String, String> q10 = new HashMap<String, String>();	// Index of Coincidence questions with no calculator
	private static Map<String, String> q11 = new HashMap<String, String>();	// Primitive Roots questions with no calculator
	private static Map<String, String> q0c = new HashMap<String, String>();	// What the respective variable is above but with a calculator
	private static Map<String, String> q1c = new HashMap<String, String>();
	private static Map<String, String> q2c = new HashMap<String, String>();
	private static Map<String, String> q3c = new HashMap<String, String>();
	private static Map<String, String> q4c = new HashMap<String, String>();
	private static Map<String, String> q5c = new HashMap<String, String>();
	private static Map<String, String> q6c = new HashMap<String, String>();
	private static Map<String, String> q7c = new HashMap<String, String>();
	private static Map<String, String> q8c = new HashMap<String, String>();
	private static Map<String, String> q9c = new HashMap<String, String>();
	private static Map<String, String> q10c = new HashMap<String, String>();
	private static Map<String, String> q11c = new HashMap<String, String>();
	
	private static JLabel questionLabel;	// Question JLabel that gets updated
	private static JLabel answerLabel;		// Answer JLabel that gets updated	
	private static boolean a = true;		// Only true for first question, used in chooseQuestion
	private static String [] arr;			// List of questions
	private static ArrayList<String> usedQuestions;		// Questions that have been used
	private static Set<String> s;		// Set of questions
	
	// Fills dictionaries with all questions
	public void fill()
	{
		questionListNoCalc.put(0, (HashMap<String, String>) q0);
		q0.put("<html> Perform an encryption with a shift cipher (k=6) on the following: <br/> "
				+ "\"This is my homework\" </html>", "<html>ZNOY OY SE NUSKCUXQ<html/>");	
		q0.put("<html> Decrypt the following, given the shift cipher key is 5: Bjhqtrj<html/>", "Welcome");
		q0.put("<html> Encrypt \"Tricky question\" with a shift cipher key of 26", "Tricky question <html/>");
		q0.put("<html> Encrypt the message \"exams are no fun\" with <br/> a shift cipher (k=2) <html/>", "GZCOU CTG PQ HWP");
		q0.put("<html> Given that \"Go Giants\" encrypts to \"Qy Qskxdc\", <br/> decrypt \"ROVVY WI XKWO SC JKM <html/>", "Hello my name is Zac");
		
		questionListNoCalc.put(1, (HashMap<String, String>) q1);
		q1.put("<html> Decrypt \"BQQZON\" given the affine cipher key is (3,1)<html/>", "Affine");
		q1.put("<html> Encrypt \"Hello\" with an affine cipher key of (1,1)<html/>", "IFMMP");
		q1.put("<html> Decrypt \"AGFRT UPRKTGJ\" given the affine cipher key is (3,7)<html/>", "Prime Numbers");
		q1.put("<html> Encrypt \"Hello\" with an affine cipher key of (2,4)<html/>", "SMAAG");
		q1.put("<html> What is the decryption function of the affine cipher <br/> E(x) = (ax + b) % 26? <html/>", "D(x) = ((x-b)/a) % 26");
		
		questionListNoCalc.put(2, (HashMap<String, String>) q2);
		q2.put("<html> Encrypt the message  \"Today is Tuesday\" with <br/> a Vigenere cipher with key \"gopher\"</html>" , "ZCSHC ZY HJLWUGM");
		q2.put("<html> Knowing the Vignere cipher key is \"Giants\", <br/> decrypt the following: \"NMLYH XXQEAWK\"</html>", "Hello friends");
		q2.put("<html> Encrypt the message  \"Have a nice day\" with a Vigenere cipher with key \"Abe\"</html>" , "HBZE B RIDI DBC");
		q2.put("<html> Knowing the Vignere cipher key is \"Zoo\", <br/> decrypt the following: \"KSOQBWMU WR QCNZ\" </html>", "Learning is cool");
		
		
		questionListNoCalc.put(3, (HashMap<String, String>) q3);
		q3.put("<html> Which matrix can be used for a Hill Cipher? <br/> K1: [[1,0,2],[0,1,1],[3,0,1]] or K2: [[0,0,1],[2,0,5],[1,1,8]]<html/>", "K1");
		q3.put("<html> Which matrix can be used for a Hill Cipher? <br/> K1: [[1,1],[0,1]] or K2: [[1,1],[0,2]] <html/>", "K1");
		q3.put("<html> Suppose \"bead\" gets encrypted using a Hill Cipher and the result is \"FGDD\". What is the key?<html/>", "[[1,1],[2,1]]");
		q3.put("<html> Encrypt \"Michigan\" with the Hill Cipher key of [[1,1],[0,1]]<html/>" , "UIJHOGNN");
		q3.put("<html> Encrypt \"let there be songs to fill the air\" with the <br/> Hill Cipher key of [[1,0,2],[0,1,1],[3,0,1]] <html/>" , "<html>XXA BLJTF AG GAXYF DT KEWJ BLJ IZR<html/>");
		
		
		questionListNoCalc.put(4, (HashMap<String, String>) q4);
		q4.put("<html> If you are using an RSA Cipher and your secret primes are 3 and 13, is either 5 or 7 a valid choice for a public encryption exponent? <html/>","Only 7");
		q4.put("<html> If you are using an RSA Cipher your secret primes are 3 and 1, <br/> and your public encryption exponent is 7, what is the prviate decryption key? <html/>", "3");
		q4.put("<html> If for an RSA Cipher n=91 and the public encryption key is 5, what is the private decryption key?<html/>", "29");
		q4.put("<html> If for an RSA Cipher n=33 and the public encryption key is 3, what is the private decryption key?<html/>", "7");
		
		
		questionListNoCalc.put(5, (HashMap<String, String>) q5);
		q5.put("<html> Encrypt \"9\" using the El Gammal Cipher with prime 11, primitive root 2, private key 4, and secret integer 8 <html/>", "Header: 3 Ciphertext:3");
		
		
		questionListNoCalc.put(6, (HashMap<String, String>) q6);
		q6.put("What is φ(2)?","1");
		q6.put("What is φ(3)?","2");
		q6.put("What is φ(4)?","2");
		q6.put("What is φ(5)?","4");
		q6.put("What is φ(6)?","2");
		q6.put("What is φ(7)?","6");
		q6.put("What is φ(8)?","4");
		q6.put("What is φ(9)?","6");
		q6.put("What is φ(67)?","66");
		q6.put("What is φ(37)?","36");
		q6.put("What is φ(103)?","102");
		
		
		questionListNoCalc.put(7, (HashMap<String, String>) q7);
		q7.put("<html> In Mod 4, how many equivalence classes are there? List them <html/>", "<html> 4. 0, 1, 2, 3 <html/>");
		q7.put("<html> In Mod N, how many equivalence classes are there? <html/>", "<html> N <html/>");
		q7.put("<html> What Mod N are you working with if -3, 2, 7, and 12 are in the same equivalence class? <html/>", "<html> Mod 5 <html/>");
		q7.put("<html> Give an example where x!=0 and xy=xz but y!=z <html/>", "<html> Sample answer: Let n=6, x=2, y=3, and z=6 <html/>");
		q7.put("<html> True or False: If a and b are both invertible in Mod N, then a+b is invertible in Mod N <html/>", "<html> False. Let a=1 and b=1 in Mod 4 <html/>");
		q7.put("<html> True or False: If a and b are both invertible in Mod N, then a*b is invertible in Mod N <html/>", "<html> True <html/>");
		
		questionListNoCalc.put(8, (HashMap<String, String>) q8);
		q8.put("If it exists, what is the multiplicative inverse of 2 in Mod 3?", "2");
		q8.put("If it exists, what is the multiplicative inverse of 2 in Mod 5?", "3");
		q8.put("If it exists, what is the multiplicative inverse of 2 in Mod 4?", "Does not exist");
		q8.put("If it exists, what is the multiplicative inverse of (n+2) in Mod (5n+9)?", "5");
		q8.put("If it exists, what is the multiplicative inverse of 5 in Mod 7?", "3");
		q8.put("If it exists, what is the multiplicative inverse of n in Mod (2n-1)?", "2");
		q8.put("If it exists, what is the multiplicative inverse of n in Mod (n^2 + 1)?", "-n");
		
			
		questionListNoCalc.put(9, (HashMap<String, String>) q9);
		q9.put("<html> Find a square root of 5 in Mod 11 <html/>", "<html> 4 <html/>");
		q9.put("<html> Find a square root of 5 in Mod 121 <html/>", "<html> 48 <html/>");
		q9.put("<html> Find a cube root of 7 in Mod 105 <html/>", "<html> 28 <html/>");
		q9.put("<html> Find a cube root of 2 in Mod 11 <html/>", "<html> 7 <html/>");
		q9.put("<html> Find a cube root of 3 in Mod 11 <html/>", "<html> 9 <html/>");
		q9.put("<html> Does 2 have a square root in Mod 19? <html/>", "<html> No <html/>");
		q9.put("<html> Does 3 have a square root in Mod 13? <html/>", "<html> Yes <html/>");
			
		
		questionListNoCalc.put(10, (HashMap<String, String>) q10);
		q10.put("<html> Compute the index of coincidence between \"blue\" and \"talk\"<html/>", "0/4");
		q10.put("<html> Compute the index of coincidence between \"cheese\" and \"please\"<html/>", "3/6");
		q10.put("<html> Compute the index of coincidence between \"payday\" and \"mayday\"<html/>", "5/6");
		q10.put("<html> Compute the index of coincidence between \"Hello\" and \"\"Seven\"<html/>", "1/5");
		q10.put("<html> Compute the index of coincidence between \"total\" and \"total\"<html/>", "5/5");
		

		questionListNoCalc.put(11, (HashMap<String, String>) q11);
		q11.put("<html> Are there any primitive roots in Mod 10? If so, find them <html/>", "<html> 3, 7, and 9 <html/>");
		q11.put("<html> Are there any primitive roots in Mod 12? If so, find them <html/>", "<html> There are none <html/>");
		q11.put("<html> Are there any primitive roots in Mod 8? If so, find them <html/>", "<html> There are none <html/>");
		q11.put("<html> Which of the following are primitive roots in Mod 9? 1, 2, 4, and 4 <html/>", "<html> 2 <html/>");
		q11.put("<html> Is 3 a primitive root in Mod 5? <html/>", "<html> Yes <html/>");

		
		questionListCalc.put(0, (HashMap<String, String>) q0c);
		q0c.put("<html> Find the encryption key of the shift cipher given the plaintext is \"Hello users\" and the ciphertext is \"Wtaad jhtgh\"<html/>", "k = 15");
		q0c.put("<html> Find the encryption key of the shift cipher and the decoded message given the encoded message is \"Ivmvijv\"<html/>", "Reverse	k = 17");
		q0c.put("<html> Find the encryption key of the shift cipher given the plaintext is \"Hello world\" and the ciphertext is \"KHOOR ZRUOG\"<html/>", "k = 3");
		q0c.put("<html> Find the encryption key of the shift cipher and the decoded message given the encoded message is \"AWBBSGCHO UCZRSB UCDVSFG\"<html/>", "Minnesota Golden Gophers \t k = 14");
			
		questionListCalc.put(1, (HashMap<String, String>) q1c);
		q1c.put("<html> Decrypt \"TFULBAR MFU EWH THHLHAC\" given the affine cipher key is (31,13)<html/>", "Working for the weekend");
		q1c.put("<html> Encrypt \"Tomorrow is Sunday\" with an affine cipher key of (57,81)<html/>", "UVLVKKVJ RP PZQSDT");
		q1c.put("<html> Decrypt \"T QTRX ABJRXIABQQ\" given the affine cipher key is (77,1)<html/>", "I like basketball");
		q1c.put("<html> Encrypt \"Baseball is my favorite sport\" with an affine cipher key of (49,39)<html/>", "KNLBKNGG PL DT YNCXOPIB LUXOI");
		
		questionListCalc.put(2, (HashMap<String, String>) q2c);
		q2c.put("<html> Find the encryption key for the Vignere cipher given \"I like strawberries\" encrypts to \"U LBRQ SMYMWULDRBLE\"<html/>" , "MATH");
		q2c.put("<html> Find the encryption key for the Vignere cipher given \"What is it\" encrypts to \"GLYD MQ SX\"<html/>" , "KEY");
		q2c.put("<html> Find the encryption key for the Vignere cipher given \"I like superheroes\" encrypts to \"P PZYL WLDLVYSYSVG\"<html/>" , "HERO");
		q2c.put("<html> Find the encryption key for the Vignere cipher given \"More practice\" encrypts to \"MPTE QTADVIDG\"<html/>" , "ABC");
		
		
		questionListCalc.put(3, (HashMap<String, String>) q3c);
		q3c.put("<html> Decrypt \"FRPWJFTMAWSLRGLXBBENEE\" with the Hill Cipher key of [[18,8],[17,9]]<html/>" , "on the threshold of a dream");
		q3c.put("<html> Encrypt \"The Giants Win The Pennant\" with the Hill Cipher key of [[18,8],[17,9]]<html/>" , "PWW SOGPCC KBT PWZ VHDANPC");
		q3c.put("<html> Encrypt \"Lets play golf\" with the Hill Cipher key of [[1,2],[-1,3]]<html/>" , "TBDJ LSWU IKVE");
		
		
		questionListCalc.put(4, (HashMap<String, String>) q4c);
		q4c.put("<html> If you are using an RSA Cipher and your secret primes are 47 and 139, is either 23 or 29 a valid choice for a public encryption exponent?<html/>","Only 29");
		q4c.put("<html> If you are using an RSA Cipher your secret primes are 23 and 31, and your public encryption exponent is 7, decrypt \"495\"<html/>", "123");
		q4c.put("<html> Encrypt \"348\" using an RSA Cipher with n=551 and public key = 5<html/>", "290");
		
		
		questionListCalc.put(5, (HashMap<String, String>) q5c);
		q5c.put("<html> Encrypt \"18\" using the El Gammal Cipher with prime 101, primitive root 2, private key 7, and secret integer 10<html/>", "Header: 14 Ciphertext: 7");

		
		questionListCalc.put(6, (HashMap<String, String>) q6c);
		q6c.put("What is φ(790)?","312");
		q6c.put("What is φ(28)?","12");
		q6c.put("What is φ(34)?","16");
		q6c.put("What is φ(68)?","32");
		q6c.put("What is φ(88)?","40");
		q6c.put("What is φ(55)?","40");
		
		
		questionListCalc.put(7, (HashMap<String, String>) q7c);
		q7c.put("<html> In Mod 4, what is 17*2? </html>", "<html> 2 <html/>");
		q7c.put("<html> In Mod 15, what is 6*32? </html>", "<html> 2 <html/>");
		q7c.put("<html> In Mod 23, what is 3*7? </html>", "<html> 21 <html/>");
		q7c.put("<html> In Mod 74, what is 99*74? </html>", "<html> 74 <html/>");
		q7c.put("<html> In Mod 54, what is 344*267? </html>", "<html> 6 <html/>");

		questionListCalc.put(8, (HashMap<String, String>) q8c);
		q8c.put("<html>If it exists, what is the multiplicative inverse of 17 in Mod 29?<html/>", "12");
		q8c.put("<html>If it exists, what is the multiplicative inverse of 25 in Mod 72?<html/>", "49");
		q8c.put("<html>If it exists, what is the multiplicative inverse of 10 in Mod 27?<html/>", "19");
		q8c.put("<html>If it exists, what is the multiplicative inverse of 124 in Mod 156?<html/>", "Does not exist");	
		
		
		questionListCalc.put(9, (HashMap<String, String>) q9c);
		q9c.put("<html> Find all square roots of 29 in Mod 140 <html/>", "<html> 13, 27, 43, 57, 83, 97, 113, 127 <html/>");
		q9c.put("<html> Find a cube root of 6 in Mod 154 <html/>", "<html> 118 <html/>");
		q9c.put("<html> Find a cube root of 3 in Mod 125 <html/>", "<html> 87 <html/>");
		q9c.put("<html> Find a square root of 41 in Mod 103 <html/>", "<html> 91 <html/>");
		q9c.put("<html> Find the fifth root of 8 in Mod 47 <html/>", "<html> 3 <html/>");
	
		
		questionListCalc.put(10, (HashMap<String, String>) q10c);
		q10c.put("<html> Compute the index of coincidence between \"grateful\" and \"tracking\"<html/>", "2/8");
		q10c.put("<html> Given the index of coincidence between two random English words is 0.064, what is the expected index if one is rotated l spaces?<html/>" , "0.064");
		

		questionListCalc.put(11, (HashMap<String, String>) q11c);
		q11c.put("<html> Is 3 a primitive root in Mod 11? <html/>", "<html> Yes <html/>");
		q11c.put("<html> Is 3 a primitive root in Mod 14? <html/>", "<html> Yes <html/>");
		q11c.put("<html> Find all primitive roots of 13. <html/>", "<html> 2, 6, 7, and 11 <html/>");
		q11c.put("<html> Is 7 a primitive root in Mod 59? <html/>", "<html> No <html/>");
		q11c.put("<html> Is 23 a primitive root in Mod 59? <html/>", "<html> Yes <html/>");
	}
	
	
	
	public Questions(int[] t, int [] s)
	{
		type = t;
		style = s;
	}
	
	// Fills activeQuestions array with possible questions based on user's selections
	public void fillQuestions()
	{
		if(style[0] == 1)
		{
			for(int i=0; i<type.length; i++)	// Iterates through all possible types and adds questions for that type if selected
			{
				if(type[i] == 1)
				{
					HashMap<String, String> a = questionListCalc.get(i);
					Set<String> s = a.keySet();
					
					Iterator<String> itr = s.iterator();

					// traversing over HashSet
					while(itr.hasNext())
					{
						String n = itr.next();
						activeQuestions.put(n, a.get(n));
					}
				}
			}
		}
		
		if(style[1] == 1)
		{
			for(int i=0; i<type.length; i++)
			{
				if(type[i] == 1)
				{
					HashMap<String, String> a = questionListNoCalc.get(i);
					Set<String> s = a.keySet();
	
					Iterator<String> itr = s.iterator();

					// traversing over HashSet
					while(itr.hasNext())
					{
						String n = itr.next();
						activeQuestions.put(n, a.get(n));
					}
				}
			}
		}	
	}
	
	
	/**
	 * Launch the application.
	 */
	
	


	/**
	 * Create the application.
	 */
	public Questions() {
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
		
		// Back button goes back to the PracticeWindow screen. Used for changing selections
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				String[] args = new String[0];
				a = true;
                PracticeWindow.main(args); // Goes back to the Practice Window
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnNewButton.setBounds(15, 16, 125, 43);
		panel.add(btnNewButton);
		
		questionLabel = new JLabel("Put Question Here");
		questionLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		questionLabel.setForeground(Color.RED);
		questionLabel.setBounds(71, 75, 819, 322);
		panel.add(questionLabel);
		
		
		answerLabel = new JLabel("New label");
		answerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		answerLabel.setVisible(false);
		answerLabel.setForeground(Color.GREEN);
		answerLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		answerLabel.setBounds(264, 489, 480, 78);
		panel.add(answerLabel);
		
		
		// Next button goes to the next question
		JButton nextButton = new JButton("Next");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerLabel.setVisible(false);
				chooseQuestion(questionLabel);
			}
		});
		nextButton.setFont(new Font("Tahoma", Font.PLAIN, 36));
		nextButton.setBounds(799, 489, 154, 65);
		panel.add(nextButton);
		
		
		// Show Answer button shows the answer for the current question
		JButton showAnswerButton = new JButton("Show Answer");
		showAnswerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerLabel.setVisible(true);
			}
		});
		showAnswerButton.setFont(new Font("Tahoma", Font.PLAIN, 28));
		showAnswerButton.setBounds(15, 489, 211, 65);
		panel.add(showAnswerButton);
	}
	

	public void setStyle(int[] style) {
		this.style = style;
	}

	public void setType(int[] type) {
		this.type = type;
	}
	
	// Chooses the question from possible questions, which are stored in activeQuestions
	public static void chooseQuestion(JLabel questionLabel)
	{
		// If it is the first question
		if(a)
		{
			s = activeQuestions.keySet();
			usedQuestions = new ArrayList<String>();
			arr = new String[s.size()];
			s.toArray(arr);	
			a = false;
		}
		
		int index = (int)(Math.random() * s.size());		// Randomly selects next question
		question = arr[index];

		if(usedQuestions.size() == activeQuestions.size())		// Checks if all questions have been asked
		{
			JOptionPane.showMessageDialog(frame, "Out of Questions!");
		}
		else
		{
			while(usedQuestions.contains(question))		// Keeps looking through possible questions until it finds a new one
			{
				index = (int)(Math.random() * s.size());

				question = arr[index];
			}
		}
		

		questionLabel.setText(question);
		answerLabel.setText(activeQuestions.get(question));

		usedQuestions.add(question);
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
		});
		Questions q = new Questions();
		q.frame.setVisible(true);
		q.fill();
		q.fillQuestions();
		chooseQuestion(questionLabel);
		
	}
}
