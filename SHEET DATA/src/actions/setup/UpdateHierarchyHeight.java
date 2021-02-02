package actions.setup;

import java.awt.Dimension;

import funktionBundles.Var;

public class UpdateHierarchyHeight 
{	
	public static void run()
	{
		Var.pageView[1].Arbeitsbereich.setSize(Var.pageView[1].Arbeitsbereich.getWidth(),getContainerComponentHeight.run(Var.pageView[1].Arbeitsbereich));
		Var.pageView[1].Arbeitsbereich.setPreferredSize(new Dimension (Var.pageView[1].Arbeitsbereich.getWidth(),getContainerComponentHeight.run(Var.pageView[1].Arbeitsbereich)));
		Var.pageView[1].Arbeitsbereich.repaint();
		
		int scrollPanelHeight = Var.pageView[1].Scrollpanel.getHeight();
		int arbeitsbereichHeight = Var.pageView[1].Arbeitsbereich.getHeight();
		
		System.out.println("ScrollPanelHeight: " + scrollPanelHeight);
		System.out.println("ArbeitsbereichHeight: " + arbeitsbereichHeight);
	}
}
