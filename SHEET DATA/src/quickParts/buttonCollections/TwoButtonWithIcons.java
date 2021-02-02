package quickParts.buttonCollections;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import funktionBundles.Var;
import quickParts.buttons.OptionAreaButton;
import quickParts.icon.IconLabel;

public class TwoButtonWithIcons extends JPanel
{
	public OptionAreaButton Button1;
	public OptionAreaButton Button2; 
	IconLabel icon1;
	IconLabel icon2;
	
	public TwoButtonWithIcons(String title1, String title2, String icon1Path, String icon2Path)
	{

		Button1 = new OptionAreaButton(title1,20,25,0,"");
		Button2 = new OptionAreaButton(title2,20,25,30,"");
		
		//get biggest Button and add 10 px padding to the JPanel
		int length;
		
		if(Button1.getWidth() > Button2.getWidth())
		{
			length = Button1.getWidth() + 35;                                                                                                                                                                                                                                                                                    
		}
		else
		{
			length = Button2.getWidth() + 35;
		}
		
		
		setPreferredSize(new Dimension(length,50));
		setBounds(0,0,length,50);
		setSize(length,50);
		setLayout(null);
		setBackground(Var.PrimColor);	
		setBorder(BorderFactory.createMatteBorder(0,0,0,1,Var.SekColor));
		

		
		System.out.println(Button1.getWidth());
		System.out.println(Button2.getWidth());
		
		
		
		icon1 = new IconLabel(icon1Path, 20,20,0,0);
		icon2 = new IconLabel(icon2Path, 20,20,0,30);
		

		add(icon1);
		add(icon2);
		add(Button1);
		add(Button2);

	}
}
