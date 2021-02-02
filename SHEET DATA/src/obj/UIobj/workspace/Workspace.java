package obj.UIobj.workspace;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelEvent;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.CountDownLatch;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.event.MouseInputAdapter;

import actions.pasteClipboard;
import actions.WActions.AcPageViewWindow;
import actions.save.SaveProjectIntoTXT;
import actions.toolActions.AcChangeTool;
import actions.toolActions.AcHandTool;
import actions.toolActions.AcImageareaTool;
import actions.toolActions.AcNormalTool;
import actions.toolActions.AcResizeTool;
import actions.toolActions.AcTextareaTool;
import funktionBundles.Var;

public class Workspace extends JLayeredPane
{
	public static draggableWorkspace drag = new draggableWorkspace();
	public static JPanel PagesBackground = new JPanel();
	
    private static FocusListener dragFocusListener;
    private static FocusListener workspaceFocusListener;
    
	
	public static Rectangle b = drag.getBounds();
	public static int x = (int)b.getX();
	public static int y = (int)b.getY();
	
	public static boolean ALT = false;
	public static boolean Hand = false;
	
	public Workspace()
	{
		setOpaque(true);
		setFocusable(true);
	    setBackground(Var.WorkspaceBackgroundColor);
	    setLayout(null);
		
		Var.workspaceZoomWidth = Var.pageWidth;
		Var.workspaceZoomHeight = Var.pageHeight;		

		dragFocusListener = new FocusListener() 
	    {
			public void focusGained(FocusEvent e) 
			{
				System.out.println("Background Focus Gained");
				Var.mainLayout[1].north5.removeAll();
				Var.mainLayout[1].north5.add(Var.pageProppertiesWindow[1]);
				Var.mainLayout[1].north5.repaint();
			}
			public void focusLost(FocusEvent e) 
			{
				System.out.println("Background Focus Lost");
			}
	    };
	    drag.addFocusListener(dragFocusListener);
		
	    
	    

	    
	    
	    // SPACE Key Binding
	    /*
	    Action SpacePressed = new AbstractAction()
		{
			public void actionPerformed(ActionEvent e) 
			{
		    	Hand = true;
		    	AcHandTool.run();
			}
		};
		
		drag.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "SpacePressed");
		drag.getActionMap().put("SpacePressed",SpacePressed);
		*/

	    

		
	    
	    
	    
	    
	    
	    
	    
		drag.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e) 
			{
			}

			public void keyPressed(KeyEvent e) 
			{
			    if(e.getKeyCode() == 32)
			    {
			    	Hand = true;
			    	AcHandTool.run();
			    }

			    if(e.getKeyCode() == 84)
			    {
			    	Var.recentTool = "textareaTool";
			    	AcChangeTool.run();
			    }
			    
			    if(e.getKeyCode() == 73)
			    {
			    	Var.recentTool = "imageareaTool";
			    	AcChangeTool.run();
			    }
			    
			    if(e.getKeyCode() == 87)
			    {
			    	Var.recentTool = "selectTool";
			    	AcChangeTool.run();
			    }
			    
			    if(e.getKeyCode() == 69)
			    {
			    	Var.recentTool = "resizeTool";
			    	AcChangeTool.run();
			    }
			    
			    if(e.getKeyCode() == 78)
			    {
			    	Var.recentTool = "notationTool";
			    	AcChangeTool.run();
			    }
			    
			    if(e.getKeyCode() == 18)
			    {
			    	System.out.println("ALT true");
			    	ALT = true;
			    }
			    if (e.getKeyCode() == KeyEvent.VK_V && (e.getModifiers() & KeyEvent.CTRL_MASK) > 0) 
				{
			    	try 
			    	{
						pasteClipboard.run();
					} 
			    	catch (IOException e1) 
			    	{
						e1.printStackTrace();
					}
				}
			    
			    if (e.getKeyCode() == KeyEvent.VK_S && (e.getModifiers() & KeyEvent.CTRL_MASK) > 0) 
				{
			    	try {
						SaveProjectIntoTXT.run();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}

			public void keyReleased(KeyEvent e) 
			{
			    if(e.getKeyCode() == 18)
			    {
			    	System.out.println("ALT false");
			    	ALT = false;
			    }
			    
			    if(e.getKeyCode() == 32)
			    {
			    	System.out.println("SPACE DONE");
			    	Hand = false;
			    	AcChangeTool.run();
			    }
			}
			
		});
		
		Point compCoords;
		
		PagesBackground.setLayout(new BorderLayout());
		PagesBackground.setBackground(Color.BLACK);

	    
		PagesBackground.setBounds(x, y, Var.workspaceWidth, Var.workspaceHeight);
		
