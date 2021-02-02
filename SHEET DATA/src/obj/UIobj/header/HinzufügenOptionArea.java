package obj.UIobj.header;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.SwingConstants;

import actions.UIActions.AcNotationwritingTool;
import actions.UIActions.AcPiano;
import actions.WActions.AcEmptyKopfzeile;
import actions.WActions.AcEmptyPage;
import actions.save.SaveProjectdataIntoLog;
import funktionBundles.Funktion;
import funktionBundles.Var;

import quickParts.buttonCollections.OneButtonWithIcon;
import quickParts.buttonCollections.OneButtonWithIconStack;
import quickParts.buttonCollections.TwoButtonWithIcons;
import quickParts.buttons.OptionAreaButton;
import window.popups.MousePopup;

public class Hinzuf¸genOptionArea extends JPanel
{
	
	public Hinzuf¸genOptionArea()
	{
		setOpaque(true);
		setFont(Var.OpenSans12);
		setBorder(BorderFactory.createMatteBorder(1,0,1,0,Var.SekColor));
		setBackground(Var.PrimColor);
		setForeground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout(5,5,5));
		

		
		// SPEICHERN _START
		OneButtonWithIconStack packneueSeite = new OneButtonWithIconStack("+ Seite", "neueSeite.png");
		packneueSeite.Button1.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
	        {
	        	AcEmptyPage.run("");
	        }
		});
		
		add(packneueSeite);
		// SPEICHERN _END
		
		
		
		// SPEICHERN _START
		OneButtonWithIconStack packKopfzeile = new OneButtonWithIconStack("Kopfzeile", "kopfzeile.png");
		packKopfzeile.Button1.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
	        {
	        	AcEmptyKopfzeile.run("");
	        }
		});
		
		add(packKopfzeile);
		// SPEICHERN _END
		
		// SPEICHERN _START
		OneButtonWithIconStack packFuﬂzeile = new OneButtonWithIconStack("Fuﬂzeile", "fuﬂzeile.png");
		packFuﬂzeile.Button1.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
	        {
//	        	AcEmptyPage.run("");
	        }
		});
		
		add(packFuﬂzeile);
		// SPEICHERN _END
		
		
	}
}
