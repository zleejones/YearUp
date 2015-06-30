import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;


public class SimpleJavaGUI {

	private JFrame frame;
	private JTextField NameTextField;
	private JTextField AgeTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleJavaGUI window = new SimpleJavaGUI();
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
	public SimpleJavaGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 14, 10, 248);
		frame.getContentPane().add(panel);
		
		JLabel NameLabel = new JLabel("My name is");
		NameLabel.setBounds(34, 33, 75, 27);
		frame.getContentPane().add(NameLabel);
		
		NameTextField = new JTextField();
		NameTextField.setBounds(119, 33, 256, 36);
		frame.getContentPane().add(NameTextField);
		NameTextField.setColumns(10);
		
		JLabel AgeLabel = new JLabel("I am");
		AgeLabel.setBounds(49, 112, 46, 14);
		frame.getContentPane().add(AgeLabel);
		
		AgeTextField = new JTextField();
		AgeTextField.setBounds(124, 109, 86, 20);
		frame.getContentPane().add(AgeTextField);
		AgeTextField.setColumns(10);
		
		JLabel StudentLabel = new JLabel("I am a student of Year Up");
		StudentLabel.setFont(new Font("Century", Font.BOLD, 12));
		StudentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		StudentLabel.setBounds(130, 182, 175, 14);
		frame.getContentPane().add(StudentLabel);
		
		JButton TheWhoButton = new JButton("Who Are You?");
		TheWhoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if (TheWhoButton.getText().equals("Who Are You?"))
				{
				   NameTextField.setText("Zakir Lee-Jones");
				   AgeTextField.setText("24");
				   TheWhoButton.setText("Clear Me!");
				} 
				else if (TheWhoButton.getText().equals("Clear Me!"))
						{
							NameTextField.setText("");
							AgeTextField.setText("");
							TheWhoButton.setText("Who Are You?");
						}
			}
		});
		TheWhoButton.setBounds(146, 207, 139, 23);
		frame.getContentPane().add(TheWhoButton);
	
		}
		public void actionPerformed(ActionEvent e) {
		}
	}

