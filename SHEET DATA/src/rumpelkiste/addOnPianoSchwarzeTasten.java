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


import funktionBundles.Var;
import funktionBundles.wavSounds;


public class addOnPianoSchwarzeTasten extends JPanel
{
	public addOnPianoSchwarzeTasten(String Name, String note)
	{
		this.setPreferredSize(new Dimension(30,100));
		this.setBackground(Color.DARK_GRAY);
		
		this.setLayout(new BorderLayout(1,1));
		
		URL buttonschwarzimage = this.getClass().getResource("schwarzetaste.jpg");
		Icon buttonschwarz = new ImageIcon(buttonschwarzimage);
		
		JButton button = new JButton(buttonschwarz);
//		button.setBackground(Color.DARK_GRAY);
//		button.setForeground(Color.WHITE);
		button.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	wavSounds.playnote(note);
//	        	Var.log = Var.log + "\n" + Name;
	        	Var.piano[1].note.setText(" " +Name);

	        }
	    });
		
		button.setFont(Var.standartFont8);
		this.add(button);
	}
}
