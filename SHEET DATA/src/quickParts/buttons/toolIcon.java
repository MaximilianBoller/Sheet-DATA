package quickParts.buttons;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import funktionBundles.Var;
import quickParts.icon.IconLabel;

public class toolIcon extends JLabel 
{
	public toolIcon(String IconPath)
	{
		setPreferredSize(new Dimension(20,20));
		setOpaque(true);
		setBackground(Var.PrimColor);
		
//		setBorder(BorderFactory.createMatteBorder(1,1,1,1,Var.Color1));
		
		String url = "resources/images/icons/" + IconPath;
		URL resource = IconLabel.class.getClassLoader().getResource(url);
		ImageIcon iconImage = new ImageIcon(resource);
		setIcon(iconImage);
		
		
		
		addMouseListener(new MouseAdapter()
		{
			public void MouseEntered(MouseEvent e)
			{
				setBackground(Var.SekColor);
//				setBorder(BorderFactory.createMatteBorder(1,1,1,1,Var.Color2));
				
			}
			public void MouseExited(MouseEvent e)
			{
				setBackground(Var.PrimColor);
				
			}
	
		});
	}
}
