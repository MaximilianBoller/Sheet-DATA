package actions.UIActions;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.SwingUtilities;

import HauptPackage.MainLayout;
import funktionBundles.Var;
import obj.UIobj.left.LogView;
import obj.UIobj.left.ProjectDATA;
import obj.UIobj.right.HierarchyPanel;

public class AcLogPanel 
{
	public static void run()
	{
    	ProjectDATA logView = new ProjectDATA();
    	logView.setVisible(true);
    	logView.update();
    	Var.projectData[1] = logView;	        	
	}
}
