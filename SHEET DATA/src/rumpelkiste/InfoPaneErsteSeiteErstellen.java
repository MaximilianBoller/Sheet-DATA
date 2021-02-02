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

		String anweisung = "Drücken Sie dafür unter (Hinzufügen) auf:";
//		String anweisung1 = "(Noten-Seite Hinzufügen) um eine Notierbare Seite hinzuzufügen."; 
//		String anweisung2 = "(Text-Seite Hinzufügen) um eine beschreibbare Seite hinzuzufügen.";
		

		Text.setEditable(false);
		Text.setFont(Var.standartFont25);
		Text.setText("  Erstellen Sie ihre Partitur!\n\n Gehen sie dafür unter (Hinzufügen) auf:\n  (Noten-Seite Hinzufügen) um eine Notierbare Seite hinzuzufügen.");
		add(Text);
		setVisible(true);
	}

}
