package actions.save;

import funktionBundles.Var;

public class AcSafeImages 
{
	public static void ausführen()
	{ 
		try
		{
//			String dateiname = Var.ProjektName + ".png";
			for(int i = 1; i <= Var.pageCount; ++i)
			{
				pngActions.savepic(Var.emptyPage[i], Var.PNGName + " "+ i + ".png");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
}
