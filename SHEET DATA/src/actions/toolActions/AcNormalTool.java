package actions.toolActions;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.net.URL;

import funktionBundles.Var;

public class AcNormalTool 
{
	public static void run()
	{
		Var.ActiveTool = "";
		URL image = AcImageareaTool.class.getClassLoader().getResource("resources/images/cursor/normalCursor.png");
		Image Image = Toolkit.getDefaultToolkit().getImage(image);
		
		Var.mainLayout[1].Mitte.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(Image,new Point(0,0),"custom cursor"));
		
		for(int i = 1; i< Var.TextAreaCount; ++i)
		{
			Var.TextArea[i].removeResizable();
			Var.TextArea[i].setEditable(false);
			Var.TextArea[i].revalidate();
		}
		
		for(int i = 1; i< Var.componentareaCount; ++i)
		{
			Var.resizableComponentArea[i].removeResizable();
			Var.resizableComponentArea[i].revalidate();
		}
		
		for(int b = 1; b< Var.pageCount; ++b)
		{
			Var.emptyPage[b].removeEditable();
			Var.emptyPage[b].revalidate();
		}
		
		for(int i = 1; i< Var.ImageAreaCount; ++i)
		{
			Var.ImageArea[i].removeResizable();
			Var.ImageArea[i].revalidate();
		}
		
		for(int i = 1; i< Var.NotationAreaCount; ++i)
		{
			Var.NotationArea[i].removeResizable();
			Var.NotationArea[i].revalidate();
		}
	}
}
