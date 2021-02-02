package obj.Wobj;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import actions.UIActions.AcHirarchieUpdate;
import actions.toolActions.AcNormalTool;
import actions.toolActions.AcResizeTool;
import funktionBundles.Rastern;
import funktionBundles.Var;

public class ResizableComponentArea2 extends JLayeredPane
{
	public MouseListener ResizeHandelListener;
	public MouseMotionListener MotionResizeListener;
	public MouseMotionListener textareaMotionListener;
	public KeyListener keyListener;
	
    private static FocusListener defaultFocusListener;

    JPanel Layer1 = new JPanel();
    JPanel Layer2 = new JPanel();
    
    
	JPanel Content = new JPanel();
	
	JPanel TopHandel = new JPanel();
	JPanel TopGrab = new JPanel();
	
	JPanel BottomHandel = new JPanel();
	JPanel BottomGrab = new JPanel();
	
	JPanel RightHandel = new JPanel();
	JPanel RightGrab = new JPanel();
	
	JPanel LeftHandel = new JPanel();
	JPanel LeftGrab = new JPanel();
	
	public boolean topHandel;
	public boolean bottomHandel;
	public boolean leftHandel;
	public boolean rightHandel;
	
	public int ClickX;
	public int ClickY;
	public int ReleaseX;
	public int ReleaseY;
	
	public boolean focus;
	
	public int page;
	
	int grabSize = 10;
	
