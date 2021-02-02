package rumpelkiste.notenblattBausteine;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


import funktionBundles.Var;


public class pausenwert1panel extends JPanel
{	
	
	public int breite = 200;
	
	public pausenwert1panel()
	{
		setLayout(null);
		setVisible(true);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(breite,100));
		
    
		
	}
	
	public void paint(Graphics g)
	{
		
		super.paintComponent(g);
		
		Graphics2D n = (Graphics2D) g;
		
		n.setColor(Color.BLACK);
		
		
		n.drawRect(10, 10, 50, 50);
		
		n.drawLine(0, 30, Var.notenblattbreite-139, 30 );
		n.drawLine(0, 40, Var.notenblattbreite-139, 40 );
		n.drawLine(0, 50, Var.notenblattbreite-139, 50 );
		n.drawLine(0, 60, Var.notenblattbreite-139, 60 );
		n.drawLine(0, 70, Var.notenblattbreite-139, 70 );

	


	}

}