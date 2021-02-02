package actions.UIActions;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.SwingUtilities;

import HauptPackage.MainLayout;
import funktionBundles.Var;
import rumpelkiste.addOnControlPanel;


public class AcNotationwritingTool 
{
	public static void ausführen()
	{
    	addOnControlPanel feld = new addOnControlPanel();
    	feld.setPreferredSize(new Dimension(70,610));
    	feld.setVisible(true);
    	Var.controlPanel[1] = feld;  
    	
    	Var.draggableworkspace[1].setLayer(Var.controlPanel[1], 2);
    	Var.draggableworkspace[1].add(Var.controlPanel[1]);
    	
    	
    	
 //   	MainLayout.Mitte.add(Var.controlPanel[1], BorderLayout.EAST);
 	
    	SwingUtilities.updateComponentTreeUI(Var.mainLayout[1]);
	}
}
