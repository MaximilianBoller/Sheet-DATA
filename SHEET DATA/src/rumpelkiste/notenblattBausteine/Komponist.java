package rumpelkiste.notenblattBausteine;

import java.awt.Color;

import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JTextArea;


import funktionBundles.Var;


public class Komponist extends JPanel
{
	public static JTextArea text = new JTextArea(640,60);

	public Komponist() 
	{
		setLayout(null);
		setVisible(true);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(640,60));
		
		this.setLayout(new GridLayout(1,1));

		text.setBackground(Color.WHITE);
		text.setForeground(Color.BLACK);
		text.setFont(Var.standartFont30);
		text.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	
//		text.setAlignmentX(CENTER_ALIGNMENT);
		
		text.setText(Var.Komponist);
		
		this.add(text);
		
		text.addMouseListener(new MouseAdapter()
	    {
	        public void mouseEntered(MouseEvent e)
	        {
	        	text.setBackground(Var.schlagschattenGrau);
	        }
	        
	        public void mouseExited(MouseEvent e)
	        {
	        	text.setBackground(Color.WHITE);
	        }
	    });
		
//		this.add(text);
		
	}
}
