package quickParts.icon;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import actions.toolActions.AcImageareaTool;
import funktionBundles.Var;
import obj.Wobj.textarea.TextAreaPropperties;

public class IconButton extends JLabel
{
	public BufferedImage bufimg;
	
	int x;
	int y;
	
	public IconButton(String path, int SizeX, int SizeY, int BoundsX, int BoudsY)
	{
		x = SizeX;
		y = SizeY;
		
		String url = "resources/images/icons/" + path;
		URL resource = IconLabel.class.getClassLoader().getResource(url);
		ImageIcon iconImage = new ImageIcon(resource);
		setIcon(iconImage);
		setBackground(Var.SekColor);
//		setForeground(Var.BorderColor);
		setPreferredSize(new Dimension(SizeX,SizeY));
		setBounds(BoundsX,BoudsY,SizeX,SizeY);
		setOpaque(true);
	}
	
	public void changeIcon(String path)
	{
		String url = "resources/images/icons/" + path;
		URL resource = IconLabel.class.getClassLoader().getResource(url);
		ImageIcon iconImage = new ImageIcon(resource);
		setIcon(iconImage);
	}
	
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        
        g.setColor(Var.BorderColor);
 //       g.drawRoundRect(0,0,x-1,y-1, 6, 6);
    }
}