		PagesBackground.addMouseListener(new MouseAdapter()
	    {
	        public void mousePressed(MouseEvent e)
	        {
	        	if(Hand)
	        	{
	        		URL image = AcImageareaTool.class.getClassLoader().getResource("resources/images/cursor/grabCursor.png");
	        		Image Image = Toolkit.getDefaultToolkit().getImage(image);
	        		Var.mainLayout[1].Mitte.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(Image,new Point(0,0),"custom cursor"));
	        	}
	        	
		    	drag.requestFocus();
		        x = e.getX();
		        y = e.getY();
		     
		         if(e.getClickCount() == 2)
		         {
		        	 AcPageViewWindow.run();
		        	 System.out.println("works just on 1. page");
		         }
	        }
	        public void mouseReleased(MouseEvent e)
	        {
	        	if(Hand)
	        	{
	        		URL image = AcImageareaTool.class.getClassLoader().getResource("resources/images/cursor/moveCursor.png");
	        		Image Image = Toolkit.getDefaultToolkit().getImage(image);
	        		Var.mainLayout[1].Mitte.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(Image,new Point(0,0),"custom cursor"));
	        	}
	        }
	     });
	    
		PagesBackground.addMouseMotionListener(new MouseMotionAdapter() 
   	 	{
   	 		public void mouseDragged(MouseEvent evt) 
          	{

          	 
//             int X = evt.getX()-x;
//             int Y = evt.getY()-y;
              int X = evt.getXOnScreen()-x;
              int Y = evt.getYOnScreen()-y;
              
              
          	Point w = Var.mainLayout[1].getLocationOnScreen();
         	int windowX = (int)w.getX();
         	int windowY = (int)w.getY();
              
         	PagesBackground.setBounds(X-windowX - 5,Y-windowY-160,Var.workspaceWidth,Var.workspaceHeight); 
          	}
	     });
   	 	
		PagesBackground.add(BorderLayout.CENTER, drag);
	    
		PagesBackground.addMouseWheelListener(new MouseInputAdapter()
   		 {
       	    public void mouseWheelMoved(MouseWheelEvent e) 
       	    {
       	        //Zoom in
       	        if(e.getWheelRotation()<0)
       	        {
       	        	
       	        	Var.draggableworkspace[1].PagesBackground.getBounds();
       	        	Rectangle workspaceRect = PagesBackground.getBounds();
       	        	int Xworkspace = (int)workspaceRect.getX();
       	        	int Yworkspace = (int)workspaceRect.getY();
       	        	int Widthworkspace = (int)workspaceRect.getWidth();
       	        	int Heightworkspace = (int)workspaceRect.getHeight();
       	        	
       	        	if(ALT)
       	        	{
       	        		Var.workspaceZoomWidth = Var.workspaceZoomWidth + 20;
       	        		Var.workspaceZoomHeight = Var.workspaceZoomHeight + 28;
       	        		
       	        		Var.pageWidth = Var.pageWidth + 20;
       	        		Var.pageHeight = Var.pageHeight + 28;
       	        		
           	        	Var.draggableworkspace[1].PagesBackground.setBounds(Xworkspace , Yworkspace, Var.workspaceZoomWidth, Var.workspaceZoomHeight);
       	        	}
       	        	else
       	        	{
           	        	Var.draggableworkspace[1].PagesBackground.setBounds(Xworkspace, Yworkspace + 20, Var.workspaceWidth, Var.workspaceHeight);
       	        	}

       	        	
       	        	System.out.println(Var.draggableworkspace[1].PagesBackground.getBounds());
       	        	
       	        	PagesBackground.repaint();
       	        }
       	        
       	        //Zoom out
       	        if(e.getWheelRotation()>0)
       	        {
       	        	
       	        	Var.draggableworkspace[1].PagesBackground.getBounds();
       	        	
       	        	Rectangle workspaceRect = PagesBackground.getBounds();
       	        	int Xworkspace = (int)workspaceRect.getX();
       	        	int Yworkspace = (int)workspaceRect.getY();
       	        	int Widthworkspace = (int)workspaceRect.getWidth();
       	        	int Heightworkspace = (int)workspaceRect.getHeight();
       	        	
       	        	if(ALT)
       	        	{
       	        		Var.workspaceZoomWidth = Var.workspaceZoomWidth - 20;
       	        		Var.workspaceZoomHeight = Var.workspaceZoomHeight - 28;
       	        		
       	        		Var.pageWidth = Var.pageWidth - 20;
       	        		Var.pageHeight = Var.pageHeight - 28;
       	        		
           	        	Var.draggableworkspace[1].PagesBackground.setBounds(Xworkspace , Yworkspace, Var.workspaceZoomWidth, Var.workspaceZoomHeight);
       	        	}
       	        	else
       	        	{
           	        	Var.draggableworkspace[1].PagesBackground.setBounds(Xworkspace, Yworkspace - 20, Var.workspaceWidth, Var.workspaceHeight);
       	        	}
       	        	
       	        	System.out.println(Var.draggableworkspace[1].PagesBackground.getBounds());
       	        	
       	        	PagesBackground.repaint();
   	        	}
   	    	}
   		 });
        
        setLayer(PagesBackground, 2);
	    add(PagesBackground);
	}
}
