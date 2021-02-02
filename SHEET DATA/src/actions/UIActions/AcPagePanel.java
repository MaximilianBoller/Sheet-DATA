package actions.UIActions;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.SwingUtilities;

import HauptPackage.MainLayout;
import funktionBundles.Var;
import obj.UIobj.left.LogView;
import obj.UIobj.right.HierarchyPanel;

public class AcPagePanel 
{
	public static void run()
	{
		if(Var.pageView[1] == null)
		{
	    	HierarchyPanel pageview = new HierarchyPanel();
//	    	pageview.setPreferredSize(new Dimension(200,2000));
	    	pageview.setVisible(true);
	    	Var.pageView[1] = pageview;
		}
    	MainLayout.RechtsPanel.add(Var.pageView[1]);      	
    	SwingUtilities.updateComponentTreeUI(Var.mainLayout[1]);

	}
}
