package actions.WActions;

import java.io.IOException;

import actions.save.pngActions;
import funktionBundles.Var;
import window.viewports.PageViewer;

public class AcPageViewWindow 
{
	public static void run()
	{
		PageViewer pageViewer;
		try 
		{
			pageViewer = new PageViewer(pngActions.showPage(Var.emptyPage[1]));
		} 
		
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
