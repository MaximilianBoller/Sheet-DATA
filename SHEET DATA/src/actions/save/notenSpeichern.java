package actions.save;

import funktionBundles.Var;

public class notenSpeichern 
{
	public static void speichern()
	{
		for(int i = 1; i<=200; ++i)
		{
			if(Var.notenArray[i]==null)
			{
				System.out.println("keine Note gefunden");
				
				break;
			}		
			
			Var.ProjectLOG = Var.ProjectLOG + Var.notenArray[i].getinfo();		
		}
	}
}
