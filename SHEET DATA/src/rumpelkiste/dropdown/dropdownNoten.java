package rumpelkiste.dropdown;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


import funktionBundles.Var;

public class dropdownNoten extends JDialog
{
	public static JLayeredPane drophintergrund = new JLayeredPane();
	public static Insets insets = drophintergrund.getInsets();
	
	public  dropdownNoten()
	{
		drophintergrund.setPreferredSize(new Dimension(200,5*30));
		drophintergrund.setLayout(null);
		drophintergrund.setBackground(Color.BLACK);

		// panel dient nur dazu das Panel zu sehen, da einem LayeredPane keine Hintergrundfarbe gegeben werden kann.
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(200,5*30));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0,0,200,5*30);
		drophintergrund.setLayer(panel, 1);
		drophintergrund.add(panel);
		//''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
		
		
		
		JButton piano = new JButton("        " + "-");
		piano.setPreferredSize(new Dimension(100,30));
		piano.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		piano.setBackground(Color.DARK_GRAY);
		piano.setForeground(Color.WHITE);
		piano.setFont(Var.standartFont13);
		piano.setHorizontalAlignment(SwingConstants.LEFT);
		
		piano.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	
	        }

	    });
		
		piano.setBounds(0,0,200,30);
		drophintergrund.setLayer(piano, 2); 
		drophintergrund.add(piano);
			
		
		JButton bedienfeld = new JButton("        " + "-");
		bedienfeld.setPreferredSize(new Dimension(100,30));
		bedienfeld.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		bedienfeld.setBackground(Color.DARK_GRAY);
		bedienfeld.setForeground(Color.WHITE);
		bedienfeld.setFont(Var.standartFont13);
		bedienfeld.setHorizontalAlignment(SwingConstants.LEFT);
		
		bedienfeld.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {

	        }
	    });
		
		bedienfeld.setBounds(0,30,200,30);
		drophintergrund.setLayer(bedienfeld, 2); 
		drophintergrund.add(bedienfeld);
			
		
		add(drophintergrund);
	}
}