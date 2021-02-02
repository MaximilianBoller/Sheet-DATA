package HauptPackage;


import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.font.TextAttribute;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.text.AttributedString;

import actions.Convertion.ConvertStringPath;
import actions.open.ÖffnenDokument;
import actions.setup.SetupProgram;
import funktionBundles.Var;
import funktionBundles.getStringLength;


public class Strg
{

	public static void main(String[] args)
	{
		SetupProgram.run();
		
		  for(int i = 0; i<args.length; i++) 
		  {
			  try 
			  {
				  Var.filePath = ConvertStringPath.run(args[i]);
				  ÖffnenDokument.öffnen(args[i]);
//				  System.out.println(args[i]);

			  }
			  catch (FileNotFoundException e) 
			  {
				  e.printStackTrace();
			  }
		  }

		return;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}