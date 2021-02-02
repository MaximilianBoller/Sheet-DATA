package actions.WActions;

import java.io.IOException;

import funktionBundles.Var;
import obj.UIobj.right.ImageAreaHierarchy;
import obj.UIobj.right.TextAreaHierarchy;
import obj.Wobj.imagearea.ImageAreaPropperties;
import obj.Wobj.imagearea.ImageArea;

public class AcImageArea 
{
	public static void run(String path, int seitenzahl , int sizeX, int sizeY, int boundsX, int boundsY)
	{
		
		ImageArea imagearea = new ImageArea(seitenzahl,Var.ImageAreaCount, sizeX, sizeY, boundsX, boundsY, path);
		Var.ImageArea[Var.ImageAreaCount] = imagearea;
		
		Var.emptyPage[seitenzahl].setLayer(Var.ImageArea[Var.ImageAreaCount], 2);
		Var.emptyPage[seitenzahl].add(Var.ImageArea[Var.ImageAreaCount]);
		Var.emptyPage[seitenzahl].revalidate();
		
		//imagearea Propperties Window
		ImageAreaPropperties propperties = new ImageAreaPropperties(Var.ImageAreaCount,sizeX,sizeY,boundsX,boundsY,path);
		Var.ImageAreaPropperties[Var.ImageAreaCount] = propperties;

		//add Imagearea hierarchy to Imagearea page
		ImageAreaHierarchy hierarchyObjectImagearea = new ImageAreaHierarchy(Var.ImageAreaCount, boundsX, "");
		Var.ImageAreaHierarchy[Var.ImageAreaCount] = hierarchyObjectImagearea;
		Var.pageHierarchy[seitenzahl].addChild(Var.ImageAreaHierarchy[Var.ImageAreaCount]);
		
		Var.ImageAreaCount = Var.ImageAreaCount + 1;
	}
}
