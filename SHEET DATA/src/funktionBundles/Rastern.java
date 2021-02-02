package funktionBundles;

public class Rastern
{
	public static double run(double position)
	{
		if(position < 0)
		{
			return 0;
		}
		
		return Math.floor((position +0.5 * Var.gridSize) /Var.gridSize)*Var.gridSize;
//		return position;
	}

}
