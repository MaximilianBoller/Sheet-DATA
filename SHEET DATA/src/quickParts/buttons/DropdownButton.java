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


public class DropdownButton extends JLabel
{
	public DropdownButton(String text) 
	{	

		setOpaque(true);

		setText(text);
		setVerticalAlignment(SwingConstants.CENTER);
		setHorizontalAlignment(SwingConstants.LEFT);
		
		setPreferredSize(new Dimension(200,20));
		
		
		setBorder(BorderFactory.createLineBorder(Var.PrimColor, 1));
		setFont(Var.OpenSans12);	
		setBackground(Var.PrimColor);
		setForeground(Var.Color4);
		
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

	    });
		
	}
	
	public void hover()
	{
		setBorder(BorderFactory.createLineBorder(Var.PrimColor, 1));
		setBackground(Var.SekColor);
		setForeground(Var.Color4);
	}
	
	public void normal()
	{
		setBorder(BorderFactory.createLineBorder(Var.PrimColor, 1));
		setBackground(Var.PrimColor);
		setForeground(Var.Color4);
	}
	
	
	
}
