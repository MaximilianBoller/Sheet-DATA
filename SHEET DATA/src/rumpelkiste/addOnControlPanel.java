package rumpelkiste;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.net.URL;

import javax.swing.*;

import javax.swing.border.LineBorder;


import funktionBundles.Var;


public class addOnControlPanel extends JLayeredPane
{
	public static JTextArea wert = new JTextArea();
	public static JTextArea notepause = new JTextArea();
	
	public static JLayeredPane hintergrund = new JLayeredPane();
	
	public addOnControlPanel()
	{
		
		LineBorder line = new LineBorder(Var.dunkelGrau, 0, false);
	
		setSize(70, 610);
		setLayout(new BorderLayout());
		
		
		wert.setPreferredSize(new Dimension(100,100));
		wert.setBackground(Var.dunkelGrau);
		wert.setForeground(Color.WHITE);
		wert.setFont(Var.standartFont15);
		wert.setBounds(10,490,50,25);
		wert.setEditable(false);
		hintergrund.setLayer(wert, 4); 
		hintergrund.add(wert);
		
		hintergrund.setLayout(null);
		
		notepause.setPreferredSize(new Dimension(100,100));
		notepause.setBackground(Var.dunkelGrau);
		notepause.setForeground(Color.WHITE);
		notepause.setFont(Var.standartFont15);
		notepause.setBounds(10,510,50,25);
		notepause.setText("");
		notepause.setEditable(false);
		hintergrund.setLayer(notepause, 4); 
		hintergrund.add(notepause);
		

		
		URL backgroundimage = this.getClass().getResource("UIBackgroundControlPanel.png");
		Icon background = new ImageIcon(backgroundimage);
		
		
		JLabel Hintergrund = new JLabel(background);
		Hintergrund.setPreferredSize(new Dimension(70,610));
		Hintergrund.setVisible(true);
		Hintergrund.setBackground(Var.neutralGrau);
		Hintergrund.setBounds(0,0,70,610);
		hintergrund.setLayer(Hintergrund, 1); 
		hintergrund.add(Hintergrund);
		
		
		URL UIAction1Image = this.getClass().getResource("UIAction1.png");
		Icon UIAction1 = new ImageIcon(UIAction1Image);
		
		JButton close = new JButton(UIAction1);
		close.setPreferredSize(new Dimension(50,50));
		close.setVisible(true);
		close.setBorder(line);	
//		close.setBackground(Color.DARK_GRAY);
		
		close.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	Var.draggableworkspace[1].remove(Var.controlPanel[1]);
//	        	MainLayout.Mitte.remove(Var.controlPanel[1]);

	        	SwingUtilities.updateComponentTreeUI(Var.mainLayout[1]);
	        	
	        	Var.notenWert1 = false;
	        	Var.notenWert2 = false;
	        	Var.notenWert4 = false;
	        	Var.notenWert8 = false;
	        	Var.notenWert16 = false;
	        	Var.notenWert32 = false;
	        	
	        	wert.setText("");
	        
	        	close.setBackground(Var.dunkelGrau);
	        	Var.AddOnControlPanel = false;
	        	
	        }
	        
