package quickParts.labels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import funktionBundles.Var;

public class TypefaceLabel extends JTextField
{
	MouseListener mouseListener;
	
	public TypefaceLabel(String font)
	{
		Font typeface = new Font(font, Font.PLAIN, 12);
		
		setSize(170,20);
		setPreferredSize(new Dimension(170,20));
		setFont(typeface);
		setText(font);
		setEditable(false);
		
		setBorder(BorderFactory.createMatteBorder(0,0,1,0,Var.SekColor));
		setBackground(Var.PrimColor);
		setForeground(Color.WHITE);
		
		mouseListener = new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				Var.typefacePanel[1].setFont(font);
			}
		};
		
		addMouseListener(mouseListener);
	}
}
