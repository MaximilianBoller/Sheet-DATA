package quickParts.buttons;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import funktionBundles.Var;


public class ClosebookmarkButton extends JPanel
{
	public ClosebookmarkButton() 
	{	

		setOpaque(true);
		setPreferredSize(new Dimension(20,40));
		
		setBorder(BorderFactory.createLineBorder(Var.PrimColor, 1));
		setFont(Var.OpenSans12);	
		setBackground(Var.PrimColor);
		setForeground(Var.Color4);
        
		addMouseListener(new MouseAdapter()
	    {
	        public void mouseEntered(MouseEvent e)
	        {
	        	//hover();
	        }
	        
	        public void mouseExited(MouseEvent e)
	        {
	        	//normal();
	        }

	    });
		
	}
	
	public void hover()
	{
		setBorder(BorderFactory.createLineBorder(Var.PrimColor, 1));
		setBackground(Var.SekColor);
		setForeground(Var.Color4);
	}
	
	public void normal()
	{
		setBorder(BorderFactory.createLineBorder(Var.PrimColor, 1));
		setBackground(Var.PrimColor);
		setForeground(Var.Color4);
	}
	
	public void paint(Graphics g) 
	{
        super.paintComponent(g);
        
        Polygon polygon = new Polygon();
        g.setColor(Var.SekColor);
        g.fillRect(0,0,20,40);
        
        g.setColor(Var.PrimColor);
        polygon.addPoint(0,40);
        polygon.addPoint(10,30); 
        polygon.addPoint(20,40);  
        g.fillPolygon(polygon);
        
    }
}
