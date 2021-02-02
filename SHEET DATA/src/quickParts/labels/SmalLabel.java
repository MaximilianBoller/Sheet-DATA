package quickParts.labels;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import funktionBundles.Var;
import funktionBundles.getStringLength;

public class SmalLabel extends JLabel
{
	public SmalLabel(String title, int SizeY, int BoundsX, int BoundsY)
	{
		
		setText(title);
		setFont(Var.OpenSans12);
		setSize(getStringLength.run(title, getFont()) + 20, SizeY);
		setBounds(BoundsX, BoundsY, getStringLength.run(title, getFont()) + 20 , SizeY );
		
		setBackground(Var.PrimColor);
		setForeground(Var.PrimTextColor);
//		setBorder(BorderFactory.createMatteBorder(1,1,1,1,Var.SekColor));
	}
}