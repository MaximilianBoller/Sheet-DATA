package obj.Wobj.notationarea;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import actions.UIActions.AcHirarchieUpdate;
import actions.toolActions.AcNormalTool;
import actions.toolActions.AcResizeTool;
import funktionBundles.Rastern;
import funktionBundles.Var;
import obj.Wobj.ResizableComponentArea;

public class NotationArea extends ResizableComponentArea
{
	public JPanel pane;
	
	public KeyListener keyListener;
    private static FocusListener defaultFocusListener;
    public static MouseListener mouseListener;
    
    
    public int LinienLayout;
    
    public static int NotenLinienYOffset = 0;
    
	public NotationArea(int Linienlayout, int Seitenzahl, int ID, int SizeX, int SizeY, int BoundsX, int BoundsY) 
	{
		super(Seitenzahl, ID, SizeX, SizeY, BoundsX, BoundsY);
		
		this.LinienLayout = Linienlayout;
		
		
		
		// TODO Auto-generated constructor stub
		pane = new JPanel() 
		{
            protected void paintComponent(Graphics g) 
            {
                super.paintComponent(g);
                ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

            	 Stroke dashed = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{10}, 0);
            	 ((Graphics2D) g).setStroke(dashed);
                 
//            	 g.drawRect(10, 10, getWidth() -20, getHeight() -20);
//                 g.drawString("[Notation]", 40, 80);
                 
//                 g.drawString("Linienlayout: " + LinienLayout, 40, 120);

            }
        };
        
        pane.setLayout(new FlowLayout(5,5,5));
        pane.setPreferredSize(new Dimension(SizeX, SizeY));
        pane.setFont(Var.textareaFont);
        pane.setBackground(Color.WHITE);
        pane.setFocusable(true);
        
		keyListener = new KeyListener()
		{

			@Override
			public void keyTyped(KeyEvent e) 
			{

			}

			@Override
			public void keyPressed(KeyEvent e) 
			{
				//entf
				if(e.getKeyCode() == 127)
				{
					System.out.println("ENTF pressed");
//					setVisible(false);
//					Var.textarea[textareaId] = null;
				}
				
				// Strg + C -> Copy
				if (e.getKeyCode() == KeyEvent.VK_C && (e.getModifiers() & KeyEvent.CTRL_MASK) > 0) 
				{
					System.out.println("Strg + C");
					Var.ClipboardLOG = getProperties();
					
					if(Var.clipboardData[1] != null) 
					{
						Var.clipboardData[1].update();
					}
					else
					{
						
					}
				}
			}

			@Override
			public void keyReleased(KeyEvent e) 
			{
				
			}
		};
		
		
		defaultFocusListener = new FocusListener() 
	    {
			public void focusGained(FocusEvent e) 
			{
				pane.addKeyListener(keyListener);
				
				pane.setBackground(Color.LIGHT_GRAY);
				pane.setForeground(Color.GRAY);
				System.out.println("NotationArea " + pane + " requested Focus");
				AcResizeTool.run();
				focus = true;

				Var.ActivePage = page;
				AcHirarchieUpdate.run(page);
			}
			
			public void focusLost(FocusEvent e) 
			{
				pane.removeKeyListener(keyListener);
				
				pane.setBackground(Color.WHITE);
				pane.setForeground(Color.BLACK);
				System.out.println("NotationArea " + pane + " lost Focus");
				AcNormalTool.run();
				focus = false;
				
			}
	    };
	    pane.addFocusListener(defaultFocusListener);
	    
	    pane.addMouseListener(mouseListener = new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				if(e.getClickCount() == 2 && focus)
				{
					setEditable(true);
					removeResizable();
				}
			} 
			public void mousePressed(MouseEvent e)
			{
				ClickX = e.getX();
				ClickY = e.getY();
				
				RequestFocus();
				//-------------------------------------------------------------------------------
			}
		});
		
		componentArea.add(pane);
	}
	
	
	
	
	public void addLine()
	{
		for(int i = 1; i <= LinienLayout; ++i)
		{
	        NotenLinie Notenlinie = new NotenLinie(1,"bass","C","4b", 0, 0);
//	        Notenlinie.setBounds(0,NotenLinienYOffset,1420,200);
	        pane.add(Notenlinie);
	        
//	        NotenLinienYOffset = NotenLinienYOffset + 200;
		}
	}
	
	

	
	public void removeResizable()
	{
		pane.removeMouseMotionListener(textareaMotionListener);
		removeMouseMotionListener(MotionResizeListener);
		removeMouseListener(ResizeHandelListener);
		
		setBorder(new LineBorder(Color.WHITE, 0));
	}
	
	public void setEditable(boolean state)
	{
//		pane.setEditable(state);
		pane.setForeground(Color.BLACK);
	}
	
	public void updatePropperties(int SizeX, int SizeY, int BoundsX, int BoundsY, int linienLayout)
	{
		setSize(SizeX, SizeY);
		setBounds(BoundsX, BoundsY, SizeX, SizeY);
		LinienLayout = linienLayout;
		
	}

	
    public String getProperties()
    {
        Point bounds = getLocation();
        
        String properties;
        
        properties = "[NotationArea]"
                + "\n";
        properties = properties + LinienLayout
                + "\n";
        properties = properties + page
                + "\n";
        properties = properties + getWidth()
                + "\n";
        properties = properties + getHeight()
                + "\n";
        properties = properties + (int)bounds.getX()
                + "\n";
        properties = properties + (int)bounds.getY()
                + "\n"; 
        return properties;
    }
	
	public void RequestFocus()
	{
		System.out.println("Imagearea: " + pane + " CLICK");
		
		Var.mainLayout[1].north5.removeAll();
		Var.mainLayout[1].north5.add(Var.NotationAreaPropperties[ID]);
		Var.mainLayout[1].repaint();

		ClickX = (int)Rastern.run(ClickX);
		ClickY = (int)Rastern.run(ClickY);
		
		pane.requestFocus();
	}
	
	public void setResizable()
	{
		setBorder(new LineBorder(Var.BlueHightlightColor, 2));
		
		textareaMotionListener = (new MouseAdapter() 
		{
			public void mouseDragged(MouseEvent e)
			{
				
				ReleaseX = e.getX();
				ReleaseY = e.getY();
				
				ReleaseX = (int)Rastern.run(ReleaseX);
				ReleaseY = (int)Rastern.run(ReleaseY);
				
				setBounds(getX() + ReleaseX - ClickX, getY() + ReleaseY - ClickY, getWidth(), getHeight());
				setSize(getWidth(), getHeight());
				
				updateProppertiesWindow();
				
				Var.emptyPage[page].revalidate();
				
			}
		});
		pane.addMouseMotionListener(textareaMotionListener);
		
		SetComponentAreaResizable();
	}
	
	public void DontMove()
	{
		setFocusable(false);
		pane.setFocusable(false);
		pane.removeMouseListener(mouseListener);
		setEnabled(false);
	}
	
	public void updateProppertiesWindow()
	{
		//Update ProppertiesWindow
		Var.NotationAreaPropperties[ID].updateSizeLocation(getWidth(), getHeight(), (int)getBounds().getX(), (int)getBounds().getY());
	}
}
