package obj.Wobj.textarea;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.Serializable;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import actions.UIActions.AcHirarchieUpdate;
import actions.toolActions.AcNormalTool;
import actions.toolActions.AcResizeTool;
import funktionBundles.Rastern;
import funktionBundles.Var;
import obj.Wobj.ResizableComponentArea;
import funktionBundles.Var;

public class TextArea extends ResizableComponentArea
{
	public KeyListener keyListener;
    private static FocusListener defaultFocusListener;
    public static MouseListener mouseListener;
    
	public JTextPane text;
	
	public float fontSize;
	String alignment;

	public TextArea(int Seitenzahl, int TextareaId, int SizeX, int SizeY, int BoundsX, int BoundsY, String Text, float fontSize, String fontName, String alignment) 
	{
		super(Seitenzahl, TextareaId, SizeX, SizeY, BoundsX, BoundsY);
		// TODO Auto-generated constructor stub
		this.fontSize = fontSize;
		this.alignment = alignment;
		
		text = new JTextPane();
		text.setOpaque(false);
		text.setBackground(new Color(0,0,0,0));
		text.setForeground(Color.BLACK);
		text.setText(Text);
/*		
		
		Font font = text.getFont();
		text.setFont(font.deriveFont(fontSize));
*/		
		Font font = new Font(fontName, Font.PLAIN, (int)fontSize);
		text.setFont(font.deriveFont(fontSize));
		text.setFont(font);
		
		allignText(this.alignment);
    	
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
				
				// Strg + L -> left text alignment
				if (e.getKeyCode() == KeyEvent.VK_L && (e.getModifiers() & KeyEvent.CTRL_MASK) > 0) 
				{
					allignText("left");
				}
				
				// Strg + R -> right text alignment
				if (e.getKeyCode() == KeyEvent.VK_R && (e.getModifiers() & KeyEvent.CTRL_MASK) > 0) 
				{
					allignText("right");
				}
				
				// Strg + E -> center text alignment
				if (e.getKeyCode() == KeyEvent.VK_E && (e.getModifiers() & KeyEvent.CTRL_MASK) > 0) 
				{
					allignText("center");
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
				text.addKeyListener(keyListener);
				
				text.setBackground(Color.LIGHT_GRAY);

				text.setForeground(Color.GRAY);
				System.out.println("Textarea " + text + " requested Focus");
				AcResizeTool.run();
				focus = true;

				Var.ActivePage = page;
				AcHirarchieUpdate.run(page);
			}
			
			public void focusLost(FocusEvent e) 
			{
				text.removeKeyListener(keyListener);

				text.setBackground(Color.WHITE);
				text.setForeground(Color.BLACK);
				System.out.println("Textarea " + text + " lost Focus");
				AcNormalTool.run();
				focus = false;
				
			}
	    };
	    text.addFocusListener(defaultFocusListener);
	    
	    text.addMouseListener(mouseListener = new MouseAdapter()
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
		
		componentArea.add(text);
	}
	
	public void removeResizable()
	{
		text.removeMouseMotionListener(textareaMotionListener);
		removeMouseMotionListener(MotionResizeListener);
		removeMouseListener(ResizeHandelListener);
		
		setBorder(new LineBorder(Color.WHITE, 0));
	}
	
	public void setEditable(boolean state)
	{
		text.setEditable(state);
		text.setForeground(Color.BLACK);
	}
	
	public void updateSizeLocation(int SizeX, int SizeY, int BoundsX, int BoundsY, String alignment)
	{
		setSize(SizeX, SizeY);
		setBounds(BoundsX, BoundsY, SizeX, SizeY);

		allignText(alignment);
	}

	
	public String getProperties()
	{
		Point bounds = getLocation();
		
		String properties;
		
		properties = "[TextArea]"
				+ "\n";
		properties = properties + text.getText()
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
		properties = properties + text.getFont().getSize()
				+ "\n";	
		properties = properties + text.getFont().getName()
				+ "\n";	
		properties = properties + this.alignment
				+ "\n";	
		return properties;
	}
	
	public void RequestFocus()
	{
		System.out.println("Textarea: " + text + " CLICK");
		
		Var.mainLayout[1].north5.removeAll();
		Var.mainLayout[1].north5.add(Var.TextAreaPropperties[ID]);
		Var.mainLayout[1].repaint();

		ClickX = (int)Rastern.run(ClickX);
		ClickY = (int)Rastern.run(ClickY);
		
		text.requestFocus();
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
		text.addMouseMotionListener(textareaMotionListener);
		
		SetComponentAreaResizable();
	}
	
	public void allignText(String alignment)
	{
		this.alignment = alignment;
		
		if(alignment.contentEquals("left"))
    	{
    		StyledDocument style = text.getStyledDocument();
    		SimpleAttributeSet align= new SimpleAttributeSet();
    		StyleConstants.setAlignment(align, StyleConstants.ALIGN_LEFT);
    		style.setParagraphAttributes(0, style.getLength(), align, false);
    		text.setDocument(style);
    	}
    	else if(alignment.contentEquals("center"))
    	{
    		StyledDocument style = text.getStyledDocument();
    		SimpleAttributeSet align= new SimpleAttributeSet();
    		StyleConstants.setAlignment(align, StyleConstants.ALIGN_CENTER);
    		style.setParagraphAttributes(0, style.getLength(), align, false);
    		text.setDocument(style);
    	}
    	else if(alignment.contentEquals("right"))
    	{
    		StyledDocument style = text.getStyledDocument();
    		SimpleAttributeSet align= new SimpleAttributeSet();
    		StyleConstants.setAlignment(align, StyleConstants.ALIGN_RIGHT);
    		style.setParagraphAttributes(0, style.getLength(), align, false);
    		text.setDocument(style);
    	}
	}
	
	public void DontMove()
	{
		setFocusable(false);
		text.setFocusable(false);
		text.removeMouseListener(mouseListener);
		setEnabled(false);
	}
	
	public void updateProppertiesWindow()
	{
		//Update ProppertiesWindow
		Var.TextAreaPropperties[ID].updateSizeLocation(getWidth(), getHeight(), (int)getBounds().getX(), (int)getBounds().getY());
	}
}
