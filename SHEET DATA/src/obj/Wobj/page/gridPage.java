package obj.Wobj.page;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import actions.WActions.AcTextArea;
import funktionBundles.Rastern;
import funktionBundles.Var;

public class gridPage extends JPanel
{
	
	public gridPage()
	
	{
		setLayout(null);
//		setBackground(Color.WHITE);
		setBorder(new LineBorder(Var.BorderColor, 1));
		setPreferredSize(new Dimension(Var.pageWidth,Var.pageHeight));
		setBounds(0,0, Var.pageWidth, Var.pageHeight);
		setVisible(true);
		setOpaque(false);
	}
	
	public void paint(Graphics g)
	{
		super.paintComponent(g);
		
		Graphics2D n = (Graphics2D) g;
		
		n.setColor(Color.LIGHT_GRAY);
		
		
		int a = Var.gridSize;
		for(int i = 0; i <= Var.pageWidth / Var.gridSize; i ++)
		{
	
			n.drawLine(a, 0,a, Var.pageHeight);
			a = a + Var.gridSize;
		}
		
		
		int b = Var.gridSize;
		for(int i = 0; i <= Var.pageHeight / Var.gridSize; i ++)
		{
	
			n.drawLine(0, b, Var.pageWidth, b);
			b = b + Var.gridSize;
		}
		

		
		
		
		n.setColor(Color.DARK_GRAY);
		n.setStroke(new BasicStroke(1));
		
		int insets = Var.pageBorder;
		n.drawRect(insets,insets,Var.pageWidth - 2*insets, Var.pageHeight - 2*insets);
		
		
		
		n.setColor(Color.RED);
		
		n.drawLine(Var.randLinks, 0, Var.randLinks, Var.pageHeight);
		n.drawLine(Var.pageWidth - Var.randRechts, 0, Var.pageWidth - Var.randRechts, Var.pageHeight);
		
		n.drawLine(0,Var.randOben, Var.pageWidth, Var.randOben);
		n.drawLine(0,Var.pageHeight - Var.randUnten, Var.pageWidth, Var.pageHeight - Var.randUnten);
		
//		n.drawRect(0,0,Var.pageWidth-1, Var.pageHeight-1);
		
	}
	
}