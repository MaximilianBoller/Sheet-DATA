package rumpelkiste;

import javax.swing.JFrame;
import javax.swing.JTextArea;


import funktionBundles.Var;


public class InfoPaneErsteSeiteErstellen extends JFrame
{	
	public JTextArea Text= new JTextArea();
	
	public InfoPaneErsteSeiteErstellen()
	{
		setTitle("Info");
		setUndecorated(false);

		String anweisung = "Dr�cken Sie daf�r unter (Hinzuf�gen) auf:";
//		String anweisung1 = "(Noten-Seite Hinzuf�gen) um eine Notierbare Seite hinzuzuf�gen."; 
//		String anweisung2 = "(Text-Seite Hinzuf�gen) um eine beschreibbare Seite hinzuzuf�gen.";
		

		Text.setEditable(false);
		Text.setFont(Var.standartFont25);
		Text.setText("  Erstellen Sie ihre Partitur!\n\n Gehen sie daf�r unter (Hinzuf�gen) auf:\n  (Noten-Seite Hinzuf�gen) um eine Notierbare Seite hinzuzuf�gen.");
		add(Text);
		setVisible(true);
	}

}
