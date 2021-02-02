package quickParts.buttons;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import actions.toolActions.AcImageareaTool;
import funktionBundles.Var;

public class AddOnClose extends JButton 
{

	
	public AddOnClose(int x, int y , int BoundsX, int BoundsY)
	{
		setSize(x, y);
		setBounds(BoundsX,BoundsY,x,y);
		setBackground(Var.SekColor);
		setBorder(BorderFactory.createLineBorder(Var.SekColor, 1));
		
		URL image = AcImageareaTool.class.getClassLoader().getResource("resources/images/icons/Kreuz.png");
		Image Image = Toolkit.getDefaultToolkit().getImage(image);
		ImageIcon icon = new ImageIcon(Image);
		setIcon(icon);
		
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
		setBorder(BorderFactory.createLineBorder(Var.SekColor, 1));
		setBackground(Var.CloseButtonHover);
	}
	
	public void normal()
	{
		setBorder(BorderFactory.createLineBorder(Var.SekColor, 1));
		setBackground(Var.SekColor);
	}
}
