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
		
		JPanel fu�zeile = new JPanel();
		fu�zeile.setPreferredSize(new Dimension(600,30));
		fu�zeile.setVisible(true);
		fu�zeile.setBackground(Color.DARK_GRAY);
		fu�zeile.setBounds(0,331,600,31);
		hintergrund.setLayer(fu�zeile, 1); 
		hintergrund.add(fu�zeile);
		
    	hintergrund.setBackground(Color.WHITE);
		hintergrund.setVisible(true);
		add(hintergrund, BorderLayout.CENTER);
    	
		setVisible(true);
	}
}