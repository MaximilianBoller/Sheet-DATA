package rumpelkiste;

import java.awt.Dimension;
import javax.swing.JLayeredPane;

import funktionBundles.Var;

public class NotenBlattHintergrund extends JLayeredPane
{	
	public int Seitenzahl;

	public NotenBlattHintergrund()
	{
		setLayout(null);
		setVisible(true);
//		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(Var.arbeitsbereichbreite,Var.arbeitsbereichhöhe));
	}
}