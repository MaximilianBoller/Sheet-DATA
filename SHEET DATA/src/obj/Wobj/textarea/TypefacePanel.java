package obj.Wobj.textarea;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import funktionBundles.Var;
import quickParts.labels.TypefaceLabel;

public class TypefacePanel extends JDialog
{
	public static int id;
	
	public TypefacePanel(int x, int y, int id)
	{
		this.id = id;
		
		setSize(200,800);
		setPreferredSize(new Dimension(200,800));
		setLocation(x,y);
		setUndecorated(true);
		
		
		JPanel hintergrund = new JPanel();
		hintergrund.setLayout(new FlowLayout(5,5,5));
		hintergrund.setBackground(Var.PrimColor);
		

		
		String Fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		int SizeY = 0;
		for(int i = 0; i < Fonts.length; ++i)
		{
			TypefaceLabel label = new TypefaceLabel(Fonts[i]);
			hintergrund.add(label);
			SizeY = SizeY + 25;
		}
		
		hintergrund.setPreferredSize(new Dimension(180,SizeY));
		hintergrund.setSize(180, SizeY);
		
		
        JScrollPane scrollPane = new JScrollPane(hintergrund);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);
        
		setVisible(true);
		
	}
	
	public static void setFont(String font)
	{
		System.out.println(font);
		Var.TextAreaPropperties[id].FontInput.TypefaceInput.setText(font);
		Var.TextAreaPropperties[id].changeProperties();
		Var.typefacePanel[1].setVisible(false);
	}
}
