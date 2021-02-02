package obj.UIobj.ResizeBar;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import actions.UIActions.AcHirarchieUpdate;
import actions.grid.Grid;
import funktionBundles.Var;

public class ResizeBarRechtsPanel extends JPanel
{
	int XClick = 0;
	int XRelease = 0;
	
	public ResizeBarRechtsPanel()
	{
		setSize(5,5);
		setPreferredSize(new Dimension(5,5));
		setBackground(Var.PrimColor);
		setBorder(BorderFactory.createMatteBorder(1,1,1,1,Var.SekColor));

		addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent e)
			{
				Cursor cursor = new Cursor(Cursor.E_RESIZE_CURSOR);
	            Var.mainLayout[1].RechtsResize.setCursor(cursor);
	    		setBackground(Var.SekColor);
			}
			
			public void mouseExited(MouseEvent e)
			{
	    		setBackground(Var.PrimColor);
			}
			
			public void mousePressed(MouseEvent e)
			{
				XClick = e.getXOnScreen();
			}
			
			public void mouseReleased(MouseEvent e)
			{
				XRelease = e.getXOnScreen();
				
				if(XClick < XRelease)
				{
					System.out.println(XRelease - XClick);
					
					Dimension dim = Var.pageView[1].getSize();
					double width = dim.getWidth();
					width = width - (XRelease - XClick);
					width = Grid.run(width, 262);
					do
					{
						width = 262;
					}
					while(width < 262);
					
					dim.setSize(width, dim.getHeight());
					
					Var.pageView[1].setPreferredSize(dim);
					Var.mainLayout[1].RechtsPanel.revalidate();
					
				}
				
				if(XClick > XRelease)
				{
					System.out.println(XClick - XRelease);

					Dimension dim = Var.pageView[1].getSize();
					double width = dim.getWidth();
					width = width + (XClick - XRelease);
					
					width = Grid.run(width, 262);
					
					if(width > Var.screenWidth)
					{
						width = Var.screenWidth - 262;
					}
					else
					{
					}
					
					dim.setSize(width, dim.getHeight());
					
					Var.pageView[1].setPreferredSize(dim);
					Var.mainLayout[1].RechtsPanel.revalidate();
					
				}

				
			}
	
		});
	}
}
