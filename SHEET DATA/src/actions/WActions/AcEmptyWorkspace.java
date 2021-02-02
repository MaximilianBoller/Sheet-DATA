package actions.WActions;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import HauptPackage.MainLayout;
import actions.toolActions.AcImageareaTool;
import actions.toolActions.AcNormalTool;
import actions.toolActions.AcResizeTool;
import actions.toolActions.AcTextareaTool;
import funktionBundles.Var;
import obj.UIobj.footer.Footer;
import obj.UIobj.workspace.Workspace;
import obj.Wobj.page.emptyPage;
import rumpelkiste.NotenBlattLayOut;

public class AcEmptyWorkspace 
{
	public static void run()
	{
//    	NotenBlattLayOut.neu();
    	//AcNotenLinie.ausführen();	
		
    	Workspace workspace = new Workspace();
		Var.draggableworkspace[1] = workspace;
		
		MainLayout.Mitte.add(Var.draggableworkspace[1], BorderLayout.CENTER);
       	Footer.infos.setText(Var.projectName);
       	Var.mainLayout[1].setTitle("SHEET01 //" + Var.projectName);
       	
		Var.mainLayout[1].Mitte.revalidate();
       	
//		AcControlPanelAddOn.ausführen();
//		AcPianoAddOn.ausführen();
	}

}
