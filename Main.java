package xo_2;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;
//import java.awt.List;
import java.awt.Color;
import javax.swing.UIManager;

public class Main implements ActionListener {

	private static boolean queue = true;
	private static boolean gameOver = false;
	private List<JButton> butnArr = new ArrayList();
	private String[] map = new String[9];
	private JFrame frame;
	private JLabel label = new JLabel("\u041E\u0447\u0435\u0440\u0435\u0434\u044C - X");

	/**;
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
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
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 366, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		label.setFont(new Font("Arial", Font.PLAIN, 20));
		label.setBounds(10, 26, 208, 24);
		frame.getContentPane().add(label);
		
		JButton btn1 = new JButton("");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 90));
		btn1.setBackground(Color.WHITE);
		btn1.setForeground(Color.BLACK);
		btn1.setBounds(10, 72, 100, 89);;
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 90));
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(120, 72, 100, 89);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 90));
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(230, 72, 100, 89);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 90));
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(10, 171, 100, 89);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 90));
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(118, 171, 100, 89);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 90));
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(230, 171, 100, 89);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 90));
		btn7.setBackground(Color.WHITE);
		btn7.setBounds(10, 271, 100, 89);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 90));
		btn8.setBackground(Color.WHITE);
		btn8.setBounds(120, 271, 100, 89);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 90));
		btn9.setBackground(Color.WHITE);
		btn9.setBounds(230, 271, 100, 89);
		frame.getContentPane().add(btn9);
		
		butnArr = Arrays.asList(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9);
		
		JButton restart = new JButton("Restart");
		restart.setBackground(UIManager.getColor("Button.light"));
		restart.setFont(new Font("Arial", Font.PLAIN, 15));
		restart.setBounds(191, 11, 139, 42);
		frame.getContentPane().add(restart);
		restart.addActionListener(this);
		
		addListener(butnArr);
	}
	
	public List<JButton> getButnArr()
	{
		return butnArr;
	
	}
	
	protected  void addListener(List<JButton> butnArr)
	{
		for(int i = 0; i < butnArr.size(); i++)
		{   
			
			butnArr.get(i).addActionListener(this);
			butnArr.get(i).setActionCommand(Integer.toString(i));
			
		}
	}

		public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand().equals("Restart"))
		{
			queue = true;
			gameOver = false;
			map = new String[9];
			for(JButton btn : butnArr)
			   {
				btn.setText("");
			   }
			label.setText("\u041E\u0447\u0435\u0440\u0435\u0434\u044C - X");
		}
		 else
		 {
		   for(JButton btn : butnArr)
		   {
			 if(e.getSource().equals(btn))
			 {
				queue = EventHandler.XOprinter(queue, gameOver, btn,  label);
				map = EventHandler.mapmaker(map, btn.getActionCommand(), btn.getText());
				gameOver = EventHandler.XO_gameOver(map, label);
				
			 }
			
		   }
		
		 }
	}
}
