package obj.Wobj;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import actions.UIActions.AcHirarchieUpdate;
import actions.toolActions.AcNormalTool;
import actions.toolActions.AcResizeTool;
import funktionBundles.Rastern;
import funktionBundles.Var;

public class ResizableComponentArea extends JPanel
{
	public JPanel componentArea;
	
	public MouseListener ResizeHandelListener;
	public MouseMotionListener MotionResizeListener;
	public MouseMotionListener textareaMotionListener;
	public KeyListener keyListener;
	

	
	public boolean topHandel;
	public boolean bottomHandel;
	public boolean leftHandel;
	public boolean rightHandel;
	
	public int ClickX;
	public int ClickY;
	public int ReleaseX;
	public int ReleaseY;
	
	public boolean focus;
	
	
	//properties
	public final int ID;
	public int page;
	
	public ResizableComponentArea(int Seitenzahl,int TextareaId,int SizeX, int SizeY, int BoundsX, int BoundsY)
	{
		ID = TextareaId;
		page = Seitenzahl;
		
		setPreferredSize(new Dimension(SizeX, SizeY));
		setBounds(BoundsX, BoundsY, SizeX, SizeY);
		
		setBackground(new Color(0,0,0,0));
		setForeground(Color.BLACK);
		setBorder(new LineBorder(Color.WHITE, 1));
		setLayout(new BorderLayout());
		setOpaque(false);
		setFocusable(true);
		
		componentArea = new JPanel();
		componentArea.setLayout(new BorderLayout());
		componentArea.setOpaque(false);
		componentArea.setPreferredSize(new Dimension(SizeX, SizeY));
		componentArea.setFocusable(true);
		
		add(componentArea);
	}
	
	public void SetComponentAreaResizable()
	{
		setBorder(new LineBorder(Var.BlueHightlightColor, 2));
		
		ResizeHandelListener = new MouseAdapter()
		{
			public void mouseEntered(MouseEvent e)
			{
				
				// OBERE KANTE
				if(e.getX() > 4 && e.getY() < 4 && e.getX() < getWidth() - 4)
				{
					Cursor cursor = new Cursor(Cursor.N_RESIZE_CURSOR);
		            Var.mainLayout[1].Mitte.setCursor(cursor);
		            topHandel = true;
		            bottomHandel = false;
		            leftHandel = false;
		            rightHandel = false;
		            
		            System.out.println("TOP");
		            
				}
				
				// UNTERE KANTE
				else if(e.getX() > 4 && e.getY() > 4 && e.getX() < getWidth() - 4)
				{
					Cursor cursor = new Cursor(Cursor.S_RESIZE_CURSOR);
		            Var.mainLayout[1].Mitte.setCursor(cursor);
		            topHandel = false;
		            bottomHandel = true;
		            leftHandel = false;
		            rightHandel = false;
		            
		            System.out.println("BOTTOM");
				}
				
				// LINKE KANTE
				else if(e.getX() < 5 && e.getY() > 5 && e.getY() < getHeight() - 5)
				{
					Cursor cursor = new Cursor(Cursor.W_RESIZE_CURSOR);
		            Var.mainLayout[1].Mitte.setCursor(cursor);
		            topHandel = false;
		            bottomHandel = false;
		            leftHandel = true;
		            rightHandel = false;
		            
		            System.out.println("LEFT");
				}
				
				// RECHTE KANTE
				else if(e.getX() > getWidth() - 5 && e.getY() > 5 && e.getY() < getHeight() - 5)
				{
					Cursor cursor = new Cursor(Cursor.E_RESIZE_CURSOR);
		            Var.mainLayout[1].Mitte.setCursor(cursor);
		            topHandel = false;
		            bottomHandel = false;
		            leftHandel = false;
		            rightHandel = true;
		            
		            System.out.println("RIGHT");
				}
				
				else
				{
					Cursor cursor = new Cursor(Cursor.MOVE_CURSOR);
		            Var.mainLayout[1].Mitte.setCursor(cursor);
				}
			}
			
			public void mouseExited(MouseEvent e)
			{
				Cursor cursor = new Cursor(Cursor.MOVE_CURSOR);
	            Var.mainLayout[1].Mitte.setCursor(cursor);
			}

			public void mouseClicked(MouseEvent e){
	        }
			
			public void mousePressed(MouseEvent e)
			{
				ClickX = e.getX();
				ClickY = e.getY();
				System.out.println(e);
			}
		};	
		
		
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
				
//				updateProppertiesWindow();
			}
		};
		
		addMouseMotionListener(MotionResizeListener);
		addMouseListener(ResizeHandelListener);
		
	}
	
	
	public void removeResizable()
	{
		componentArea.removeMouseMotionListener(textareaMotionListener);
		removeMouseMotionListener(MotionResizeListener);
		removeMouseListener(ResizeHandelListener);
		
		setBorder(new LineBorder(Color.WHITE, 0));
	}
	
	public void setEditable(boolean state)
	{
//		componentArea.setEditable(state);
		componentArea.setForeground(Color.BLACK);
	}

}
