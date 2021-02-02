package obj.UIobj.workspace;



import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import funktionBundles.Var;

public class emptyWorkspace extends JPanel
{
	public emptyWorkspace()
	{
		setBackground(Var.PrimColor);
		setLayout(new BorderLayout());
	}
	public void paint(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D n = (Graphics2D) g;
        n.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        
        
		URL image = this.getClass().getResource("background2.jpg");
		Image Image = Toolkit.getDefaultToolkit().getImage(image);
        //n.drawImage(Image, 0, 0, Var.screenWidth, Var.screenHeight,Color.BLACK, null);
        
		n.setColor(Color.WHITE);
		n.drawRect(10,10,getWidth()-20, getHeight() -20);

		n.setFont(Var.OpenSans14);
		n.drawString("Welcome to Sheet 1.0 2020 Edition",30,40);
		n.drawString("Create your document:",30,60);
		n.drawString("Click on Datei > Neu",30,80);
		
	}
}
