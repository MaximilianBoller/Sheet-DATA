package actions.toolActions;

import funktionBundles.Var;

public class AcChangeTool 
{
	public static void run()
	{
		if(Var.recentTool.equals("textareaTool"))
		{
			System.out.println("T");
	    	AcTextareaTool.run();
		}
		
		if(Var.recentTool.equals("imageareaTool"))
		{
	    	System.out.println("I");
	    	AcImageareaTool.run();
		}
		
		if(Var.recentTool.equals("selectTool"))
		{
	    	System.out.println("W");
	    	AcNormalTool.run();
		}
		
		if(Var.recentTool.equals("resizeTool"))
		{
	    	System.out.println("E");
	    	AcResizeTool.run();
		}
		
		if(Var.recentTool.equals("notationTool"))
		{
	    	System.out.println("N");
	    	AcNotationAreaTool.run();
		}
	}
}
