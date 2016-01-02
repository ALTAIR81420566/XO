import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;

public class Main {

	protected static char A = 'n';
	protected static char B = 'n';
	protected static char C = 'n';
	protected static char D = 'n';
	protected static char E = 'n';
	protected static char F = 'n';
	protected static char G = 'n';
	protected static char H = 'n';
	protected static char I = 'n';
	
	protected static boolean queue = true;
	protected static boolean gameOver = false;
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	protected void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 365, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u041E\u0447\u0435\u0440\u0435\u0434\u044C - \u0425");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 33, 283, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 90));
		btnNewButton.addActionListener(new ActionListener() {
		//	frame.remove(btnNewButton);
				//frame.repaint();	
			public void actionPerformed(ActionEvent arg0) 
			{
				A = EventHandler.XOprinter(A, btnNewButton, lblNewLabel);
				EventHandler.gameOver(frame,lblNewLabel);
			}
		});
	
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(10, 83, 100, 89);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				B = EventHandler.XOprinter(B, button, lblNewLabel);
				EventHandler.gameOver(frame,lblNewLabel);
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.PLAIN, 90));
		button.setBackground(Color.WHITE);
		button.setBounds(125, 83, 100, 89);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				D = EventHandler.XOprinter(D, button_1, lblNewLabel);
				EventHandler.gameOver(frame,lblNewLabel);
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 90));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(10, 183, 100, 89);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				E = EventHandler.XOprinter(E, button_2, lblNewLabel);
				EventHandler.gameOver(frame,lblNewLabel);
			}
		});
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 90));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(125, 183, 100, 89);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{		
				C = EventHandler.XOprinter(C, button_3, lblNewLabel);
				EventHandler.gameOver(frame,lblNewLabel);
			}
		});
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 90));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(235, 83, 100, 89);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				F = EventHandler.XOprinter(F, button_4, lblNewLabel);
				EventHandler.gameOver(frame,lblNewLabel);
			}
		});
		button_4.setForeground(Color.BLACK);
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 90));
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(235, 183, 100, 89);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				G = EventHandler.XOprinter(G, button_5, lblNewLabel);
				EventHandler.gameOver(frame,lblNewLabel);
			}
		});
		button_5.setForeground(Color.BLACK);
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 90));
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(10, 283, 100, 89);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				H = EventHandler.XOprinter(H, button_6, lblNewLabel);
				EventHandler.gameOver(frame,lblNewLabel);
			}
		});
		button_6.setForeground(Color.BLACK);
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 90));
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(125, 283, 100, 89);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				I = EventHandler.XOprinter(I, button_7, lblNewLabel);
				EventHandler.gameOver(frame,lblNewLabel);
			}
		});
		button_7.setForeground(Color.BLACK);
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 90));
		button_7.setBackground(Color.WHITE);
		button_7.setBounds(235, 283, 100, 89);
		frame.getContentPane().add(button_7);
		
		JButton btnNewButton_1 = new JButton("\u041D\u0430\u0447\u0430\u0442\u044C \u0437\u0430\u043D\u043E\u0432\u043E");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				 A = 'n';
				 B = 'n';
				 C = 'n';
				 D = 'n';
				 E = 'n';
				 F = 'n';
				 G = 'n';
				 H = 'n';
				 I = 'n';
				
				 queue = true;
				 gameOver = false;
				 
				 button.setText(null);
				 button_7.setText(null);
				 button_6.setText(null);
				 button_5.setText(null);
				 button_4.setText(null);
				 button_3.setText(null);
				 button_2.setText(null);
				 button_1.setText(null);
				 btnNewButton.setText(null);
				 
				 lblNewLabel.setText("Очередь - Х");
			}
		});
		btnNewButton_1.setBounds(213, 22, 122, 50);
		frame.getContentPane().add(btnNewButton_1);
	}
}
