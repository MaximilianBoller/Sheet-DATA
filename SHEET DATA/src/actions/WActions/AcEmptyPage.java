package actions.WActions;

import java.awt.Dimension;

import funktionBundles.Var;
import obj.UIobj.right.PageHierarchy;
import obj.UIobj.workspace.WorkspaceProppertiesWindow;
import obj.Wobj.page.emptyPage;

public class AcEmptyPage 
{
	public static void run(String title)
	{
		
		//add empty working page to workspace
		emptyPage emptypage = new emptyPage(Var.pageXCoordinate, Var.pageCount);
		Var.emptyPage[Var.pageCount] = emptypage;
		Var.draggableworkspace[1].drag.setLayer(Var.emptyPage[Var.pageCount] , 1);
		Var.draggableworkspace[1].drag.add(Var.emptyPage[Var.pageCount]);	
		System.out.println("Seite wurde in emptypage Array an der Stelle: " + Var.pageCount + " gespeichert.");
		
		//create workspacePropperties Window
		WorkspaceProppertiesWindow pagepropperties = new WorkspaceProppertiesWindow();
		Var.pageProppertiesWindow[1] = pagepropperties;
		
		//add Page hierarchy to layer-panel
		PageHierarchy hierarchy = new PageHierarchy(Var.pageCount, Var.pageXCoordinate, title);
		Var.pageHierarchy[Var.pageCount] = hierarchy;
		Var.pageView[1].Arbeitsbereich.add(Var.pageHierarchy[Var.pageCount]);
		
		
		if(Var.pageCount == 1)
		{
			Var.workspaceWidth = Var.workspaceWidth + Var.pageWidth;
			Var.workspaceHeight = Var.workspaceHeight + Var.pageHeight;
		}
		else
		{
			Var.workspaceWidth = Var.workspaceWidth + Var.pageWidth + Var.pageXGap;
		}

		Var.pageXCoordinate = Var.pageXCoordinate + Var.pageWidth + Var.pageXGap;
		
		// Damit Beim Erstellen der Ersten Seite nichts auf der Arbeitsfläche ist.

		
		Var.draggableworkspace[1].drag.setSize(Var.workspaceWidth, Var.workspaceHeight);
		Var.draggableworkspace[1].PagesBackground.setSize(Var.workspaceWidth, Var.workspaceHeight);

		Var.pageCount = Var.pageCount + 1; 
		
		if(Var.pageView[1] != null)
		{
			Var.mainLayout[1].RechtsPanel.revalidate();
		}

	}

}
