package actions.save;

import java.awt.Point;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


import funktionBundles.Var;

public class SaveProjectdataIntoLog 
{
	public static void run() throws Exception
	{

		// empty log
		Var.ProjectLOG = "";
		
		// write properties
		Var.ProjectLOG = Var.ProjectLOG + "<Properties>"
				+ "\n";
		Var.ProjectLOG = Var.ProjectLOG + "<name>"
				+ "\n";
		Var.ProjectLOG = Var.ProjectLOG + Var.projectName
				+ "\n";
		
		Var.ProjectLOG = Var.ProjectLOG + "<page width>"
				+ "\n";
		Var.ProjectLOG = Var.ProjectLOG + Var.pageWidth
				+ "\n";
		
		Var.ProjectLOG = Var.ProjectLOG + "<page height>"
				+ "\n";
		Var.ProjectLOG = Var.ProjectLOG + Var.pageHeight
				+ "\n";
		
		Var.ProjectLOG = Var.ProjectLOG + "<page border>"
				+ "\n";
		Var.ProjectLOG = Var.ProjectLOG + Var.pageBorder
				+ "\n";
		
		Var.ProjectLOG = Var.ProjectLOG + "<page count>"
				+ "\n";
		Var.ProjectLOG = Var.ProjectLOG + Var.pageCount
				+ "\n";
		
		
		
		
		
		// page properties
		for(int i = 1; i < Var.pageCount; ++i)
		{
			Var.ProjectLOG = Var.ProjectLOG + "[EmptyPage]"
					+ "\n";
			Var.ProjectLOG = Var.ProjectLOG + Var.pageHierarchy[i].title.getText()
					+ "\n";
		}
		
	
		// text area Properties
		for(int b = 1; b < Var.TextAreaCount; ++b)
		{
			Var.ProjectLOG = Var.ProjectLOG + Var.TextArea[b].getProperties();
		}
		
		// image area Properties
		for(int b = 1; b < Var.ImageAreaCount; ++b)
		{
			Var.ProjectLOG = Var.ProjectLOG + Var.ImageArea[b].getProperties();
		}
		
		// notation area Properties
		for(int b = 1; b < Var.NotationAreaCount; ++b)
		{
			Var.ProjectLOG = Var.ProjectLOG + Var.NotationArea[b].getProperties();
		}
		
		
		
		
		
		
		
		

		
		/* HIER ANFANG
		
		
		Var.log = Var.log + "Textobjekte:______"
				+ "\n";
		
		Var.log = Var.log + "<Projektname:\n"
				+ Var.projectName + "\n" +
				">" + "\n";
		
		Var.log = Var.log + "<Instrumentenanzahl:\n"
				+ Var.instrumentAnzahl + "\n" +
				">" + "\n";

		
		Var.log = Var.log + "<Titel:\n"
				+ Var.titel[1].text.getText() + "\n" +
				">" + "\n";
		
		Var.log = Var.log + "<Untertitel:\n"
				+ Var.untertitel[1].text.getText() + "\n" +
				">" + "\n";
		
		Var.log = Var.log + "<Tempo:\n"
				+ Var.tempo[1].text.getText() + "\n" +
				">" + "\n";
		
		Var.log = Var.log + "<Komponist:\n"
				+ Var.komponist[1].text.getText() + "\n" +
				">" + "\n";

		Var.log = Var.log + "<Arbeitsbereich Erstellen>"
				+ "\n";
		
		Var.log = Var.log + "NotenblattObjekte:______"
				+ "\n";
		
		Var.log = Var.log + "Notenlinienanzahl\n"
				+ Var.notenLinienAnzahl + "\n" +
				">" + "\n";
		
		Var.log = Var.log + "<Notenanzahl:\n"
				+ Var.notenAnzahlInt + "\n" +
				">" + "\n";
		
		//Abspeichern der Infos für die Notenlinien
		for(int i = 1; i < Var.notenLinienAnzahl; ++i)
		{
			Var.log = Var.log + Var.notenlinien[i].getinfo();
		}
		
		for(int i = 1; i < Var.notenAnzahlInt; ++i)
		{
			Var.log = Var.log + Var.notenArray[i].getinfo();
		}
		
//		Var.log = Var.log + "_projekt";
		
		
		//HIER ENDE
		*/

	}
}
