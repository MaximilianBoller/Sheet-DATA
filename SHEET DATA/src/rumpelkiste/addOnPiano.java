package rumpelkiste;

import java.awt.Color;

import java.awt.Dimension;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;


import funktionBundles.Var;
import window.dialogWindows.keyPianoinfo;


public class addOnPiano extends JPanel
{
	public static JTextArea note = new JTextArea();
	public static JButton tastaturPiano = new JButton();
	
	public static JLayeredPane pane = new JLayeredPane();
	
	

	public addOnPiano() 
	{	 

		LineBorder line = new LineBorder(Var.dunkelGrau, 0, false);
		
		note.setPreferredSize(new Dimension(100,100));
		note.setBackground(Var.dunkelGrau);
		note.setForeground(Color.WHITE);
		note.setFont(Var.standartFont15);
		note.setBounds(870,10,50,50);

		note.setEditable(false);
		pane.setLayer(note, 4); 
		pane.add(note);
		
		
		URL UIkayImage = this.getClass().getResource("UIkey.png");
		Icon UIkey = new ImageIcon(UIkayImage);
		
		tastaturPiano.setIcon(UIkey);
		tastaturPiano.setBorder(line);
		tastaturPiano.setPreferredSize(new Dimension(50,50));
		tastaturPiano.setBounds(870,100,50,50);
		tastaturPiano.addKeyListener(new tastaturPiano());
		tastaturPiano.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	keyPianoinfo info = new keyPianoinfo();
	        	info.setLocationRelativeTo(null);
	        	
	        	Var.keypiano[1] = info;
	        	
	        	
	        }
	    });
		pane.setLayer(tastaturPiano, 3); 
		pane.add(tastaturPiano);

		
		URL pianoBackdropimage = this.getClass().getResource("UIBackgroundPiano.png");
		Icon pianobackdrop = new ImageIcon(pianoBackdropimage);
		
		JLabel rot = new JLabel(pianobackdrop);
		rot.setPreferredSize(new Dimension(930,230));
		rot.setVisible(true);
		rot.setBounds(0,0,930,230);	
		pane.setLayer(rot, 1); 
		pane.add(rot);
		
		
		
		
		URL closeimage = this.getClass().getResource("UIAction1.png");
		Icon closebutton = new ImageIcon(closeimage);
		
		JButton close = new JButton(closebutton);

		close.setBorder(line);
		close.setPreferredSize(new Dimension(50,50));
		close.setVisible(true);
		close.setBackground(Color.DARK_GRAY);
		
		close.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	Var.draggableworkspace[1].remove(Var.piano[1]);
