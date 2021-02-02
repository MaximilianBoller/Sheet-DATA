package actions.WActions;

import funktionBundles.Var;
import obj.UIobj.right.PageHierarchy;
import obj.UIobj.workspace.WorkspaceProppertiesWindow;
import obj.Wobj.Header_Footer.emptyHeader;
import obj.Wobj.page.emptyPage;

public class AcEmptyKopfzeile 
{
	public static void run(String title)
	{
		
		//add empty header to workspace
		emptyHeader emptyHeader = new emptyHeader(Var.headerXCoordinate, Var.pageCount);
		Var.emptyHeader[Var.headerCount] = emptyHeader;
		Var.draggableworkspace[1].drag.setLayer(Var.emptyHeader[Var.headerCount] , 1);
		Var.draggableworkspace[1].drag.add(Var.emptyHeader[Var.headerCount]);	
		
		System.out.println("Header wurde in emptyHeader Array an der Stelle: " + Var.headerCount + " gespeichert.");
		
		if(Var.headerCount == 1)
		{
			Var.workspaceWidth = Var.workspaceWidth + Var.pageWidth;
			Var.workspaceHeight = Var.workspaceHeight + Var.emptyHeader[Var.headerCount].getHeight();
		}

		Var.headerXCoordinate = Var.headerXCoordinate + Var.pageWidth + Var.pageXGap;

		
		Var.draggableworkspace[1].drag.setSize(Var.workspaceWidth, Var.workspaceHeight);
		Var.draggableworkspace[1].PagesBackground.setSize(Var.workspaceWidth, Var.workspaceHeight);

		Var.headerCount = Var.headerCount + 1; 
		
		/*
		if(Var.pageView[1] != null)
		{
			Var.mainLayout[1].RechtsPanel.revalidate();
		}
		*/

	}
}
