package rumpelkiste.dropdown;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


import actions.WActions.AcEmptyPage;
import funktionBundles.Funktion;
import funktionBundles.Var;
import rumpelkiste.AcMusicalStaff;



public class dropdownHinzufügen extends JDialog
{
	public static JLayeredPane drophintergrund = new JLayeredPane();
	public static Insets insets = drophintergrund.getInsets();
	
	public dropdownHinzufügen()
	{

		drophintergrund.setPreferredSize(new Dimension(200,5*30));
		drophintergrund.setLayout(null);
		drophintergrund.setBackground(Color.BLACK);
	
		// panel dient nur dazu das Panel zu sehen, da einem LayeredPane keine Hintergrundfarbe gegeben werden kann.
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(200,5*30));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0,0,200,5*30);
		drophintergrund.setLayer(panel, 1); 
		drophintergrund.add(panel);
		//''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
		
		
		JButton notenseite = new JButton("        " + "Notenlinien");
		notenseite.setPreferredSize(new Dimension(100,30));
		notenseite.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		notenseite.setBackground(Color.DARK_GRAY);
		notenseite.setForeground(Color.WHITE);
		notenseite.setFont(Var.standartFont13);
		notenseite.setHorizontalAlignment(SwingConstants.LEFT);
		
		notenseite.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	Funktion.infoLogUpdate(1000);
	        	

	        	AcMusicalStaff.run();
	        	
	        }

	    });
		
		notenseite.setBounds(0,0,200,30);
		drophintergrund.setLayer(notenseite, 2); 
		drophintergrund.add(notenseite);
		
		
		JButton notenLinie = new JButton("        " + "emptyPage");
		notenLinie.setPreferredSize(new Dimension(100,30));
		notenLinie.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		notenLinie.setBackground(Color.DARK_GRAY);
		notenLinie.setForeground(Color.WHITE);
		notenLinie.setFont(Var.standartFont13);
		notenLinie.setHorizontalAlignment(SwingConstants.LEFT);
		
		notenLinie.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	AcEmptyPage.run("...");
	        	

	        	
	        }
	    });
		
		notenLinie.setBounds(0,30,200,30);
		drophintergrund.setLayer(notenLinie, 2); 
		drophintergrund.add(notenLinie);
		
		
		JButton bimbo = new JButton("        " + "-");
		bimbo.setPreferredSize(new Dimension(100,30));
		bimbo.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		bimbo.setBackground(Color.DARK_GRAY);
		bimbo.setForeground(Color.WHITE);
		bimbo.setFont(Var.standartFont13);
		bimbo.setHorizontalAlignment(SwingConstants.LEFT);
		
		bimbo.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
        	

	        	
	        }
	    });
		
		bimbo.setBounds(0,60,200,30);
		drophintergrund.setLayer(bimbo, 2); 
		drophintergrund.add(bimbo);
		
		
		
		
		JButton notizenklein = new JButton("        " + "Kleine Notiz");
		notizenklein.setPreferredSize(new Dimension(100,30));
		notizenklein.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		notizenklein.setBackground(Color.DARK_GRAY);
		notizenklein.setForeground(Color.WHITE);
		notizenklein.setFont(Var.standartFont13);
		notizenklein.setHorizontalAlignment(SwingConstants.LEFT);
		
		notizenklein.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	//AcPostItKlein.ausführen();
	        	
	        }
	    });
		
		notizenklein.setBounds(0,90,200,30);
		drophintergrund.setLayer(notizenklein, 2); 
		drophintergrund.add(notizenklein);
		
		
		JButton notizen = new JButton("        " + "Große Notiz");
		notizen.setPreferredSize(new Dimension(100,30));
		notizen.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		notizen.setBackground(Color.DARK_GRAY);
		notizen.setForeground(Color.WHITE);
		notizen.setFont(Var.standartFont13);
		notizen.setHorizontalAlignment(SwingConstants.LEFT);
		
		notizen.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {

	        	//AcPostItGroß.ausführen();
	        }
	    });
		
		notizen.setBounds(0,120,200,30);
		drophintergrund.setLayer(notizen, 2); 
		drophintergrund.add(notizen);
		

		add(drophintergrund);
	}
}