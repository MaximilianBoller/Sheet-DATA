package actions.UIActions;

import java.awt.Color;

import funktionBundles.Var;

public class AcHirarchieUpdate 
{
	public static void run(int seite)
	{
		for(int i = 1; i < Var.pageCount; ++i)
		{
			if(Var.pageHierarchy[i].Seitenzahl == seite)
			{
				Var.pageHierarchy[i].aktive(true);
			}
			else
			{
				Var.pageHierarchy[i].aktive(false);
			}
			
			
		}
		
	}
}
