package quickParts.buttonCollections;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import funktionBundles.Var;
import quickParts.buttons.OptionAreaButton;
import quickParts.icon.IconLabel;

public class OneButtonWithIcon extends JPanel 
{
	public OptionAreaButton Button1;
	public IconLabel icon1;
	
	public OneButtonWithIcon(String title1, String icon1Path)
	{
		Button1 = new OptionAreaButton(title1,20,25,0,"");
		
		icon1 = new IconLabel(icon1Path, 20,20,0,0);
		
		add(icon1);
		add(Button1);
		
		//get biggest Button and add 10 px padding to the JPanel
		int length = Button1.getWidth() + 35;
		
		setPreferredSize(new Dimension(length,50));
		setBounds(0,0,length,50);
		setSize(length,50);
		setLayout(null);
		setBackground(Var.PrimColor);
		setBorder(BorderFactory.createMatteBorder(0,0,0,1,Var.SekColor));
	}
}
