package obj.UIobj.workspace;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;


import HauptPackage.MainLayout;
import funktionBundles.Var;

public class Scrollbar  extends JPanel
{
	public Scrollbar(int SizeX, int SizeY)
	{
		setBackground(Var.SekColor);
		setPreferredSize(new Dimension(SizeX,SizeY));
		setBorder(BorderFactory.createMatteBorder(0,0,0,0,Var.SekColor));
		setLayout(null);
		setVisible(true);
	}
}
