package obj.Wobj.Header_Footer;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import actions.UIActions.AcHirarchieUpdate;
import actions.WActions.AcImageArea;
import actions.WActions.AcPageViewWindow;
import actions.WActions.AcResizableComponentArea;
import actions.WActions.AcTextArea;
import funktionBundles.Rastern;
import funktionBundles.Var;
import obj.Wobj.page.gridPage;

public class emptyHeader extends JLayeredPane
{	
	public gridPage grid = new gridPage();
	
	public int Seitenzahl;
	public MouseListener PageMouseListener;

	//For positioning Components
	public int ClickX = 0;
	public int ClickY = 0;
	
	public int ReleaseX = 0;
	public int ReleaseY = 0;
	
	

	public emptyHeader(int x, int seitenzahl)
	{
		Seitenzahl = seitenzahl;
		
		setOpaque(true);
		setLayout(null);
		setBackground(Color.WHITE);
		setBorder(new LineBorder(Var.BorderColor, 1));
		setPreferredSize(new Dimension(Var.pageWidth, 400));
		setBounds(x,Var.pageHeight + 10, Var.pageWidth, 400);
		setVisible(true);
	}
	
	public void setEditable()
	{	
		setLayer(grid, 1);
		add(grid);
		
		PageMouseListener = new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
	        {

	        }
			
			public void mousePressed(MouseEvent e)
			
			{
				ClickX = (int)Rastern.run(e.getX());
				ClickY = (int)Rastern.run(e.getY());
				
				System.out.println(e.getX() + "," + e.getY());
				
				System.out.println(Seitenzahl);
				Var.ActivePage = Seitenzahl;
				System.out.println("Aktive Page: " + Var.ActivePage);
				AcHirarchieUpdate.run(Var.ActivePage);
			}
			
			public void mouseReleased(MouseEvent e)
			{
				ReleaseX = (int)Rastern.run(e.getX());
				ReleaseY = (int)Rastern.run(e.getY());
				
				System.out.println(e.getX() + "," + e.getY());
				
				if(ReleaseX + ReleaseY > ClickX + ClickY )
				{
					if(Var.ActiveTool.contentEquals("textarea"))
					{
						AcTextArea.run("",Seitenzahl,ReleaseX - ClickX, ReleaseY - ClickY, ClickX, ClickY, 20, Var.standartTypeface, "left");
					}
					
					if(Var.ActiveTool.contentEquals("imagearea"))
					{
						AcImageArea.run("",Seitenzahl,ReleaseX - ClickX, ReleaseY - ClickY, ClickX, ClickY);
					}
				}
				
				else
				{
					if(Var.ActiveTool.contentEquals("textarea"))
					{
						AcTextArea.run("",Seitenzahl,ClickX - ReleaseX, ClickY - ReleaseY, ReleaseX, ReleaseY, 20, Var.standartTypeface, "left");
					}
					
					if(Var.ActiveTool.contentEquals("imagearea"))
					{
						AcImageArea.run("",Seitenzahl,ClickX - ReleaseX, ClickY - ReleaseY, ReleaseX, ReleaseY);
					}
				}

			}
		};	

		addMouseListener(PageMouseListener);
	}
	
	public void addGrid()
	{
		setLayer(grid, 1);
		add(grid);
	}
	
	public void removeGrid()
	{
		remove(grid);
	}
	
	public void removeEditable()
	{
		remove(grid);
		removeMouseListener(PageMouseListener);
	}

}