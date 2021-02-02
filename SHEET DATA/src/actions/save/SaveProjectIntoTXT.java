package actions.save;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import HauptPackage.Strg;
import actions.Convertion.ConvertStringPath;
import funktionBundles.Funktion;
import funktionBundles.Var;

public class SaveProjectIntoTXT
{
	public static void run() throws Exception
	{
		try 
		{	
			OutputStream stream = new FileOutputStream(Var.filePath);
			System.out.println("New File Path: " + ConvertStringPath.run(Var.filePath));

//-----------------------------------------------------------------------------------------------
	
			try 
			{
				SaveProjectdataIntoLog.run();
				stream.write(Var.ProjectLOG.getBytes());
				stream.close();
				
				//update Log when saving
				if(Var.projectData[1] != null)
				{
					Var.projectData[1].update();
				}
				else
				{
				}
				
				if(Var.clipboardData[1] != null)
				{
					Var.clipboardData[1].update();
				}
				else
				{
				}

			} 
			
			catch (IOException e) 
			{

				e.printStackTrace();
			}


		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
