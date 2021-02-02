package window.dialogWindows;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.KeyboardFocusManager;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


import funktionBundles.Var;


public class dialogWindowLog
{
	public static void LogFenster()
	{
		JFrame frame = new JFrame("Notiz");
		frame.setPreferredSize(new Dimension(500, 1000));
		frame.setMinimumSize(new Dimension(500, 1000));
		frame.setMaximumSize(new Dimension(500, 1000));
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
//		frame.setLayout(null);
		frame.pack();

		JPanel pane = new JPanel();
		pane.setLayout(new java.awt.BorderLayout() );
		
		
		
		
//		frame.setUndecorated(true);
		
		JTextArea textarea;
		JTextArea zeilennummern;
		
		zeilennummern = new JTextArea("",1,1);
		zeilennummern.setFont(Var.standartFont15);
		zeilennummern.setLineWrap(true);
		zeilennummern.setBackground(Color.WHITE);
		zeilennummern.setForeground(Color.BLACK);
		zeilennummern.setPreferredSize(new Dimension(20,10));
		zeilennummern.setEditable(false);
		
		
		textarea = new JTextArea("", 1, 5);
		textarea.setFont(Var.standartFont15);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(Color.DARK_GRAY);
		textarea.setForeground(Color.WHITE);
		
		textarea.setText(Var.ProjectLOG);
		KeyboardFocusManager.getCurrentKeyboardFocusManager().
        addVetoableChangeListener( "focusedWindow",new VetoableChangeListener() 
        {
	         private boolean gained = false;
	
	         public void vetoableChange( PropertyChangeEvent evt ) throws PropertyVetoException 
	         {
	           if ( evt.getNewValue() == frame ) 
	           {
	             gained = true;
	           }
	           if ( gained && evt.getNewValue() != frame ) 
	           {
	        	   textarea.setText(Var.ProjectLOG);
	           }
	         }
	    } );
		
		String zeilennummer = "1";
		
		
		for(int i = 2; i<= 999; ++i)
		{
			zeilennummer = zeilennummer + "\n" + i;
		}
		
		zeilennummern.setText(zeilennummer);
		
		pane.add(textarea, java.awt.BorderLayout.CENTER);
		pane.add(zeilennummern, java.awt.BorderLayout.WEST);
		
		JScrollPane scroll = new JScrollPane(pane,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		

		frame.add(scroll);

		frame.setVisible(true);
		
		return;
	}
}

