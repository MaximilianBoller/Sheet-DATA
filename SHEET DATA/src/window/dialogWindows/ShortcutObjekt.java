package window.dialogWindows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

import funktionBundles.Var;

public class ShortcutObjekt extends JPanel
{
	public ShortcutObjekt(String bezeichnung, String shortcut, String erkl�rung)
	{
		setSize(300,100);
		setPreferredSize(new Dimension(300,100));
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createMatteBorder(1,1,1,1,Var.SekColor));
		
		JPanel north = new JPanel();
		north.setPreferredSize(new Dimension(300,20));
		north.setLayout(new GridLayout(1,2));
		
		JTextField bezeichnungsText = new JTextField();
		bezeichnungsText.setBackground(Var.PrimColor);
		bezeichnungsText.setForeground(Color.LIGHT_GRAY);
		bezeichnungsText.setBorder(BorderFactory.createMatteBorder(0,0,0,1,Var.SekColor));
		bezeichnungsText.setEditable(false);
		bezeichnungsText.setText(bezeichnung);
		
		JTextField shortcutText = new JTextField();
		shortcutText.setHorizontalAlignment(JTextField.CENTER);
		shortcutText.setBackground(Var.PrimColor);
		shortcutText.setForeground(Color.WHITE);
		shortcutText.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Var.SekColor));
		shortcutText.setEditable(false);
		shortcutText.setText(shortcut);
		
		north.add(bezeichnungsText);
		north.add(shortcutText);	
		
		JTextPane erkl�rungsText = new JTextPane();
		erkl�rungsText.setBackground(Var.PrimColor);
		erkl�rungsText.setForeground(Color.LIGHT_GRAY);
		erkl�rungsText.setBorder(BorderFactory.createMatteBorder(1,0,0,0,Var.SekColor));
		erkl�rungsText.setEditable(false);
		erkl�rungsText.setText(erkl�rung);
		
		add(north, BorderLayout.NORTH);
		add(erkl�rungsText, BorderLayout.CENTER);
	}
}
