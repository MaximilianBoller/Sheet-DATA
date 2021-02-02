package obj.UIobj.header;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import actions.UIActions.AcClipboardPanel;
import actions.UIActions.AcLogPanel;
import actions.UIActions.AcNotationwritingTool;
import actions.UIActions.AcPagePanel;
import actions.UIActions.AcPiano;
import actions.WActions.AcPageViewWindow;
import actions.colorScheme.Dark;
import actions.colorScheme.Light;
import actions.save.Clipboard;
import actions.save.SaveProjectdataIntoLog;
import funktionBundles.Funktion;
import funktionBundles.Var;

import quickParts.buttonCollections.OneButtonWithIcon;
import quickParts.buttonCollections.TwoButtonWithIcons;
import quickParts.buttons.OptionAreaButton;

import window.dialogWindows.dialogWindowPNGSpeichern;
import window.dialogWindows.dialogWindowÖffnenDokument;

public class AnsichtOptionArea extends JPanel
{
	
	public AnsichtOptionArea()
	{
		setOpaque(true);
		setFont(Var.OpenSans12);
		setBorder(BorderFactory.createMatteBorder(1,0,1,0,Var.SekColor));
		setBackground(Var.PrimColor);
		setForeground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout(5,5,5));
		

		TwoButtonWithIcons packNewOpen = new TwoButtonWithIcons("Piano", "Tool", "piano.png", "tool.png");
		packNewOpen.Button1.popup(true, "Show Piano");
		packNewOpen.Button1.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
	        {
	        	AcPiano.ausführen();    
	        }
		});
		packNewOpen.Button2.popup(true, "Show Toolbar");
		packNewOpen.Button2.addMouseListener(new MouseAdapter()
		{
	        public void mouseClicked(MouseEvent e)
	        {
	        	if(Var.AddOnControlPanel)
	        	{
	        	}
	        	
	        	if(Var.AddOnControlPanel == false)
	        	{
		        	AcNotationwritingTool.ausführen();	
		        	Var.AddOnControlPanel = true;
	        	}
	        }
		});
		add(packNewOpen);

		
		

		TwoButtonWithIcons packEbenen = new TwoButtonWithIcons("Seiten", "Project DATA", "Ebenen.png", "log.png");
		packEbenen.Button1.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
	        {
				AcPagePanel.run();
	        }
		});
		packEbenen.Button2.addMouseListener(new MouseAdapter()
		{
	        public void mouseClicked(MouseEvent e)
	        {
	        	AcLogPanel.run();
	        }
		});
		add(packEbenen);
		
		
		
		
		TwoButtonWithIcons colorscheme = new TwoButtonWithIcons("Clipboard DATA", "Test Button 2", "", "");
		colorscheme.Button1.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
	        {
				AcClipboardPanel.run();
	        }
		});
		colorscheme.Button2.addMouseListener(new MouseAdapter()
		{
	        public void mouseClicked(MouseEvent e)
	        {
	        	
	        }
		});
		add(colorscheme);



		
	}
}
