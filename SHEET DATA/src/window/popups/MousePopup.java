package window.popups;

import java.awt.Color;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.Popup;
import javax.swing.PopupFactory;

import com.sun.jdi.event.Event;

import funktionBundles.Var;

public class MousePopup extends JLabel
{
	public static Popup popup;
	
	public static void run(MouseEvent e, String message)
	{
		
		if (popup != null) 
    	{
            popup.hide();
        }
		
        JLabel text = new JLabel(message);
        text.setOpaque(true);
        text.setBackground(Color.LIGHT_GRAY);
		text.setForeground(Var.PrimColor);
		text.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Var.SekColor));
        popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), text, (int)e.getComponent().getLocationOnScreen().getX(), (int)Var.mainLayout[1].getLocationOnScreen().getY() + 153);
        
        
        popup.show();
	}
}
