package rumpelkiste.notenblattBausteine;


import java.awt.Color;
import java.awt.Dimension;

import java.awt.GridLayout;



import javax.swing.JPanel;
import javax.swing.JTextArea;


import funktionBundles.Var;

public class PostIt extends JPanel
{	
	public PostIt() 
	{
		setLayout(null);
		setVisible(true);
		setBackground(new Color(188,235,80));
		setPreferredSize(new Dimension(300,300));
		
		this.setLayout(new GridLayout(1,1));
		JTextArea text = new JTextArea(100,100);
		text.setBackground(new Color(188,235,80));
		text.setForeground(Color.DARK_GRAY);
		text.setFont(Var.standartFont30);
		text.setWrapStyleWord(true);
		text.setLineWrap(true);
		text.setText("Notiz");
		this.add(text);
		
//		this.add(text);
		
	}
	
/*	public void paint(Graphics g)
	{
		Font font = new Font("Calibri light", Font.PLAIN, 40);
		
		super.paintComponent(g);
		
		Graphics2D n = (Graphics2D) g;
		

		
		n.setColor(Color.BLACK);
		n.fillRect(0, 0, 300, 300);
		


	}
*/
}


