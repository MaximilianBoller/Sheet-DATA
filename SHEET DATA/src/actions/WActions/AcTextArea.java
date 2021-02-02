package actions.WActions;

import java.io.IOException;
import java.io.ObjectInputStream;

import funktionBundles.Var;
import obj.UIobj.right.ImageAreaHierarchy;
import obj.UIobj.right.TextAreaHierarchy;
import obj.Wobj.textarea.TextAreaPropperties;
import obj.Wobj.textarea.TextArea;

public class AcTextArea 
{
	public static void run(String text, int seitenzahl , int sizeX, int sizeY, int boundsX, int boundsY, float fontSize, String fontName, String alignemnt)
	{
		
		TextArea textareaTest = new TextArea(seitenzahl,Var.TextAreaCount, sizeX, sizeY, boundsX, boundsY, text, fontSize, fontName, alignemnt);
		Var.TextArea[Var.TextAreaCount] = textareaTest;
		
		Var.emptyPage[seitenzahl].setLayer(Var.TextArea[Var.TextAreaCount], 2);
		Var.emptyPage[seitenzahl].add(Var.TextArea[Var.TextAreaCount]);
		Var.emptyPage[seitenzahl].revalidate();
		
		//textarea Propperties Window
		TextAreaPropperties textareaProppertiesWindow = new TextAreaPropperties(Var.TextAreaCount, fontSize, fontName, sizeX, sizeY, boundsX, boundsY);
		Var.TextAreaPropperties[Var.TextAreaCount] = textareaProppertiesWindow;
		
		//add Textarea hierarchy to Hirarchy page
		TextAreaHierarchy hierarchyObjectImagearea = new TextAreaHierarchy(Var.TextAreaCount, boundsX, "");
		Var.TextAreaHierarchy[Var.TextAreaCount] = hierarchyObjectImagearea;
		Var.pageHierarchy[seitenzahl].addChild(Var.TextAreaHierarchy[Var.TextAreaCount]);
		
		
		Var.TextAreaCount = Var.TextAreaCount + 1;	
	}
}
