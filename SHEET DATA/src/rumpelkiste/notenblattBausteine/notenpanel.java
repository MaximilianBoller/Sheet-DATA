package rumpelkiste.notenblattBausteine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.net.URL;
import java.text.AttributedString;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;


import funktionBundles.Funktion;

public class notenpanel extends JPanel
{	

	
	public String Notenwert;
	
	public String Vorzeichen;
	
	public boolean kreuz;
	public boolean b;
	
	public int l�nge;
	public int h�he;
	
	public int strichX;
	public int strichY;
	
	String Art;

	public String getinfo()
	{	
		return 
		"" + "\n"+
		"<Note" + "\n" +
		h�he+ "\n" +
		l�nge+ "\n" +
		Notenwert+ "\n" +
		this.getX()+ "\n" +
		this.getY()+ "\n" +
		Art+ "\n" +
		Vorzeichen+ "\n" +
		"Note>" +
		"\n";
	}
	
	
	
	public notenpanel(int anfangsh�he, int breite, String art, String notenwert, String vorzeichen)
	{
	
		Notenwert = notenwert;
		Vorzeichen = vorzeichen;
		
		setLayout(null);
		setVisible(true);
		setBackground(Color.WHITE);
		setOpaque(false);
		

		
		l�nge = breite;
		Art = art;
		
		System.out.println("Test:" + art);
		
		
		
		
		
		
    	int y = Funktion.korrigieren(anfangsh�he);
    	h�he = y;
    		
    	if(h�he >= 100)
    	{
    		strichX = 15;
    		strichY = 40;
    	}
    	
    	if(h�he<100)
    	{
    		strichX = 0;
    		strichY = -50;
    	}
    	
		addMouseListener(new MouseAdapter()
	    {

			
	        public void mouseClicked(MouseEvent e)
	        {
	        	if(SwingUtilities.isRightMouseButton(e))
	        	{
		        	if(e.getClickCount() == 1)
		        	{
		        		System.out.println("bub");
		        		Vorzeichen = "#";
		        		repaint();
		        	}
		        	
		        	if(e.getClickCount() == 2)
		        	{
		        		System.out.println("bub");
		        		Vorzeichen = "b";
		        		
		        		repaint();
		        	}
		        	
		        	if(e.getClickCount() == 3)
		        	{
		        		System.out.println("bub");
		        		Vorzeichen = "";
		        		
		        		repaint();
		        	}
	        	}
	        	
	        	if(SwingUtilities.isLeftMouseButton(e))
	        	{
//		        	System.out.println("I'm here");
		        	int y = Funktion.korrigieren(e.getY());
		        	
		        	h�he = y;
		        	repaint();
	        	}

	        	if(h�he >= 100)
	        	{
	        		strichX = 15;
	        		strichY = 40;
	        	}
	        	
	        	if(h�he<100)
	        	{
	        		strichX = 0;
	        		strichY = -50;
	        	}
	        }
	        
	    });
		
	}
	
	public void paint(Graphics g)
	{
		
		super.paintComponent(g);
		
		Graphics2D n = (Graphics2D) g;
		
		n.setColor(Color.BLACK);
		

		if(h�he <20)
		{
			n.fillRect(l�nge/2-20, 19, 40, 2);
		}
		
		if(h�he <40)
		{
			n.fillRect(l�nge/2-20, 39, 40, 2);
		}
		
		if(h�he >140)
		{
			n.fillRect(l�nge/2-20, 159, 40, 2);
		}
		
		if(h�he >160)
		{
			n.fillRect(l�nge/2-20, 179, 40, 2);
		}
		
		if(Notenwert.contentEquals("Note1"))
		{
			if(Art.contentEquals("note"))
			{
				URL noteurl = this.getClass().getResource("Note1.png");
				Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
//				n.drawImage(Bild,0,h�he-80,200,200,null);
				n.drawImage(Bild, 0, h�he-80, 200, 200, null);
			}
			
			if(Art.contentEquals("pause"))
			{
				
				URL noteurl = this.getClass().getResource("Pause1.png");
				Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
				n.drawImage(Bild,0,0,200,200,null);
			}
			
			
			

			
			
			
			
			
		}
		
		if(Notenwert.contentEquals("Note1_2"))
		{
			if(Art.contentEquals("note"))
			{
				if(h�he <= 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_2L.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,h�he-80,100,200,null);

				}
				
				if(h�he > 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_2R.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,h�he-80,100,200,null);
				}
			}

