package rumpelkiste.notenblattBausteine;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JTextArea;


import funktionBundles.Var;


public class Tempo extends JPanel
{
	public static JTextArea text = new JTextArea(600,60);
	public Tempo() 
	{
		setLayout(null);
		setVisible(true);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(600,60));
		
		this.setLayout(new GridLayout(1,1));


		text.setBackground(Color.WHITE);
		text.setForeground(Color.BLACK);
		text.setFont(Var.standartFont30);
		text.setAlignmentX(Component.CENTER_ALIGNMENT);
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
		
		text.setText(Var.Tempo);
		
		this.add(text);
		
//		this.add(text);
		
	}
}