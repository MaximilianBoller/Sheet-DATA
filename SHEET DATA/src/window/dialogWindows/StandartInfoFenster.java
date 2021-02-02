package window.dialogWindows;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.*;


public class StandartInfoFenster extends JFrame 
{
	public static JLayeredPane hintergrund = new JLayeredPane();
	public static Insets insets = hintergrund.getInsets();
	
	public StandartInfoFenster()
	{
		
		setTitle("Standart Info Fenster");
		setSize(600, 400);
//		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new BorderLayout());
		
		JPanel fuﬂzeile = new JPanel();
		fuﬂzeile.setPreferredSize(new Dimension(600,30));
		fuﬂzeile.setVisible(true);
		fuﬂzeile.setBackground(Color.DARK_GRAY);
		fuﬂzeile.setBounds(0,331,600,31);
		hintergrund.setLayer(fuﬂzeile, 1); 
		hintergrund.add(fuﬂzeile);
		
    	hintergrund.setBackground(Color.WHITE);
		hintergrund.setVisible(true);
		add(hintergrund, BorderLayout.CENTER);
    	
		setVisible(true);
	}
}