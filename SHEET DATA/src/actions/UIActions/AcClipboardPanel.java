package actions.UIActions;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.SwingUtilities;

import HauptPackage.MainLayout;
import funktionBundles.Var;
import obj.UIobj.left.ClipboardDATA;
import obj.UIobj.left.LogView;
import obj.UIobj.left.ProjectDATA;
import obj.UIobj.right.HierarchyPanel;

public class AcClipboardPanel 
{
	public static void run()
	{
		ClipboardDATA logView = new ClipboardDATA();
    	logView.setVisible(true);
    	logView.update();
    	Var.clipboardData[1] = logView;	        	
	}
}
