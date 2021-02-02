package obj.UIobj.right;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import actions.UIActions.AcHirarchieUpdate;
import actions.setup.UpdateHierarchyHeight;
import actions.toolActions.AcImageareaTool;
import funktionBundles.Var;
import quickParts.icon.IconButton;
import quickParts.icon.IconLabel;

public class PageHierarchy extends JPanel
{
	public int Seitenzahl;
	int XPageCoordinate;
	
	public JTextField title = new JTextField(JTextField.CENTER);
	public JPanel FokusIndikator = new JPanel();
	public JPanel ChildObjects = new JPanel();
	
	JPanel Parent = new JPanel();
	
	public int Height = 0;
	
	boolean PageVisible = true;
	boolean Collapse = true;
	
	public PageHierarchy(int seitenzahl, int xPageCoordinate, String name)
	{
		Seitenzahl = seitenzahl;
		XPageCoordinate = xPageCoordinate;
		
		Parent.setBackground(Var.PrimColor);
		Parent.setLayout(new FlowLayout(0,0,0));
		
		
		setBorder(BorderFactory.createMatteBorder(1,1,1,1,Var.SekColor));
		setSize(242,20);
		setBackground(Var.PrimColor);
		setForeground(Color.LIGHT_GRAY);
		setLayout(new BorderLayout());
		
		addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent e)
			{
				setBackground(Var.SekColor);
//				setSize(242,20 + Height);
			}
			
			public void mouseExited(MouseEvent e)
			{
				setBackground(Var.PrimColor);
//				setSize(242,20);
			}
			
			public void mousePressed(MouseEvent e)
			{
				Var.draggableworkspace[1].PagesBackground.setBounds(- XPageCoordinate,0,Var.workspaceWidth, Var.workspaceHeight);
				Var.ActivePage = Seitenzahl;
				
				AcHirarchieUpdate.run(Seitenzahl);
			}
	
		});
		
		FokusIndikator.setPreferredSize(new Dimension(5,20));
		FokusIndikator.setBounds(0,0,5,20);
		FokusIndikator.setBackground(Var.BorderColor);
		Parent.add(FokusIndikator);
		
		IconButton icon1 = new IconButton("eye.png", 20,20,0,0);
		icon1.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				PageVisible = !PageVisible;
				System.out.println(PageVisible);
				
				if(PageVisible)
				{
					Var.emptyPage[seitenzahl].setVisible(true);
					icon1.changeIcon("eye.png");
				}
				
				else
				{
					Var.emptyPage[seitenzahl].setVisible(false);
					icon1.changeIcon("closedEye.png");

				}
			}
		});
		Parent.add(icon1);
		
		IconLabel icon2 = new IconLabel("HirarchiePage.png", 20,20,0,0);
		Parent.add(icon2);
		
		JLabel pagecount = new JLabel();
		pagecount.setHorizontalAlignment(JTextField.CENTER);
		pagecount.setFont(Var.OpenSans12);
		pagecount.setText(Integer.toString(Seitenzahl));
		pagecount.setBackground(Var.SekColor);
		pagecount.setForeground(Color.LIGHT_GRAY);
		pagecount.setPreferredSize(new Dimension(30,20));
		pagecount.setBorder(BorderFactory.createMatteBorder(0,0,0,1,Var.SekColor));
		pagecount.setBounds(0,0,30,20);
		Parent.add(pagecount);
		

		title.setText(name);
		title.setOpaque(false);
		title.setHorizontalAlignment(JTextField.LEFT);
		title.setBackground(Var.SekColor);
		title.setForeground(Color.LIGHT_GRAY);
		title.setBorder(BorderFactory.createMatteBorder(0,5,0,0,Var.PrimColor));
		title.setFont(Var.OpenSans12);
		title.setPreferredSize(new Dimension(145,20));
		title.setBounds(0,0,145,20);
		Parent.add(title);
		
		IconButton expandButton = new IconButton("expand.png", 20,20,0,0);
		expandButton.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				Collapse = !Collapse;
				System.out.println(Collapse);
				
				if(Collapse)
				{
//					Var.emptyPage[seitenzahl].setVisible(true);
					expandButton.changeIcon("expand.png");
					ChildObjects.setVisible(false);	
				}
				else
				{
//					Var.emptyPage[seitenzahl].setVisible(false);
					expandButton.changeIcon("collapse.png");
					ChildObjects.setVisible(true);
				}
			}
			
			public void mouseClicked(MouseEvent e)
			{
				UpdateHierarchyHeight.run();
			}
			
		});
		Parent.add(expandButton);
		
		add(Parent, BorderLayout.NORTH);
		
		ChildObjects.setSize(200,0);
//		ChildObjects.setPreferredSize(new Dimension(200,0));
		ChildObjects.setBounds(0,0,200,0);
		ChildObjects.setBackground(Color.LIGHT_GRAY);
		ChildObjects.setLayout(new FlowLayout(0,0,0));
		ChildObjects.setVisible(false);
		add(ChildObjects, BorderLayout.CENTER);
		
	}
	
	public void aktive(boolean b)
	{
		if(b)
		{
			FokusIndikator.setBackground(Var.PinkHightlightColor);
		}
		else
		{
			FokusIndikator.setBackground(Var.BorderColor);
		}
	}
	
	public void addChild(Component object)
	{
		ChildObjects.add(object);
		Height = Height + 20;
		ChildObjects.setPreferredSize(new Dimension(200,Height));
		ChildObjects.setSize(200,Height);
		
		UpdateHierarchyHeight.run();
	}
}


