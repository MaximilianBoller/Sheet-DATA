package quickParts.labels;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

import funktionBundles.Var;

public class SelectionHeadingField extends JTextField
{
	public SelectionHeadingField(String Text, int SizeX, int SizeY, int BoundsX, int BoundsY)
	{
		setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.GRAY));
	    setFont(Var.OpenSans16);
	    setBackground(Var.PrimColor);
	    setOpaque(true);
	    setForeground(Color.WHITE);
	    setText(Text);
	    setPreferredSize(new Dimension(SizeX,SizeY));
	    setBounds(BoundsX,BoundsY,SizeX,SizeY);
	}
}
