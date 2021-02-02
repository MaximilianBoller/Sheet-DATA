package actions.UIActions;

import java.awt.Dimension;

import javax.swing.SwingUtilities;

import HauptPackage.MainLayout;
import funktionBundles.Var;
import rumpelkiste.addOnPiano;

public class AcPiano 
{	
	public static void ausführen()
	{
    	if(Var.AddOnPiano)
    	{
    		return;
    	}
    	else
    	{
        	addOnPiano piano = new addOnPiano();
        	piano.setPreferredSize(new Dimension(930,230));
        	piano.setBounds(Var.draggableworkspace[1].getWidth()-930,Var.draggableworkspace[1].getHeight()-230, 930, 230);
        	piano.setVisible(true);
        	Var.piano[1]=piano;
        	
        	Var.draggableworkspace[1].setLayer(Var.piano[1],3);
        	Var.draggableworkspace[1].add(Var.piano[1]);
//        	MainLayout.fenster.repaint();
        	SwingUtilities.updateComponentTreeUI(Var.mainLayout[1]);
        	

        	Var.AddOnPiano = true;
    	}
	}
}