	        public void mousePressed(MouseEvent e)
	        {
	        }
	        public void mouseReleased(MouseEvent e)
	        {
	        }

	    });
		
		close.setBounds(10,10,50,50);
		hintergrund.setLayer(close, 2); 
		hintergrund.add(close);
		


		
		
		
		
		URL UI1Image = this.getClass().getResource("UI1.png");
		Icon UI1 = new ImageIcon(UI1Image);

		JButton wert1 = new JButton(UI1);
		wert1.setPreferredSize(new Dimension(50,50));
		wert1.setBorder(line);	
		wert1.setBackground(Var.neutralGrau);
		wert1.setForeground(Color.DARK_GRAY);
		wert1.setBounds(10,70,50,50);
		hintergrund.setLayer(wert1, 2); 
		wert1.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	Var.notenWert1 = true;
	        	Var.notenWert2 = false;
	        	Var.notenWert4 = false;
	        	Var.notenWert8 = false;
	        	Var.notenWert16 = false;
	        	Var.notenWert32 = false;
	        	wert.setText("1");
	        }
	        public void mousePressed(MouseEvent e)
	        {
	        }
	        public void mouseReleased(MouseEvent e)
	        {
	        }
	    });
   		hintergrund.add(wert1);
		

   		
   		
   		
   		

		URL UI2Image = this.getClass().getResource("UI2.png");
		Icon UI2 = new ImageIcon(UI2Image);

		JButton wert2 = new JButton(UI2);
		wert2.setPreferredSize(new Dimension(50,50));
		wert2.setBorder(line);
		wert2.setBackground(Color.WHITE);
		wert2.setForeground(Color.DARK_GRAY);
		wert2.setBounds(10,120,50,50);
		hintergrund.setLayer(wert2, 2); 
		wert2.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	Var.notenWert1 = false;
	        	Var.notenWert2 = true;
	        	Var.notenWert4 = false;
	        	Var.notenWert8 = false;
	        	Var.notenWert16 = false;
	        	Var.notenWert32 = false;
	        	wert.setText("1/2");
	        }
	        public void mousePressed(MouseEvent e)
	        {
	        }
	        public void mouseReleased(MouseEvent e)
	        {
	        }

	    });
   		hintergrund.add(wert2);
		
   		
   		
   		
		
		
		URL UI4Image = this.getClass().getResource("UI4.png");
		Icon UI4 = new ImageIcon(UI4Image);

		JButton wert4 = new JButton(UI4);
		wert4.setPreferredSize(new Dimension(50,50));
		wert4.setBorder(line);
		wert4.setBackground(Color.WHITE);
		wert4.setForeground(Color.DARK_GRAY);
		wert4.setBounds(10,170,50,50);
		hintergrund.setLayer(wert4, 2); 
		hintergrund.add(wert4);
		wert4.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	Var.notenWert1 = false;
	        	Var.notenWert2 = false;
	        	Var.notenWert4 = true;
	        	Var.notenWert8 = false;
	        	Var.notenWert16 = false;
	        	Var.notenWert32 = false;
	        	wert.setText("1/4");
	        }
	        public void mousePressed(MouseEvent e)
	        {
	        }
	        public void mouseReleased(MouseEvent e)
	        {
	        }

	    });
		
		
		
		URL UI8Image = this.getClass().getResource("UI8.png");
		Icon UI8 = new ImageIcon(UI8Image);
		
		JButton wert8 = new JButton(UI8);
		wert8.setPreferredSize(new Dimension(50,50));
		wert8.setBorder(line);
		wert8.setBackground(Color.WHITE);
		wert8.setForeground(Color.DARK_GRAY);
		wert8.setBounds(10,220,50,50);
		hintergrund.setLayer(wert8, 2); 
		hintergrund.add(wert8);
		wert8.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	Var.notenWert1 = false;
	        	Var.notenWert2 = false;
	        	Var.notenWert4 = false;
	        	Var.notenWert8 = true;
	        	Var.notenWert16 = false;
	        	Var.notenWert32 = false;
	        	wert.setText("1/8");
	        }
	        
	        public void mousePressed(MouseEvent e)
	        {
	        }
	        public void mouseReleased(MouseEvent e)
	        {
	        }

	    });
		
		
		
		URL UI16Image = this.getClass().getResource("UI16.png");
		Icon UI16 = new ImageIcon(UI16Image);
		
		JButton wert16 = new JButton(UI16);
		wert16.setPreferredSize(new Dimension(50,50));
		wert16.setBorder(line);
		wert16.setBackground(Color.WHITE);
		wert16.setForeground(Color.DARK_GRAY);
		wert16.setBounds(10,270,50,50);
		hintergrund.setLayer(wert16, 2); 
		hintergrund.add(wert16);
		wert16.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	Var.notenWert1 = false;
	        	Var.notenWert2 = false;
	        	Var.notenWert4 = false;
	        	Var.notenWert8 = false;
	        	Var.notenWert16 = true;
	        	Var.notenWert32 = false;
	        	wert.setText("1/16");
	        }
	        
	        public void mousePressed(MouseEvent e)
	        {
	        }
	        public void mouseReleased(MouseEvent e)
	        {
	        }

	    });
		
		
		
		URL UI32Image = this.getClass().getResource("UI32.png");
		Icon UI32 = new ImageIcon(UI32Image);
		
		JButton wert32 = new JButton(UI32);
		wert32.setPreferredSize(new Dimension(40,80));
		wert32.setBorder(line);
		wert32.setBackground(Color.WHITE);
		wert32.setForeground(Color.DARK_GRAY);
		wert32.setBounds(10,320,50,50);
		hintergrund.setLayer(wert32, 2); 
		hintergrund.add(wert32);
		wert32.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	Var.notenWert1 = false;
	        	Var.notenWert2 = false;
	        	Var.notenWert4 = false;
	        	Var.notenWert8 = false;
	        	Var.notenWert16 = false;
	        	Var.notenWert32 = true;
	        	wert.setText("1/32");
	        }
	        
	        public void mousePressed(MouseEvent e)
	        {
	        }
	        public void mouseReleased(MouseEvent e)
	        {
	        }
	        

	    });
		
		
		
		URL UIImagenote = this.getClass().getResource("UINote.png");
		Icon UINote = new ImageIcon(UIImagenote);
		
		JButton note = new JButton(UINote);
		note.setPreferredSize(new Dimension(40,80));
		note.setBorder(line);
		note.setBackground(Color.WHITE);
		note.setForeground(Color.DARK_GRAY);
		note.setBounds(10,380,50,50);
		hintergrund.setLayer(note, 2); 
		hintergrund.add(note);
		note.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	Var.note = true;
	        	Var.pause = false;
	        	Var.takt = false;
	        	
	        	Var.werkzeug = "note";
	        	System.out.println("Var.werkzeug: " + Var.werkzeug);
	        	notepause.setText("note");
	        }
	        
	        public void mousePressed(MouseEvent e)
	        {

	        }
	        public void mouseReleased(MouseEvent e)
	        {

	        }
	        

	    });
		
		URL UIImagepause = this.getClass().getResource("UIPause.png");
		Icon UIPause = new ImageIcon(UIImagepause);
		
		JButton pause = new JButton(UIPause);
		pause.setPreferredSize(new Dimension(40,80));
		pause.setBorder(line);
		pause.setBackground(Color.WHITE);
		pause.setForeground(Color.DARK_GRAY);
		pause.setBounds(10,430,50,50);
		hintergrund.setLayer(pause, 2); 
		hintergrund.add(pause);
		pause.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {
	        	Var.note = false;
	        	Var.pause = true;
	        	Var.takt = false;
	        	
	        	Var.werkzeug = "pause";
	        	System.out.println("Var.werkzeug: " + Var.werkzeug);
	        	notepause.setText("pause");
	        }
	        
	        public void mousePressed(MouseEvent e)
	        {
	        }
	        public void mouseReleased(MouseEvent e)
	        {
	        }
	    });
		
		URL UIImageTakt = this.getClass().getResource("UITakt.png");
		Icon UITakt = new ImageIcon(UIImageTakt);
		
		JButton Takt = new JButton(UITakt);
		Takt.setPreferredSize(new Dimension(40,80));
		Takt.setBorder(line);
		Takt.setBackground(Color.WHITE);
		Takt.setForeground(Color.DARK_GRAY);
		Takt.setBounds(10,550,50,50);
		hintergrund.setLayer(Takt, 2); 
		hintergrund.add(Takt);
		Takt.addMouseListener(new MouseAdapter()
	    {
	        public void mouseClicked(MouseEvent e)
	        {

	        	Var.note = false;
	        	Var.pause = false;
	        	Var.takt = true;
	        	
	        	Var.werkzeug = "Takt";
	        	
	        	System.out.println("Var.werkzeug: " + Var.werkzeug);
	        	wert.setText("");
	        	notepause.setText("Takt");
	        
	        }
	        
	        public void mousePressed(MouseEvent e)
	        {
	        }
	        public void mouseReleased(MouseEvent e)
	        {
	        }
	    });
		


		
		
		
		hintergrund.setBackground(Color.BLACK);
		hintergrund.setVisible(true);
		setLayer(hintergrund, 1);
		add(hintergrund, BorderLayout.CENTER);
		
	}
}