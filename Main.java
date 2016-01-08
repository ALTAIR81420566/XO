
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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

	/**
	 * ; Launch the application.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					new Main();

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
		btn1.setBounds(70, 72, 100, 89);
		;
		btn1.addActionListener(this);
		startpage.add(btn1);

		JButton btn2 = new JButton("Играть за О");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn2.setBackground(UIManager.getColor("Button.light"));
		btn2.setBounds(180, 72, 100, 89);
		btn2.addActionListener(this);
		startpage.add(btn2);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(100, 100, 366, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		label.setFont(new Font("Arial", Font.PLAIN, 16));
		label.setBounds(10, 26, 100, 24);
		frame.add(label);

		int c[][] = { { 10, 72 }, { 120, 72 }, { 230, 72 }, { 10, 171 }, { 118, 171 }, { 230, 171 }, { 10, 271 },
				{ 120, 271 }, { 230, 271 } };
		createXOButn(c);

		JButton restart = new JButton("Restart");
		restart.setBackground(UIManager.getColor("Button.light"));
		restart.setFont(new Font("Arial", Font.PLAIN, 10));
		restart.setBounds(249, 11, 81, 42);
		restart.addActionListener(this);
		frame.add(restart);

		JButton setSide = new JButton("Сменить сторону");
		setSide.setFont(new Font("Tahoma", Font.PLAIN, 10));
		setSide.setBounds(120, 11, 125, 42);
		setSide.addActionListener(this);
		frame.add(setSide);

		addListener(butnArr);
	}

	private void addListener(List<JButton> butnArr) {
		for (int i = 0; i < butnArr.size(); i++) {

			butnArr.get(i).addActionListener(this);
			butnArr.get(i).setActionCommand(Integer.toString(i));

		}
	}

	private void createXOButn(int[][] c) {

		for (int i = 0; i < c.length; i++) {

			JButton btn = new JButton("");
			btn.setFont(new Font("Tahoma", Font.PLAIN, 90));
			btn.setBackground(Color.WHITE);
			btn.setForeground(Color.BLACK);
			btn.setBounds(c[i][0], c[i][1], 100, 89);
			
			frame.add(btn);
			butnArr.add(btn);

		}

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Сменить сторону")) {
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
			if (side == true) {
				label.setText("\u041E\u0447\u0435\u0440\u0435\u0434\u044C - X");
			} else {
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
