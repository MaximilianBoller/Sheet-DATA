package funktionBundles;

public class Funktion 
{
	
	public static double grid(double position, double gridSize)
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
	
	public static int countLines(String str)
	{
	   String[] lines = str.split("\r\n|\r|\n");
	   return  lines.length;
	}
	
/*	
	public static void pause(int position,int seitennummer)
	{

		
		if(Var.wert1 == true)
		{
			if(Var.yposition <= 1050)
			{
				pausenwert1panel test = new pausenwert1panel();
				test.setPreferredSize(new Dimension(200,100));
				test.setBounds(Var.yposition, position, 200, 100);
				Var.hintergrund[seitennummer].setLayer(test, 4); 
				Var.hintergrund[seitennummer].add(test);
				Var.yposition = Var.yposition + 200;
			}
			else
			{
				Var.yposition = 80+50;
				
				position = position+160;
				pausenwert1panel test = new pausenwert1panel();
				test.setPreferredSize(new Dimension(200,100));
				test.setBounds(Var.yposition, position, 200, 100);
				Var.hintergrund[seitennummer].setLayer(test, 4); 
				Var.hintergrund[seitennummer].add(test);
				Var.yposition = Var.yposition + 200;
			}
		}
	}
*/	
	

	
	public static int korrigieren(int y) 
	{
        if (y >= 0 && y <= 22) 
        {	
            wavSounds.playnote("c3.wav");
            return 10;
        }
        if (y >= 23 && y <= 36) 
        {
            wavSounds.playnote("h2.wav");
            return 20;
        }
        if (y >= 37 && y <= 42) 
        {
            wavSounds.playnote("a2.wav");
            return 30;
        }
        if (y >= 43 && y <= 56) 
        {
            wavSounds.playnote("g2.wav");
        	return 40;
        }
        if (y >= 57 && y <= 62) 
        {
            wavSounds.playnote("f2.wav");
        	return 50;
        }
        if (y >= 63 && y <= 76) 
        {
            wavSounds.playnote("e2.wav");
            return 60;
        }
        if (y >= 77 && y <= 82) 
        {
            wavSounds.playnote("d2.wav");
        	return 70;
        } 
        if (y >= 83 && y <= 96) 
        {
            wavSounds.playnote("c2.wav");
            return 80;
        }
        if (y >= 97 && y <= 102) 
        {
            wavSounds.playnote("h1.wav");
            return 90;
        }  
        if (y >= 103 && y <= 116) 
        {
            wavSounds.playnote("a1.wav");
            return 100;
        }
        if (y >= 117 && y <= 122) 
        {
            wavSounds.playnote("g1.wav");
            return 110;
        }
        if (y >= 123 && y <= 136) 
        {
            wavSounds.playnote("f1.wav");
            return 120;
        }
        if (y >= 137 && y <= 142) 
        {
            wavSounds.playnote("e1.wav");
            return 130;
        }
        if (y >= 143 && y <= 156) 
        {
            wavSounds.playnote("d1.wav");
            return 140;
        }
        if (y >= 157 && y <= 162) 
        {
            wavSounds.playnote("c1.wav");
            return 150;
        }
        if (y >= 163 && y <= 176) 
        {
            wavSounds.playnote("h.wav");
            return 160;
        }
        if (y >= 177 && y <= 200) 
        {
            wavSounds.playnote("a.wav");
            return 170; 
        }
        
        return y;
	}

	
	
	
	
	
	public static void test01()
	{
		System.out.println("hello");
	}
	
	
	public static void infoLogUpdate(int time)
	{
		Thread t1 = new Thread(new infoLogThread(time));
		
		t1.start();
		
	}
}
