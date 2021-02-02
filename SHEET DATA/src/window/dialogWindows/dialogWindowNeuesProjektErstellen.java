package window.dialogWindows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import actions.UIActions.AcPagePanel;
import actions.WActions.AcEmptyPage;
import actions.save.SaveProjectIntoTXT;
import actions.setup.CreateNewDocument;
import funktionBundles.Var;
import quickParts.*;
import quickParts.input.InputTextfield;
import quickParts.labels.HeadlineLabel;
import quickParts.labels.SelectionField;
import quickParts.labels.SelectionHeadingField;
import quickParts.labels.SmalLabel;


public class dialogWindowNeuesProjektErstellen extends JFrame
{
    public Titlebar titlebar = new Titlebar("Neues Dokument");
    public JPanel hintergrund = new JPanel();
	public JPanel workspace = new JPanel();
	
	private SelectionHeadingField projektnameTextarea = new SelectionHeadingField("Unbenannt-1", 300, 30, 20, 10);
	public InputTextfield Maße1 = new InputTextfield("", 100, 30, 20, 80); 
	public InputTextfield Maße2 = new InputTextfield("", 100, 30, 20, 150); 
	
	private InputTextfield RandOben = new InputTextfield("2", 100, 30, 20, 210); 
	
	private SelectionField RandUnten = new SelectionField("10", 100, 30, 40, 330); 
	private SelectionField RandLinks = new SelectionField("10", 100, 30, 40, 370); 
	private SelectionField RandRechts = new SelectionField("10", 100, 30, 40, 410); 
	


	public dialogWindowNeuesProjektErstellen()
	{
	    setResizable(false);
	    setLocation(Var.screenWidth / 2 - 400, Var.screenHeight / 2 - 300);
	    setUndecorated(true);
	    setLayout(new BorderLayout());
	    setSize(800,600);
	    
		JPanel rechtsHintergrund = new JPanel();
	    rechtsHintergrund.setLayout(null);
	    rechtsHintergrund.setBackground(Var.PrimColor);

	    rechtsHintergrund.add(projektnameTextarea);
	    
	    SmalLabel breite = new SmalLabel("Breite",20,20,50);
	    rechtsHintergrund.add(breite);
	    rechtsHintergrund.add(Maße1);
	    
	    SmalLabel höhe = new SmalLabel("Höhe",20,20,120);
	    rechtsHintergrund.add(höhe);
	    rechtsHintergrund.add(Maße2);
	    
	    SmalLabel rand = new SmalLabel("Rand",20,20,190);
	    rechtsHintergrund.add(rand);
	    rechtsHintergrund.add(RandOben);
	    
	    SmalLabel cm = new SmalLabel("cm",20,130,220);
	    rechtsHintergrund.add(cm);
	    
	    
//	    rechtsHintergrund.add(RandUnten);
//	    rechtsHintergrund.add(RandLinks);
//	    rechtsHintergrund.add(RandRechts);
	    
	    
	    JButton erstellen = new JButton("Erstellen");     
	    erstellen.setBounds(20,600-90,200,40);
	    erstellen.setFont(Var.OpenSans14);
	    erstellen.setBackground(Var.PrimColor);
	    erstellen.setForeground(Color.LIGHT_GRAY);
	    erstellen.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Var.SekColor));
	    erstellen.addMouseListener(new MouseAdapter()
		{
	    	public void mousePressed(MouseEvent e)
	    	{
	    		Var.mainLayout[1].Mitte.removeAll();
	    		
				try {
					saveProperties();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
	        	CreateNewDocument.ausführern();
	        	
				try {
					SaveProjectIntoTXT.run();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
		    	AcPagePanel.run();
		    	AcEmptyPage.run("");

	        	dispose();
	    	}
		});
	    rechtsHintergrund.add(erstellen);
	    
	    
	
	    
	    
	    
		JPanel linksHintergrund = new JPanel();
		linksHintergrund.setLayout(null);
		linksHintergrund.setBackground(Var.SekColor);
	    
		PrintLayout a5 = new PrintLayout("A5", 888, 1260, 20, 20);
		linksHintergrund.add(a5);
		
		PrintLayout a4 = new PrintLayout("A4", 1260, 1782, 130, 20);
		linksHintergrund.add(a4);
		
		PrintLayout a3 = new PrintLayout("A3", 1782, 2520, 240, 20);
		linksHintergrund.add(a3);
		

		
		
	    
	    
	    
	    
	    workspace.setLayout(new GridLayout(1,2));
//	    workspace.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Var.Color2));
	    workspace.setOpaque(true);
	    workspace.setBackground(Var.PrimColor);
	    
	    workspace.add(linksHintergrund);
	    workspace.add(rechtsHintergrund);
	    
	    hintergrund.setLayout(new BorderLayout());
	    hintergrund.setOpaque(false);
	    hintergrund.setBorder(new LineBorder(Var.SekColor, 1));
	    hintergrund.setBounds(0,0,getWidth(), getHeight());
	    
	    hintergrund.add(BorderLayout.NORTH, titlebar);
	    hintergrund.add(BorderLayout.CENTER, workspace);
	    
	    add(BorderLayout.CENTER, hintergrund);
	    setVisible(true);
	}
	
	public void saveProperties() throws Exception
	{
		Var.projectName = projektnameTextarea.getText();
		Var.pageWidth = Integer.parseInt(Maße1.getText());
		Var.pageHeight = Integer.parseInt(Maße2.getText());

		
		Var.footer[1].infos.setText(Var.projectName);
		Var.mainLayout[1].setTitle("SHEET/" + Var.projectName);
		Var.pageBorder = 60 * Integer.parseInt(RandOben.getText());
		
//		Var.gridSize = 30;



		
		/*
		
		if(Var.dpi == 150)
		{
			Var.gridSize = 30;
		}
		
		if(Var.dpi == 300)
		{
			Var.gridSize = 60;

		}
		*/
	}

}

