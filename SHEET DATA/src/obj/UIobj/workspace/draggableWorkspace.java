package obj.UIobj.workspace;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import funktionBundles.Var;


public class draggableWorkspace extends JLayeredPane
{
	
	Rectangle b = this.getBounds();
	
	public int x = (int)b.getX();
	public int y = (int)b.getY();
	
	public draggableWorkspace()
	{
		setOpaque(true);
		setSize(500,500);
		setBounds(0,0,500,500);
		setLayout(null);
		setFocusable(true);
		
//		setBorder(BorderFactory.createLineBorder(Var.PrimColor,1));
		setBackground(Color.DARK_GRAY);
		
	}
}
