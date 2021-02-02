package actions.setup;

import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;

public class getContainerComponentHeight 
{
	public static int run(Container container)
	{
		Component[] components = container.getComponents();
		
		System.out.println("start:");
		int total = 0;
		for(int i = 0; i < components.length; ++i)
		{
			System.out.println("Component " + i + " :" + components[i].getHeight());
			total = total + components[i].getHeight();
		}
		
		System.out.println("total Höhe: " + total);
		return total;
	}
}
