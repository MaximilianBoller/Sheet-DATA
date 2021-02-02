package obj.UIobj.header;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.FlowLayout;

import java.awt.KeyboardFocusManager;
import java.awt.Point;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

import javax.swing.BorderFactory;

import javax.swing.JPanel;
import javax.swing.JTextArea;


import funktionBundles.Var;
import quickParts.buttons.HeaderButton;
import rumpelkiste.dropdown.dropdownHilfe;
import rumpelkiste.dropdown.dropdownNoten;


public class Header extends JPanel
{
	static Point compCoords;
	
	public Header()
	{
		
		setBackground(Var.PrimColor);
		setPreferredSize(new Dimension(30,30));
		setLayout(new FlowLayout(0,0,0));

			HeaderButton datei = new HeaderButton("Datei", 60,30);
			compCoords = null;		    
		    datei.addMouseListener(new MouseListener()
		    {
		        public void mouseClicked(MouseEvent e) 
		        {
		        	DateiOptionArea  dateiOptionArea = new DateiOptionArea();
		        	Var.mainLayout[1].north2.removeAll();
		    		Var.mainLayout[1].north2.add(dateiOptionArea);
		    		Var.mainLayout[1].north2.revalidate();

		        }

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
		    });
		    
		    
		    
		    
		    
		    
	
			HeaderButton start = new HeaderButton("Start", 60,30);
			
			compCoords = null;		    
			start.addMouseListener(new MouseListener()
		    {
				
		        public void mouseClicked(MouseEvent e) 
		        {
		        	
		        }

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
		    });
			
			
			
			
			
			
			
			
		    
			HeaderButton bearbeiten = new HeaderButton("Bearbeiten", 90,30);
			
			compCoords = null;		    
		    bearbeiten.addMouseListener(new MouseListener()
		    {
				@Override
				public void mouseClicked(MouseEvent e) 
				{
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
		    });
				    
	
			HeaderButton ansicht = new HeaderButton("Ansicht", 80,30);
			compCoords = null;		    
		    ansicht.addMouseListener(new MouseListener()
		    {
		    	public void mouseExited(MouseEvent e)
		    	{

        		}
		        public void mouseEntered(MouseEvent e)
		        {
	
	        	}
		        public void mouseReleased(MouseEvent e){}
		        
		        public void mousePressed(MouseEvent e)
		        {
		        	
		        }
		        public void mouseClicked(MouseEvent e) 
		        {

		        	AnsichtOptionArea  ansichtOptionArea = new AnsichtOptionArea();
		        	Var.mainLayout[1].north2.removeAll();
		    		Var.mainLayout[1].north2.add(ansichtOptionArea);
		    		Var.mainLayout[1].north2.revalidate();
		       }
		    });
	
	
		    HeaderButton hinzufügen = new HeaderButton("Hinzufügen", 90,30);
		    
			compCoords = null;		    
		    hinzufügen.addMouseListener(new MouseListener()
		    {
		    	public void mouseExited(MouseEvent e){
		    		hinzufügen.normal();
        		}
		        public void mouseEntered(MouseEvent e){
		        	hinzufügen.hover();
	        	}
		        public void mouseReleased(MouseEvent e){}
		        
		        public void mousePressed(MouseEvent e)
		        {
		        	HinzufügenOptionArea  hinzufügenoptionArea = new HinzufügenOptionArea();
		        	Var.mainLayout[1].north2.removeAll();
		    		Var.mainLayout[1].north2.add(hinzufügenoptionArea);
		    		Var.mainLayout[1].north2.revalidate();
		        }		
		        public void mouseClicked(MouseEvent e) 
		        {
		        	
		        }
		    });
	
		    HeaderButton noten = new HeaderButton("Noten", 60,30);
		    
			compCoords = null;		    
		    noten.addMouseListener(new MouseListener()
		    {
		    	public void mouseExited(MouseEvent e){
		    		noten.normal();
        		}
		        public void mouseEntered(MouseEvent e){
		        	noten.hover();
	        	}
		        public void mouseReleased(MouseEvent e){}
		        
		        public void mousePressed(MouseEvent e)
		        {
		            compCoords = e.getPoint();
		        }
		        
		        public void mouseClicked(MouseEvent e) 
		        {

		            Point currCoords = e.getLocationOnScreen();
		            dropdownNoten notendropdown = new dropdownNoten();
		        	
		            notendropdown.setLocation(currCoords.x - compCoords.x, currCoords.y - compCoords.y+29);

		            notendropdown.setPreferredSize(new Dimension (200,120));
		            notendropdown.setMaximumSize(new Dimension(200,120));
		            notendropdown.setMinimumSize(new Dimension(200,120));
		            notendropdown.setUndecorated(true);
		            notendropdown.setVisible(true);
		            
		    	    KeyboardFocusManager.getCurrentKeyboardFocusManager().addVetoableChangeListener("focusedWindow",new VetoableChangeListener()
		    	    {
		                  private boolean gained = false;

		                  @Override
		                  public void vetoableChange(PropertyChangeEvent evt)throws PropertyVetoException 
		                  {
		                    if (evt.getNewValue() == notendropdown) 
		                    {
		                      gained = true;
		    		        	noten.setBackground(Color.DARK_GRAY);
		    		        	noten.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		    		        	noten.setForeground(Color.WHITE);
		                    }
		                    if (gained && evt.getNewValue() != notendropdown)
		                    {
		                    	notendropdown.dispose();
		                    	noten.setBackground(Var.neutralGrau);
		                    	noten.setBorder(BorderFactory.createLineBorder(Var.neutralGrau));
		    		        	noten.setForeground(Color.DARK_GRAY);
		                    }
		                  }
		           });
		       }
		    });
			
	
		    HeaderButton hilfe = new HeaderButton("Hilfe", 60,30);
		    
			compCoords = null;		    
		    hilfe.addMouseListener(new MouseListener()
		    {
		    	public void mouseExited(MouseEvent e){
		    		hilfe.normal();
        		}
		        public void mouseEntered(MouseEvent e){
		        	hilfe.hover();
	        	}
		        public void mouseReleased(MouseEvent e){}
		        
		        public void mousePressed(MouseEvent e)
		        {
		        	HilfeOptionArea  hilfeOptionArea = new HilfeOptionArea();
		        	Var.mainLayout[1].north2.removeAll();
		    		Var.mainLayout[1].north2.add(hilfeOptionArea);
		    		Var.mainLayout[1].north2.revalidate();
		        }		
		        public void mouseClicked(MouseEvent e) 
		        {
		        	
		        }
		    });

		add(datei);
		add(start);
		add(bearbeiten);
		add(ansicht);
		add(hinzufügen);
		add(noten);
		add(hilfe);

	/*	
		Programmfenster.Oben.add(datei);
		Programmfenster.Oben.add(bearbeiten);
		Programmfenster.Oben.add(ansicht);
		Programmfenster.Oben.add(hinzufügen);
		Programmfenster.Oben.add(noten);
		Programmfenster.Oben.add(hilfe);
		
		System.out.println(Programmfenster.Oben.getComponentCount());
		
	*/
	}
}
