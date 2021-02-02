package obj.UIobj.left;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.event.MouseInputAdapter;


import HauptPackage.*;
import funktionBundles.Var;
import quickParts.buttons.ClosebookmarkButton;
import quickParts.labels.HeadlineLabel;


public class LogView extends JFrame
{
	public static JPanel arbeitsbereich = new JPanel();
	public static String Textdateiname;
	public static JTextArea textarea;
	public static String inhalt;
	public static JPanel background;
	static Point compCoords;
	
	public String zeilennummer;
	
	public LogView()
	{
		setTitle("Log View");
		setLayout(null);
		setPreferredSize(new Dimension(400, 800));
		setSize(400, 800);
		
		HeadlineLabel headline = new HeadlineLabel("Log file", 150,40,10,0);
		headline.setOpaque(true);
		headline.setBackground(Var.PrimColor);
//		setLayer(headline, 3); 
//		add(headline);
		
		ClosebookmarkButton close = new ClosebookmarkButton();
		close.setBounds(170,-1,20,40);
		close.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	MainLayout.Links.remove(Var.projectData[1]);
//	        	Programmfenster.Mitte.validate();
	        	SwingUtilities.updateComponentTreeUI(Var.mainLayout[1]);
	        	close.setBackground(Var.PrimColor);
	        }
	        public void mouseEntered(MouseEvent e){}
	        public void mouseExited(MouseEvent e){}
	    });
//		setLayer(close, 1); 
//		add(close);
		

		arbeitsbereich.setPreferredSize(new Dimension(400,10000));
		arbeitsbereich.setSize(400,10000);
		arbeitsbereich.setBounds(0,0,400,10000);
		arbeitsbereich.setBackground(Color.BLACK);
		arbeitsbereich.setLayout(new BorderLayout());

		JPanel links = new JPanel();
		links.setLayout(new GridLayout(1,2));


		
		
		textarea = new JTextArea("", 1, 5);
		textarea.setFont(Var.OpenSans12);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(Var.PrimColor);
		textarea.setForeground(Color.LIGHT_GRAY);
		textarea.setEditable(false);
//		textarea.setSize(90,1000);
		textarea.setText(Var.ProjectLOG);

/*		
		int lineCount = Funktion.countLines(Var.log);
		for(int i = 2; i<= lineCount; ++i)
		{
			zeilennummer = zeilennummer + "\n" + i;
		}
		zeilennummern.setText(zeilennummer);

		links.add(zeilennummern);
//		links.add(Abstand);
		*/
		arbeitsbereich.add(links, java.awt.BorderLayout.WEST);	
		arbeitsbereich.add(textarea, java.awt.BorderLayout.CENTER);
		
        addMouseWheelListener(new MouseInputAdapter()
   		 {
       	    public void mouseWheelMoved(MouseWheelEvent e) 
       	    {
       	        if(e.getWheelRotation()<0)
       	        {
       	            
         	         Rectangle bounds = arbeitsbereich.getBounds();
     	        	if((int)bounds.getY() + 20 >= 50)
     	        	{
     	        		arbeitsbereich.setBounds(0, 0, 150, 10000);
         	            repaint();
     	        	}
     	        	else
     	        	{
        	        	arbeitsbereich.setBounds(0, (int)bounds.getY() + 20, 400, 10000);
         	            repaint();
     	        	}
 
       	        }
       	        
       	        if(e.getWheelRotation()>0)
       	        {
       	        	
       	        	Rectangle bounds = arbeitsbereich.getBounds();
       	        	arbeitsbereich.setBounds(0, (int)bounds.getY() - 20, 400, 10000);
       	            repaint();

	        	}
 
   	    	}
   		 });
//		setLayer(arbeitsbereich,2);
		add(arbeitsbereich);
		
		JPanel Background = new JPanel();
		Background.setBackground(Var.PrimColor);
		Background.setBorder(BorderFactory.createMatteBorder(0,0,0,1,Var.SekColor));
		Background.setBounds(0,0,400,800);
//		setLayer(Background, 1);
		add(Background);
		
		
		setVisible(true);
	}
	
	public void update()
	{
		textarea.setText(Var.ProjectLOG);
	}
}
