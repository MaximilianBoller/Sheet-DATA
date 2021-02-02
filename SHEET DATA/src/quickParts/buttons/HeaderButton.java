package quickParts.buttons;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import funktionBundles.Var;


public class HeaderButton extends JLabel
{
	public HeaderButton(String text, int SizeX, int SizeY) 
	{	

		setOpaque(true);

		setText(text);
		
		setHorizontalAlignment(SwingConstants.CENTER);
		setVerticalAlignment(SwingConstants.CENTER);
		
		setBorder(BorderFactory.createMatteBorder(0,0,0,0,Var.PrimColor));
		setPreferredSize(new Dimension(SizeX,SizeY));
		
		setFont(Var.OpenSans12);	
		setBackground(Var.PrimColor);
		setForeground(Var.PrimTextColor);
		
		
		addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent e)
			{
				hover();
			}
			public void mouseExited(MouseEvent e)
			{
				normal();
			}
			public void mousePressed(MouseEvent e)
			{
				active();
			}
		});
		
	}
	
	public void hover()
	{
		setFont(Var.FontThik);
		setBorder(BorderFactory.createMatteBorder(0,0,0,0,Var.SekColor));
		setBackground(Var.ButtonHoverColor);
		setForeground(Var.PrimTextColor);
	}
	
	public void normal()
	{
		setFont(Var.OpenSans12);	
		setBorder(BorderFactory.createMatteBorder(0,0,0,0,Var.PrimColor));
		setBackground(Var.PrimColor);
		setForeground(Var.PrimTextColor);
	}
	
	public void active()
	{
		setFont(Var.FontThik);	
		setBorder(BorderFactory.createMatteBorder(0,0,2,0,Var.SekColor));
		setBackground(Var.ButtonHoverColor);
		setForeground(Var.PrimTextColor);
	}
	
	
}
