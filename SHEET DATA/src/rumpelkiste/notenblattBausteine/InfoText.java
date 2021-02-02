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

public class InfoText extends JPanel
{
	public static JTextArea text = new JTextArea(240,260);

	public InfoText() 
	{
		setLayout(null);
		setVisible(true);
		setBackground(Color.GRAY);
		setPreferredSize(new Dimension(240,260));
		
		this.setLayout(new GridLayout(1,1));

		text.setBackground(Color.WHITE);
		text.setForeground(Color.BLACK);
		text.setFont(Var.standartFont25);
		text.setWrapStyleWord(true);
		text.setLineWrap(true);
		
		text.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	
//		text.setAlignmentX(CENTER_ALIGNMENT);
		
		text.setText(Var.InfoText);
		
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
