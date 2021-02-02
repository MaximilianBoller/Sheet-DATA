package rumpelkiste;
import java.awt.Color;

import javax.swing.*;

public class StartFenster 
{
	public static void StartFenster()
	{
		JFrame frame = new JFrame("Willkommen bei QuickSheet");
		frame.setSize(1000, 800);
		frame.setLocationRelativeTo(null);

		
		JPanel pane = new JPanel();
		pane.setBackground(Color.WHITE);
		
		frame.add(pane);
		frame.setVisible(true);
	}
}
