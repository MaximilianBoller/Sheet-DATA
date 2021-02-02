package rumpelkiste.dropdown;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JPanel;

import funktionBundles.Funktion;
import funktionBundles.Var;
import quickParts.buttons.DropdownButton;
import window.dialogWindows.dialogWindowNeuesProjektErstellen;
import window.dialogWindows.dialogWindowÖffnenDokument;
import rumpelkiste.*;

public class dropdownDatei extends JDialog 
{
	public JPanel container = new JPanel();
	
	public dropdownDatei()
	{
		container.setLayout(new GridLayout(4,1));
		container.setBorder(BorderFactory.createLineBorder(Var.SekColor, 1));
		
		
		DropdownButton neu = new DropdownButton("neu");
		neu.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	dialogWindowNeuesProjektErstellen neuesDokumentFenster = new dialogWindowNeuesProjektErstellen();
	        	Var.dialogwindowNeuesDokument[1] = neuesDokumentFenster;
	        	
	        }

	    });
		container.add(neu);

		
		DropdownButton öffnen = new DropdownButton("öffnnen");
		öffnen.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	dialogWindowÖffnenDokument öffnenDokumentFenster = new dialogWindowÖffnenDokument();
	        }

	    });
		container.add(öffnen);

		DropdownButton speichern = new DropdownButton("speichern");
		speichern.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	Var.logInfo = "speichern...";
	        	Funktion.infoLogUpdate(1000);
	        	
//	        	SaveProjectdataIntoLog.run();
//	        	SaveProjectIntoTXT.run();
	        	
	        	
	        	
	        	Var.projectData[1].textarea.setText(Var.ProjectLOG);
	        	Var.projectData[1].textarea.validate();
	        }

	    });
		container.add(speichern);
		
		
		DropdownButton beenden = new DropdownButton("beenden");	
		beenden.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	System.exit(0);
	        }

	    });
		container.add(beenden);
		
		add(container);
		
		
		setPreferredSize(new Dimension(200, container.getComponentCount() * 25));
		setMinimumSize(new Dimension(200, container.getComponentCount() * 25));
		setMaximumSize(new Dimension(200, container.getComponentCount() * 25));
		
		
		setUndecorated(true);
		setVisible(true);

	}
}
