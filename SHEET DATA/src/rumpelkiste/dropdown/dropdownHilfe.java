package rumpelkiste.dropdown;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


import funktionBundles.Var;
import funktionBundles.database_Test;



public class dropdownHilfe extends JDialog
{
	public static JLayeredPane drophintergrund = new JLayeredPane();
	public static Insets insets = drophintergrund.getInsets();
	
	public  dropdownHilfe()
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
		
		
		
			JButton Button = new JButton("        " + "Screen Size Test");
			Button.setPreferredSize(new Dimension(100,30));
			Button.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
			Button.setBackground(Color.DARK_GRAY);
			Button.setForeground(Color.WHITE);
			Button.setFont(Var.standartFont13);
			Button.setHorizontalAlignment(SwingConstants.LEFT);
			
			Button.addMouseListener(new MouseAdapter()
		    {
		        public void mouseClicked(MouseEvent e)
		        {
		        	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		        	
		        	double i = screenSize.getHeight();
		        	double b = screenSize.getWidth();
		        	System.out.println(" Bildschrimhöhe: " + i);
		        	System.out.println(" Bildschirmbreite: " + b);
		        	
		        }

		    });
			
			Button.setBounds(0,0,200,30);
			drophintergrund.setLayer(Button, 2); 
			drophintergrund.add(Button);
			
			
			JButton test = new JButton("        " + "test");
			test.setPreferredSize(new Dimension(100,30));
			test.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
			test.setBackground(Color.DARK_GRAY);
			test.setForeground(Color.WHITE);
			test.setFont(Var.standartFont13);
			test.setHorizontalAlignment(SwingConstants.LEFT);
			
			test.addMouseListener(new MouseAdapter()
		    {
		        public void mouseClicked(MouseEvent e)
		        {
		        	
		        	Var.ProjectLOG = Var.ProjectLOG + "\n test erfolgt";
		        	database_Test.play();
		        	

		        }

		    });
			
			test.setBounds(0,30,200,30);
			drophintergrund.setLayer(test, 2); 
			drophintergrund.add(test);
				
			
			add(drophintergrund);			
			

	}
}