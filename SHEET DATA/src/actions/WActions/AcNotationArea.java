package actions.WActions;

import java.io.IOException;

import funktionBundles.*;
import obj.UIobj.right.*;
import obj.UIobj.right.TextAreaHierarchy;
import obj.Wobj.imagearea.ImageAreaPropperties;
import obj.Wobj.imagearea.ImageArea;
import obj.Wobj.notationarea.NotationArea;
import obj.Wobj.notationarea.NotationAreaPropperties;

public class AcNotationArea 
{
	public static void run(int Linienlayout, int seitenzahl , int sizeX, int sizeY, int boundsX, int boundsY)
	{
		
		NotationArea NotationArea = new NotationArea(Linienlayout,seitenzahl,Var.NotationAreaCount, sizeX, sizeY, boundsX, boundsY);
		Var.emptyPage[seitenzahl].setLayer(NotationArea, 2);
		Var.emptyPage[seitenzahl].add(NotationArea);
		Var.emptyPage[seitenzahl].revalidate();
		Var.NotationArea[Var.NotationAreaCount] = NotationArea;
		
//		NotationAreaPropperties
		NotationAreaPropperties NotationAreaPropperties = new NotationAreaPropperties(Var.NotationAreaCount,sizeX,sizeY,boundsX,boundsY);
		Var.NotationAreaPropperties[Var.NotationAreaCount] = NotationAreaPropperties;

//		Add NotationArea to hierarchy
		NotationAreaHierarchy NotationAreaHierarchy = new NotationAreaHierarchy(Var.NotationAreaCount, boundsX, "");
		Var.pageHierarchy[seitenzahl].addChild(NotationAreaHierarchy);
		Var.NotationAreaHierarchy[Var.NotationAreaCount] = NotationAreaHierarchy;
		
		Var.NotationAreaCount = Var.NotationAreaCount + 1;
	}
}
