package rumpelkiste;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;


import funktionBundles.Funktion;
import funktionBundles.Var;


public class implementPiano extends JInternalFrame
{
	public static JLayeredPane pane = new JLayeredPane();
	public static Insets insets = pane.getInsets();
	public static JTextArea note = new JTextArea();
	

	public implementPiano()
	{
		
		//Raster snap
	    this.addMouseListener(new MouseAdapter()
	    { 
	    	public void mouseEntered(MouseEvent e)
	        {
	        	
	    	    double x = Funktion.grid(getX(), Var.RasterHintergrund);
	    	    double y = Funktion.grid(getY(), Var.RasterHintergrund);
	    	    
	    	    setLocation((int)Math.round(x),(int)Math.round(y));
	        }
	    	
	        public void mouseReleased(MouseEvent e)
	        {
	    	    double x = Funktion.grid(getX(), Var.RasterHintergrund);
	    	    double y = Funktion.grid(getY(), Var.RasterHintergrund);
	    	    
	    	    setLocation((int)Math.round(x),(int)Math.round(y));
	        }
	    });
	    
	    
		
//		JFrame frame = new JFrame("Piano");
//		setSize(1200, 470);
//		setVisible(true);
		setClosable(true);
		
//		BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
//		Component title = ui.getNorthPane();

		note.setPreferredSize(new Dimension(100,50));
		note.setFont(Var.standartFont30);
		note.setBounds(870,340,100,50);
		note.setEditable(false);
		pane.setLayer(note, 4); 
		pane.add(note);
		
		
		JPanel rot = new JPanel();
		rot.setPreferredSize(new Dimension(850,5));
		rot.setVisible(true);
		rot.setBackground(new Color(115,26,25));
		rot.setBounds(10,10,850,5);
		pane.setLayer(rot, 3); 
		pane.add(rot);
		
		JPanel fuﬂzeile = new JPanel();
		fuﬂzeile.setPreferredSize(new Dimension(1200,30));
		fuﬂzeile.setVisible(true);
		fuﬂzeile.setBackground(Color.DARK_GRAY);
		fuﬂzeile.setBounds(0,401,1200,30);
		pane.setLayer(fuﬂzeile, 3); 
		pane.add(fuﬂzeile);
		

		
		addOnPianoWeisseTasten WeisseTaste01 = new addOnPianoWeisseTasten("a","audio/a.wav");
		WeisseTaste01.setPreferredSize(new Dimension(50,380));
		WeisseTaste01.setBounds(10,10,50,380);
		pane.setLayer(WeisseTaste01, 1); 
		pane.add(WeisseTaste01);
		
				addOnPianoSchwarzeTasten SchwarzeTaste01= new addOnPianoSchwarzeTasten("a#","audio/a#.wav");
				SchwarzeTaste01.setPreferredSize(new Dimension(30,200));
				SchwarzeTaste01.setBounds(45,10,30,200);
				pane.setLayer(SchwarzeTaste01, 2); 
				pane.add(SchwarzeTaste01);
		
		addOnPianoWeisseTasten WeisseTaste02 = new addOnPianoWeisseTasten("h","audio/h.wav");
		WeisseTaste02.setPreferredSize(new Dimension(50,380));
		WeisseTaste02.setBounds(60,10,50,380);
		pane.setLayer(WeisseTaste02, 1); 
		pane.add(WeisseTaste02);
				
		addOnPianoWeisseTasten WeisseTaste03 = new addOnPianoWeisseTasten("c1","audio/c1.wav");
		WeisseTaste03.setPreferredSize(new Dimension(50,380));
		WeisseTaste03.setBounds(110,10,50,380);
		pane.setLayer(WeisseTaste03, 1); 
		pane.add(WeisseTaste03);
		
				addOnPianoSchwarzeTasten SchwarzeTaste03= new addOnPianoSchwarzeTasten("c#1","audio/c#1.wav");
				SchwarzeTaste03.setPreferredSize(new Dimension(30,200));
				SchwarzeTaste03.setBounds(145,10,30,200);
				pane.setLayer(SchwarzeTaste03, 2); 
				pane.add(SchwarzeTaste03);
		
		addOnPianoWeisseTasten WeisseTaste04 = new addOnPianoWeisseTasten("d1","audio/d1.wav");
		WeisseTaste04.setPreferredSize(new Dimension(50,380));
		WeisseTaste04.setBounds(160,10,50,380);
		pane.setLayer(WeisseTaste04, 1); 
		pane.add(WeisseTaste04);

				addOnPianoSchwarzeTasten SchwarzeTaste04= new addOnPianoSchwarzeTasten("d#1","audio/d#1.wav");
				SchwarzeTaste04.setPreferredSize(new Dimension(30,200));
				SchwarzeTaste04.setBounds(195,10,30,200);
				pane.setLayer(SchwarzeTaste04, 2); 
				pane.add(SchwarzeTaste04);
				
		
		addOnPianoWeisseTasten WeisseTaste05 = new addOnPianoWeisseTasten("e1","audio/e1.wav");
		WeisseTaste05.setPreferredSize(new Dimension(50,380));
		WeisseTaste05.setBounds(210,10,50,380);
		pane.setLayer(WeisseTaste05, 1); 
		pane.add(WeisseTaste05);

		
		addOnPianoWeisseTasten WeisseTaste06 = new addOnPianoWeisseTasten("f1","audio/f1.wav");
		WeisseTaste06.setPreferredSize(new Dimension(50,380));
		WeisseTaste06.setBounds(260,10,50,380);
		pane.setLayer(WeisseTaste06, 1); 
		pane.add(WeisseTaste06);
		
				addOnPianoSchwarzeTasten SchwarzeTaste05= new addOnPianoSchwarzeTasten("f#1","audio/f#1.wav");
				SchwarzeTaste05.setPreferredSize(new Dimension(30,200));
				SchwarzeTaste05.setBounds(295,10,30,200);
				pane.setLayer(SchwarzeTaste05, 2); 
				pane.add(SchwarzeTaste05);
		
		addOnPianoWeisseTasten WeisseTaste07 = new addOnPianoWeisseTasten("g1","audio/g1.wav");
		WeisseTaste07.setPreferredSize(new Dimension(50,380));
		WeisseTaste07.setBounds(310,10,50,380);
		pane.setLayer(WeisseTaste07, 1); 
		pane.add(WeisseTaste07);
		
				addOnPianoSchwarzeTasten SchwarzeTaste07= new addOnPianoSchwarzeTasten("g#1","audio/g#1.wav");
				SchwarzeTaste07.setPreferredSize(new Dimension(30,200));
				SchwarzeTaste07.setBounds(345,10,30,200);
				pane.setLayer(SchwarzeTaste07, 2); 
				pane.add(SchwarzeTaste07);
		
		addOnPianoWeisseTasten WeisseTaste08 = new addOnPianoWeisseTasten("a1","audio/a1.wav");
		WeisseTaste08.setPreferredSize(new Dimension(50,380));
		WeisseTaste08.setBounds(360,10,50,380);
		pane.setLayer(WeisseTaste08, 1); 
		pane.add(WeisseTaste08);
		
				addOnPianoSchwarzeTasten SchwarzeTaste06= new addOnPianoSchwarzeTasten("a#1","audio/a#1.wav");
				SchwarzeTaste06.setPreferredSize(new Dimension(30,200));
				SchwarzeTaste06.setBounds(395,10,30,200);
				pane.setLayer(SchwarzeTaste06, 2); 
				pane.add(SchwarzeTaste06);
		
		addOnPianoWeisseTasten WeisseTaste09 = new addOnPianoWeisseTasten("h1","audio/h1.wav");
		WeisseTaste09.setPreferredSize(new Dimension(50,380));
		WeisseTaste09.setBounds(410,10,50,380);
		pane.setLayer(WeisseTaste09, 1); 
		pane.add(WeisseTaste09);
		
		addOnPianoWeisseTasten WeisseTaste10 = new addOnPianoWeisseTasten("c2","audio/c2.wav");
		WeisseTaste10.setPreferredSize(new Dimension(50,380));
		WeisseTaste10.setBounds(460,10,50,380);
		pane.setLayer(WeisseTaste10, 1); 
		pane.add(WeisseTaste10);
		
				addOnPianoSchwarzeTasten SchwarzeTaste08= new addOnPianoSchwarzeTasten("c#2","audio/c#2.wav");
				SchwarzeTaste08.setPreferredSize(new Dimension(30,200));
				SchwarzeTaste08.setBounds(495,10,30,200);
				pane.setLayer(SchwarzeTaste08, 2); 
				pane.add(SchwarzeTaste08);
		
		addOnPianoWeisseTasten WeisseTaste11 = new addOnPianoWeisseTasten("d2","audio/d2.wav");
		WeisseTaste11.setPreferredSize(new Dimension(50,380));
		WeisseTaste11.setBounds(510,10,50,380);
		pane.setLayer(WeisseTaste11, 1); 
		pane.add(WeisseTaste11);
		
				addOnPianoSchwarzeTasten SchwarzeTaste09= new addOnPianoSchwarzeTasten("d#2","audio/d#2.wav");
				SchwarzeTaste09.setPreferredSize(new Dimension(30,200));
				SchwarzeTaste09.setBounds(545,10,30,200);
				pane.setLayer(SchwarzeTaste09, 2); 
				pane.add(SchwarzeTaste09);

		
		addOnPianoWeisseTasten WeisseTaste12 = new addOnPianoWeisseTasten("e2","audio/e2.wav");
		WeisseTaste12.setPreferredSize(new Dimension(50,380));
		WeisseTaste12.setBounds(560,10,50,380);
		pane.setLayer(WeisseTaste12, 1); 
		pane.add(WeisseTaste12);
		

		
		addOnPianoWeisseTasten WeisseTaste13 = new addOnPianoWeisseTasten("f2","audio/f2.wav");
		WeisseTaste13.setPreferredSize(new Dimension(50,380));
		WeisseTaste13.setBounds(610,10,50,380);
		pane.setLayer(WeisseTaste13, 1); 
		pane.add(WeisseTaste13);
		
				addOnPianoSchwarzeTasten SchwarzeTaste10= new addOnPianoSchwarzeTasten("f#2","audio/f#2.wav");
				SchwarzeTaste10.setPreferredSize(new Dimension(30,200));
				SchwarzeTaste10.setBounds(645,10,30,200);
				pane.setLayer(SchwarzeTaste10, 2); 
				pane.add(SchwarzeTaste10);
		
		addOnPianoWeisseTasten WeisseTaste14 = new addOnPianoWeisseTasten("g2","audio/g2.wav");
		WeisseTaste14.setPreferredSize(new Dimension(50,380));
		WeisseTaste14.setBounds(660,10,50,380);
		pane.setLayer(WeisseTaste14, 1); 
		pane.add(WeisseTaste14);
		
				addOnPianoSchwarzeTasten SchwarzeTaste11= new addOnPianoSchwarzeTasten("g#2","audio/g#2.wav");
				SchwarzeTaste11.setPreferredSize(new Dimension(30,200));
				SchwarzeTaste11.setBounds(695,10,30,200);
				pane.setLayer(SchwarzeTaste11, 2); 
				pane.add(SchwarzeTaste11);
				
		addOnPianoWeisseTasten WeisseTaste15 = new addOnPianoWeisseTasten("a2","audio/a2.wav");
		WeisseTaste15.setPreferredSize(new Dimension(50,380));
		WeisseTaste15.setBounds(710,10,50,380);
		pane.setLayer(WeisseTaste15, 1); 
		pane.add(WeisseTaste15);
		
				addOnPianoSchwarzeTasten SchwarzeTaste12= new addOnPianoSchwarzeTasten("a#2","audio/a#2.wav");
				SchwarzeTaste12.setPreferredSize(new Dimension(30,200));
				SchwarzeTaste12.setBounds(745,10,30,200);
				pane.setLayer(SchwarzeTaste12, 2); 
				pane.add(SchwarzeTaste12);
		
		addOnPianoWeisseTasten WeisseTaste16 = new addOnPianoWeisseTasten("h2","audio/h2.wav");
		WeisseTaste16.setPreferredSize(new Dimension(50,380));
		WeisseTaste16.setBounds(760,10,50,380);
		pane.setLayer(WeisseTaste16, 1); 
		pane.add(WeisseTaste16);
		
		addOnPianoWeisseTasten WeisseTaste17 = new addOnPianoWeisseTasten("c3","audio/c3.wav");
		WeisseTaste17.setPreferredSize(new Dimension(50,380));
		WeisseTaste17.setBounds(810,10,50,380);
		pane.setLayer(WeisseTaste17, 1); 
		pane.add(WeisseTaste17);
		


		
		
		
		
		
		
		
		
		pane.setLayout(null);
		pane.setBackground(Color.DARK_GRAY);
		
		add(pane);
	}
}
