package obj.Wobj.imagearea;

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

public class ImageAreaPropperties extends JPanel
{
	IconLabel icon = new IconLabel("Path.png",20,20,0,0);
	InputTextfield input = new InputTextfield("drop file", 300,20,0,0);
	
	OptionAreaButton ok = new OptionAreaButton("übernehmen", 20,0,0, "auf Text übernehmen...");
	
	SmalLabel LocationX = new SmalLabel("x:", 20,0,0);
	InputTextfield BoundsXInput = new InputTextfield("", 40,20,0,0);
	SmalLabel LocationY = new SmalLabel("y:", 20,0,0);
	InputTextfield BoundsYInput = new InputTextfield("", 40,20,0,0);
	SmalLabel DimensionX = new SmalLabel("B:", 20,0,0);
	InputTextfield SizeXInput = new InputTextfield("", 40,20,0,0);
	SmalLabel DimensionY = new SmalLabel("H:", 20,0,0);
	InputTextfield SizeYInput = new InputTextfield("", 40,20,0,0);
	
	public String File;
	public static int textareaId; 
	
	public ImageAreaPropperties(int textareaId, int SizeX, int SizeY, int BoundsX, int BoundsY, String path)
	{
		this.textareaId = textareaId;
		
		input.setText(String.valueOf(path));
		SizeXInput.setText(String.valueOf(SizeX));
		SizeYInput.setText(String.valueOf(SizeY));
		BoundsXInput.setText(String.valueOf(BoundsX));
		BoundsYInput.setText(String.valueOf(BoundsY));
		
		setBorder(BorderFactory.createMatteBorder(0,1,1,0,Var.SekColor));
		setBackground(Var.PrimColor);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		

		
		input.setDropTarget(new DropTarget() 
		{
		    public synchronized void drop(DropTargetDropEvent evt) 
		    {
		        try 
		        {
		            evt.acceptDrop(DnDConstants.ACTION_COPY);
		            List<File> droppedFiles = (List<File>)
		                evt.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
		            for (File file : droppedFiles) 
		            {
		            	File = file.getPath();
			        	Var.ImageArea[textareaId].Path = File;
			        	input.setText(File);
			        	Var.ImageArea[textareaId].pane.repaint();
		            }
		        } catch (Exception ex) 
		        {
		            ex.printStackTrace();
		        }
		    }
		});
		
		ok.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	Var.ImageArea[textareaId].updateSizeLocation(Integer.parseInt(SizeXInput.getText()), Integer.parseInt(SizeYInput.getText()), Integer.parseInt(BoundsXInput.getText()), Integer.parseInt(BoundsYInput.getText()), File);
	        }
	    });
		
		add(icon);
		add(input);
		
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
