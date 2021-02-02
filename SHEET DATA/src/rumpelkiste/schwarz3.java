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

public class schwarz3 extends JPanel
{
	public schwarz3(String Name, String note)
	{
		LineBorder line = new LineBorder(Var.dunkelGrau, 0, false);
		
		this.setPreferredSize(new Dimension(75,50));
		this.setBackground(Color.DARK_GRAY);
		
		this.setLayout(new BorderLayout(1,1)); 
		URL buttonschwarzimage = this.getClass().getResource("UISchwarz3.png");
		Icon buttonschwarz = new ImageIcon(buttonschwarzimage);
		
		JButton button = new JButton(buttonschwarz);
		button.setBorder(line);
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
