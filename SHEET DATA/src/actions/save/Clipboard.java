package actions.save;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

public class Clipboard 
{
	public static FileReader datei;
	public static void run() throws IOException
	{
		String text = "Hello \n"
				+ "Peter";
		
		BufferedReader br = new BufferedReader(new StringReader(text));

		System.out.println(br.readLine());
		System.out.println(br.readLine());
	}
}
