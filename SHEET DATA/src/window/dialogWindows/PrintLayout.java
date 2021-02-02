package window.dialogWindows;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import funktionBundles.Var;
import quickParts.labels.HeadlineLabel;

public class PrintLayout extends JPanel
{
	public PrintLayout(String Title, int PropertiesSizeX, int PropertiesSizeY, int BoundsX, int BoundsY)
	{

		
		setBorder(BorderFactory.createMatteBorder(1,1,1,1,Var.PrimColor));
	    setBackground(Var.SekColor);
	    setPreferredSize(new Dimension(100,180));
	    setBounds(BoundsX,BoundsY,100,180);
	    setLayout(null);
	    
	    
	    JLabel icon = new JLabel();
	    URL iconUrl= this.getClass().getResource("PrintLayout.png");
		Icon IconImage = new ImageIcon(iconUrl);
		icon.setIcon(IconImage);
		icon.setPreferredSize(new Dimension(80,120));
		icon.setBounds(10,55,80,120);
		
		HeadlineLabel DinFormat = new HeadlineLabel(Title, 80,20,10,10);
		
		JLabel DinSize = new JLabel();
		DinSize.setBackground(Var.SekColor);
		DinSize.setForeground(Color.LIGHT_GRAY);
//		DinSize.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Var.Color1));
		DinSize.setFont(Var.OpenSans12);
		DinSize.setPreferredSize(new Dimension(80, 20));
		DinSize.setText(PropertiesSizeX + "/" + PropertiesSizeY);
		DinSize.setBounds(10,30,80,20);
		
		add(DinFormat);
		add(DinSize);
		add(icon);
		
		addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				Var.neuesProjektErstellen[1].Maﬂe1.setText(Integer.toString(PropertiesSizeX));
				Var.neuesProjektErstellen[1].Maﬂe2.setText(Integer.toString(PropertiesSizeY));
			}
			
			public void mouseEntered(MouseEvent e)
			{
				setBackground(Var.PrimColor);
			}
			
			public void mouseExited(MouseEvent e)
			{
				setBackground(Var.SekColor);
			}
		});
	}
}
