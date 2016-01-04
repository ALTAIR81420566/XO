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

	protected static boolean XO_gameOver(List<JButton> butnArr, JLabel label)
	{
		//assert(butnArr.size() == 9);
		System.out.println();
		if((butnArr.get(0).getText().equals("X") && butnArr.get(3).getText().equals("X") && butnArr.get(6).getText().equals("X")) ||
				(butnArr.get(1).getText().equals("X") && butnArr.get(4).getText().equals("X") && butnArr.get(7).getText().equals("X")) ||
				(butnArr.get(2).getText().equals("X") && butnArr.get(5).getText().equals("X") && butnArr.get(8).getText().equals("X")) ||
				(butnArr.get(0).getText().equals("X") && butnArr.get(1).getText().equals("X") && butnArr.get(2).getText().equals("X")) ||
				(butnArr.get(3).getText().equals("X") && butnArr.get(4).getText().equals("X") && butnArr.get(5).getText().equals("X")) ||
				(butnArr.get(6).getText().equals("X") && butnArr.get(7).getText().equals("X") && butnArr.get(8).getText().equals("X")) ||
				(butnArr.get(6).getText().equals("X") && butnArr.get(4).getText().equals("X") && butnArr.get(2).getText().equals("X")) ||
				(butnArr.get(0).getText().equals("X") && butnArr.get(4).getText().equals("X") && butnArr.get(8).getText().equals("X")))
		{
			label.setText("Выйграл - Х");
			return true;
		} 
		 else if((butnArr.get(0).getText().equals("O") && butnArr.get(3).getText().equals("O") && butnArr.get(6).getText().equals("O")) ||
					(butnArr.get(1).getText().equals("O") && butnArr.get(4).getText().equals("O") && butnArr.get(7).getText().equals("O")) ||
					(butnArr.get(2).getText().equals("O") && butnArr.get(5).getText().equals("O") && butnArr.get(8).getText().equals("O")) ||
					(butnArr.get(0).getText().equals("O") && butnArr.get(1).getText().equals("O") && butnArr.get(2).getText().equals("O")) ||
					(butnArr.get(3).getText().equals("O") && butnArr.get(4).getText().equals("O") && butnArr.get(5).getText().equals("O")) ||
					(butnArr.get(6).getText().equals("O") && butnArr.get(7).getText().equals("O") && butnArr.get(8).getText().equals("O")) ||
					(butnArr.get(6).getText().equals("O") && butnArr.get(4).getText().equals("O") && butnArr.get(2).getText().equals("O")) ||
					(butnArr.get(0).getText().equals("O") && butnArr.get(4).getText().equals("O") && butnArr.get(8).getText().equals("O")))
			{
			    label.setText("Выйграл - O");
				return true;
			} 
		       else
		       {
		    	   return false;
		       }
	}
}
