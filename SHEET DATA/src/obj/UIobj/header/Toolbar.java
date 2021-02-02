package obj.UIobj.header;

import java.awt.Color;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;

import javax.swing.JPanel;


import actions.toolActions.AcImageareaTool;
import actions.toolActions.AcNormalTool;
import actions.toolActions.AcNotationAreaTool;
import actions.toolActions.AcResizeTool;
import actions.toolActions.AcTextareaTool;

import funktionBundles.Var;
import quickParts.buttons.toolIcon;

public class Toolbar extends JPanel
{
	public Toolbar()
	{
		
		setOpaque(true);
		setFont(Var.OpenSans12);
		setBorder(BorderFactory.createMatteBorder(0,0,1,0,Var.SekColor));
		setBackground(Var.PrimColor);
		setForeground(Color.LIGHT_GRAY);
//		setPreferredSize(new Dimension(105,30));
		setSize(105,30);
		setLayout(new FlowLayout(5,5,5));
		

		toolIcon move = new toolIcon("normal.png");
		move.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
	            AcNormalTool.run();
			}
	
		});
		add(move);
		
		toolIcon resize = new toolIcon("resize.png");
		resize.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{  
	            AcResizeTool.run();
			}
	
		});
		add(resize);
		
		
		toolIcon textarea = new toolIcon("textarea.png");
		textarea.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{ 
	            AcTextareaTool.run();
			}
	
		});
		add(textarea);
		
		toolIcon imagearea = new toolIcon("imagearea.png");
		imagearea.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
	            AcImageareaTool.run();
			}
	
		});
		add(imagearea);
		

		
		toolIcon notation = new toolIcon("notationarea.png");
		notation.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{  
	            AcNotationAreaTool.run();
			}
	
		});
		add(notation);
		


	}
}
