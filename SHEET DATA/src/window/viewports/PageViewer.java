package window.viewports;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import funktionBundles.Var;

public class PageViewer extends JFrame
{
	BufferedImage Image;
//	int width = (int)Math.round((Var.screenHeight - 40) *Math.sqrt(2));
	
	public PageViewer(BufferedImage page)
	{
		Image = page;
		

		
		setPreferredSize(new Dimension(Var.pageWidth / 2 +1,Var.pageHeight / 2+1));
		setSize(Var.pageWidth / 2+1,Var.pageHeight / 2+1);
		setTitle("Vorschau");
		
		
		setLocationRelativeTo(null);
		setUndecorated(true);
		setVisible(true);
		
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
	        {
				dispose();
	        }
	
		});
	}
	
	public void paint(Graphics g)
	{
//		super.paintComponent(g);
		
		Graphics2D n = (Graphics2D) g;
		
		n.setColor(Var.BorderColor);
		
		
		n.drawImage(Image, 0, 0, Var.pageWidth / 2,Var.pageHeight / 2, this);
		

		
		
		
//		n.setColor(Color.BLACK);
//		n.setStroke(new BasicStroke(2));
		
//		int insets = Var.borderInsets;
//		n.drawRect(insets,insets,Var.pageWidth - 2*insets, Var.pageHeight - 2*insets);
		
		

	}

}
