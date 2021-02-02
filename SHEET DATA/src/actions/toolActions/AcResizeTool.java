package actions.toolActions;

import java.awt.Cursor;

import javax.swing.border.LineBorder;

import funktionBundles.Var;

public class AcResizeTool 
{
	public static void run()
	{
		AcNormalTool.run();
		
		Cursor cursor = new Cursor(Cursor.MOVE_CURSOR);
        Var.mainLayout[1].Mitte.setCursor(cursor);
		
		for(int i = 1; i< Var.TextAreaCount; ++i)
		{
			Var.TextArea[i].setResizable();
			Var.TextArea[i].revalidate();
		}
		
		for(int i = 1; i< Var.ImageAreaCount; ++i)
		{
			Var.ImageArea[i].setResizable();
			Var.ImageArea[i].revalidate();
		}
		
		for(int i = 1; i< Var.NotationAreaCount; ++i)
		{
			Var.NotationArea[i].setResizable();
			Var.NotationArea[i].revalidate();
		}
		
		for(int i = 1; i< Var.pageCount; ++i)
		{
			Var.emptyPage[i].addGrid();
		}
		
	}
}
