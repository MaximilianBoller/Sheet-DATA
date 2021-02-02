package obj.Wobj.notationarea;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.JLayeredPane;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

import actions.WActions.AcNote;
import funktionBundles.Var;
public class NotenLinie extends JLayeredPane
{	
	public int nummer;
	public String schl�ssel;
	public String z�hlzeit;
	public String vorzeichen;
	public int xPosition;
	public int yposition;
	
	public int vorzeichenh�he;
	public int einr�ckung;
	
	
	
	public static int notenXPosition;	


	public String getinfo()
	{	
		return 
		"\n"+
		"<Notenlinie" + "\n" +
		schl�ssel + "\n" + 
		vorzeichen + "\n" +
		z�hlzeit + "\n" +
		xPosition + "\n" + 
		"Notenlinie>" +
		"\n";
	}
	
	public NotenLinie(int Nummer, String Schl�ssel, String Z�hlzeit, String Vorzeichen, int Einr�ckung, int XPosition)
	{
		nummer = Nummer;
		

		xPosition = XPosition;
		vorzeichen = Vorzeichen;
		schl�ssel = Schl�ssel;
		z�hlzeit = Z�hlzeit;
		einr�ckung = Einr�ckung;
		
		
		
		
		
		setLayout(null);
		setVisible(true);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(800,200));
		
