package actions.toolActions;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.net.URL;

import funktionBundles.Var;

public class AcHandTool 
{
	public static void run()
	{
		AcNormalTool.run();
		
		URL image = AcImageareaTool.class.getClassLoader().getResource("resources/images/cursor/moveCursor.png");
		Image Image = Toolkit.getDefaultToolkit().getImage(image);
		
		Var.mainLayout[1].Mitte.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(Image,new Point(0,0),"custom cursor"));
		
		for(int i = 1; i< Var.TextAreaCount; ++i)
		{
			Var.TextArea[i].DontMove();
			Var.TextArea[i].revalidate();
		}
		
		/*
		for(int i = 1; i< Var.imageareaCount; ++i)
		{
			Var.imagearea[i].setResizable();
			Var.imagearea[i].revalidate();
		}
		
		for(int i = 1; i< Var.pageCount; ++i)
		{
			Var.emptyPage[i].addGrid();
		}
		
		for(int b = 1; b< Var.headerCount; ++b)
		{
			Var.emptyHeader[b].addGrid();
		}
		*/
		
	}
}
