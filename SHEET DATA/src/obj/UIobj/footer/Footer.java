package obj.UIobj.footer;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;


import HauptPackage.MainLayout;
import funktionBundles.Var;

public class Footer  extends JPanel
{
	public static JTextArea infos = new JTextArea();
	public static JTextArea infos02 = new JTextArea();
	
	public Footer()
	{
		setBackground(Var.PrimColor);
		setPreferredSize(new Dimension(100,30));
		setBorder(BorderFactory.createMatteBorder(1,0,1,0,Var.SekColor));
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		infos.setFont(Var.OpenSans12);
		infos.setEditable(false);
//		infos.setPreferredSize(new Dimension(1500,30));
		infos.setBackground(Var.PrimColor);
		infos.setForeground(Var.BorderColor);
		add(infos);
		
		infos02.setFont(Var.OpenSans12);
		infos02.setEditable(false);
//		infos.setPreferredSize(new Dimension(1500,30));
		infos02.setBackground(Var.PrimColor);
		infos02.setForeground(Var.BorderColor);
		infos02.setText(Var.logInfo);
		add(infos02);
		
		setVisible(true);
	}
}
