package obj.Wobj.notationarea;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

import HauptPackage.MainLayout;
import funktionBundles.Var;
import rumpelkiste.dropdown.dropdownDatei;

public class NotenLinienEinstellungen extends JFrame
{
	int nummer;

	public JLayeredPane hintergrund = new JLayeredPane();
	public JLabel hintergrundBild = new JLabel();
	
	public JComboBox vorzeichenListe;
	public String schlüssel = "";
	public String zählzeit = "";
	
	
	
	public JButton violinButton = new JButton();
	public JButton bassButton = new JButton();
	
	public JButton takt44 = new JButton();
	public JButton taktC = new JButton();
	public JButton takt34 = new JButton();
	public JButton takt24 = new JButton();
	
	
	
	public NotenLinienEinstellungen(int xwert,int ywert, int Nummer)
	{
		nummer = Nummer;

		LineBorder line = new LineBorder(Var.dunkelGrau, 0, false);
		LineBorder activLine = new LineBorder(Color.RED, 2, false);
		
		System.out.println("panel "+ nummer);
		
		setLayout(null);
	
		hintergrund.setBackground(Color.BLACK);
		hintergrund.setSize(new Dimension(120,280));
		hintergrund.setBounds(0,0,120,280);
		hintergrund.setLayout(null);
		
		
		URL BackgoundImage = this.getClass().getResource("NotenLinienEinstellungenHintergrund.png");
		Icon Image = new ImageIcon(BackgoundImage);
		hintergrundBild.setIcon(Image);
		hintergrundBild.setSize(new Dimension(120,280));
		hintergrundBild.setBounds(0,0,120,280);
		hintergrundBild.setVisible(true);
		hintergrund.setLayer(hintergrundBild, 1);
		hintergrund.add(hintergrundBild);
		
		
		
		URL violinImage = this.getClass().getResource("UIViolin.png");
		Icon Imageiconviolin = new ImageIcon(violinImage);
		violinButton.setIcon(Imageiconviolin);
		if(schlüssel.contentEquals("violin"))
		{
        	violinButton.setBorder(activLine);
		}
		else
		{
			violinButton.setBorder(line);
		}
		violinButton.setSize(new Dimension(50,50));
		violinButton.setBounds(10,10,50,50);
		violinButton.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {	
	        	violinButton.setBorder(activLine);
	        	bassButton.setBorder(line);
	        	schlüssel = "violin";
	        	
	        }
	    });
		hintergrund.setLayer(violinButton, 2);
		hintergrund.add(violinButton);
		
		
		
		URL bassImage = this.getClass().getResource("UIBass.png");
		Icon ImageiconBass = new ImageIcon(bassImage);
		bassButton.setIcon(ImageiconBass);
		bassButton.setBorder(line);
		bassButton.setSize(new Dimension(50,50));
		bassButton.setBounds(60,10,50,50);
		bassButton.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	bassButton.setBorder(activLine);
	        	violinButton.setBorder(line);
	        	schlüssel = "bass";
	        }
	    });
		hintergrund.setLayer(bassButton, 2);
		hintergrund.add(bassButton);
		
		
		URL Takt44 = this.getClass().getResource("Takt44.png");
		Icon Takt44Icon = new ImageIcon(Takt44);	
		takt44.setIcon(Takt44Icon);
		takt44.setBorder(line);
		takt44.setSize(new Dimension(25,50));
		takt44.setBounds(10,70,25,50);
		takt44.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	zählzeit = "4/4";
	        	
	        	takt44.setBorder(activLine);
	        	taktC.setBorder(line);
	        	takt34.setBorder(line);
	        	takt24.setBorder(line);
	        }
	    });
		hintergrund.setLayer(takt44, 2);
		hintergrund.add(takt44);
		
		URL TaktC = this.getClass().getResource("TaktC.png");
		Icon TaktCIcon = new ImageIcon(TaktC);	
		taktC.setIcon(TaktCIcon);
		taktC.setBorder(line);
		taktC.setSize(new Dimension(25,50));
		taktC.setBounds(35,70,25,50);
		taktC.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	zählzeit = "C";
	        	
	        	takt44.setBorder(line);
	        	taktC.setBorder(activLine);
	        	takt34.setBorder(line);
	        	takt24.setBorder(line);
	        }
	    });
		hintergrund.setLayer(taktC, 2);
		hintergrund.add(taktC);
		
		URL Takt34 = this.getClass().getResource("Takt34.png");
		Icon Takt34Icon = new ImageIcon(Takt34);	
		takt34.setIcon(Takt34Icon);
		takt34.setBorder(line);
		takt34.setSize(new Dimension(25,50));
		takt34.setBounds(60,70,25,50);
		takt34.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	zählzeit = "3/4";
	        	
	        	takt44.setBorder(line);
	        	taktC.setBorder(line);
	        	takt34.setBorder(activLine);
	        	takt24.setBorder(line);
	        }
	    });
		hintergrund.setLayer(takt34, 2);
		hintergrund.add(takt34);
		
		URL Takt24 = this.getClass().getResource("Takt24.png");
		Icon Takt24Icon = new ImageIcon(Takt24);	
		takt24.setIcon(Takt24Icon);
		takt24.setBorder(line);
		takt24.setSize(new Dimension(25,50));
		takt24.setBounds(85,70,25,50);
		takt24.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	zählzeit = "2/4";
	        	
	        	takt44.setBorder(line);
	        	taktC.setBorder(line);
	        	takt34.setBorder(line);
	        	takt24.setBorder(activLine);
	        }
	    });
		hintergrund.setLayer(takt24, 2);
		hintergrund.add(takt24);
		
		
		
		JLabel vorzeichen = new JLabel();
		vorzeichen.setText("Vorzeichen:");
		vorzeichen.setPreferredSize(new Dimension(100,30));
		vorzeichen.setFont(Var.standartFont15);
		vorzeichen.setBounds(10,130,100,30);
		hintergrund.setLayer(vorzeichen, 2); 
		hintergrund.add(vorzeichen);
		
		String anzahlListe[] =
			{
					"","1b","2b","3b","4b","1#","2#","3#","4#"
			};
		
		vorzeichenListe = new JComboBox(anzahlListe);
		vorzeichenListe.setFont(Var.standartFont15);
		vorzeichenListe.setBackground(Var.neutralGrau);
		vorzeichenListe.setPreferredSize(new Dimension(100,30));
		vorzeichenListe.setBounds(10,170,100,30);
		hintergrund.setLayer(vorzeichenListe, 2); 
		hintergrund.add(vorzeichenListe);
		
		JButton übernehmen = new JButton("Übernehmen");
		übernehmen.setFont(Var.standartFont15);
		übernehmen.setBackground(Var.neutralGrau);
		übernehmen.setPreferredSize(new Dimension(100,30));
		übernehmen.setBounds(10,210,100,30);
		LineBorder line1 = new LineBorder(Var.dunkelGrau, 1, false);
		übernehmen.setBorder(line1);
		übernehmen.addMouseListener(new MouseAdapter()
	    {
	        public void mousePressed(MouseEvent e)
	        {
	        	if(schlüssel == "violin")
	        	{
		        	Var.notenlinien[nummer].schlüssel = "violin";
		        	Var.notenlinien[nummer].repaint();
	        	}
	        	
	        	if(schlüssel == "bass")
	        	{
		        	Var.notenlinien[nummer].schlüssel = "bass";
		        	Var.notenlinien[nummer].repaint();
	        	}
	        	

	        	Var.notenlinien[nummer].vorzeichen = String.valueOf(vorzeichenListe.getSelectedItem());
	        	Var.notenlinien[nummer].zählzeit = zählzeit;
	        	Var.notenlinien[nummer].repaint();
	        	
	        	dispose();
	        	
	        }
	    });
		hintergrund.setLayer(übernehmen, 2); 
		hintergrund.add(übernehmen);
		
		
		
		
		
		
		
		
		hintergrundBild.setVisible(true);	
		add(hintergrund);

		addMouseListener(new MouseListener()
	    {
	        public void mouseReleased(MouseEvent e)
	        {
	        }
	
	        public void mousePressed(MouseEvent e)
	        {
	        	Var.notenLinienEinstelungen[Nummer].dispose();
	        }
	
	        public void mouseExited(MouseEvent e) 
	        {
	        }
	
	        public void mouseEntered(MouseEvent e)
	        {
	        }
	
	        public void mouseClicked(MouseEvent e) 
	        {
	        }
	    });
		
		
		setPreferredSize(new Dimension(120,280));
		setLocation(xwert,ywert);
		setUndecorated(true);
		setVisible(true);


	}
}