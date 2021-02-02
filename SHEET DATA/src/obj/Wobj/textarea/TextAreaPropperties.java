package obj.Wobj.textarea;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import funktionBundles.Var;
import quickParts.buttons.OptionAreaButton;
import quickParts.icon.IconLabel;
import quickParts.icon.IconButton;
import quickParts.input.DropdownInputField;
import quickParts.input.InputTextfield;
import quickParts.labels.SmalLabel;

public class TextAreaPropperties extends JPanel
{
	public final int textareaId; 
	
	IconLabel FontSize = new IconLabel("FontSize.png",20,20,0,0);
	InputTextfield FontSizeInput = new InputTextfield("", 40,20,0,0);
	
	IconLabel FontIcon = new IconLabel("Font.png",20,20,0,0);
	DropdownInputField FontInput;
	
	SmalLabel LocationX = new SmalLabel("x:", 20,0,0);
	InputTextfield BoundsXInput = new InputTextfield("", 40,20,0,0);
	SmalLabel LocationY = new SmalLabel("y:", 20,0,0);
	InputTextfield BoundsYInput = new InputTextfield("", 40,20,0,0);
	SmalLabel DimensionX = new SmalLabel("B:", 20,0,0);
	InputTextfield SizeXInput = new InputTextfield("", 40,20,0,0);
	SmalLabel DimensionY = new SmalLabel("H:", 20,0,0);
	InputTextfield SizeYInput = new InputTextfield("", 40,20,0,0);
	
	IconButton TextalignLeft = new IconButton("TextalignLeft.png",20,20,0,0);
	IconButton TextalignCenter = new IconButton("TextalignCenter.png",20,20,0,0);
	IconButton TextalignRight = new IconButton("TextalignRight.png",20,20,0,0);
	
	String textalignment = "left";

	OptionAreaButton ok = new OptionAreaButton("übernehmen", 20,0,0, "auf Text übernehmen...");

	public TextAreaPropperties(int textareaId, float fontsize, String fontName, int SizeX, int SizeY, int BoundsX, int BoundsY)
	{
		this.textareaId = textareaId;
		
		FontInput  = new DropdownInputField("", this.textareaId);

		
		setBorder(BorderFactory.createMatteBorder(0,1,1,0,Var.SekColor));
		setBackground(Var.PrimColor);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		
		FontSizeInput.setText(String.valueOf(fontsize));
		FontInput.TypefaceInput.setText(fontName);
		SizeXInput.setText(String.valueOf(SizeX));
		SizeYInput.setText(String.valueOf(SizeY));
		BoundsXInput.setText(String.valueOf(BoundsX));
		BoundsYInput.setText(String.valueOf(BoundsY));
		
		ok.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e) { changeProperties(); }
	    });
		
		add(FontSize);
		add(FontSizeInput);
		
		add(FontIcon);
		add(FontInput);
		
		add(TextalignLeft);
		TextalignLeft.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e) 
			{
				textalignment = "left";
			}
		});
		
		add(TextalignCenter);
		TextalignCenter.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e) 
			{
				textalignment = "center";
			}
		});
		
		add(TextalignRight);
		TextalignRight.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e) 
			{
				textalignment = "right";
			}
		});
		
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
	
	public void changeProperties()
	{
		Font font = new Font(FontInput.TypefaceInput.getText(), Font.PLAIN, 12);
    	Var.TextArea[textareaId].text.setFont(font.deriveFont(Float.parseFloat(FontSizeInput.getText())));
    	
    	Var.TextArea[textareaId].updateSizeLocation(Integer.parseInt(SizeXInput.getText()), Integer.parseInt(SizeYInput.getText()), Integer.parseInt(BoundsXInput.getText()), Integer.parseInt(BoundsYInput.getText()), textalignment);
    	Var.TextArea[textareaId].repaint();
    	System.out.println("TextareaId: " + textareaId);
	}
	
	public void updateSizeLocation(int SizeX, int SizeY, int BoundsX, int BoundsY)
	{
		SizeXInput.setText(String.valueOf(SizeX));
		SizeYInput.setText(String.valueOf(SizeY));
		BoundsXInput.setText(String.valueOf(BoundsX));
		BoundsYInput.setText(String.valueOf(BoundsY));
	}
}
