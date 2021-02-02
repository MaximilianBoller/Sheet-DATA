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
	public String schlüssel;
	public String zählzeit;
	public String vorzeichen;
	public int xPosition;
	public int yposition;
	
	public int vorzeichenhöhe;
	public int einrückung;
	
	
	
	public static int notenXPosition;	


	public String getinfo()
	{	
		return 
		"\n"+
		"<Notenlinie" + "\n" +
		schlüssel + "\n" + 
		vorzeichen + "\n" +
		zählzeit + "\n" +
		xPosition + "\n" + 
		"Notenlinie>" +
		"\n";
	}
	
	public NotenLinie(int Nummer, String Schlüssel, String Zählzeit, String Vorzeichen, int Einrückung, int XPosition)
	{
		nummer = Nummer;
		

		xPosition = XPosition;
		vorzeichen = Vorzeichen;
		schlüssel = Schlüssel;
		zählzeit = Zählzeit;
		einrückung = Einrückung;
		
		
		
		
		
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
		        	AcNote.ausführen(nummer, e.getY());
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
		

		if(schlüssel.contentEquals("violin"))
		{
			URL schlüssel = this.getClass().getResource("violinschlüssel.png");
			Image Bild = Toolkit.getDefaultToolkit().getImage(schlüssel);	
			n.drawImage(Bild,einrückung + 0,0,80,200,null);
			vorzeichenhöhe = -6;
			
		}
		
		if(schlüssel.contentEquals("bass"))
		{
			URL schlüssel = this.getClass().getResource("bassschlüssel.png");
			Image Bild = Toolkit.getDefaultToolkit().getImage(schlüssel);	
			n.drawImage(Bild,einrückung + 0,0,80,200,null);
			
			vorzeichenhöhe = 15;
			
		}
		
		
		
		
		if(vorzeichen.contentEquals(""))
		{
			
		}

		else if(vorzeichen.contentEquals("1b"))
		{
			URL schlüssel = this.getClass().getResource("1b.png");
			Image SchlüsselBild = Toolkit.getDefaultToolkit().getImage(schlüssel);	
			n.setColor(Color.PINK);
			n.fillRect(einrückung + 80, einrückung, 100, 200);
			
			n.drawImage(SchlüsselBild,einrückung + 80,vorzeichenhöhe,100,200,null);

		}
		
		else if(vorzeichen.contentEquals("2b"))
		{
			URL schlüssel = this.getClass().getResource("2b.png");
			Image SchlüsselBild = Toolkit.getDefaultToolkit().getImage(schlüssel);	
			n.drawImage(SchlüsselBild,einrückung + 80,vorzeichenhöhe,100,200,null);
		}
		
		else if(vorzeichen.contentEquals("3b"))
		{
			URL schlüssel = this.getClass().getResource("3b.png");
			Image SchlüsselBild = Toolkit.getDefaultToolkit().getImage(schlüssel);	
			n.drawImage(SchlüsselBild,einrückung + 80,vorzeichenhöhe,100,200,null);
		}
		
		else if(vorzeichen.contentEquals("4b"))
		{
			URL schlüssel = this.getClass().getResource("4b.png");
			Image SchlüsselBild = Toolkit.getDefaultToolkit().getImage(schlüssel);	
			n.drawImage(SchlüsselBild,einrückung + 80,vorzeichenhöhe,100,200,null);
		}
		
		else if(vorzeichen.contentEquals("1#"))
		{
			URL schlüssel = this.getClass().getResource("1#.png");
			Image SchlüsselBild = Toolkit.getDefaultToolkit().getImage(schlüssel);	
			n.drawImage(SchlüsselBild,einrückung + 80,vorzeichenhöhe,100,200,null);
		}
		
		else if(vorzeichen.contentEquals("2#"))
		{
			URL schlüssel = this.getClass().getResource("2#.png");
			Image SchlüsselBild = Toolkit.getDefaultToolkit().getImage(schlüssel);	
			n.drawImage(SchlüsselBild,einrückung + 80,vorzeichenhöhe,100,200,null);
		}
		
		else if(vorzeichen.contentEquals("3#"))
		{
			URL schlüssel = this.getClass().getResource("3#.png");
			Image SchlüsselBild = Toolkit.getDefaultToolkit().getImage(schlüssel);	
			n.drawImage(SchlüsselBild,einrückung + 80,vorzeichenhöhe,100,200,null);
		}
		
		else if(vorzeichen.contentEquals("4#"))
		{
			URL schlüssel = this.getClass().getResource("4#.png");
			Image SchlüsselBild = Toolkit.getDefaultToolkit().getImage(schlüssel);	
			n.drawImage(SchlüsselBild,einrückung + 80,vorzeichenhöhe,100,200,null);
		}
		
		
		
		
		if(zählzeit.contentEquals(""))
		{

		}
		
		if(vorzeichen.contentEquals(""))
		{
			if(zählzeit.contentEquals("4/4"))
			{
				URL zählzeit = this.getClass().getResource("Takt44.png");
				Image ZählzeitBild = Toolkit.getDefaultToolkit().getImage(zählzeit);	
				n.drawImage(ZählzeitBild,einrückung +80,0,40,200,null);
			}
			else if(zählzeit.contentEquals("C"))
			{
				URL zählzeit = this.getClass().getResource("TaktC.png");
				Image ZählzeitBild = Toolkit.getDefaultToolkit().getImage(zählzeit);	
				n.drawImage(ZählzeitBild,einrückung + 80,0,40,200,null);
			}
			else if(zählzeit.contentEquals("3/4"))
			{
				URL zählzeit = this.getClass().getResource("Takt34.png");
				Image ZählzeitBild = Toolkit.getDefaultToolkit().getImage(zählzeit);	
				n.drawImage(ZählzeitBild,einrückung + 80,0,40,200,null);
			}
			else if(zählzeit.contentEquals("2/4"))
			{
				URL zählzeit = this.getClass().getResource("Takt24.png");
				Image ZählzeitBild = Toolkit.getDefaultToolkit().getImage(zählzeit);	
				n.drawImage(ZählzeitBild,einrückung + 80,0,40,200,null);
			}
		}
		
		else
		{
			if(zählzeit.contentEquals("4/4"))
			{
				URL zählzeit = this.getClass().getResource("Takt44.png");
				Image ZählzeitBild = Toolkit.getDefaultToolkit().getImage(zählzeit);	
				n.drawImage(ZählzeitBild,einrückung +180,0,40,200,null);
			}
			else if(zählzeit.contentEquals("C"))
			{
				URL zählzeit = this.getClass().getResource("TaktC.png");
				Image ZählzeitBild = Toolkit.getDefaultToolkit().getImage(zählzeit);	
				n.drawImage(ZählzeitBild,einrückung + 180,0,40,200,null);
			}
			else if(zählzeit.contentEquals("3/4"))
			{
				URL zählzeit = this.getClass().getResource("Takt34.png");
				Image ZählzeitBild = Toolkit.getDefaultToolkit().getImage(zählzeit);	
				n.drawImage(ZählzeitBild,einrückung + 180,0,40,200,null);
			}
			else if(zählzeit.contentEquals("2/4"))
			{
				URL zählzeit = this.getClass().getResource("Takt24.png");
				Image ZählzeitBild = Toolkit.getDefaultToolkit().getImage(zählzeit);	
				n.drawImage(ZählzeitBild,einrückung + 180,0,40,200,null);
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