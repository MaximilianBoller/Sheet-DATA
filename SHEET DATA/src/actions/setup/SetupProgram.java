package actions.setup;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import HauptPackage.*;
import actions.WActions.AcEmptyPage;
import actions.colorScheme.Dark;
import actions.colorScheme.Light;
import actions.setup.typefaces.SetupTypefaces;
import actions.toolActions.AcImageareaTool;
import actions.toolActions.AcNormalTool;
import actions.toolActions.AcResizeTool;
import actions.toolActions.AcTextareaTool;
import funktionBundles.Var;
import obj.UIobj.ResizeBar.ResizeBarRechtsPanel;
import obj.UIobj.footer.Footer;
import obj.UIobj.header.BlankOptionArea;
import obj.UIobj.header.Header;
import obj.UIobj.header.Toolbar;

import obj.UIobj.workspace.Scrollbar;
import obj.UIobj.workspace.emptyWorkspace;

public class SetupProgram 
{
	public static void run()
	{
		Dark.run();
		
		MainLayout mainLayout = new MainLayout();
		
		ResizeBarRechtsPanel resize = new ResizeBarRechtsPanel();
		mainLayout.RechtsResize.add(resize);
		
		Header header = new Header();
		mainLayout.north1.add(header);
    	Var.header[1] = header;
		
		BlankOptionArea blankOptionArea = new BlankOptionArea();
		mainLayout.north2.add(blankOptionArea);
		
		Toolbar toolbar = new Toolbar();
		mainLayout.north4.add(toolbar);

		
		emptyWorkspace empty = new emptyWorkspace();
		mainLayout.Mitte.add(empty);

    	Var.mainLayout[1] = mainLayout;
    	Var.mainLayout[1].setVisible(true);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	//____________________________________________ SETUP OBJEKTS
    	
    	SetupTypefaces.run();
	}
}
