package rumpelkiste;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import funktionBundles.Var;

public class Label extends JPanel
{
	public static JLabel panel = new JLabel();
	
	public Label()
	{
		setLayout(null);
		
		JLabel close = new JLabel();
		URL closeImage = this.getClass().getResource("BlattHintergrundNeu.png");
		Icon closeBack = new ImageIcon(closeImage);
		panel.setIcon(closeBack);
		
		panel.setPreferredSize(new Dimension(Var.arbeitsbereichbreite,Var.arbeitsbereichhöhe));
		panel.setBounds(0,0,Var.arbeitsbereichbreite,Var.arbeitsbereichhöhe);
		panel.setBackground(Var.neutralGrau);
		panel.setVisible(true);
		
		add(panel);
		
		setPreferredSize(new Dimension(Var.arbeitsbereichbreite,Var.arbeitsbereichhöhe));
		setVisible(true);
	}
}
 