		addMouseListener(new MouseAdapter()
	    {
			public void mouseEntered(MouseEvent e)
			{
				setBackground(Var.neutralGrau);
			}
			public void mouseExited(MouseEvent e)
			{
				setBackground(Color.WHITE);
			}
	        public void mouseClicked(MouseEvent e)
	        {
	        	if(SwingUtilities.isRightMouseButton(e))
	        	{
		        	if(e.getClickCount() == 1)
		        	{
		        		setBackground(Color.RED);

		        		Var.notenLinienEinstelungen[Nummer].setSize(new Dimension(120,280));
		        		Var.notenLinienEinstelungen[Nummer].setLocation(e.getXOnScreen(), e.getYOnScreen());
		        		Var.notenLinienEinstelungen[Nummer].setVisible(true);
		        	}
	        	}
	        	if(SwingUtilities.isLeftMouseButton(e))
	        	{	
		        	AcNote.ausf�hren(nummer, e.getY());
	        	}
	        }
	    });

	}


	public void paint(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D n = (Graphics2D) g;

		
		n.setColor(Color.PINK);

//		n.fillRect(0, 0, 1520, 200);
		

		if(schl�ssel.contentEquals("violin"))
		{
			URL schl�ssel = this.getClass().getResource("violinschl�ssel.png");
			Image Bild = Toolkit.getDefaultToolkit().getImage(schl�ssel);	
			n.drawImage(Bild,einr�ckung + 0,0,80,200,null);
			vorzeichenh�he = -6;
			
		}
		
		if(schl�ssel.contentEquals("bass"))
		{
			URL schl�ssel = this.getClass().getResource("bassschl�ssel.png");
			Image Bild = Toolkit.getDefaultToolkit().getImage(schl�ssel);	
			n.drawImage(Bild,einr�ckung + 0,0,80,200,null);
			
			vorzeichenh�he = 15;
			
		}
		
		
		
		
		if(vorzeichen.contentEquals(""))
		{
			
		}

		else if(vorzeichen.contentEquals("1b"))
		{
			URL schl�ssel = this.getClass().getResource("1b.png");
			Image Schl�sselBild = Toolkit.getDefaultToolkit().getImage(schl�ssel);	
			n.setColor(Color.PINK);
			n.fillRect(einr�ckung + 80, einr�ckung, 100, 200);
			
			n.drawImage(Schl�sselBild,einr�ckung + 80,vorzeichenh�he,100,200,null);

		}
		
		else if(vorzeichen.contentEquals("2b"))
		{
			URL schl�ssel = this.getClass().getResource("2b.png");
			Image Schl�sselBild = Toolkit.getDefaultToolkit().getImage(schl�ssel);	
			n.drawImage(Schl�sselBild,einr�ckung + 80,vorzeichenh�he,100,200,null);
		}
		
		else if(vorzeichen.contentEquals("3b"))
		{
			URL schl�ssel = this.getClass().getResource("3b.png");
			Image Schl�sselBild = Toolkit.getDefaultToolkit().getImage(schl�ssel);	
			n.drawImage(Schl�sselBild,einr�ckung + 80,vorzeichenh�he,100,200,null);
		}
		
		else if(vorzeichen.contentEquals("4b"))
		{
			URL schl�ssel = this.getClass().getResource("4b.png");
			Image Schl�sselBild = Toolkit.getDefaultToolkit().getImage(schl�ssel);	
			n.drawImage(Schl�sselBild,einr�ckung + 80,vorzeichenh�he,100,200,null);
		}
		
		else if(vorzeichen.contentEquals("1#"))
		{
			URL schl�ssel = this.getClass().getResource("1#.png");
			Image Schl�sselBild = Toolkit.getDefaultToolkit().getImage(schl�ssel);	
			n.drawImage(Schl�sselBild,einr�ckung + 80,vorzeichenh�he,100,200,null);
		}
		
		else if(vorzeichen.contentEquals("2#"))
		{
			URL schl�ssel = this.getClass().getResource("2#.png");
			Image Schl�sselBild = Toolkit.getDefaultToolkit().getImage(schl�ssel);	
			n.drawImage(Schl�sselBild,einr�ckung + 80,vorzeichenh�he,100,200,null);
		}
		
		else if(vorzeichen.contentEquals("3#"))
		{
			URL schl�ssel = this.getClass().getResource("3#.png");
			Image Schl�sselBild = Toolkit.getDefaultToolkit().getImage(schl�ssel);	
			n.drawImage(Schl�sselBild,einr�ckung + 80,vorzeichenh�he,100,200,null);
		}
		
		else if(vorzeichen.contentEquals("4#"))
		{
			URL schl�ssel = this.getClass().getResource("4#.png");
			Image Schl�sselBild = Toolkit.getDefaultToolkit().getImage(schl�ssel);	
			n.drawImage(Schl�sselBild,einr�ckung + 80,vorzeichenh�he,100,200,null);
		}
		
		
		
		
		if(z�hlzeit.contentEquals(""))
		{

		}
		
		if(vorzeichen.contentEquals(""))
		{
			if(z�hlzeit.contentEquals("4/4"))
			{
				URL z�hlzeit = this.getClass().getResource("Takt44.png");
				Image Z�hlzeitBild = Toolkit.getDefaultToolkit().getImage(z�hlzeit);	
				n.drawImage(Z�hlzeitBild,einr�ckung +80,0,40,200,null);
			}
			else if(z�hlzeit.contentEquals("C"))
			{
				URL z�hlzeit = this.getClass().getResource("TaktC.png");
				Image Z�hlzeitBild = Toolkit.getDefaultToolkit().getImage(z�hlzeit);	
				n.drawImage(Z�hlzeitBild,einr�ckung + 80,0,40,200,null);
			}
			else if(z�hlzeit.contentEquals("3/4"))
			{
				URL z�hlzeit = this.getClass().getResource("Takt34.png");
				Image Z�hlzeitBild = Toolkit.getDefaultToolkit().getImage(z�hlzeit);	
				n.drawImage(Z�hlzeitBild,einr�ckung + 80,0,40,200,null);
			}
			else if(z�hlzeit.contentEquals("2/4"))
			{
				URL z�hlzeit = this.getClass().getResource("Takt24.png");
				Image Z�hlzeitBild = Toolkit.getDefaultToolkit().getImage(z�hlzeit);	
				n.drawImage(Z�hlzeitBild,einr�ckung + 80,0,40,200,null);
			}
		}
		
		else
		{
			if(z�hlzeit.contentEquals("4/4"))
			{
				URL z�hlzeit = this.getClass().getResource("Takt44.png");
				Image Z�hlzeitBild = Toolkit.getDefaultToolkit().getImage(z�hlzeit);	
				n.drawImage(Z�hlzeitBild,einr�ckung +180,0,40,200,null);
			}
			else if(z�hlzeit.contentEquals("C"))
			{
				URL z�hlzeit = this.getClass().getResource("TaktC.png");
				Image Z�hlzeitBild = Toolkit.getDefaultToolkit().getImage(z�hlzeit);	
				n.drawImage(Z�hlzeitBild,einr�ckung + 180,0,40,200,null);
			}
			else if(z�hlzeit.contentEquals("3/4"))
			{
				URL z�hlzeit = this.getClass().getResource("Takt34.png");
				Image Z�hlzeitBild = Toolkit.getDefaultToolkit().getImage(z�hlzeit);	
				n.drawImage(Z�hlzeitBild,einr�ckung + 180,0,40,200,null);
			}
			else if(z�hlzeit.contentEquals("2/4"))
			{
				URL z�hlzeit = this.getClass().getResource("Takt24.png");
				Image Z�hlzeitBild = Toolkit.getDefaultToolkit().getImage(z�hlzeit);	
				n.drawImage(Z�hlzeitBild,einr�ckung + 180,0,40,200,null);
			}
		}
		
		
		

		
		
		setFont(Var.standartFont15);
		

		
		
		n.setColor(Color.BLACK);
		
//		n.drawRect(0, 0, Var.blattBreite-200, 100);
		n.fillRect(0, 58, 3000, 2);
		
		n.fillRect(0, 78, 3000, 2);
		
		n.fillRect(0, 98, 3000, 2);
		
		n.fillRect(0, 118, 3000, 2);
		
		n.fillRect(0, 138, 3000, 2);
		
		n.drawRect(1,1,getWidth() - 1, getHeight() - 1);
		
		
		  
		
		n.drawLine(Var.notenblattbreite-200, 30, Var.notenblattbreite-200, 70 );
		
		n.drawString(String.valueOf(nummer), 20, 20);
	}
}