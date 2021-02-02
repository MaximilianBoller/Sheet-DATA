package actions.setup;

import java.awt.GraphicsEnvironment;

public class GetSystemFonts 
{
	public static String run() 
	{
		String Fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		String FontReturn = "";
		
		for(int i = 0; i < Fonts.length; ++i)
		{
			FontReturn = FontReturn + Fonts[i] + "\n";
		}
		
		return FontReturn;
		
	}
}
