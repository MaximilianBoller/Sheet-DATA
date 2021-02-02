package window.dialogWindows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class keyPianoinfo extends JFrame 
{
	public static JLayeredPane hintergrund = new JLayeredPane();

	
	public keyPianoinfo()
	{
		
		setTitle("key piano layout");
		setSize(435, 159);
//		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new BorderLayout());
		
		
	
		
		URL url = getClass().getResource("infoIcon.png");
		ImageIcon imgicon = new ImageIcon(url);
		super.setIconImage(imgicon.getImage());
		
		
		
		
		
		URL Image = this.getClass().getResource("InfoKeyPiano.png");
		Icon image = new ImageIcon(Image);
		JLabel info = new JLabel(image);
		info.setPreferredSize(new Dimension(420,120));
		info.setBounds(0, 0, 420, 120);
		hintergrund.setLayer(info, 1); 
		hintergrund.add(info);
		
		
		JPanel fuﬂzeile = new JPanel();
		fuﬂzeile.setPreferredSize(new Dimension(600,30));
		fuﬂzeile.setVisible(true);
		fuﬂzeile.setBackground(Color.DARK_GRAY);
		fuﬂzeile.setBounds(0,331,600,31);
		hintergrund.setLayer(fuﬂzeile, 1); 
		hintergrund.add(fuﬂzeile);
		
    	hintergrund.setBackground(Color.WHITE);
		hintergrund.setVisible(true);
		add(hintergrund, BorderLayout.CENTER);
    	
		setVisible(true);
	}
}

