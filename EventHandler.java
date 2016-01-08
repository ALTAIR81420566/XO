
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;

public class EventHandler {
	public static boolean XOprinter(boolean side, boolean gameOver, JButton button, JLabel label) {
		boolean incorrectButton = false;
		if (!gameOver) {
			if (button.getText().equals("")) {
				if (side == true) {
					label.setText("Очередь - О");
					button.setText("X");

				}

				else {
					label.setText("Очередь - Х");
					button.setText("O");

				}

			} else {
				incorrectButton = true;
				return incorrectButton;
			}

		}
		return incorrectButton;
	}

	protected static String[] compPlayer(boolean incorrectButton, String[] map, boolean side, boolean gameOver,
			JLabel label, List<JButton> butnArr) {
		if (!gameOver && incorrectButton == false) {
			if (side == true) {
				side = false;
			} else {
				side = true;
			}
			List<Integer> nullElements = new ArrayList<Integer>();
			for (int i = 0; i < map.length; i++) {
				if (map[i] == null) {
					nullElements.add(i);
				}
			}

			Random rand = new Random();
			int randIndx = rand.nextInt(nullElements.size());
			int randEl = nullElements.get(randIndx);
			XOprinter(side, gameOver, butnArr.get(randEl), label);
			map = mapmaker(map, butnArr.get(randEl).getActionCommand(), butnArr.get(randEl).getText());

		}

		return map;
	}

	protected static String[] mapmaker(String[] map, String actionCommand, String XO) {

		int ac = new Integer(actionCommand);
		map[ac] = XO;
		return map;

	}

	protected static boolean XO_gameOver(String[] map, JLabel label) {
		if ((map[0] == "X" && map[3] == "X" && map[6] == "X") || (map[1] == "X" && map[4] == "X" && map[7] == "X")
				|| (map[2] == "X" && map[5] == "X" && map[8] == "X")
				|| (map[0] == "X" && map[1] == "X" && map[2] == "X")
				|| (map[3] == "X" && map[4] == "X" && map[5] == "X")
				|| (map[6] == "X" && map[7] == "X" && map[8] == "X")
				|| (map[6] == "X" && map[4] == "X" && map[2] == "X")
				|| (map[0] == "X" && map[4] == "X" && map[8] == "X")) {

			label.setText("Выйграл - X ");
			return true;
		} else if ((map[0] == "O" && map[3] == "O" && map[6] == "O")
				|| (map[1] == "O" && map[4] == "O" && map[7] == "O")
				|| (map[2] == "O" && map[5] == "O" && map[8] == "O")
				|| (map[0] == "O" && map[1] == "O" && map[2] == "O")
				|| (map[3] == "O" && map[4] == "O" && map[5] == "O")
				|| (map[6] == "O" && map[7] == "O" && map[8] == "O")
				|| (map[6] == "O" && map[4] == "O" && map[2] == "O")
				|| (map[0] == "O" && map[4] == "O" && map[8] == "O")) {
			label.setText("Выйграл - O ");
			return true;
		} else {
			return false;
		}
	}
}
