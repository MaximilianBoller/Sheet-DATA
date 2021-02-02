package rumpelkiste.notenblattBausteine;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JTextArea;


import funktionBundles.Var;


public class Untertitel extends JPanel
{	
	public JTextArea text = new JTextArea(600,80);
	
	public Untertitel() 
	{
		setLayout(null);
		setVisible(true);
		setBackground(Color.PINK);
		setPreferredSize(new Dimension(600,80));
		
		this.setLayout(new GridLayout(1,1));

		text.setBackground(Color.WHITE);
		text.setForeground(Color.BLACK);
		text.setFont(Var.standartFont30);
//		text.setAlignmentX(CENTER_ALIGNMENT);
		text.setText(Var.Untertitel);
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