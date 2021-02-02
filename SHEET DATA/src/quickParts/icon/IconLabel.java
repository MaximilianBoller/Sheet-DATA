package quickParts.icon;

import java.awt.Dimension;
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

public class IconLabel extends JLabel
{
	public BufferedImage bufimg;
	
	public IconLabel(String path, int SizeX, int SizeY, int BoundsX, int BoudsY)
	{
		String url = "resources/images/icons/" + path;
		URL resource = IconLabel.class.getClassLoader().getResource(url);
		ImageIcon iconImage = new ImageIcon(resource);
		setIcon(iconImage);
		setPreferredSize(new Dimension(SizeX,SizeY));
		setBounds(BoundsX,BoudsY,SizeX,SizeY);
	}
}
