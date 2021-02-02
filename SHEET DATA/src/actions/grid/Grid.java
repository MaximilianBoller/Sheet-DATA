package actions.grid;

public class Grid
{
	public static double run(double position, double gridSize)
	{
		if(gridSize ==0)
		{
			return position;
		}
		
		if(position < 0)
		{
			return 0;
		}
		
		return Math.floor((position +0.5 * gridSize) /gridSize)*gridSize;
	}
}
