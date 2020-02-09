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
	private int[] type = PracticeWindow.getType();
	private int[] style = PracticeWindow.getStyle();
	private Map<Integer, HashMap<String, String>> questionListCalc = new HashMap<Integer, HashMap<String, String>>();
	private Map<Integer, HashMap<String, String>> questionListNoCalc = new HashMap<Integer, HashMap<String, String>>();
	private static Map<String, String> activeQuestions = new HashMap<String, String>();
	private static String question;
	private static Map<String, String> q0 = new HashMap<String, String>();
	private static JLabel questionLabel;
	private static JLabel answerLabel;
	private static boolean a = true;
	private static String [] arr;
	private static ArrayList<String> usedQuestions;
	private static Set<String> s;
	
	public void fill()
	{
		questionListNoCalc.put(0, (HashMap<String, String>) q0);
		q0.put("Perform an encryption with a shift cipher (k=6) on the following: "
				+ "This is my homework", "ZNOY OY SE NUSKCUXQ");	
		q0.put("Decrypt the following, given the shift cipher key is 5: Bjhqtrj", "Welcome");
		//q0.put("Find the encryption key of the shift cipher given the plaintext is \"Hello users\" and the ciphertext is \"Wtaad jhtgh\"", "k = 15");
		q0.put("Encrypt \"Tricky question\" with a shift cipher key of 26", "Tricky question");
		System.out.println("Filling");
	}
	
	/*
	private HashMap<String, String> q0 = new HashMap<String, String>
	q0.put();
	q0.put()
	q0.put();
	q0.put();
	
	private HashMap<String, String> q1 = new HashMap<String, String>
	q1.put();
	q1.put()
	q1.put();
	q1.put();
	
	private HashMap<String, String> q2 = new HashMap<String, String>
	q2.put();
	q2.put()
	q2.put();
	q2.put();
	
	private HashMap<String, String> q3 = new HashMap<String, String>
	q3.put();
	q3.put()
	q3.put();
	q3.put();
	
	private HashMap<String, String> q4 = new HashMap<String, String>
	q4.put();
	q4.put()
	q4.put();
	q4.put();
	
	private HashMap<String, String> q5 = new HashMap<String, String>
	q5.put();
	q5.put()
	q5.put();
	q5.put();
	
	private HashMap<String, String> q6 = new HashMap<String, String>
	q6.put();
	q6.put()
	q6.put();
	q6.put();
	
	private HashMap<String, String> q7 = new HashMap<String, String>
	q7.put();
	q7.put()
	q7.put();
	q7.put();
	
	private HashMap<String, String> q8 = new HashMap<String, String>
	q8.put();
	q8.put()
	q8.put();
	q8.put();
	
	private HashMap<String, String> q9 = new HashMap<String, String>
	q9.put();
	q9.put()
	q9.put();
	q9.put();
	
	private HashMap<String, String> q10 = new HashMap<String, String>
	q10.put();
	q10.put()
	q10.put();
	q10.put();
	
	private HashMap<String, String> q11 = new HashMap<String, String>
	q11.put();
	q11.put()
	q11.put();
	q11.put();
	
	private HashMap<String, String> q12 = new HashMap<String, String>
	q12.put();
	q12.put()
	q12.put();
	q12.put();
	
	
	
	// Calculator
	private HashMap<String, String> q0c = new HashMap<String, String>
	q0c.put();
	q0c.put()
	q0c.put();
	q0c.put();
	
	private HashMap<String, String> q1c = new HashMap<String, String>
	q1c.put();
	q1c.put()
	q1c.put();
	q1c.put();
	
	private HashMap<String, String> q2c = new HashMap<String, String>
	q2c.put();
	q2c.put()
	q2c.put();
	q2c.put();
	
	private HashMap<String, String> q3c = new HashMap<String, String>
	q3c.put();
	q3c.put()
	q3c.put();
	q3c.put();
	
	private HashMap<String, String> q4c = new HashMap<String, String>
	q4c.put();
	q4c.put()
	q4c.put();
	q4c.put();
	
	private HashMap<String, String> q5c = new HashMap<String, String>
	q5c.put();
	q5c.put()
	q5c.put();
	q5c.put();
	
	private HashMap<String, String> q6c = new HashMap<String, String>
	q6c.put();
	q6c.put()
	q6c.put();
	q6c.put();
	
	private HashMap<String, String> q7c = new HashMap<String, String>
	q7c.put();
	q7c.put()
	q7c.put();
	q7c.put();
	
	private HashMap<String, String> q8c = new HashMap<String, String>
	q8c.put();
	q8c.put()
	q8c.put();
	q8c.put();
	
	private HashMap<String, String> q9c = new HashMap<String, String>
	q9c.put();
	q9c.put()
	q9c.put();
	q9c.put();
	
	private HashMap<String, String> q10c = new HashMap<String, String>
	q10c.put();
	q10c.put()
	q10c.put();
	q10c.put();
	
	private HashMap<String, String> q11c = new HashMap<String, String>
	q11c.put();
	q11c.put()
	q11c.put();
	q11c.put();
	
	private HashMap<String, String> q12c = new HashMap<String, String>
	q12c.put();
	q12c.put()
	q12c.put();
	q12c.put();
	*/
	
	
	public Questions(int[] t, int [] s)
	{
		type =t;
		style = s;
	}
	
	public void fillQuestions()
	{
		System.out.println("Starting fill Questions");
		if(style[0] == 1)
		{
			System.out.println("LLL");
			for(int i=0; i<type.length; i++)
			{
				if(type[i] == 1)
				{
					HashMap<String, String> a = questionListCalc.get(i);
					Set<String> s = a.keySet();
					
					Iterator<String> itr = s.iterator();

					// traversing over HashSet
					System.out.println("Traversing over Set using Iterator");
					while(itr.hasNext())
					{
						activeQuestions.put(itr.next(), a.get(itr.next()));
					}
				}
			}
		}
		System.out.println("Continuing fill Questions");
		System.out.println("Style[1] "+style[1]);
		if(style[1] == 1)
		{
			System.out.println("IN");
			for(int i=0; i<type.length; i++)
			{
				if(type[i] == 1)
				{
					System.out.println("HERE");
					HashMap<String, String> a = questionListNoCalc.get(i);
					Set<String> s = a.keySet();
					System.out.println("Test: "+s.size());
					
					Iterator<String> itr = s.iterator();

					// traversing over HashSet
					System.out.println("Traversing over Set using Iterator");
					while(itr.hasNext())
					{
						String n = itr.next();
						System.out.println("AYOO "+ n);
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
		
		JButton nextButton = new JButton("Next");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerLabel.setVisible(false);
				System.out.println("Hit next");
				chooseQuestion(questionLabel);
				System.out.println("After");
				
				
				
				
			}
		});
		nextButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		nextButton.setBounds(799, 489, 154, 65);
		panel.add(nextButton);
		
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
	
	public static void chooseQuestion(JLabel questionLabel)
	{
		
		if(a)
		{
			s = activeQuestions.keySet();
			System.out.println("Size: " + s.size());
			System.out.println("Size: " + q0.size());
			usedQuestions = new ArrayList<String>();
			arr = new String[q0.size()];
			s.toArray(arr);
			for(int i=0; i<arr.length; i++)
			{
				System.out.println("Printing");
				System.out.println(arr[i]);
				System.out.println(activeQuestions.get(arr[i]));
			}
			
			a = false;
		}
		
		int index = (int)(Math.random() * s.size());
		question = arr[index];
		//System.out.println(question);
		//System.out.println(activeQuestions.get(question));
		if(usedQuestions.size() == activeQuestions.size())
		{
			JOptionPane.showMessageDialog(frame, "Out of Questions!");
		}
		else
		{
			while(usedQuestions.contains(question))
			{
				index = (int)(Math.random() * s.size());
				//System.out.println("Size: " + s.size());
				System.out.println("Index: " + index);
				question = arr[index];
			}
			System.out.println("H");
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
