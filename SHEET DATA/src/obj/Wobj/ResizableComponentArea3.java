package obj.Wobj;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import actions.UIActions.AcHirarchieUpdate;
import actions.toolActions.AcNormalTool;
import actions.toolActions.AcResizeTool;
import funktionBundles.Rastern;
import funktionBundles.Var;

public class ResizableComponentArea3 extends JPanel
{
	public JTextArea textarea;
	
	public MouseListener ResizeHandelListener;
	public MouseMotionListener MotionResizeListener;
	public MouseMotionListener textareaMotionListener;
	public KeyListener keyListener;
	
    private static FocusListener defaultFocusListener;
	
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
	public int page;
	
	public ResizableComponentArea3(int Seitenzahl,int SizeX, int SizeY, int BoundsX, int BoundsY)
	{
		page = Seitenzahl;
//		textareaId = TextareaId;
//		FontSize = fontSize;
		
		setPreferredSize(new Dimension(SizeX, SizeY));
		setSize(SizeX, SizeY);
		setBounds(BoundsX, BoundsY, SizeX, SizeY);
		
		setBackground(Color.WHITE);
		setForeground(Color.BLACK);
		setBorder(new LineBorder(Color.WHITE, 1));
		setLayout(new BorderLayout());
		setFocusable(true);
		
		/*
		textarea = new JTextArea();
		textarea.setText(Text);
		textarea.setPreferredSize(new Dimension(SizeX, SizeY));
		textarea.setFont(Var.textareaFont.deriveFont(FontSize));
		Font font = textarea.getFont();
		textarea.setFont( font.deriveFont(FontSize));
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		*/
//		textarea.setFocusable(true);
		
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
					setVisible(false);
//					Var.textarea[textareaId] = null;
				}
				
				//strg
				if (e.getKeyCode() == KeyEvent.VK_C && (e.getModifiers() & KeyEvent.CTRL_MASK) > 0) 
				{
					System.out.println("STRG + C pressed");
//					Var.ClipboardLOG = getProperties();
					
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
				textarea.addKeyListener(keyListener);
				
				textarea.setBackground(Color.LIGHT_GRAY);
				textarea.setForeground(Color.GRAY);
//				System.out.println("Textarea " + textareaId + " requested Focus");
				AcResizeTool.run();
				focus = true;

				Var.ActivePage = page;
				AcHirarchieUpdate.run(page);
			}
			
			public void focusLost(FocusEvent e) 
			{
				textarea.removeKeyListener(keyListener);
				
				textarea.setBackground(Color.WHITE);
				textarea.setForeground(Color.BLACK);
//				System.out.println("Textarea " + textareaId + " lost Focus");
				AcNormalTool.run();
				focus = false;
				
			}
	    };
		textarea.addFocusListener(defaultFocusListener);
	    
		textarea.addMouseListener(new MouseAdapter()
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
//				System.out.println("Textarea: " + textareaId + " CLICK");
				
//				Var.mainLayout[1].north5.removeAll();
//				Var.mainLayout[1].north5.add(Var.textareaProppertiesWindow[textareaId]);
//				Var.mainLayout[1].repaint();
				
				ClickX = e.getX();
				ClickY = e.getY();

				ClickX = (int)Rastern.run(ClickX);
				ClickY = (int)Rastern.run(ClickY);
				
				textarea.requestFocus();
			}
		});
		
		add(textarea);
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
				
//				updateProppertiesWindow();
				
				Var.emptyPage[page].revalidate();
				
			}
		});
		textarea.addMouseMotionListener(textareaMotionListener);
		
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

						setBounds(getX() - ReleaseX, getY(), getWidth(), getHeight());
						setSize(getWidth() + ReleaseX, getHeight());
						
						Var.emptyPage[page].revalidate();
					}
					else
					{
						ReleaseX = (int)Rastern.run(ReleaseX);
						
						setBounds(getX() + ReleaseX, getY(), getWidth(), getHeight());
						setSize(getWidth() -ReleaseX, getHeight());
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

						setBounds(getX(), getY() - ReleaseY, getWidth(), getHeight());
						setSize(getWidth(), getHeight() + ReleaseY);
						
						Var.emptyPage[page].revalidate();
					}
					else
					{
						ReleaseY = (int)Rastern.run(ReleaseY);
						
						setBounds(getX(), getY() + ReleaseY - ClickY, getWidth(), getHeight() - ReleaseY - ClickY);
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
//		textarea.removeMouseMotionListener(textareaMotionListener);
		removeMouseMotionListener(MotionResizeListener);
		removeMouseListener(ResizeHandelListener);
		
		setBorder(new LineBorder(Color.WHITE, 0));
	}
	
	public void setEditable(boolean state)
	{
//		textarea.setEditable(state);
//		textarea.setForeground(Color.BLACK);
		
	}
	
	public void updateSizeLocation(int SizeX, int SizeY, int BoundsX, int BoundsY)
	{
		setSize(SizeX, SizeY);
		setBounds(BoundsX, BoundsY, SizeX, SizeY);
	}
	
	/*
	public void updateProppertiesWindow()
	{
		//Update ProppertiesWindow
//		Var.textareaProppertiesWindow[textareaId].updateSizeLocation(getWidth(), getHeight(), (int)getBounds().getX(), (int)getBounds().getY());
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
