package actions.Convertion;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ConvertStringPath 
{
	public static String run(String file)
	{
		file = file.replace("\\", "//");
		System.out.println("convert");
		return file;
	}
}
