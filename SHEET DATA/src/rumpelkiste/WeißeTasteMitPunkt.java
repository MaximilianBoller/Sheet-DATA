package rumpelkiste;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


import funktionBundles.Var;
import funktionBundles.wavSounds;


public class Wei�eTasteMitPunkt extends JPanel
{
	public Wei�eTasteMitPunkt(String Name, String note)
	{
		LineBorder line = new LineBorder(Var.dunkelGrau, 0, false);
		
		this.setPreferredSize(new Dimension(50,380));
		this.setBackground(Color.WHITE);
		
		this.setLayout(new BorderLayout(1,1));
		
		URL wei�eTasteimage = this.getClass().getResource("UIWei�MitPunkt.png");
		Icon wei�eTaste = new ImageIcon(wei�eTasteimage);
		
		JButton button = new JButton(wei�eTaste);
		button.setBorder(line);
		button.setBackground(Color.WHITE);
		button.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	wavSounds.playnote(note);
//	        	Var.log = Var.log + "\n fuck";
	        	Var.piano[1].note.setText(" " +Name);
	        }
/*	        
	        public void mousePressed(MouseEvent e)
	        {
	        	button.setBackground(Color.LIGHT_GRAY);
	        }
	        
	        public void mouseReleased(MouseEvent e)
	        {
	        	button.setBackground(Color.WHITE);
	        }
	        */
	    });
		
		this.add(button);
		
	}
	
}
