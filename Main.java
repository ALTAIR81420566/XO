

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
import java.awt.Color;
import javax.swing.UIManager;

public class Main implements ActionListener {

	private static boolean side = true;
	private static boolean gameOver = false;
	private List<JButton> butnArr = new ArrayList();
	private String[] map = new String[9];
	private JFrame frame;
	private JFrame startpage;
	private JLabel label = new JLabel("\u041E\u0447\u0435\u0440\u0435\u0434\u044C - X");

	/**;
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					
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
		initializeStart();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializeStart() {
		startpage = new JFrame();
		startpage.setVisible(true);
		startpage.setBounds(100, 100, 366, 425);
		startpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		startpage.getContentPane().setLayout(null);
		
		JButton btn1 = new JButton("Играть за Х");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn1.setBackground(UIManager.getColor("Button.light"));
		btn1.setForeground(Color.BLACK);
		btn1.setBounds(70, 72, 100, 89);;
		btn1.addActionListener(this);
		startpage.getContentPane().add(btn1);
		
		
		JButton btn2 = new JButton("Играть за О");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn2.setBackground(UIManager.getColor("Button.light"));
		btn2.setBounds(180, 72, 100, 89);
		btn2.addActionListener(this);
		startpage.getContentPane().add(btn2);
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(100, 100, 366, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		label.setFont(new Font("Arial", Font.PLAIN, 16));
		label.setBounds(10, 26, 100, 24);
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
		restart.setFont(new Font("Arial", Font.PLAIN, 10));
		restart.setBounds(249, 11, 81, 42);
		restart.addActionListener(this);
		frame.getContentPane().add(restart);
		
		JButton setSide = new JButton("Сменить сторону");
		setSide.setFont(new Font("Tahoma", Font.PLAIN, 10));
		setSide.setBounds(120, 11, 125, 42);
		setSide.addActionListener(this);
		frame.getContentPane().add(setSide);
		
		
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

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Сменить сторону")){
			gameOver = false;
			map = new String[9];
			for (JButton btn : butnArr) {
				btn.setText("");
			}
			frame.setVisible(false);
			startpage.setVisible(true);
		} else if (e.getActionCommand().equals("Играть за Х")) {
			side = true;
			startpage.setVisible(false);
			frame.setVisible(true);

		} else if (e.getActionCommand().equals("Играть за О")) {
			side = false;
			startpage.setVisible(false);
			frame.setVisible(true);
			map = EventHandler.compPlayer(false, map, side, gameOver, label, butnArr);

		} else if (e.getActionCommand().equals("Restart")) {

			gameOver = false;
			map = new String[9];
			for (JButton btn : butnArr) {
				btn.setText("");
			}
			if(side == true){
			label.setText("\u041E\u0447\u0435\u0440\u0435\u0434\u044C - X");
			}else{
				map = EventHandler.compPlayer(false, map, side, gameOver, label, butnArr);
				label.setText("Очередь - О");
			}
		} else {

			for (int i = 0; i < butnArr.size(); i++) {
				if (e.getSource().equals(butnArr.get(i))) {
					boolean incorrectButton = EventHandler.XOprinter(side, gameOver, butnArr.get(i), label);
					map = EventHandler.mapmaker(map, butnArr.get(i).getActionCommand(), butnArr.get(i).getText());
					gameOver = EventHandler.XO_gameOver(map, label);

					map = EventHandler.compPlayer(incorrectButton, map, side, gameOver, label, butnArr);
					gameOver = EventHandler.XO_gameOver(map, label);
				}

			}

		}
	}
}
