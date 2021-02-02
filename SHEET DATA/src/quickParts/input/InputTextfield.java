package quickParts.input;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

import funktionBundles.Var;

public class InputTextfield extends JTextField
{
	int x;
	int y;
	
	public InputTextfield(String Value, int SizeX, int SizeY, int BoundsX, int BoundsY)
	{
		x = SizeX;
		y = SizeY;
		
		setHorizontalAlignment(JTextField.CENTER);
		setFont(Var.OpenSans12);
		setBackground(Var.SekColor);
		setForeground(Var.BorderColor);
		setBorder(BorderFactory.createMatteBorder(0,0,0,0,Var.PrimColor));
		setEditable(true);
		setText(Value);
		setSize(SizeX, SizeY);
		setPreferredSize(new Dimension(SizeX, SizeY));
		setBounds(BoundsX,BoundsY,SizeX,SizeY);
	}
	
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        
        g.setColor(Var.BorderColor);
        g.drawRoundRect(0,0,x-1,y-1, 6, 6);
    }

}