//	        	Programmfenster.Mitte.validate();
	        	SwingUtilities.updateComponentTreeUI(Var.mainLayout[1]);
	        	close.setBackground(Color.DARK_GRAY);
	        	Var.AddOnPiano = false;
	        	Var.keypiano[1].removeAll();
	        	Var.keypiano[1].dispose();

	        	
	        }
	        
	        public void mouseEntered(MouseEvent e)
	        {
	        	close.setBackground(Color.RED);
	        }
	        
	        public void mouseExited(MouseEvent e)
	        {
	        	close.setBackground(Color.DARK_GRAY);
	        }
	    });
		
		close.setBounds(870,160,50,50);
		pane.setLayer(close, 2); 
		pane.add(close);
	
		
		
		addOnPianoWeisseTasten WeisseTaste01 = new addOnPianoWeisseTasten("a","audio/a.wav");
		WeisseTaste01.setPreferredSize(new Dimension(50,150));
		WeisseTaste01.setBounds(10,60,50,150);
		pane.setLayer(WeisseTaste01, 2); 
		pane.add(WeisseTaste01);
		
				schwarz4 SchwarzeTaste01= new schwarz4("a#","audio/a#.wav");
				SchwarzeTaste01.setPreferredSize(new Dimension(100,50));
				SchwarzeTaste01.setBounds(10,10,100,50);
				pane.setLayer(SchwarzeTaste01, 3); 
				pane.add(SchwarzeTaste01);
		
		addOnPianoWeisseTasten WeisseTaste02 = new addOnPianoWeisseTasten("h","audio/h.wav");
		WeisseTaste02.setPreferredSize(new Dimension(50,150));
		WeisseTaste02.setBounds(60,60,50,150);
		pane.setLayer(WeisseTaste02, 2); 
		pane.add(WeisseTaste02);
				
		addOnPianoWeisseTasten WeisseTaste03 = new addOnPianoWeisseTasten("c1","audio/c1.wav");
		WeisseTaste03.setPreferredSize(new Dimension(50,150));
		WeisseTaste03.setBounds(110,60,50,150);
		pane.setLayer(WeisseTaste03, 2); 
		pane.add(WeisseTaste03);
		
				schwarz3 SchwarzeTaste03= new schwarz3("c#1","audio/c#1.wav");
				SchwarzeTaste03.setPreferredSize(new Dimension(75,50));
				SchwarzeTaste03.setBounds(110,10,75,50);
				pane.setLayer(SchwarzeTaste03, 3); 
				pane.add(SchwarzeTaste03);
		
		addOnPianoWeisseTasten WeisseTaste04 = new addOnPianoWeisseTasten("d1","audio/d1.wav");
		WeisseTaste04.setPreferredSize(new Dimension(50,150));
		WeisseTaste04.setBounds(160,60,50,150);
		pane.setLayer(WeisseTaste04, 2); 
		pane.add(WeisseTaste04);

				schwarz2 SchwarzeTaste04= new schwarz2("d#1","audio/d#1.wav");
				SchwarzeTaste04.setPreferredSize(new Dimension(75,50));
				SchwarzeTaste04.setBounds(185,10,75,50);
				pane.setLayer(SchwarzeTaste04, 3); 
				pane.add(SchwarzeTaste04);
				
		
		addOnPianoWeisseTasten WeisseTaste05 = new addOnPianoWeisseTasten("e1","audio/e1.wav");
		WeisseTaste05.setPreferredSize(new Dimension(50,150));
		WeisseTaste05.setBounds(210,60,50,150);
		pane.setLayer(WeisseTaste05, 2); 
		pane.add(WeisseTaste05);

		
		addOnPianoWeisseTasten WeisseTaste06 = new addOnPianoWeisseTasten("f1","audio/f1.wav");
		WeisseTaste06.setPreferredSize(new Dimension(50,150));
		WeisseTaste06.setBounds(260,60,50,150);
		pane.setLayer(WeisseTaste06, 2); 
		pane.add(WeisseTaste06);
		
				schwarz3 SchwarzeTaste05= new schwarz3("f#1","audio/f#1.wav");
				SchwarzeTaste05.setPreferredSize(new Dimension(75,50));
				SchwarzeTaste05.setBounds(260,10,75,50);
				pane.setLayer(SchwarzeTaste05, 3); 
				pane.add(SchwarzeTaste05);
		
		addOnPianoWeisseTasten WeisseTaste07 = new addOnPianoWeisseTasten("g1","audio/g1.wav");
		WeisseTaste07.setPreferredSize(new Dimension(50,150));
		WeisseTaste07.setBounds(310,60,50,150);
		pane.setLayer(WeisseTaste07, 2); 
		pane.add(WeisseTaste07);
		
				schwarz1 SchwarzeTaste07= new schwarz1("g#1","audio/g#1.wav");
				SchwarzeTaste07.setPreferredSize(new Dimension(50,50));
				SchwarzeTaste07.setBounds(335,10,50,50);
				pane.setLayer(SchwarzeTaste07, 3); 
				pane.add(SchwarzeTaste07);
		
		addOnPianoWeisseTasten WeisseTaste08 = new addOnPianoWeisseTasten("a1","audio/a1.wav");
		WeisseTaste08.setPreferredSize(new Dimension(50,150));
		WeisseTaste08.setBounds(360,60,50,150);
		pane.setLayer(WeisseTaste08, 2); 
		pane.add(WeisseTaste08);
		
				schwarz2 SchwarzeTaste06= new schwarz2("a#1","audio/a#1.wav");
				SchwarzeTaste06.setPreferredSize(new Dimension(75,50));
				SchwarzeTaste06.setBounds(385,10,75,50);
				pane.setLayer(SchwarzeTaste06, 3); 
				pane.add(SchwarzeTaste06);
		
		addOnPianoWeisseTasten WeisseTaste09 = new addOnPianoWeisseTasten("h1","audio/h1.wav");
		WeisseTaste09.setPreferredSize(new Dimension(50,150));
		WeisseTaste09.setBounds(410,60,50,150);
		pane.setLayer(WeisseTaste09, 2); 
		pane.add(WeisseTaste09);
		
		WeiﬂeTasteMitPunkt WeisseTaste10 = new WeiﬂeTasteMitPunkt("c2","audio/c2.wav");
		WeisseTaste10.setPreferredSize(new Dimension(50,150));
		WeisseTaste10.setBounds(460,60,50,150);
		pane.setLayer(WeisseTaste10, 2); 
		pane.add(WeisseTaste10);
		
				schwarz3 SchwarzeTaste08= new schwarz3("c#2","audio/c#2.wav");
				SchwarzeTaste08.setPreferredSize(new Dimension(75,50));
				SchwarzeTaste08.setBounds(460,10,75,50);
				pane.setLayer(SchwarzeTaste08, 3); 
				pane.add(SchwarzeTaste08);
		
		addOnPianoWeisseTasten WeisseTaste11 = new addOnPianoWeisseTasten("d2","audio/d2.wav");
		WeisseTaste11.setPreferredSize(new Dimension(50,150));
		WeisseTaste11.setBounds(510,60,50,150);
		pane.setLayer(WeisseTaste11, 2); 
		pane.add(WeisseTaste11);
		
				schwarz2 SchwarzeTaste09= new schwarz2("d#2","audio/d#2.wav");
				SchwarzeTaste09.setPreferredSize(new Dimension(75,50));
				SchwarzeTaste09.setBounds(535,10,75,50);
				pane.setLayer(SchwarzeTaste09, 3); 
				pane.add(SchwarzeTaste09);

		
		addOnPianoWeisseTasten WeisseTaste12 = new addOnPianoWeisseTasten("e2","audio/e2.wav");
		WeisseTaste12.setPreferredSize(new Dimension(50,150));
		WeisseTaste12.setBounds(560,60,50,150);
		pane.setLayer(WeisseTaste12, 2); 
		pane.add(WeisseTaste12);
		

		
		addOnPianoWeisseTasten WeisseTaste13 = new addOnPianoWeisseTasten("f2","audio/f2.wav");
		WeisseTaste13.setPreferredSize(new Dimension(50,150));
		WeisseTaste13.setBounds(610,60,50,150);
		pane.setLayer(WeisseTaste13, 2); 
		pane.add(WeisseTaste13);
		
				schwarz3 SchwarzeTaste10= new schwarz3("f#2","audio/f#2.wav");
				SchwarzeTaste10.setPreferredSize(new Dimension(75,50));
				SchwarzeTaste10.setBounds(610,10,75,50);
				pane.setLayer(SchwarzeTaste10, 3); 
				pane.add(SchwarzeTaste10);
		
		addOnPianoWeisseTasten WeisseTaste14 = new addOnPianoWeisseTasten("g2","audio/g2.wav");
		WeisseTaste14.setPreferredSize(new Dimension(50,150));
		WeisseTaste14.setBounds(660,60,50,150);
		pane.setLayer(WeisseTaste14, 2); 
		pane.add(WeisseTaste14);
		
				schwarz1 SchwarzeTaste11= new schwarz1("g#2","audio/g#2.wav");
				SchwarzeTaste11.setPreferredSize(new Dimension(50,50));
				SchwarzeTaste11.setBounds(685,10,50,50);
				pane.setLayer(SchwarzeTaste11, 3); 
				pane.add(SchwarzeTaste11);
				
		addOnPianoWeisseTasten WeisseTaste15 = new addOnPianoWeisseTasten("a2","audio/a2.wav");
		WeisseTaste15.setPreferredSize(new Dimension(50,150));
		WeisseTaste15.setBounds(710,60,50,150);
		pane.setLayer(WeisseTaste15, 2); 
		pane.add(WeisseTaste15);
		
				schwarz5 SchwarzeTaste12= new schwarz5("a#2","audio/a#2.wav");
				SchwarzeTaste12.setPreferredSize(new Dimension(125,50));
				SchwarzeTaste12.setBounds(735,10,125,50);
				pane.setLayer(SchwarzeTaste12, 3); 
				pane.add(SchwarzeTaste12);
		
		addOnPianoWeisseTasten WeisseTaste16 = new addOnPianoWeisseTasten("h2","audio/h2.wav");
		WeisseTaste16.setPreferredSize(new Dimension(50,150));
		WeisseTaste16.setBounds(760,60,50,150);
		pane.setLayer(WeisseTaste16, 2); 
		pane.add(WeisseTaste16);
		
		addOnPianoWeisseTasten WeisseTaste17 = new addOnPianoWeisseTasten("c3","audio/c3.wav");
		WeisseTaste17.setPreferredSize(new Dimension(50,150));
		WeisseTaste17.setBounds(810,60,50,150);
		pane.setLayer(WeisseTaste17, 2); 
		pane.add(WeisseTaste17);
		


		
		
		
		
		setLayout(null);
		
		pane.setLayout(null);
		pane.setPreferredSize(new Dimension(930,230));
		pane.setBounds(0, 0, 930, 230);
		
		add(pane);

	}

}
