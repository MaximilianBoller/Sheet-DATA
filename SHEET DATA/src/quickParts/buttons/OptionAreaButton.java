package quickParts.buttons;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

import actions.WActions.AcEmptyPage;
import funktionBundles.Var;
import funktionBundles.getStringLength;
import window.popups.MousePopup;

public class OptionAreaButton extends JButton
{
	public boolean popup;
	public String Text;
	public Timer timer;
	
	public OptionAreaButton(String title, int SizeY, int BoundX, int BoundY, String message)
	{
		this.Text = message;
		setText(title);
		setFont(Var.OpenSans12);
		setSize(getStringLength.run(title, getFont()) + 20, SizeY);
		setPreferredSize(new Dimension(getStringLength.run(title, getFont()) + 20, SizeY));
		setBounds(BoundX, BoundY, getStringLength.run(title, getFont()) + 20 , SizeY );
		
		setBackground(Var.PrimColor);
		setForeground(Var.PrimTextColor);
		setBorder(BorderFactory.createMatteBorder(1,1,1,1,Var.SekColor));
		addMouseListener(new MouseAdapter()
	    {
	        public void mouseEntered(MouseEvent e)
	        {
	        	if(popup)
	        	{
	        		showPopup(e);
		        	
	        	}
	        	setBackground(Var.SekColor);

	        }
	        
	        public void mouseExited(MouseEvent e)
	        {
	        	if(popup)
	        	{
	        		hidePopup(e);
	        	}
	        	
	        	setBackground(Var.PrimColor);

	        }
	    });
	}
	
	public void popup(boolean state, String Text)
	{
		this.Text = Text;
		popup = state;
	}
	
	public void showPopup(MouseEvent e)
	{
		MousePopup.run(e, Text);
	}
	
	public void hidePopup(MouseEvent e)
	{
    	MousePopup.popup.hide();
	}
}