			if(Art.contentEquals("pause"))
			{
				URL noteurl = this.getClass().getResource("Pause1_2.png");
				Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
				n.drawImage(Bild,0,0,100,200,null);
			}
			
			/*
			
			//Linien extra oben
			if(h�he <= 15)
			{
				n.drawLine(60/2-14, 20, 60/2+10, 20);
			}
			if(h�he <= 5)
			{
				n.drawLine(60/2-14, 10, 60/2+10, 10);
				n.drawLine(60/2-14, 20, 60/2+10, 20);
			}
			
			//Linien extra unten
			if(h�he >=75)
			{
				n.drawLine(60/2-14, 80, 60/2+10, 80);
			}
			if(h�he >=85)
			{
				n.drawLine(60/2-14, 90, 60/2+10, 90);
				n.drawLine(60/2-14, 80, 60/2+10, 80);
			}
			*/
			
			
		}
		
		if(Notenwert.contentEquals("Note1_4"))
		{
			if(Art.contentEquals("note"))
			{
				if(h�he <= 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_4L.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,h�he-80,60,200,null);
				}
				
				if(h�he > 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_4R.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,h�he-80,60,200,null);
				}
			}
			
			if(Art.contentEquals("pause"))
			{
				URL noteurl = this.getClass().getResource("Pause1_4.png");
				Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
				n.drawImage(Bild,0,0,60,200,null);
			}
			

		
		}
		
		
		
		if(Notenwert.contentEquals("Note1_8"))
		{
			if(Art.contentEquals("note"))
			{
				if(h�he <= 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_8L.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,h�he-80,40,200,null);
				}
				
				if(h�he > 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_8R.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,h�he-80,40,200,null);
				}
			}
			
			if(Art.contentEquals("pause"))
			{
				URL noteurl = this.getClass().getResource("Pause1_8.png");
				Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
				n.drawImage(Bild,0,0,40,200,null);
			}
		}
		
		
		
		if(Notenwert.contentEquals("Note1_16"))
		{
			if(Art.contentEquals("note"))
			{
				if(h�he <= 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_16L.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,h�he-80,40,200,null);
				}
				
				if(h�he > 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_16R.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,h�he-80,40,200,null);
				}
			}

			
			if(Art.contentEquals("pause"))
			{
				URL noteurl = this.getClass().getResource("Pause1_16.png");
				Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
				n.drawImage(Bild,0,0,40,200,null);
			}
		}
		
		if(Notenwert.contentEquals("Note1_32"))
		{
			if(Art.contentEquals("note"))
			{
				if(h�he <= 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_32L.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,h�he-80,40,200,null);
				}
				
				if(h�he > 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_32R.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,h�he-80,40,200,null);
				}
			}
			if(Art.contentEquals("pause"))
			{
				URL noteurl = this.getClass().getResource("Pause1_32.png");
				Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
				n.drawImage(Bild,0,0,40,200,null);
			}
		}


		
		if(Vorzeichen.contentEquals("#"))
		{
			URL noteurl = this.getClass().getResource("#.png");
			Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
			n.drawImage(Bild,l�nge / 2 - 30,h�he -10,20,40,null);
			
		}
		
		if(Vorzeichen.contentEquals("b"))
		{
			URL noteurl = this.getClass().getResource("b.png");
			Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
			n.drawImage(Bild,l�nge / 2 - 30,h�he - 10,20,40,null);
		}
		
		if(Art.contentEquals("Takt"))
		{

				URL noteurl = this.getClass().getResource("Takt.png");
				Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
				n.drawImage(Bild,0,0,40,200,null);
				
		}
		else
		{
			return;
		}
		



	}

}