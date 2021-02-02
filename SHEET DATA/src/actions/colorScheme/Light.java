package actions.colorScheme;

import java.awt.Color;

import funktionBundles.Var;

public class Light 
{
	public static void run()
	{
		Var.PrimColor = new Color(239,239,239);
		Var.SekColor = new Color(219,219,219);
		Var.BorderColor = new Color(204,204,204);
		Var.WorkspaceBackgroundColor = new Color(146,146,146);
		
		Var.ButtonHoverColor = new Color(255,255,255);
		Var.ToolHoverColor = new Color(188,188,188);
		
		Var.PrimTextColor = new Color(48,48,48);
		Var.SekTextColor = new Color(145,145,145);
		
		Var.BlueHightlightColor = new Color(24,73,252);
		Var.PinkHightlightColor = new Color(251,1,91);
		Var.GelbHightlightColor = new Color(254,189,35);
	}
}
