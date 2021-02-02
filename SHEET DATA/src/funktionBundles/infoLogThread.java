package funktionBundles;

import obj.UIobj.footer.Footer;

public class infoLogThread implements Runnable
{
	int zeit;
	
	public infoLogThread(int x)
	{
		zeit  = x;
	}
	
	public void run()
	{
		try
		{ 
			System.out.println("infoLogThread zeit: " + zeit);
			Footer.infos02.setText(Var.logInfo);
			
			Thread.sleep(zeit);
			
			System.out.println("infoLogThread fertig!");
			Var.logInfo = "";
			Footer.infos02.setText(Var.logInfo);
			
		}
		catch(Exception e)
		{
			
		}
	}
}
