package quickParts.labels;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

import funktionBundles.Var;

public class SelectionField extends JTextField
{
	public SelectionField(String Text, int SizeX, int SizeY, int BoundsX, int BoundsY)
	{
		setBorder(BorderFactory.createMatteBorder(1,1,1,1,Var.BorderColor));
	    setFont(Var.OpenSans14);
	    setBackground(Var.SekColor);
	    setOpaque(true);
	    setForeground(Color.LIGHT_GRAY);
	    setText(Text);
	    setPreferredSize(new Dimension(SizeX,SizeY));
	    setBounds(BoundsX,BoundsY,SizeX,SizeY);
	}
}
