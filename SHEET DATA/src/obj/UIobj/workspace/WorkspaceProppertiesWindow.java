package obj.UIobj.workspace;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import actions.toolActions.AcImageareaTool;
import funktionBundles.Var;
import quickParts.buttons.OptionAreaButton;
import quickParts.icon.IconLabel;
import quickParts.input.InputTextfield;
import quickParts.labels.HeadlineLabel;

public class WorkspaceProppertiesWindow extends JPanel
{
	IconLabel RasterIcon = new IconLabel("Raster.png",20,20,0,0);
	InputTextfield GridSizeInput = new InputTextfield("", 40, 20, 0, 0);
	
	IconLabel RandLinksIcon = new IconLabel("RandLinks.png",20,20,0,0);
	InputTextfield LinksInput = new InputTextfield("", 40, 20, 0, 0);
	
	IconLabel RandRechtsIcon = new IconLabel("RandRechts.png",20,20,0,0);
	InputTextfield RechtsInput = new InputTextfield("", 40, 20, 0, 0);
	
	IconLabel RandObenIcon = new IconLabel("RandOben.png",20,20,0,0);
	InputTextfield ObenInput = new InputTextfield("", 40, 20, 0, 0);
	
	IconLabel RandUntenIcon = new IconLabel("RandUnten.png",20,20,0,0);
	InputTextfield UntenInput = new InputTextfield("", 40, 20, 0, 0);
	
	IconLabel RandInnenIcon = new IconLabel("RandInnen.png",20,20,0,0);
	InputTextfield RandInnenInput = new InputTextfield("", 40, 20, 0, 0);
	

	
	OptionAreaButton ok = new OptionAreaButton("übernehmen", 20, 0, 0, "auf Text übernehmen...");
	
	public WorkspaceProppertiesWindow()
	{
		setBorder(BorderFactory.createMatteBorder(0,1,1,0,Var.SekColor));
		setBackground(Var.PrimColor);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		GridSizeInput.setText(String.valueOf(Var.gridSize));
		LinksInput.setText(String.valueOf(Var.pageBorder));
		RechtsInput.setText(String.valueOf(Var.pageBorder));
		ObenInput.setText(String.valueOf(Var.pageBorder));
		UntenInput.setText(String.valueOf(Var.pageBorder));
		RandInnenInput.setText(String.valueOf(Var.pageBorder));
		
		ok.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e) { changeProperties(); }
	    });

		add(RasterIcon);
		add(GridSizeInput);
		
		add(RandLinksIcon);
		add(LinksInput);
		
		add(RandRechtsIcon);
		add(RechtsInput);
		
		add(RandObenIcon);
		add(ObenInput);
		
		add(RandUntenIcon);
		add(UntenInput);
		
		add(RandInnenIcon);
		add(RandInnenInput);
		
		
		add(ok);
		setVisible(true);
	}
	
	public void changeProperties()
	{
		Var.gridSize = Integer.parseInt(GridSizeInput.getText());
		
		Var.randLinks = Integer.parseInt(LinksInput.getText());
		Var.randRechts = Integer.parseInt(RechtsInput.getText());
		Var.randOben = Integer.parseInt(ObenInput.getText());
		Var.randUnten = Integer.parseInt(UntenInput.getText());
		
		Var.pageBorder = Integer.parseInt(RandInnenInput.getText());
	}
}
