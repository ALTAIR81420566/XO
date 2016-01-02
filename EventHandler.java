

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventHandler {

	
	
	public static char XOprinter(char B, JButton button, JLabel label)
	{
	  if(!Main.gameOver)
	  {
		if(B == 'n')
		{
		  if (Main.queue == true)
		  {
			  label.setText("Очередь - О");
			  button.setText("X");
			B = 'X';
			Main.queue = false;
		  }
	
		  else if (Main.queue == false)
		  {
			  label.setText("Очередь -Х");
			  button.setText("O");
			B = 'O';
			Main.queue = true;
		  }
		  
		}
	  } 
		return B;
	}
	
	protected static void gameOver(JFrame frame, JLabel label)
	{
		if ((Main.A == 'X' && Main.B == 'X' && Main.C == 'X') || (Main.A == 'X' && Main.E == 'X' && Main.I == 'X') ||
				(Main.G == 'X' && Main.E == 'X' && Main.C == 'X') || (Main.D == 'X' && Main.E == 'X' && Main.F == 'X') ||
				(Main.B == 'X' && Main.E == 'X' && Main.H == 'X') || (Main.A == 'X' && Main.D == 'X' && Main.G == 'X') || 
				(Main.C == 'X' && Main.F == 'X' && Main.I == 'X') || (Main.G == 'X' && Main.H == 'X' && Main.I == 'X'))
		{
			
			label.setText("Выйграл - Х");
			Main.gameOver = true;
		}
		if ((Main.A == 'O' && Main.B == 'O' && Main.C == 'O') || (Main.A == 'O' && Main.E == 'O' && Main.I == 'O') ||
				(Main.G == 'O' && Main.E == 'O' && Main.C == 'O') || (Main.D == 'O' && Main.E == 'O' && Main.F == 'O') ||
				(Main.B == 'O' && Main.E == 'O' && Main.H == 'O') || (Main.A == 'O' && Main.D == 'O' && Main.G == 'O') || 
				(Main.C == 'O' && Main.F == 'O' && Main.I == 'O') || (Main.G == 'O' && Main.H == 'O' && Main.I == 'O'))
		{
			
			label.setText("Выйграл - O");
			Main.gameOver = true;
		}
	}
}
