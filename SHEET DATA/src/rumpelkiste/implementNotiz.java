package rumpelkiste;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Insets;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


import funktionBundles.Funktion;
import funktionBundles.Var;


public class implementNotiz extends JInternalFrame
{
	public static JPanel hintergrund = new JPanel();
	public static Insets insets = hintergrund.getInsets();
	
	public implementNotiz() 
	{
		setLayout(new BorderLayout());

  
		Font font = new Font("Calibri", Font.PLAIN, 30);
		Font font01 = new Font("Calibri", Font.PLAIN, 40);
		
		
		this.addMouseMotionListener(new MouseAdapter()
		{
			public void mouseMoved(MouseEvent e)
			{
	    	    double x = Funktion.grid(getX(), Var.RasterHintergrund);
	    	    double y = Funktion.grid(getY(), Var.RasterHintergrund);
	    	    
	    	    setLocation((int)Math.round(x),(int)Math.round(y));
			}
		});
		
		
	
		
		
   
	    hintergrund.setBackground(Color.BLACK);
	    hintergrund.setPreferredSize(new Dimension(300,300));
	    hintergrund.setLayout(null);
		setClosable(true);
		add(BorderLayout.CENTER, hintergrund);
	    
 

	    JTextArea maintaskarea;
	    JTextArea taskarea;
	    
	    maintaskarea = new JTextArea("Main Task");
	    maintaskarea.setPreferredSize(new Dimension(300,50));
	    
	    maintaskarea.setBackground(new Color(188,235,80));
	    maintaskarea.setForeground(Color.darkGray);
	    maintaskarea.setLineWrap(true);
	    maintaskarea.setFont(font01);
	    maintaskarea.setBounds(0,0,300,50);
    	hintergrund.add(maintaskarea);
	    
	    taskarea = new JTextArea("Task");
	    taskarea.setPreferredSize(new Dimension(300,250));
	    taskarea.setBackground(new Color(188,235,80));
	    taskarea.setForeground(Color.darkGray);
	    taskarea.setLineWrap(true);
	    taskarea.setFont(font);
	    taskarea.setBounds(0,50,300,250);
    	hintergrund.add(taskarea);
	    
	    taskarea.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	if (e.getClickCount()>=2)
	        	{
		            int x = e.getX();
		            int y = e.getY();

		            System.out.println(x + "," + y); 
		         
		            implementNotizKlein klein = new implementNotizKlein();

		            klein.setPreferredSize(new Dimension(300,150));
		            klein.setBounds(10,10,300,150);
//		        	Var.NotenBlattScrolls[1].arbeitsbereich.setLayer(klein, 6);

	        	}
 
	        }
	    });
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(300, 300);

	    setVisible(true);
	}
		
	
}
