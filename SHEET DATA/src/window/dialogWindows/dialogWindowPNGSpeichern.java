package window.dialogWindows;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.Insets;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.net.URL;

import javax.swing.*;


import actions.save.AcSafeImages;
import funktionBundles.Var;



public class dialogWindowPNGSpeichern extends JFrame 
{
	public static JLayeredPane hintergrund = new JLayeredPane();
	public static Insets insets = hintergrund.getInsets();
	
	public static JTextField textdateiname = new JTextField("Projekt01");
	
	public static String getProjektname()
	{
		return(textdateiname.getText());
	}
	
	public dialogWindowPNGSpeichern()
	{

		URL url = getClass().getResource("infoIcon.png");
		ImageIcon imgicon = new ImageIcon(url);
		super.setIconImage(imgicon.getImage());
		
		setTitle("PNG");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new BorderLayout());
		
		JPanel fußzeile = new JPanel();
		fußzeile.setPreferredSize(new Dimension(600,30));
		fußzeile.setVisible(true);
		fußzeile.setBackground(Color.DARK_GRAY);
		fußzeile.setBounds(0,331,600,31);
		hintergrund.setLayer(fußzeile, 2); 
		hintergrund.add(fußzeile);
		
		URL backgroundimage = this.getClass().getResource("PNGIcon.png");
		Icon background = new ImageIcon(backgroundimage);
		
		JLabel links = new JLabel(background);
		links.setPreferredSize(new Dimension(300,325));
		links.setVisible(true);
		links.setBackground(new Color(51,51,51));
//		links.setBackground(Color.green);
		links.setBounds(0,0,300,325);
		hintergrund.setLayer(links, 1); 
		hintergrund.add(links);
		
		JPanel rechts = new JPanel();
		rechts.setPreferredSize(new Dimension(300,400));
		rechts.setVisible(true);
		rechts.setBackground(Color.WHITE);
		rechts.setBounds(300,0,300,400);
		hintergrund.setLayer(rechts, 1); 
		hintergrund.add(rechts);
		
		JLabel dateiname = new JLabel();
		dateiname.setText("Dokumentname:");
		dateiname.setPreferredSize(new Dimension(500,30));
		dateiname.setFont(Var.standartFont20);
		dateiname.setBounds(310,10,500,30);
		hintergrund.setLayer(dateiname, 2); 
		hintergrund.add(dateiname);
		
		textdateiname.setBackground(Color.WHITE);
		textdateiname.setFont(Var.standartFont15);
		textdateiname.setBounds(310,50,265,30);
		hintergrund.setLayer(textdateiname, 2); 
		hintergrund.add(textdateiname);
		
	
		JButton öffnen = new JButton("Exportieren");
		öffnen.setBackground(Color.WHITE);
		öffnen.setForeground(Color.DARK_GRAY);
		öffnen.setPreferredSize(new Dimension(130,30));
		öffnen.setFont(Var.standartFont15);
		öffnen.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	Var.PNGName = textdateiname.getText();	        	
	        	AcSafeImages.ausführen();
	        	dispose();
	        	
	        }

	    });
		
		
		öffnen.setBounds(310,290,130,30);
		hintergrund.setLayer(öffnen, 2); 
		hintergrund.add(öffnen);
		
		
		
		JButton abbrechen = new JButton("Abbrechen");
		abbrechen.setBackground(Color.WHITE);
		abbrechen.setPreferredSize(new Dimension(125,30));
		abbrechen.setFont(Var.standartFont15);
		abbrechen.setBounds(450,290,125,30);
		abbrechen.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	dispose();
	        }

	    });
	    
		hintergrund.setLayer(abbrechen, 2); 
		hintergrund.add(abbrechen);
		
		
		
		
		
    	hintergrund.setBackground(Color.WHITE);
		hintergrund.setVisible(true);
		add(hintergrund, BorderLayout.CENTER);
    	
    	
    	
    	
    	
    	
    	

		

		
		
		
		
		
		
		
		

		
		
		

		
		

		
		setVisible(true);
	}
	

}
