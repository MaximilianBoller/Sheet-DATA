package funktionBundles;
public class database_Test
{
    static String[] database;
    
    static 
    {
        database_Test.database = new String[] { "c2", "d2", "e2" };
    }
    
    public static void play()
    {
    	for (int i = 0; i <= 4; ++i) 
		{
		    final String audio = "audio/";
		    final String wav = ".wav";
		    wavSounds.playnote(String.valueOf(audio) + database_Test.database[i] + wav);
		    
		    try 
		    {
		        Thread.sleep(200L);
		    }
		    
		    catch (InterruptedException ex) 
		    {
		    	
		    }
		}
        
    }
}