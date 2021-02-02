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
import window.dialogWindows.dialogWindowPNGSpeichern;


public class dropdownBearbeiten extends JDialog
{
	public static JLayeredPane drophintergrund = new JLayeredPane();
	public static Insets insets = drophintergrund.getInsets();
	
	public  dropdownBearbeiten()
	{
		
		drophintergrund.setPreferredSize(new Dimension(200,120));
		drophintergrund.setLayout(null);
		drophintergrund.setBackground(Color.BLACK);
		
		// panel dient nur dazu das Panel zu sehen, da einem LayeredPane keine Hintergrundfarbe gegeben werden kann.
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(200,120));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0,0,200,120);
		drophintergrund.setLayer(panel, 1); 
		drophintergrund.add(panel);
		//''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
		
		
			JButton Button1 = new JButton("        " + "Export Notenblatt");
			Button1.setPreferredSize(new Dimension(100,30));
			Button1.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
			Button1.setBackground(Color.DARK_GRAY);
			Button1.setForeground(Color.WHITE);
			Button1.setFont(Var.standartFont13);
			Button1.setHorizontalAlignment(SwingConstants.LEFT);
			
			Button1.addMouseListener(new MouseAdapter()
		    {
		        public void mouseClicked(MouseEvent e)
		        {
//		        	AcImageSpeichern.ausführen();
		        	dialogWindowPNGSpeichern dialogWindow = new dialogWindowPNGSpeichern();
		        	dialogWindow.setLocationRelativeTo(null);
		        	
		        }

		    });
			
			Button1.setBounds(0,0,200,30);
			drophintergrund.setLayer(Button1, 2); 
			drophintergrund.add(Button1);
			
			
			
			
			
			
			JButton komponist = new JButton("        " + "-");
			komponist.setPreferredSize(new Dimension(100,30));
			komponist.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
			komponist.setBackground(Color.DARK_GRAY);
			komponist.setForeground(Color.WHITE);
			komponist.setFont(Var.standartFont13);
			komponist.setHorizontalAlignment(SwingConstants.LEFT);
			
			komponist.addMouseListener(new MouseAdapter()
		    {
		        public void mouseClicked(MouseEvent e)
		        {
		        }

		    });
			komponist.setBounds(0,30,200,30);
			drophintergrund.setLayer(komponist, 2); 
			drophintergrund.add(komponist);
			
			
			JButton test = new JButton("        " + "-");
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
		        }

		    });
			test.setBounds(0,60,200,30);
			drophintergrund.setLayer(test, 2); 
			drophintergrund.add(test);
			
			
			JButton test01 = new JButton("        " + "-");
			test01.setPreferredSize(new Dimension(100,30));
			test01.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
			test01.setBackground(Color.DARK_GRAY);
			test01.setForeground(Color.WHITE);
			test01.setFont(Var.standartFont13);
			test01.setHorizontalAlignment(SwingConstants.LEFT);
			
			test01.addMouseListener(new MouseAdapter()
		    {
		        public void mouseClicked(MouseEvent e)
		        {
		        }

		    });
			test01.setBounds(0,90,200,30);
			drophintergrund.setLayer(test01, 2); 
			drophintergrund.add(test01);
			
			add(drophintergrund);
	}
}