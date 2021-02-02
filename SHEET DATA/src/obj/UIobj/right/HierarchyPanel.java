package obj.UIobj.right;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.event.MouseInputAdapter;


import HauptPackage.*;
import funktionBundles.Var;
import quickParts.buttons.AddOnClose;
import quickParts.buttons.ClosebookmarkButton;
import quickParts.icon.IconButton;
import quickParts.icon.IconLabel;
import quickParts.labels.HeadlineLabel;


public class HierarchyPanel extends JPanel
{
	public static JPanel Scrollpanel = new JPanel();
	public static Container Arbeitsbereich = new Container();
	
	public JPanel scrollHandel = new JPanel();
	public JPanel scrollBar;
	
	public static JPanel background;
	
	static Point compCoords;
	
	public HierarchyPanel()
	{
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(262, 500));
//		setSize(200, 500);
		
		JPanel North = new JPanel();
		North.setLayout(new BorderLayout());
		
		
		JLabel headline = new JLabel("   Pages");
		headline.setFont(Var.OpenSans14);
		headline.setOpaque(true);
		headline.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Var.SekColor));
		headline.setBackground(Var.PrimColor);
		headline.setForeground(Color.GRAY);
		headline.setSize(170,30);
		headline.setBounds(0,0,170,30);
		
		North.add(headline, BorderLayout.CENTER);
		
		AddOnClose close = new AddOnClose(30,30,170,0);
		close.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	MainLayout.RechtsPanel.remove(Var.pageView[1]);
	        	SwingUtilities.updateComponentTreeUI(Var.mainLayout[1]);
	        	close.setBackground(Var.PrimColor);
	        }
	        public void mouseEntered(MouseEvent e){}
	        public void mouseExited(MouseEvent e){}
	    });
		
		North.add(close, BorderLayout.EAST);

		
		
		
		
		
		Arbeitsbereich.setBackground(Color.BLACK);
//		Arbeitsbereich.setPreferredSize(new Dimension (252, 22));
		Arbeitsbereich.setSize(252, 22);
		Arbeitsbereich.setBounds(0, 0, 252, 22);
		Arbeitsbereich.setLayout(new FlowLayout(0,0,0));
		
		scrollHandel.setBackground(Var.SekColor);
		scrollHandel.setLayout(null);
		scrollHandel.setPreferredSize(new Dimension(10,10));
		
		scrollBar = new JPanel() 
		{
            protected void paintComponent(Graphics g) 
            {
                super.paintComponent(g);
                ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
             
                g.setColor(Var.SekColor);
                g.fillRect(0,0,10,this.getHeight());
                
                g.setColor(Var.PrimColor);
                g.fillRoundRect(0,0,9,this.getHeight()-1,10,10);
                
                g.setColor(Var.SekColor);
                g.drawRoundRect(0,0,9,this.getHeight()-1,10,10);
                
            }
        };
		scrollBar.setSize(10,100);
		scrollBar.setBackground(Var.SekColor);
		scrollBar.setBounds(0,0,10,100);
		
		scrollHandel.addMouseMotionListener(new MouseAdapter() 
		{
			public void mouseDragged(MouseEvent e)
			{
				scrollBar.setBounds(0, e.getY(), 10, getHeight()-1 );
				System.out.println(scrollBar.getBounds());
				
				Arbeitsbereich.setBounds(0, e.getY() * (-1), Arbeitsbereich.getWidth(), Arbeitsbereich.getHeight());
				
				if(e.getY() < 0)
				{
					Arbeitsbereich.setBounds(0, 0, Arbeitsbereich.getWidth(), Arbeitsbereich.getHeight());
					scrollBar.setBounds(0, 0, 10, getHeight()-1);
				}
				
				
			}
			
		});
		scrollHandel.add(scrollBar);
		
		Scrollpanel.setPreferredSize(new Dimension(262,1000));
		Scrollpanel.setSize(262,1000);
		Scrollpanel.setBounds(0,0,200,1000);
		Scrollpanel.setBorder(new LineBorder(Var.PrimColor, 5));
		Scrollpanel.setBackground(Var.SekColor);
		Scrollpanel.setLayout(new BorderLayout());
//		Scrollpanel.setOpaque(false);
		
		JPanel ABHintergrund = new JPanel();
		ABHintergrund.setBackground(Var.SekColor);
		ABHintergrund.setLayout(null);
	
		ABHintergrund.add(Arbeitsbereich);
		
		Scrollpanel.add(ABHintergrund, BorderLayout.CENTER);
		Scrollpanel.add(scrollHandel, BorderLayout.EAST);
		
        
		add(Scrollpanel,BorderLayout.CENTER);
		add(North, BorderLayout.NORTH);
		
		
		JPanel SOUTH = new JPanel();
		SOUTH.setBackground(Var.PrimColor);
		SOUTH.setLayout(new FlowLayout(5,5,0));
		SOUTH.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		IconLabel trash = new IconLabel("trashcan.png", 20,20,0,0);
 		IconLabel newPage = new IconLabel("neueSeite.png", 20,20,0,0);
		IconLabel ordner = new IconLabel("opendokument.png", 20,20,0,0);
		
		SOUTH.add(trash);
		SOUTH.add(newPage);
		SOUTH.add(ordner);
		add(SOUTH, BorderLayout.SOUTH);
		
		setVisible(true);
	}
}