	public ResizableComponentArea2(int Seitenzahl,int SizeX, int SizeY, int BoundsX, int BoundsY)
	{
		page = Seitenzahl;
		
		setPreferredSize(new Dimension(SizeX, SizeY));
		setBounds(BoundsX, BoundsY, SizeX, SizeY);
		
		setLayout(null);
		setBorder(new LineBorder(Color.BLACK,1));
		setOpaque(false);
		setBackground(Color.WHITE);
		setFocusable(true);
		
		defaultFocusListener = new FocusListener() 
	    {
			public void focusGained(FocusEvent e) 
			{
				System.out.println("FocusGained");
				addKeyListener(keyListener);
				
				Content.setBackground(Color.LIGHT_GRAY);
				Content.setForeground(Color.GRAY);
				focus = true;
			}
			
			public void focusLost(FocusEvent e) 
			{
				System.out.println("FocusLost");
				removeKeyListener(keyListener);
				
				Content.setBackground(Color.WHITE);
				Content.setForeground(Color.BLACK);
				focus = false;
				
			}
	    };
	    Content.addFocusListener(defaultFocusListener);
	    
	    
	    
	    
	    addMouseListener(new MouseAdapter()
		{
	    	public void mousePressed(MouseEvent e)
	    	{
	    		ClickX = e.getX();
	    		ClickY = e.getY();
	    		
	    		if(e.getY() <grabSize && e.getX() > grabSize && e.getX() < getWidth() - grabSize )
	    		{
					Cursor cursor = new Cursor(Cursor.N_RESIZE_CURSOR);
		            Var.mainLayout[1].Mitte.setCursor(cursor);
		            topHandel = true;
		            bottomHandel = false;
		            leftHandel = false;
		            rightHandel = false;
		            
		            System.out.println("TOP");
	    		}
	    		
	    		if(e.getX() > getWidth() - grabSize && e.getY() > grabSize && e.getY() < getHeight() - grabSize)
	    		{
					Cursor cursor = new Cursor(Cursor.E_RESIZE_CURSOR);
		            Var.mainLayout[1].Mitte.setCursor(cursor);
		            topHandel = false;
		            bottomHandel = false;
		            leftHandel = false;
		            rightHandel = true;
		            
		            System.out.println("RIGHT");
	    		}
	    		
	    		if(e.getX() < grabSize && e.getY() > grabSize && e.getY() < getHeight() - grabSize)
	    		{
					Cursor cursor = new Cursor(Cursor.W_RESIZE_CURSOR);
		            Var.mainLayout[1].Mitte.setCursor(cursor);
		            topHandel = false;
		            bottomHandel = false;
		            leftHandel = true;
		            rightHandel = false;
		            
		            System.out.println("LEFT");
	    		}
	    		
	    		if(e.getY() > getHeight() - grabSize && e.getX() < getWidth() - grabSize && e.getX() > grabSize)
	    		{
					Cursor cursor = new Cursor(Cursor.S_RESIZE_CURSOR);
		            Var.mainLayout[1].Mitte.setCursor(cursor);
		            topHandel = false;
		            bottomHandel = true;
		            leftHandel = false;
		            rightHandel = false;
		            
		            System.out.println("BOTTOM");
	    		}
	    	} 	
		});
	    
	    
	    
		Content.setOpaque(true);
		Content.setFocusable(true);
		Content.setBackground(Color.BLACK);
		Content.setBounds(grabSize, grabSize, getWidth() - grabSize * 2, getHeight() - grabSize * 2);
		Content.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				Content.requestFocus();
				System.out.println("request Focus...");
			}
		});
		setLayer(Content, 1);
		
		add(Content);
		
		
		
		
		
		
		

		MotionResizeListener = new MouseAdapter()
		{
			public void mouseDragged(MouseEvent e) 
			{
				ReleaseX = e.getX();
				ReleaseY = e.getY();
				

				if(bottomHandel)
				{
					setSize(getWidth(), (int)Rastern.run(ReleaseY));
					Var.emptyPage[page].revalidate();
				}
				
				else if(rightHandel)
				{
					setSize((int)Rastern.run(ReleaseX), getHeight());
					Var.emptyPage[page].revalidate();
				}
				
				else if(leftHandel)
				{
					if(ReleaseX < 0)
					{
						ReleaseX = ReleaseX*(-1);
						System.out.println(ReleaseX);  
						
						ReleaseX = (int)Rastern.run(ReleaseX);

						setBounds(getX() - ReleaseX, getY(), getWidth() + ReleaseX, getHeight());
						setSize(getWidth(), getHeight());
						
						Var.emptyPage[page].revalidate();
					}
					else
					{
						ReleaseX = (int)Rastern.run(ReleaseX);
						
						setBounds(getX() + ReleaseX, getY(), getWidth() -ReleaseX, getHeight());
						setSize(getWidth(), getHeight());
						Var.emptyPage[page].revalidate();
					}
				}
				
				else if(topHandel)
				{
					if(ReleaseY < 0)
					{
						ReleaseY = ReleaseY*(-1);
						System.out.println(ReleaseY);  
						
						ReleaseY = (int)Rastern.run(ReleaseY);

						setBounds(getX(), getY() - ReleaseY, getWidth(), getHeight() + ReleaseY);
						setSize(getWidth(), getHeight());
						
						Var.emptyPage[page].revalidate();
					}
					else
					{

						ReleaseY = (int)Rastern.run(ReleaseY);
						
						setBounds(getX(), getY() + ReleaseY, getWidth(), getHeight() - ReleaseY);
						setSize(getWidth(), getHeight());
						Var.emptyPage[page].revalidate();
					}
				}
			}
		};
		
		addMouseMotionListener(MotionResizeListener);
		addMouseListener(ResizeHandelListener);
	}

	/*
	public Insets getInsets()
	{
		return new Insets(5, 10, 15, 20);
	}
	*/
	
		public void removeResizable()
		{
//			textarea.removeMouseMotionListener(textareaMotionListener);
			removeMouseMotionListener(MotionResizeListener);
			removeMouseListener(ResizeHandelListener);
			
			setBorder(new LineBorder(Color.WHITE, 0));
		}
		
		public void paintComponent(Graphics g) 
        {
            super.paintComponent(g);
            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
            
            g.setColor(Var.PrimColor);
            
            //oben
            g.fillRect(getWidth() / 2 - grabSize/2, 0, grabSize, grabSize );
            //unten
            g.fillRect(getWidth() / 2 - grabSize/2, getHeight() - grabSize, grabSize, grabSize );
            //rechts
            g.fillRect(getWidth() - grabSize, getHeight() / 2 - grabSize/2, grabSize, grabSize );
            //links
            g.fillRect(0, getHeight() / 2 - grabSize/2, grabSize, grabSize );
            
            //content
            g.fillRect(grabSize,grabSize,getWidth() - grabSize*2, getHeight() - grabSize*2);
            
            g.setColor(Var.BorderColor);
            
        }
		
		/*
		public void setEditable(boolean state)
		{
//			textarea.setEditable(state);
//			textarea.setForeground(Color.BLACK);
			
		}
		
		/*
		public void updateSizeLocation(int SizeX, int SizeY, int BoundsX, int BoundsY)
		{
			setSize(SizeX, SizeY);
			setBounds(BoundsX, BoundsY, SizeX, SizeY);
		}
		
		/*
		public void updateProppertiesWindow()
		{
			//Update ProppertiesWindow
			//Var.textareaProppertiesWindow[componentId].updateSizeLocation(getWidth(), getHeight(), (int)getBounds().getX(), (int)getBounds().getY());
		}

		/*
		public String getProperties()
		{
			Point bounds = getLocation();
			
			String properties;
			
			properties = "<text area>"
					+ "\n";
			properties = properties + textarea.getText()
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
			properties = properties + FontSize
					+ "\n";	
			return properties;
		}
		*/
		
	}
