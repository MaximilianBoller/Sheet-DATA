package obj.Wobj.notationarea;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

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
import quickParts.labels.SmalLabel;

public class NotationAreaPropperties extends JPanel
{
	OptionAreaButton ok = new OptionAreaButton("übernehmen", 20,0,0, "auf Text übernehmen...");
	
	OptionAreaButton addLine = new OptionAreaButton("+ Linie", 20,0,0, "Notenlinie hinzufügen");
	
	SmalLabel LineCount = new SmalLabel("Linienlayout:", 20,0,0);
	InputTextfield LineCountInput = new InputTextfield("1", 40,20,0,0);
	
	
	SmalLabel LocationX = new SmalLabel("x:", 20,0,0);
	InputTextfield BoundsXInput = new InputTextfield("", 40,20,0,0);
	SmalLabel LocationY = new SmalLabel("y:", 20,0,0);
	InputTextfield BoundsYInput = new InputTextfield("", 40,20,0,0);
	SmalLabel DimensionX = new SmalLabel("B:", 20,0,0);
	InputTextfield SizeXInput = new InputTextfield("", 40,20,0,0);
	SmalLabel DimensionY = new SmalLabel("H:", 20,0,0);
	InputTextfield SizeYInput = new InputTextfield("", 40,20,0,0);
	

	public static int ID; 
	
	public NotationAreaPropperties(int ID, int SizeX, int SizeY, int BoundsX, int BoundsY)
	{
		this.ID = ID;
		

		SizeXInput.setText(String.valueOf(SizeX));
		SizeYInput.setText(String.valueOf(SizeY));
		BoundsXInput.setText(String.valueOf(BoundsX));
		BoundsYInput.setText(String.valueOf(BoundsY));
		
		setBorder(BorderFactory.createMatteBorder(0,1,1,0,Var.SekColor));
		setBackground(Var.PrimColor);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		ok.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	Var.NotationArea[ID].updatePropperties(Integer.parseInt(SizeXInput.getText()), Integer.parseInt(SizeYInput.getText()), Integer.parseInt(BoundsXInput.getText()), Integer.parseInt(BoundsYInput.getText()), Integer.parseInt(LineCountInput.getText()));
	        }
	    });
		
		addLine.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	Var.NotationArea[ID].addLine();
	        }
	    });

		add(LineCount);
		add(LineCountInput);
		
		add(addLine);
		
		add(LocationX);
		add(BoundsXInput);
		
		add(LocationY);
		add(BoundsYInput);
		
		add(DimensionX);
		add(SizeXInput);
		
		add(DimensionY);
		add(SizeYInput);
		
		add(ok);

		
		setVisible(true);
	}
	
	public void updateSizeLocation(int SizeX, int SizeY, int BoundsX, int BoundsY)
	{
		SizeXInput.setText(String.valueOf(SizeX));
		SizeYInput.setText(String.valueOf(SizeY));
		BoundsXInput.setText(String.valueOf(BoundsX));
		BoundsYInput.setText(String.valueOf(BoundsY));
		
		
	}
	
	
	
}
