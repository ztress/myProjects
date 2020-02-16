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
	private static Map<String, String> q12 = new HashMap<String, String>();	// Multiplicative Inverse questions with no calculator
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
	private static Map<String, String> q12c = new HashMap<String, String>();
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
		q0.put("Perform an encryption with a shift cipher (k=6) on the following: "
				+ "This is my homework", "ZNOY OY SE NUSKCUXQ");	
		q0.put("Decrypt the following, given the shift cipher key is 5: Bjhqtrj", "Welcome");
		q0.put("Encrypt \"Tricky question\" with a shift cipher key of 26", "Tricky question");
		q0.put("Encrypt the message \"exams are no fun\" witha a shift cipher (k=2", "GZCOU CTG PQ HWP");
		q0.put("Given that \"Go Giants\" encrypts to \"Qy Qskxdc\", decrypt \"ROVVY WI XKWO SC JKM", "Hello my name is Zac");
		
		questionListNoCalc.put(2, (HashMap<String, String>) q2);
		q2.put("Encrypt the message  \"Today is Tuesday\" with a Vigenere cipher with key \"gopher\"" , "ZCSHC ZY HJLWUGM");
		q2.put("Knowing the Vignere cipher key is \"Giants\", decrypt the following: \"NMLYH XXQEAWK\"", "Hello friends");
		q2.put("Encrypt the message  \"Have a nice day\" with a Vigenere cipher with key \"Abe\"" , "HBZE B RIDI DBC");
		q2.put("Knowing the Vignere cipher key is \"Zoo\", decrypt the following: \"KSOQBWMU WR QCNZ\"", "Learning is cool");
		
		
		questionListNoCalc.put(1, (HashMap<String, String>) q1);
		q1.put("Decrypt \"BQQZON\" given the affine cipher key is (3,1)", "Affine");
		q1.put("Encrypt \"Hello\" with an affine cipher key of (1,1)", "IFMMP");
		q1.put("Decrypt \"AGFRT UPRKTGJ\" given the affine cipher key is (3,7)", "Prime Numbers");
		q1.put("Encrypt \"Hello\" with an affine cipher key of (2,4)", "SMAAG");
		q1.put("What is the decryption function of the affine cipher E(x) = (ax + b) % 26?", "D(x) = ((x-b)/a) % 26");
		
		
		questionListNoCalc.put(3, (HashMap<String, String>) q3);
		q3.put("Which matrix can be used for a Hill Cipher? K1: [[1,0,2],[0,1,1],[3,0,1]] or K2: [[0,0,1],[2,0,5],[1,1,8]]", "K1");
		q3.put("Which matrix can be used for a Hill Cipher? K1: [[1,1],[0,1]] or K2: [[1,1],[0,2]]", "K1");
		q3.put("Suppose \"bead\" gets encrypted using a Hill Cipher and the result is \"FGDD\". What is the key?", "[[1,1],[2,1]]");
		q3.put("Encrypt \"Michigan\" with the Hill Cipher key of [[1,1],[0,1]]" , "UIJHOGNN");
		q3.put("Encrypt \"let there be songs to fill the air\" with the Hill Cipher key of [[1,0,2],[0,1,1],[3,0,1]]" , "XXA BLJTF AG GAXYF DT KEWJ BLJ IZR");
		
		
		questionListNoCalc.put(4, (HashMap<String, String>) q4);
		q4.put("If you are using an RSA Cipher and your secret primes are 3 and 13, is either 5 or 7 a valid choice for a public encryption exponent?","Only 7");
		q4.put("If you are using an RSA Cipher your secret primes are 3 and 1, and your public encryption exponent is 7, what is the prviate decryption key?", "3");
		q4.put("If for an RSA Cipher n=91 and the public encryption key is 5, what is the private decryption key?", "29");
		q4.put("If for an RSA Cipher n=33 and the public encryption key is 3, what is the private decryption key?", "7");
		
		
		questionListNoCalc.put(5, (HashMap<String, String>) q5);
		q5.put("Encrypt \"9\" using the El Gammal Cipher with prime 11, primitive root 2, private key 4, and secret integer 8", "Header: 3 Ciphertext:3");

		
		
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
		q7.put(,);
		q7.put(,);
		q7.put(,);
		q7.put(,);
		q7.put(,);
		
		
		questionListNoCalc.put(8, (HashMap<String, String>) q8);
		q8.put(,);
		q8.put(,);
		q8.put(,);
		q8.put(,);
		q8.put(,);
		
		
		questionListNoCalc.put(9, (HashMap<String, String>) q9);
		q9.put(,);
		q9.put(,);
		q9.put(,);
		q9.put(,);
		q9.put(,);
		
		
		questionListNoCalc.put(10, (HashMap<String, String>) q10);
		q10.put("Compute the index of coincidence between \"blue\" and \"talk\"", "0/4");
		q10.put("Compute the index of coincidence between \"cheese\" and \"please\"", "3/6");
		q10.put("Compute the index of coincidence between \"payday\" and \"mayday\"", "5/6");
		q10.put("Compute the index of coincidence between \"Hello\" and \"\"Seven", "1/5");
		q10.put("Compute the index of coincidence between \"total\" and \"total\"", "5/5");
		
		
		questionListNoCalc.put(11, (HashMap<String, String>) q11);
		q11.put(,);
		q11.put(,);
		q11.put(,);
		q11.put(,);
		q11.put(,);
		
		
		questionListNoCalc.put(12, (HashMap<String, String>) q12);
		q12.put(,);
		q12.put(,);
		q12.put(,);
		q12.put(,);
		q12.put(,);
		
		
		questionListCalc.put(0, (HashMap<String, String>) q0c);
		q0c.put("Find the encryption key of the shift cipher given the plaintext is \"Hello users\" and the ciphertext is \"Wtaad jhtgh\"", "k = 15");
		q0c.put("Find the encryption key of the shift cipher and the decoded message given the encoded message is \"Ivmvijv\"", "Reverse	k = 17");
		q0c.put("Find the encryption key of the shift cipher given the plaintext is \"Hello world\" and the ciphertext is \"KHOOR ZRUOG\"", "k = 3");
		q0c.put("Find the encryption key of the shift cipher and the decoded message given the encoded message is \"AWBBSGCHO UCZRSB UCDVSFG\"", "Minnesota Golden Gophers	k = 14");
		
		questionListCalc.put(2, (HashMap<String, String>) q2c);
		q2c.put("Find the encryption key for the Vignere cipher given \"I like strawberries\" encrypts to \"U LBRQ SMYMWULDRBLE\"" , "MATH");
		q2c.put("Find the encryption key for the Vignere cipher given \"What is it\" encrypts to \"GLYD MQ SX\"" , "KEY");
		q2c.put("Find the encryption key for the Vignere cipher given \"I like superheroes\" encrypts to \"P PZYL WLDLVYSYSVG\"" , "HERO");
		q2c.put("Find the encryption key for the Vignere cipher given \"More practice\" encrypts to \"MPTE QTADVIDG\"" , "ABC");
		
		
		questionListCalc.put(1, (HashMap<String, String>) q1c);
		q1c.put("Decrypt \"TFULBAR MFU EWH THHLHAC\" given the affine cipher key is (31,13)", "Working for the weekend");
		q1c.put("Encrypt \"Tomorrow is Sunday\" with an affine cipher key of (57,81)", "UVLVKKVJ RP PZQSDT");
		q1c.put("Decrypt \"T QTRX ABJRXIABQQ\" given the affine cipher key is (77,1)", "I like basketball");
		q1c.put("Encrypt \"Baseball is my favorite sport\" with an affine cipher key of (49,39)", "KNLBKNGG PL DT YNCXOPIB LUXOI");
		
		
		questionListCalc.put(3, (HashMap<String, String>) q3c);
		q3c.put("Decrypt \"FRPWJFTMAWSLRGLXBBENEE\" with the Hill Cipher key of [[18,8],[17,9]]" , "on the threshold of a dream");
		q3c.put("Encrypt \"The Giants Win The Pennant\" with the Hill Cipher key of [[18,8],[17,9]]" , "PWW SOGPCC KBT PWZ VHDANPC");
		q3c.put("Encrypt \"Lets play golf\" with the Hill Cipher key of [[1,2],[-1,3]]" , "TBDJ LSWU IKVE");
	
		
		
		questionListCalc.put(4, (HashMap<String, String>) q4c);
		q4c.put("If you are using an RSA Cipher and your secret primes are 47 and 139, is either 23 or 29 a valid choice for a public encryption exponent?","Only 29");
		q4c.put("If you are using an RSA Cipher your secret primes are 23 and 31, and your public encryption exponent is 7, decrypt \"495\"", "123");
		q4c.put("Encrypt \"348\" using an RSA Cipher with n=551 and public key = 5", "290");
		
		
		questionListCalc.put(5, (HashMap<String, String>) q5c);
		q5c.put("Encrypt \"18\" using the El Gammal Cipher with prime 101, primitive root 2, private key 7, and secret integer 10", "Header: 14 Ciphertext: 7");

		
		questionListCalc.put(6, (HashMap<String, String>) q6c);
		q6c.put("What is φ(790)?","312");
		q6c.put("What is φ(28)?","12");
		q6c.put("What is φ(34)?","16");
		q6c.put("What is φ(68)?","32");
		q6c.put("What is φ(88)?","40");
		q6c.put("What is φ(55)?","40");
		
		
		questionListCalc.put(7, (HashMap<String, String>) q7c);
		q7c.put(,);
		q7c.put(,);
		q7c.put(,);
		q7c.put(,);
		q7c.put(,);
		
		
		questionListCalc.put(8, (HashMap<String, String>) q8c);
		q8c.put(,);
		q8c.put(,);
		q8c.put(,);
		q8c.put(,);
		q8c.put(,);
		
		
		questionListCalc.put(9, (HashMap<String, String>) q9c);
		q9c.put(,);
		q9c.put(,);
		q9c.put(,);
		q9c.put(,);
		q9c.put(,);
		
		
		questionListCalc.put(10, (HashMap<String, String>) q10c);
		q10c.put("Compute the index of coincidence between \"grateful\" and \"tracking\"", "2/8");
		q10c.put("Given the index of coincidence between two random English words is 0.064, what is the expected index if one is rotated l spaces?" , "0.064");
		
		
		questionListCalc.put(11, (HashMap<String, String>) q11c);
		q11c.put(,);
		q11c.put(,);
		q11c.put(,);
		q11c.put(,);
		q11c.put(,);
		
		
		questionListCalc.put(12, (HashMap<String, String>) q12c);
		q12c.put(,);
		q12c.put(,);
		q12c.put(,);
		q12c.put(,);
		q12c.put(,);	
	
	}
	
	
	
	public Questions(int[] t, int [] s)
	{
		type =t;
		style = s;
	}
	
	// Fills activeQuestions array with possible questions based on user's selections
	public void fillQuestions()
	{
		//System.out.println("Starting fill Questions");
		if(style[0] == 1)
		{
			//System.out.println("LLL");
			for(int i=0; i<type.length; i++)	// Iterates through all possible types and adds questions for that type if selected
			{
				if(type[i] == 1)
				{
					HashMap<String, String> a = questionListCalc.get(i);
					Set<String> s = a.keySet();
					
					Iterator<String> itr = s.iterator();

					// traversing over HashSet
					//System.out.println("Traversing over Set using Iterator");
					while(itr.hasNext())
					{
						activeQuestions.put(itr.next(), a.get(itr.next()));
					}
				}
			}
		}
		//System.out.println("Continuing fill Questions");
		//System.out.println("Style[1] "+style[1]);
		if(style[1] == 1)
		{
			//System.out.println("IN");
			for(int i=0; i<type.length; i++)
			{
				if(type[i] == 1)
				{
					HashMap<String, String> a = questionListNoCalc.get(i);
					Set<String> s = a.keySet();
	
					Iterator<String> itr = s.iterator();

					// traversing over HashSet
					//System.out.println("Traversing over Set using Iterator");
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
		answerLabel.setVisible(false);
		answerLabel.setForeground(Color.GREEN);
		answerLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		answerLabel.setBounds(317, 489, 392, 78);
		panel.add(answerLabel);
		
		// Next button goes to the next question
		JButton nextButton = new JButton("Next");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerLabel.setVisible(false);
				//System.out.println("Hit next");
				chooseQuestion(questionLabel);
				//System.out.println("After");
			}
		});
		nextButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		nextButton.setBounds(799, 489, 154, 65);
		panel.add(nextButton);
		
		// Show Answer button shows the answer for the current question
		JButton showAnswerButton = new JButton("Show Answer");
		showAnswerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerLabel.setVisible(true);
				//answerLabel.setText(activeQuestions.get(currentQuestion));
			}
		});
		showAnswerButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		showAnswerButton.setBounds(15, 489, 244, 65);
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
			//System.out.println("Size: " + s.size());
			//System.out.println("Size: " + q0.size());
			usedQuestions = new ArrayList<String>();
			arr = new String[s.size()];
			s.toArray(arr);
			/*
			for(int i=0; i<arr.length; i++)
			{
				System.out.println("Printing");
				System.out.println(arr[i]);
				System.out.println(activeQuestions.get(arr[i]));
			}
			*/
			
			a = false;
		}
		
		int index = (int)(Math.random() * s.size());		// Randomly selects next question
		System.out.println("Array size: " + arr.length);
		question = arr[index];
		//System.out.println(question);
		//System.out.println(activeQuestions.get(question));
		if(usedQuestions.size() == activeQuestions.size())		// Checks if all questions have been asked
		{
			JOptionPane.showMessageDialog(frame, "Out of Questions!");
		}
		else
		{
			while(usedQuestions.contains(question))		// Keeps looking through possible questions until it finds a new one
			{
				index = (int)(Math.random() * s.size());
				//System.out.println("Size: " + s.size());
				//System.out.println("Index: " + index);
				question = arr[index];
			}
			//System.out.println("H");
		}
		
		
		//questionLabel.setText("Hi");
		//questionLabel.setText(activeQuestions.get(keysAsArray.get(r.next(keysAsArray.size()))));
		//Random random = new Random();
		//List<String> keys = new ArrayList<String>(activeQuestions.keySet());
		//String randomKey = keys.get(random.next(keys.size()));
		
		//this.questionLabel.setText("HI");
		questionLabel.setText(question);
		answerLabel.setText(activeQuestions.get(question));
		//System.out.println(question);
		//System.out.println(activeQuestions.get(question));
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
