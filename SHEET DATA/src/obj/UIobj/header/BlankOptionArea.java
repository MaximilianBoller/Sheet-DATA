package obj.UIobj.header;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import funktionBundles.Var;

public class BlankOptionArea extends JLabel
{
	public BlankOptionArea()
	{
		setOpaque(true);
		setText("welcome to SHEET, a place where you can sheet everything");
		setFont(Var.OpenSans12);
		
		setHorizontalAlignment(SwingConstants.CENTER);
		setVerticalAlignment(SwingConstants.CENTER);
		
		setBorder(BorderFactory.createMatteBorder(1,0,1,0,Var.SekColor));
		
		setPreferredSize(new Dimension(62,62));
		setBackground(Var.PrimColor);
		setForeground(Color.LIGHT_GRAY);
	}
}
