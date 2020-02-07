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
import java.util.HashMap;
import java.util.Iterator;

public class Questions {

	private JFrame frame;
	private int[] type = new int[13];
	private int[] style = new int[2];
	private Map<Integer, HashMap<String, String>> questionListCalc = new HashMap<Integer, HashMap<String, String>>();
	private Map<Integer, HashMap<String, String>> questionListNoCalc = new HashMap<Integer, HashMap<String, String>>();
	private Map<String, String> activeQuestions = new HashMap<String, String>();
	private String currentQuestion;
	
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
		if(style[0] == 1)
		{
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
					System.out.println("Traversing over Set using Iterator");
					while(itr.hasNext())
					{
						activeQuestions.put(itr.next(), a.get(itr.next()));
					}
				}
			}
		}	
	}
	
	
	/**
	 * Launch the application.
	 */
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
		q.fillQuestions();
		
	}

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
		
		JLabel questionLabel = new JLabel("Put Question Here");
		questionLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		questionLabel.setForeground(Color.RED);
		questionLabel.setBounds(71, 115, 819, 282);
		panel.add(questionLabel);
		
		
		
		JLabel answerLabel = new JLabel("New label");
		answerLabel.setVisible(false);
		answerLabel.setForeground(Color.GREEN);
		answerLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		answerLabel.setBounds(317, 489, 392, 78);
		panel.add(answerLabel);
		
		JButton nextButton = new JButton("Next");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerLabel.setVisible(false);
			}
		});
		nextButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		nextButton.setBounds(799, 489, 154, 65);
		panel.add(nextButton);
		
		JButton showAnswerButton = new JButton("Show Answer");
		showAnswerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answerLabel.setVisible(true);
				answerLabel.setText(activeQuestions.get(currentQuestion));
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
}
