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


import actions.UIActions.AcLogPanel;
import actions.UIActions.AcNotationwritingTool;
import actions.UIActions.AcPiano;
import funktionBundles.Var;


public class dropdownAnsicht extends JDialog
{
	public static JLayeredPane drophintergrund = new JLayeredPane();
	public static Insets insets = drophintergrund.getInsets();
	
	public  dropdownAnsicht()
	{
		
		drophintergrund.setPreferredSize(new Dimension(200,90));
		drophintergrund.setLayout(null);
		drophintergrund.setBackground(Color.BLACK);
	
		// panel dient nur dazu das Panel zu sehen, da einem LayeredPane keine Hintergrundfarbe gegeben werden kann.
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(200,90));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0,0,200,90);
		drophintergrund.setLayer(panel, 1); 
		drophintergrund.add(panel);
		//''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
		
		
		
		JButton controlPanel = new JButton("        " + "Add_Werkzeug");
		controlPanel.setPreferredSize(new Dimension(100,30));
		controlPanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		controlPanel.setBackground(Color.DARK_GRAY);
		controlPanel.setForeground(Color.WHITE);
		controlPanel.setFont(Var.standartFont13);
		controlPanel.setHorizontalAlignment(SwingConstants.LEFT);
		controlPanel.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	if(Var.AddOnControlPanel == true)
	        	{
	        	}
	        	
	        	if(Var.AddOnControlPanel == false)
	        	{
		        	AcNotationwritingTool.ausführen();	
		        	Var.AddOnControlPanel = true;
	        	}

	        }
	    });
		
		controlPanel.setBounds(0,0,200,30);
		drophintergrund.setLayer(controlPanel, 2); 
		drophintergrund.add(controlPanel);
		
		JButton pianoAddOn = new JButton("        " + "Add_Piano");
		pianoAddOn.setPreferredSize(new Dimension(100,30));
		pianoAddOn.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		pianoAddOn.setBackground(Color.DARK_GRAY);
		pianoAddOn.setForeground(Color.WHITE);
		pianoAddOn.setFont(Var.standartFont13);
		pianoAddOn.setHorizontalAlignment(SwingConstants.LEFT);
		pianoAddOn.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	AcPiano.ausführen();    
	        }
	    });
		
		pianoAddOn.setBounds(0,30,200,30);
		drophintergrund.setLayer(pianoAddOn, 2); 
		drophintergrund.add(pianoAddOn);
		
		
		JButton logOutput = new JButton("        " + "Add_Log");
		logOutput.setPreferredSize(new Dimension(100,30));
		logOutput.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		logOutput.setBackground(Color.DARK_GRAY);
		logOutput.setForeground(Color.WHITE);
		logOutput.setFont(Var.standartFont13);
		logOutput.setHorizontalAlignment(SwingConstants.LEFT);
		logOutput.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	AcLogPanel.run();

	        }
	    });
		
		logOutput.setBounds(0,60,200,30);
		drophintergrund.setLayer(logOutput, 2); 
		drophintergrund.add(logOutput);

		
		add(drophintergrund);
	}
}