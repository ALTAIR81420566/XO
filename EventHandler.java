package xo_2;



import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;

public class EventHandler 
{
	public static boolean XOprinter(boolean queue, boolean gameOver, JButton button, JLabel label)
	{
	  if(!gameOver)
	  {
		if(button.getText().equals(""))
		{
		  if (queue == true)
		  {
			  label.setText("Очередь - О");
			  button.setText("X");
			
			return false;
		  }
	
		  else 
		  {
			  label.setText("Очередь - Х");
			  button.setText("O");
			
			return true;
		  }
		  
		}
	  } 
		return queue;
	}

	protected static String[] mapmaker(String[] map, String actionCommand, String XO)
	{
		
		int ac = new Integer(actionCommand);
		
		map[ac] = XO;
		
		
		return map;
		
	}
	
	protected static boolean XO_gameOver(String[] map, JLabel label)
	{
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
