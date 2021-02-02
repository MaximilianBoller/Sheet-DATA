package obj.UIobj.right;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import funktionBundles.Var;
import quickParts.icon.IconButton;
import quickParts.icon.IconLabel;

public class TextAreaHierarchy extends JPanel
{
	public int ID;
	int XPageCoordinate;
	
	public JTextField title = new JTextField();
	public JPanel FokusIndikator = new JPanel();
	
	boolean TextareaVisible = true;

	public TextAreaHierarchy(int textareacount, int xPageCoordinate, String name)
	{
		ID = textareacount;
		XPageCoordinate = xPageCoordinate;
		
		setBorder(BorderFactory.createMatteBorder(1,0,0,0,Var.SekColor));
		setPreferredSize(new Dimension(242,20));
		setBackground(Var.PrimColor);
		setForeground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout(0,0,0));
		
		addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent e)
			{
	//			setBackground(Var.SekColor);
			}
			
			public void mouseExited(MouseEvent e)
			{
				setBackground(Var.PrimColor);
			}
			
			public void mousePressed(MouseEvent e)
			{
				Var.TextArea[ID].RequestFocus();
			}
	
		});	
		
		FokusIndikator.setPreferredSize(new Dimension(5,20));
		FokusIndikator.setBounds(0,0,5,20);
		FokusIndikator.setBackground(Var.BorderColor);
		add(FokusIndikator);
		
		IconButton icon1 = new IconButton("eye.png", 20,20,0,0);
		icon1.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				TextareaVisible = !TextareaVisible;
				System.out.println(TextareaVisible);
				
				if(TextareaVisible)
				{
					Var.TextArea[ID].setVisible(true);
					icon1.changeIcon("eye.png");
				}
				
				else
				{
					Var.TextArea[ID].setVisible(false);
					icon1.changeIcon("closedEye.png");

				}
			}
		});
		add(icon1);
		
		IconLabel icon2 = new IconLabel("HirarchieText.png", 20,20,0,0);
		icon2.setBorder(BorderFactory.createMatteBorder(0,0,0,1,Var.SekColor));
		add(icon2);
		
		
		JLabel pagecount = new JLabel();
		pagecount.setHorizontalAlignment(JTextField.CENTER);
		pagecount.setFont(Var.OpenSans12);
		pagecount.setText(Integer.toString(ID));
		pagecount.setBackground(Var.SekColor);
		pagecount.setForeground(Color.LIGHT_GRAY);
		pagecount.setPreferredSize(new Dimension(30,20));
		pagecount.setBounds(0,0,30,20);
//		add(pagecount);
		
		

		title.setText(name);
		title.setOpaque(false);
		title.setHorizontalAlignment(JTextField.LEFT);
		title.setBackground(Var.SekColor);
		title.setForeground(Color.LIGHT_GRAY);
		title.setBorder(BorderFactory.createMatteBorder(0,5,0,0,Var.PrimColor));
		title.setFont(Var.OpenSans12);
		title.setPreferredSize(new Dimension(197,20));
		title.setBounds(0,0,197,20);
		add(title);
		

	}
	
	public void aktive(boolean b)
	{
		if(b)
		{
			FokusIndikator.setBackground(Var.PinkHightlightColor);
		}
		else
		{
			FokusIndikator.setBackground(Var.BorderColor);
		}
	}
}


