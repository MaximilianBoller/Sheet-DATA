package rumpelkiste;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import funktionBundles.Var;
import funktionBundles.wavSounds;

public class tastaturPiano implements KeyListener
{
	@Override
	public void keyTyped(KeyEvent e) 
	{

		
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		int key = e.getKeyCode();
		
		System.out.println(key);
		
        if (key == 65)
		{
        	//Key Code a: 65
        	wavSounds.playnote("audio/c2.wav");
        	Var.piano[1].note.setText("c2");
		}
        
        if (key == 83)
		{
        	//Key Code s: 83
        	wavSounds.playnote("audio/d2.wav");
        	Var.piano[1].note.setText("d2");
		}
        
        if (key == 68)
		{
        	//Key Code d: 68
        	wavSounds.playnote("audio/e2.wav");
        	Var.piano[1].note.setText("e2");
		}
        
        if (key == 70)
		{
        	//Key Code f: 70
        	wavSounds.playnote("audio/f2.wav");
        	Var.piano[1].note.setText("f2");
		}
        
        if (key == 71)
		{
        	//Key Code g: 71
        	wavSounds.playnote("audio/g2.wav");
        	Var.piano[1].note.setText("g2");
		}
        
        if (key == 72)
		{
        	//Key Code h: 72
        	wavSounds.playnote("audio/a2.wav");
        	Var.piano[1].note.setText("a2");
		}
        
        if (key == 74)
		{
        	//Key Code j: 74
        	wavSounds.playnote("audio/h2.wav");
        	Var.piano[1].note.setText("h2");
		}
        
        if (key == 75)
		{
        	//Key Code k: 75
        	wavSounds.playnote("audio/c3.wav");
        	Var.piano[1].note.setText("c3");
		}
        
        
        if (key == 87)
		{
        	//Key Code w: 87
        	wavSounds.playnote("audio/c#2.wav");
        	Var.piano[1].note.setText("c#2");
		}
        
        if (key == 69)
		{
        	//Key Code e: 69
        	wavSounds.playnote("audio/d#2.wav");
        	Var.piano[1].note.setText("d#2");
		}
        
        if (key == 84)
		{
        	//Key Code t: 84
        	wavSounds.playnote("audio/f#2.wav");
        	Var.piano[1].note.setText("f#2");
		}
        
        if (key == 90)
		{
        	//Key Code z: 90
        	wavSounds.playnote("audio/g#2.wav");
        	Var.piano[1].note.setText("g#2");
		}
        
        if (key == 85)
		{
        	//Key Code u: 85
        	wavSounds.playnote("audio/a#2.wav");
        	Var.piano[1].note.setText("a#2");
		}
        
        
        
        
        
        
        
        
        

	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		
		
	}
}
