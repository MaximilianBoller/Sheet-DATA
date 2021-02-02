package actions.save;

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import funktionBundles.Var;

public class pngActions 
{

	public static BufferedImage getscrn(Component com)
	{
		BufferedImage bf = new BufferedImage(Var.pageWidth,Var.pageHeight, BufferedImage.TYPE_INT_RGB);

		com.paint(bf.getGraphics());
		return bf;
	}
	
	
	public static void savepic(Component c, String Filename )throws IOException
	{
		BufferedImage b = getscrn(c);
		
		
		ImageIO.write(b, "png", new File(Filename));
		
	}
	
	public static BufferedImage showPage(Component c)throws IOException
	{
		BufferedImage b = getscrn(c);
		
		return b;
		
	}
	
}
