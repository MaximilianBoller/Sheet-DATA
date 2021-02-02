package quickParts.labels;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

import funktionBundles.Var;

public class HeadlineLabel extends JLabel
{
	public HeadlineLabel(String title, int SizeX, int SizeY, int BoundsX, int BoundsY)
	{
	    setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.GRAY));
	    setFont(Var.OpenSans14);
//	    setBackground(Var.Color1);
//	    setOpaque(true);
	    setForeground(Color.LIGHT_GRAY);
	    setText(title);
	    setPreferredSize(new Dimension(SizeX,SizeY));
	    setBounds(BoundsX,BoundsY,SizeX,SizeY);
	}
}
