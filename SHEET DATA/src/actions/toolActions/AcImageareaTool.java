package actions.toolActions;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;

import funktionBundles.Var;

public class AcImageareaTool 
{
	public static void run()
	{
		AcNormalTool.run();
		Var.ActiveTool = "imagearea";
		
		URL image = AcImageareaTool.class.getClassLoader().getResource("resources/images/cursor/imageareaTool.png");
		Image Image = Toolkit.getDefaultToolkit().getImage(image);
		
		Var.mainLayout[1].Mitte.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(Image,new Point(0,0),"custom cursor"));
		
//       Var.mainLayout[1].setCursor(c);
        
		
		for(int i = 1; i< Var.pageCount; ++i)
		{
			System.out.println(i);
			Var.emptyPage[i].setEditable();
		}
		
		for(int i = 1; i< Var.headerCount; ++i)
		{
			System.out.println(i);
			Var.emptyHeader[i].setEditable();
		}
		
		for(int i = 1; i< Var.TextAreaCount; ++i)
		{
			Var.TextArea[i].setEditable(false);
		}
	}
}
