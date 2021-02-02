package quickParts.input;

import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import actions.setup.UpdateHierarchyHeight;
import funktionBundles.Var;
import obj.Wobj.textarea.TypefacePanel;
import quickParts.icon.IconButton;

public class DropdownInputField extends JPanel
{		
	public InputTextfield TypefaceInput = new InputTextfield("", 200,20,0,0);
	
	boolean Collapse = true;
	public final int id;
	
	public DropdownInputField(String font, int id)
	{
		this.id = id;
		TypefaceInput.setText(font);
		TypefaceInput.setEditable(false);
		setLayout(new FlowLayout(0,0,0));

		TypefaceInput.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				Point location = TypefaceInput.getLocationOnScreen();
				TypefacePanel typefacepanel = new TypefacePanel((int)location.getX(), (int)location.getY() + 20, id);
				Var.typefacePanel[1] = typefacepanel;

				Var.typefacePanel[1].setVisible(true);
			}
			

		});
		
		add(TypefaceInput);
	}
}
