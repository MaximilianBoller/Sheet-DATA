package obj.UIobj.header;

import java.awt.BasicStroke;
import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

import actions.save.SaveProjectIntoTXT;
import funktionBundles.Funktion;
import funktionBundles.Var;
import quickParts.buttonCollections.TwoButtonWithIcons;
import quickParts.buttons.OptionAreaButton;
import window.dialogWindows.ShortcutWindow;
import window.dialogWindows.dialogWindowNeuesProjektErstellen;
import window.dialogWindows.dialogWindowPNGSpeichern;
import window.dialogWindows.dialogWindow÷ffnenDokument;

public class DateiOptionArea extends JPanel
{
	
	public DateiOptionArea()
	{
		setOpaque(true);
		setFont(Var.OpenSans12);
		setBorder(BorderFactory.createMatteBorder(1,0,1,0,Var.SekColor));
		setBackground(Var.PrimColor);
		setForeground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout(5,5,5));


		
		TwoButtonWithIcons packNewOpen = new TwoButtonWithIcons("Neu", "÷ffnen", "newdokument.png", "opendokument.png");
		packNewOpen.Button1.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
	        {
	        	dialogWindowNeuesProjektErstellen npedialogwindow = new dialogWindowNeuesProjektErstellen();
	        	Var.neuesProjektErstellen[1] = npedialogwindow;
	        }
		});
		packNewOpen.Button2.addMouseListener(new MouseAdapter()
		{
	        public void mouseClicked(MouseEvent e)
	        {
	        	dialogWindow÷ffnenDokument ˆffnenDokumentFenster = new dialogWindow÷ffnenDokument();
	        }
		});
		add(packNewOpen);
		
		
		TwoButtonWithIcons packSaveExport = new TwoButtonWithIcons("Speichern","Export","speichern.png","export.png");
		packSaveExport.Button1.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
	        {
				
	        	Var.logInfo = "speichern...";
	        	Funktion.infoLogUpdate(1000);
	        	

	        	try 
	        	{
					SaveProjectIntoTXT.run();
				} 
	        	catch (Exception e1) 
	        	{
					e1.printStackTrace();
				}
	        	
	        	// no Log 
//	        	Var.AktivesDokument[1].textarea.setText(Var.log);
//	        	Var.AktivesDokument[1].textarea.validate();
	        }
		});
		packSaveExport.Button2.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
	        {
	        	dialogWindowPNGSpeichern dialogWindow = new dialogWindowPNGSpeichern();
	        	dialogWindow.setLocationRelativeTo(null);
	        }
		});
		add(packSaveExport);

		TwoButtonWithIcons propperties = new TwoButtonWithIcons("Shortcuts", " ", "", "");
		propperties.Button1.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
	        {
				ShortcutWindow shortcuts = new ShortcutWindow();
	        }
		});
		propperties.Button2.addMouseListener(new MouseAdapter()
		{
	        public void mouseClicked(MouseEvent e)
	        {
	        	
	        }
		});
		add(propperties);
		
		OptionAreaButton BEENDEN = new OptionAreaButton("BEENDEN",40,0,0, "");
		BEENDEN.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	System.exit(0);
	        }
	    });
		add(BEENDEN);
		

	}

	/*
    public void paintComponent(Graphics g)
    { 
        super.paintComponent(g);
        g.setColor(Var.SekColor);
        
        g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 5,5); 
    }
    */
}
