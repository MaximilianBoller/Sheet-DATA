package rumpelkiste.notenblattBausteine;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.net.URL;


import javax.swing.ImageIcon;

import javax.swing.JPanel;



public class Schweif extends JPanel
{
	public String Art;
	
	public Schweif(String art)
	{
		Art = art;
		
		
		setLayout(null);
		setVisible(true);
		setBackground(Color.WHITE);
	}
	
	public void paint(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D n = (Graphics2D) g;
		
		if(Art.contentEquals("1Anfang"))
		{
			URL schweifurl = this.getClass().getResource("schweif1.png");	
			ImageIcon image = new ImageIcon(schweifurl);
			image.paintIcon(this, n, 0, 0);
		}
		
		if(Art.contentEquals("1Ende"))
		{
			URL schweifurl = this.getClass().getResource("schweif1Ende.png");	
			ImageIcon image = new ImageIcon(schweifurl);
			image.paintIcon(this, n, 0, 0);
		}
		
		
		
		
		
		if(Art.contentEquals("2Anfang"))
		{
			URL schweifurl = this.getClass().getResource("schweif2.png");	
			ImageIcon image = new ImageIcon(schweifurl);
			image.paintIcon(this, n, 0, 0);
		}
		
		if(Art.contentEquals("2Ende"))
		{
			URL schweifurl = this.getClass().getResource("schweif2Ende.png");	
			ImageIcon image = new ImageIcon(schweifurl);
			image.paintIcon(this, n, 0, 0);
		}
		
		
		
		if(Art.contentEquals("3Anfang"))
		{
			URL schweifurl = this.getClass().getResource("schweif3.png");	
			ImageIcon image = new ImageIcon(schweifurl);
			image.paintIcon(this, n, 0, 0);
		} 
		
		if(Art.contentEquals("3Ende"))
		{
			URL schweifurl = this.getClass().getResource("schweif3Ende.png");	
			ImageIcon image = new ImageIcon(schweifurl);
			image.paintIcon(this, n, 0, 0);
		}
		
		
		
		
		if(Art.contentEquals("4Anfang"))
		{
			URL schweifurl = this.getClass().getResource("schweif4.png");	
			ImageIcon image = new ImageIcon(schweifurl);
			image.paintIcon(this, n, 0, 0);
		}	
		
		if(Art.contentEquals("4Ende"))
		{
			URL schweifurl = this.getClass().getResource("schweif4Ende.png");	
			ImageIcon image = new ImageIcon(schweifurl);
			image.paintIcon(this, n, 0, 0);
		}
	}
}
