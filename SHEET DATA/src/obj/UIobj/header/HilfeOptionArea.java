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
import actions.setup.GetSystemFonts;
import funktionBundles.Funktion;
import funktionBundles.Var;

import quickParts.buttonCollections.OneButtonWithIcon;
import quickParts.buttonCollections.OneButtonWithIconStack;
import quickParts.buttonCollections.TwoButtonWithIcons;
import quickParts.buttons.OptionAreaButton;
import window.popups.MousePopup;

public class HilfeOptionArea extends JPanel
{
	
	public HilfeOptionArea()
	{
		setOpaque(true);
		setFont(Var.OpenSans12);
		setBorder(BorderFactory.createMatteBorder(1,0,1,0,Var.SekColor));
		setBackground(Var.PrimColor);
		setForeground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout(5,5,5));
		

		
		OneButtonWithIconStack packneueSeite = new OneButtonWithIconStack("Get System Fonts", "");
		packneueSeite.Button1.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
	        {
				Var.ClipboardLOG = GetSystemFonts.run();
				Var.clipboardData[1].update();
	        }
		});
		add(packneueSeite);
		
		
		
		
		
		OneButtonWithIconStack packKopfzeile = new OneButtonWithIconStack("02", "");
		packKopfzeile.Button1.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
	        {
				
	        }
		});
		add(packKopfzeile);

		
		
		
		
		OneButtonWithIconStack packFuﬂzeile = new OneButtonWithIconStack("03", "");
		packFuﬂzeile.Button1.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
	        {
				
	        }
		});
		add(packFuﬂzeile);

		
		
	}
}
