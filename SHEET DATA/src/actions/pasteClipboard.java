package actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import actions.WActions.AcTextArea;
import funktionBundles.Var;

public class pasteClipboard 
{
	public static void run() throws IOException
	{
		BufferedReader br = new BufferedReader(new StringReader(Var.ClipboardLOG));
		
		String zeile = br.readLine();
				
		if(zeile.contentEquals("<text area>"))
		{							
			AcTextArea.run(br.readLine(),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),Float.parseFloat(br.readLine()),br.readLine(),br.readLine());
		}
	}
}
