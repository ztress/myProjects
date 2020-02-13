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
		//q0.put("Find the encryption key of the shift cipher given the plaintext is \"Hello users\" and the ciphertext is \"Wtaad jhtgh\"", "k = 15");
		q0.put("Encrypt \"Tricky question\" with a shift cipher key of 26", "Tricky question");
		
		
		questionListNoCalc.put(1, (HashMap<String, String>) q1);
		q1.put(,);
		q1.put(,);
		q1.put(,);
		q1.put(,);
		q1.put(,);
		
		
		questionListNoCalc.put(2, (HashMap<String, String>) q2);
		q2.put(,);
		q2.put(,);
		q2.put(,);
		q2.put(,);
		q2.put(,);
		
		
		questionListNoCalc.put(3, (HashMap<String, String>) q3);
		q3.put(,);
		q3.put(,);
		q3.put(,);
		q3.put(,);
		q3.put(,);
		
		
		questionListNoCalc.put(4, (HashMap<String, String>) q4);
		q4.put(,);
		q4.put(,);
		q4.put(,);
		q4.put(,);
		q4.put(,);
		
		
		questionListNoCalc.put(5, (HashMap<String, String>) q5);
		q5.put(,);
		q5.put(,);
		q5.put(,);
		q5.put(,);
		q5.put(,);
		
		questionListNoCalc.put(6, (HashMap<String, String>) q6);
		q6.put(,);
		q6.put(,);
		q6.put(,);
		q6.put(,);
		q6.put(,);
		
		
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
		q10.put(,);
		q10.put(,);
		q10.put(,);
		q10.put(,);
		q10.put(,);
		
		
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
		
		
		questionListCalc.put(101, (HashMap<String, String>) q1c);
		q1c.put(,);
		q1c.put(,);
		q1c.put(,);
		q1c.put(,);
		q1c.put(,);
		
		
		questionListCalc.put(102, (HashMap<String, String>) q2c);
		q2c.put(,);
		q2c.put(,);
		q2c.put(,);
		q2c.put(,);
		q2c.put(,);
		
		
		questionListCalc.put(103, (HashMap<String, String>) q3c);
		q3c.put(,);
		q3c.put(,);
		q3c.put(,);
		q3c.put(,);
		q3c.put(,);
		
		
		questionListCalc.put(104, (HashMap<String, String>) q4c);
		q4c.put(,);
		q4c.put(,);
		q4c.put(,);
		q4c.put(,);
		q4c.put(,);
		
		
		questionListCalc.put(105, (HashMap<String, String>) q5c);
		q5c.put(,);
		q5c.put(,);
		q5c.put(,);
		q5c.put(,);
		q5c.put(,);
		
		questionListCalc.put(106, (HashMap<String, String>) q6c);
		q6c.put(,);
		q6c.put(,);
		q6c.put(,);
		q6c.put(,);
		q6c.put(,);
		
		
		questionListCalc.put(107, (HashMap<String, String>) q7c);
		q7c.put(,);
		q7c.put(,);
		q7c.put(,);
		q7c.put(,);
		q7c.put(,);
		
		
		questionListCalc.put(108, (HashMap<String, String>) q8c);
		q8c.put(,);
		q8c.put(,);
		q8c.put(,);
		q8c.put(,);
		q8c.put(,);
		
		
		questionListCalc.put(109, (HashMap<String, String>) q9c);
		q9c.put(,);
		q9c.put(,);
		q9c.put(,);
		q9c.put(,);
		q9c.put(,);
		
		
		questionListCalc.put(110, (HashMap<String, String>) q10c);
		q10c.put(,);
		q10c.put(,);
		q10c.put(,);
		q10c.put(,);
		q10c.put(,);
		
		
		questionListCalc.put(111, (HashMap<String, String>) q11c);
		q11c.put(,);
		q11c.put(,);
		q11c.put(,);
		q11c.put(,);
		q11c.put(,);
		
		
		questionListCalc.put(112, (HashMap<String, String>) q12c);
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
			arr = new String[q0.size()];
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
