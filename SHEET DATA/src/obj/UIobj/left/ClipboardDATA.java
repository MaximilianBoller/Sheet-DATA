package obj.UIobj.left;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import funktionBundles.Var;

public class ClipboardDATA extends JFrame
{
	public static JTextPane textarea;
	
	public ClipboardDATA()
	{
		setTitle("Clipboard");
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(400, 800));
		setSize(400, 800);
		
		textarea = new JTextPane();
		textarea.setSize(400,800);
		textarea.setFont(Var.OpenSans12);
//		textarea.setLineWrap(true);
//		textarea.setWrapStyleWord(true);
		textarea.setBackground(Var.PrimColor);
		textarea.setForeground(Color.LIGHT_GRAY);
		textarea.setEditable(false);
		textarea.setText(Var.ClipboardLOG);
		
		JScrollPane scroll = new JScrollPane(textarea);
		add(scroll, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public void update()
	{
		textarea.setText(Var.ClipboardLOG);
	}
}
