package HauptPackage;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.UIDefaults;
import javax.swing.UIManager;





public class MainLayout extends JFrame
{
	public static Container north = new Container();
	public Container north1 = new Container();
	public Container north2 = new Container();
	public Container north3 = new Container();
	public Container north4 = new Container();
	public Container north5 = new Container();
	
	public static Container Mitte = new Container();
	public static Container MitteUnten = new Container();
	public static Container MitteRechts = new Container();
	public Container Unten = new Container();
	public static Container Links = new Container();
	public static Container Rechts = new Container();
	public static Container RechtsResize = new Container();
	public static Container RechtsPanel = new Container();
	
	
	
	
	
	public MainLayout()
	{
		
		setSize(new Dimension(1920,1000));
		setPreferredSize(new Dimension(1920, 1000));
		setMinimumSize(new Dimension(192, 100));
		setTitle("SHEET");
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		URL image = this.getClass().getResource("icon.png");
		Image Image = Toolkit.getDefaultToolkit().getImage(image);
		setIconImage(Image);
		setLayout(new BorderLayout());
		
		RechtsResize.setLayout(new GridLayout(1,1));
		RechtsPanel.setLayout(new GridLayout(2,1));
		
		Rechts.setLayout(new BorderLayout());
		Rechts.add(RechtsResize, BorderLayout.WEST);
		Rechts.add(RechtsPanel, BorderLayout.CENTER);		
		
		
		Links.setLayout(new GridLayout(1,1));
		
		Unten.setLayout(new GridLayout(1,2));
		
		north.setLayout(new BorderLayout());

		
		north1.setLayout(new GridLayout());
		north2.setLayout(new GridLayout());
		north3.setLayout(new BorderLayout());
		north4.setLayout(new GridLayout());
		north5.setLayout(new GridLayout());
		
		
		Mitte.setLayout(new BorderLayout());
		
		MitteUnten.setLayout(new GridLayout(1,1));	
		MitteUnten.setBounds(0, 0, 1000, 0);
		Mitte.add(MitteUnten, BorderLayout.SOUTH);
		
		MitteRechts.setLayout(new GridLayout(1,1));	
		MitteRechts.setBounds(0, 0, 1000, 0);
		Mitte.add(MitteRechts, BorderLayout.EAST);
		

		north.add(north1, BorderLayout.NORTH);
		north.add(north2, BorderLayout.CENTER);
		north.add(north3, BorderLayout.SOUTH);
		north3.add(north4, BorderLayout.WEST);
		north3.add(north5, BorderLayout.CENTER);
		
		add(north, BorderLayout.NORTH);
		add(Links, BorderLayout.WEST);
		add(Rechts,BorderLayout.EAST);
		add(Mitte, BorderLayout.CENTER);
		add(Unten, BorderLayout.SOUTH);
		
//		setVisible(true);
				
	}
}