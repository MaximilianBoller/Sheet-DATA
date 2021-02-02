package actions.setup;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;


import actions.WActions.AcEmptyWorkspace;
import funktionBundles.Var;

import rumpelkiste.InfoPaneErsteSeiteErstellen;
import rumpelkiste.NotenBlattLayOut;

public class CreateNewDocument 
{
	public static void ausführern()
	{
    	
//		File documents = new File("SHEET Documents");
//		File file = new File("SHEET Documents/"+ Var.projectName + ".txt");
		
//		File documents = new File("Sheet Dokumente");
		Var.filePath = Var.projectName + ".sheet";
		
		System.out.println("File: " + Var.filePath);
		
		File saveFile = new File(Var.filePath);

/*		if(documents.exists())
		{
			System.out.println("OrdnerExistiert");
		}
		
		else
		{
			documents.mkdirs();
			System.out.println("Ordner wurde erstellt");
		}
		
		if(file.exists())
		{
			System.out.println("FileExistiert");
			
		}
		else
		{
*/			try
			{
				saveFile.createNewFile();
			} 
			catch (IOException f)
			{
				
				f.printStackTrace();
			}
//		}
		
		AcEmptyWorkspace.run();
		Var.neuesProjektErstellen[1].dispose();
    }
}
