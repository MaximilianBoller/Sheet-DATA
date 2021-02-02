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
	
	public int länge;
	public int höhe;
	
	public int strichX;
	public int strichY;
	
	String Art;

	public String getinfo()
	{	
		return 
		"" + "\n"+
		"<Note" + "\n" +
		höhe+ "\n" +
		länge+ "\n" +
		Notenwert+ "\n" +
		this.getX()+ "\n" +
		this.getY()+ "\n" +
		Art+ "\n" +
		Vorzeichen+ "\n" +
		"Note>" +
		"\n";
	}
	
	
	
	public notenpanel(int anfangshöhe, int breite, String art, String notenwert, String vorzeichen)
	{
	
		Notenwert = notenwert;
		Vorzeichen = vorzeichen;
		
		setLayout(null);
		setVisible(true);
		setBackground(Color.WHITE);
		setOpaque(false);
		

		
		länge = breite;
		Art = art;
		
		System.out.println("Test:" + art);
		
		
		
		
		
		
    	int y = Funktion.korrigieren(anfangshöhe);
    	höhe = y;
    		
    	if(höhe >= 100)
    	{
    		strichX = 15;
    		strichY = 40;
    	}
    	
    	if(höhe<100)
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
		        	
		        	höhe = y;
		        	repaint();
	        	}

	        	if(höhe >= 100)
	        	{
	        		strichX = 15;
	        		strichY = 40;
	        	}
	        	
	        	if(höhe<100)
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
		

		if(höhe <20)
		{
			n.fillRect(länge/2-20, 19, 40, 2);
		}
		
		if(höhe <40)
		{
			n.fillRect(länge/2-20, 39, 40, 2);
		}
		
		if(höhe >140)
		{
			n.fillRect(länge/2-20, 159, 40, 2);
		}
		
		if(höhe >160)
		{
			n.fillRect(länge/2-20, 179, 40, 2);
		}
		
		if(Notenwert.contentEquals("Note1"))
		{
			if(Art.contentEquals("note"))
			{
				URL noteurl = this.getClass().getResource("Note1.png");
				Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
//				n.drawImage(Bild,0,höhe-80,200,200,null);
				n.drawImage(Bild, 0, höhe-80, 200, 200, null);
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
				if(höhe <= 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_2L.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,höhe-80,100,200,null);

				}
				
				if(höhe > 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_2R.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,höhe-80,100,200,null);
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
			if(höhe <= 15)
			{
				n.drawLine(60/2-14, 20, 60/2+10, 20);
			}
			if(höhe <= 5)
			{
				n.drawLine(60/2-14, 10, 60/2+10, 10);
				n.drawLine(60/2-14, 20, 60/2+10, 20);
			}
			
			//Linien extra unten
			if(höhe >=75)
			{
				n.drawLine(60/2-14, 80, 60/2+10, 80);
			}
			if(höhe >=85)
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
				if(höhe <= 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_4L.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,höhe-80,60,200,null);
				}
				
				if(höhe > 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_4R.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,höhe-80,60,200,null);
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
				if(höhe <= 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_8L.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,höhe-80,40,200,null);
				}
				
				if(höhe > 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_8R.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,höhe-80,40,200,null);
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
				if(höhe <= 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_16L.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,höhe-80,40,200,null);
				}
				
				if(höhe > 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_16R.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,höhe-80,40,200,null);
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
				if(höhe <= 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_32L.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,höhe-80,40,200,null);
				}
				
				if(höhe > 80 )
				{
					URL noteurl = this.getClass().getResource("Note1_32R.png");
					Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
					n.drawImage(Bild,0,höhe-80,40,200,null);
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
			n.drawImage(Bild,länge / 2 - 30,höhe -10,20,40,null);
			
		}
		
		if(Vorzeichen.contentEquals("b"))
		{
			URL noteurl = this.getClass().getResource("b.png");
			Image Bild = Toolkit.getDefaultToolkit().getImage(noteurl);	
			n.drawImage(Bild,länge / 2 - 30,höhe - 10,20,40,null);
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