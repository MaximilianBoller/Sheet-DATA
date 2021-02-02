package window.dialogWindows;


import java.awt.Color;
import java.awt.Dimension;

import java.awt.Frame;

import java.awt.Point;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import funktionBundles.Var;


public class Titlebar  extends JPanel
{
    JLabel text = new JLabel();
     
    JLabel exit = new JLabel();

    
    static Point compCoords;
    
	public Titlebar(String title)
	{
		setOpaque(false);
	    setLayout(null);
	    setPreferredSize(new Dimension(200,30));
	    setOpaque(true);
	    setBackground(Var.PrimColor);
	    setForeground(Color.LIGHT_GRAY);
	    

	    text.setText(title);
	    text.setPreferredSize(new Dimension(text.getMinimumSize()));
	    text.setBounds(10,0,500,30);
	    text.setBackground(Var.PrimColor);
	    text.setForeground(Color.LIGHT_GRAY);
//	    text.setEditable(false);
	    text.setFont(Var.OpenSans12);
//	    text.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Var.Color3));
	    add(text);
  
	    
	    URL exitButtonUrl= this.getClass().getResource("buttonExitDark.png");
		Icon exitButton = new ImageIcon(exitButtonUrl);
		exit.setOpaque(true);
	    exit.setIcon(exitButton);
        exit.setBackground(Var.PrimColor);
        exit.setPreferredSize(new Dimension(30,30));
		exit.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Var.SekColor));
//		exit.setBorder(BorderFactory.createLineBorder(Var.Color1));
		
		exit.addMouseListener(new MouseListener()
        {
	    	public void mouseClicked(MouseEvent e) 
	    	{
	    		Var.neuesProjektErstellen[1].dispose();
	    	}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) 
			{
				exit.setBackground(new Color(217, 68, 82));
			}
	
			public void mouseExited(MouseEvent e) 
			{
		        exit.setBackground(Var.PrimColor);
			}
        });
		
        exit.setBounds(800-50, 0, 50, 30);
        add(exit);
        
        compCoords = null;
	    addMouseListener(new MouseListener()
	    {
	        public void mouseReleased(MouseEvent e)
	        {
	            compCoords = null;
	        }
	
	        public void mousePressed(MouseEvent e)
	        {
	            compCoords = e.getPoint();
	        }
	        public void mouseExited(MouseEvent e) {}
	        public void mouseEntered(MouseEvent e){}
	        public void mouseClicked(MouseEvent e){}
	    });

	    addMouseMotionListener(new MouseMotionListener() 
	    {
	        public void mouseMoved(MouseEvent e){}
	
	        public void mouseDragged(MouseEvent e)
	        {
	            Point currCoords = e.getLocationOnScreen();
	            Var.neuesProjektErstellen[1].setLocation(currCoords.x - compCoords.x, currCoords.y - compCoords.y);
	        }
	    });
	    
	    
		compCoords = null;		        
	}

}
