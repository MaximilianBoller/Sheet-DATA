package window.dialogWindows;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import funktionBundles.Var;

public class ShortcutWindow extends JFrame
{
	public ShortcutWindow()
	{
		setPreferredSize(new Dimension(300,800));
		setSize(500,800);
		setVisible(true);
		setTitle("SHORTCUTS");
		
		JPanel hintergrund = new JPanel();
		hintergrund.setLayout(new FlowLayout(5,5,5));
		hintergrund.setPreferredSize(new Dimension(310,10000));
		hintergrund.setSize(310, 10000);
		hintergrund.setBackground(Var.PrimColor);
		
		ShortcutObjekt StrgS = new ShortcutObjekt("Safe", "Strg + S", "You can press Strg + S to safe the projekt");
		hintergrund.add(StrgS);
		
		ShortcutObjekt StrgC = new ShortcutObjekt("Copy", "Strg + C", "You can press Strg + C to copy the objekt propperties into the clipboard");
		hintergrund.add(StrgC);
		
		ShortcutObjekt StrgV = new ShortcutObjekt("Paste", "Strg + V", "You can press Strg + V to paste the clipboard onto the page");
		hintergrund.add(StrgV);
		
		ShortcutObjekt StrgA = new ShortcutObjekt("Cut", "Strg + A", "You can press Strg + A to cut the objekt from the page into the clipboard INFO: NOCH NICHT IMPLEMENTIERT");
		hintergrund.add(StrgA);
		
		ShortcutObjekt StrgL = new ShortcutObjekt("Leftalign Text", "Strg + L", "You can press Strg + L to allign a text in a textarea to the left");
		hintergrund.add(StrgL);
		
		ShortcutObjekt StrgR = new ShortcutObjekt("Rightalign Text", "Strg + R", "You can press Strg + R to allign a text in a textarea to the right");
		hintergrund.add(StrgR);
		
		ShortcutObjekt StrgE = new ShortcutObjekt("Centeralign Text", "Strg + E", "You can press Strg + E to allign a text in a textarea to the center");
		hintergrund.add(StrgE);
		
		ShortcutObjekt E = new ShortcutObjekt("Move Tool", "E", "You can press E to change to the move-tool");
		hintergrund.add(E);
		
		ShortcutObjekt T = new ShortcutObjekt("Textarea Tool", "T", "You can press T to change to the textarea-tool");
		hintergrund.add(T);
		
		ShortcutObjekt I = new ShortcutObjekt("Imagearea Tool", "I", "You can press I to change to the imagearea-tool");
		hintergrund.add(I);
		
		ShortcutObjekt N = new ShortcutObjekt("Notation Tool", "N", "You can press N to change to the notation-tool");
		hintergrund.add(N);
		
		ShortcutObjekt W = new ShortcutObjekt("Blank view", "W", "You can press W to change to the blank view");
		hintergrund.add(W);
		
		ShortcutObjekt Space = new ShortcutObjekt("Hand Tool", "SPACE", "You can press space to change to the hand-tool");
		hintergrund.add(Space);
		
        JScrollPane scrollPane = new JScrollPane(hintergrund);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        scrollPane.setBounds(50, 30, 300, 50);
        add(scrollPane);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
	}
}
