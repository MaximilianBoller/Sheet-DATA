package funktionBundles;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;

import actions.toolActions.AcImageareaTool;

import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioSystem;




public class wavSounds
{
    public static void playnote(String filepath) 
    {
    	
		String Filepath = ("resources/"+ filepath);
		URL NoteSound = wavSounds.class.getClassLoader().getResource(Filepath);
//		File note = new File(filepath);
		
//    	Funktion.class.getClassLoader().getResource(filepath);
    	
  //  	String note = filepath;
    	
        
        new Thread(new Runnable() 
        {
            public void run() 
            {
                try 
                {
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(NoteSound);
                    clip.open(inputStream);
                    clip.loop(0);
                    Thread.sleep(clip.getMicrosecondLength() / 10L);
                }
                
                catch (Exception e)
                {
 //               	System.out.println("Problem in wavSounds.java");
                    e.printStackTrace();
                }
            }
        }).start();
    }
}