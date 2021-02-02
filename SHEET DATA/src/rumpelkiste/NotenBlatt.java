package rumpelkiste;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;


import javax.swing.JLayeredPane;


import funktionBundles.Var;


//import Tests.TestPanel;

public class NotenBlatt extends JLayeredPane
{	
	public int Seitenzahl;

	public NotenBlatt(int SeitenZahl)
	{
		setLayout(null);
		setVisible(true);
		setBackground(Color.DARK_GRAY);
		setPreferredSize(new Dimension(Var.arbeitsbereichbreite,Var.arbeitsbereichhöhe));
		this.Seitenzahl = SeitenZahl;
		
	}
	
	public void paint(Graphics g)
	{
		Font font = new Font("Calibri light", Font.PLAIN, 40);
		
		super.paintComponent(g);
		
		Graphics2D n = (Graphics2D) g;
		

		
		n.setColor(Color.WHITE);
//		n.fillRect(0, 0, Var.blattBreite, Var.blattHöhe);
		
		n.setColor(Color.GRAY);		
		n.setFont(Var.standartFont25);		
		n.setFont(Var.standartFont15);		
//		n.drawString(Var.ProjektName, 80, Var.notenblatthöhe-80);		
//		n.drawString("Seite "+ Seitenzahl, Var.notenblattbreite-100,Var.notenblatthöhe-80);	

	}

}
	