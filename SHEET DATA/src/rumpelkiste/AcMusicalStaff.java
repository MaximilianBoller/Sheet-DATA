package rumpelkiste;

import java.awt.Color;

import funktionBundles.Var;
import obj.Wobj.notationarea.NotenLinie;
import obj.Wobj.notationarea.NotenLinienEinstellungen;
import rumpelkiste.notenblattBausteine.Schweif;

public class AcMusicalStaff 
{
	public static void run()
	{	
		if(Integer.parseInt(Var.instrumentAnzahl) == 1)
		{
			if(Var.notenLinienAnzahl <=1)
			{
				// Erster eingerückter Schweif:
				Schweif schweif = new Schweif("1Anfang");
				schweif.setBounds(300,Var.notenLinienYwert,40,200);
				Var.notenBlattHintergrundArray[1].setLayer(schweif, 3); 
				Var.notenBlattHintergrundArray[1].add(schweif);
				
				Schweif schweifEnde = new Schweif("1Ende");
				schweifEnde.setBounds(1660,Var.notenLinienYwert,20,200);
				Var.notenBlattHintergrundArray[1].setLayer(schweifEnde, 3); 
				Var.notenBlattHintergrundArray[1].add(schweifEnde);
				
			}
			
			else
			{
				//Alle darauf Folgende Schweife:
				Schweif schweif = new Schweif("1Anfang");
				schweif.setBounds(100,Var.notenLinienYwert,40,200);
				Var.notenBlattHintergrundArray[1].setLayer(schweif, 3); 
				Var.notenBlattHintergrundArray[1].add(schweif);
				
				Schweif schweifEnde = new Schweif("1Ende");
				schweifEnde.setBounds(1660,Var.notenLinienYwert,20,200);
				Var.notenBlattHintergrundArray[1].setLayer(schweifEnde, 3); 
				Var.notenBlattHintergrundArray[1].add(schweifEnde);
			}
		}
		
		
		
		
		if(Integer.parseInt(Var.instrumentAnzahl) == 2)
		{
			if(Var.notenLinienAnzahl <=2)
			{
				// Erster eingerückter Schweif:
				Schweif schweif = new Schweif("2Anfang");
				schweif.setBounds(300,Var.notenLinienYwert,40,420);
				Var.notenBlattHintergrundArray[1].setLayer(schweif, 3); 
				Var.notenBlattHintergrundArray[1].add(schweif);
				
				Schweif schweifEnde = new Schweif("2Ende");
				schweifEnde.setBounds(1660,Var.notenLinienYwert,20,420);
				Var.notenBlattHintergrundArray[1].setLayer(schweifEnde, 3); 
				Var.notenBlattHintergrundArray[1].add(schweifEnde);
			}
			
			else
			{
				//Alle darauf Folgende Schweife:
				Schweif schweif = new Schweif("2Anfang");
				schweif.setBounds(100,Var.notenLinienYwert,40,420);
				Var.notenBlattHintergrundArray[1].setLayer(schweif, 3); 
				Var.notenBlattHintergrundArray[1].add(schweif);
				
				Schweif schweifEnde = new Schweif("2Ende");
				schweifEnde.setBounds(1660,Var.notenLinienYwert,20,420);
				Var.notenBlattHintergrundArray[1].setLayer(schweifEnde, 3); 
				Var.notenBlattHintergrundArray[1].add(schweifEnde);
			}
		}
		
		if(Integer.parseInt(Var.instrumentAnzahl) == 3)
		{
			if(Var.notenLinienAnzahl <=3)
			{
				// Erster eingerückter Schweif:
				Schweif schweif = new Schweif("3Anfang");
				schweif.setBounds(300,Var.notenLinienYwert,40,640);
				Var.notenBlattHintergrundArray[1].setLayer(schweif, 3); 
				Var.notenBlattHintergrundArray[1].add(schweif);
				
				Schweif schweifEnde = new Schweif("3Ende");
				schweifEnde.setBounds(1660,Var.notenLinienYwert,20,640);
				Var.notenBlattHintergrundArray[1].setLayer(schweifEnde, 3); 
				Var.notenBlattHintergrundArray[1].add(schweifEnde);
			}
			
			else
			{
				//Alle darauf Folgende Schweife:
				Schweif schweif = new Schweif("3Anfang");
				schweif.setBounds(100,Var.notenLinienYwert,40,640);
				Var.notenBlattHintergrundArray[1].setLayer(schweif, 3); 
				Var.notenBlattHintergrundArray[1].add(schweif);
				
				Schweif schweifEnde = new Schweif("3Ende");
				schweifEnde.setBounds(1660,Var.notenLinienYwert,20,640);
				Var.notenBlattHintergrundArray[1].setLayer(schweifEnde, 3); 
				Var.notenBlattHintergrundArray[1].add(schweifEnde);
			}
		}
		
		if(Integer.parseInt(Var.instrumentAnzahl) == 4)
		{
			if(Var.notenLinienAnzahl <=4)
			{
				// Erster eingerückter Schweif:
				Schweif schweif = new Schweif("4Anfang");
				schweif.setBounds(300,Var.notenLinienYwert,40,860);
				Var.notenBlattHintergrundArray[1].setLayer(schweif, 3); 
				Var.notenBlattHintergrundArray[1].add(schweif);
				
				Schweif schweifEnde = new Schweif("4Ende");
				schweifEnde.setBounds(1660,Var.notenLinienYwert,20,860);
				Var.notenBlattHintergrundArray[1].setLayer(schweifEnde, 3); 
				Var.notenBlattHintergrundArray[1].add(schweifEnde);
			}
			
			else
			{
				//Alle darauf Folgende Schweife:
				Schweif schweif = new Schweif("4Anfang");
				schweif.setBounds(100,Var.notenLinienYwert,40,860);
				Var.notenBlattHintergrundArray[1].setLayer(schweif, 3); 
				Var.notenBlattHintergrundArray[1].add(schweif);
				
				Schweif schweifEnde = new Schweif("4Ende");
				schweifEnde.setBounds(1660,Var.notenLinienYwert,20,860);
				Var.notenBlattHintergrundArray[1].setLayer(schweifEnde, 3); 
				Var.notenBlattHintergrundArray[1].add(schweifEnde);
			}
		}

		
		for(int i = 0; i<Integer.parseInt(Var.instrumentAnzahl); ++i)
		{
			
			if(Var.notenLinienAnzahl <= Integer.parseInt(Var.instrumentAnzahl))
			{

				
				NotenLinie linie = new NotenLinie(Var.notenLinienAnzahl, "", "", "", 0, 600);
				linie.setBounds(340,Var.notenLinienYwert,1320,200);  
				Var.notenlinien[Var.notenLinienAnzahl] = linie;
				
				Var.notenBlattHintergrundArray[1].setLayer(Var.notenlinien[Var.notenLinienAnzahl], 2); 
				Var.notenBlattHintergrundArray[1].add(Var.notenlinien[Var.notenLinienAnzahl]);
				
				NotenLinienEinstellungen einstellungen = new NotenLinienEinstellungen(0,0,Var.notenLinienAnzahl);
				Var.notenLinienEinstelungen[Var.notenLinienAnzahl] = einstellungen;
				Var.notenLinienEinstelungen[Var.notenLinienAnzahl].hintergrund.setBackground(Color.BLACK);
				Var.notenLinienEinstelungen[Var.notenLinienAnzahl].dispose();
				
				Var.notenLinienAnzahl = Var.notenLinienAnzahl + 1;
				Var.notenLinienYwert = Var.notenLinienYwert + 220;
			}

			else
			{
				NotenLinie linie = new NotenLinie(Var.notenLinienAnzahl, Var.notenlinien[Var.mitläufer].schlüssel, "",Var.notenlinien[Var.mitläufer].vorzeichen,0,300);
				linie.setBounds(140,Var.notenLinienYwert,1520,200);        	
				Var.notenlinien[Var.notenLinienAnzahl] = linie;
				
				Var.notenBlattHintergrundArray[1].setLayer(Var.notenlinien[Var.notenLinienAnzahl], 2); 
				Var.notenBlattHintergrundArray[1].add(Var.notenlinien[Var.notenLinienAnzahl]);
				
				NotenLinienEinstellungen einstellungen = new NotenLinienEinstellungen(0,0,Var.notenLinienAnzahl);
				Var.notenLinienEinstelungen[Var.notenLinienAnzahl] = einstellungen;
				Var.notenLinienEinstelungen[Var.notenLinienAnzahl].hintergrund.setBackground(Color.BLACK);
				Var.notenLinienEinstelungen[Var.notenLinienAnzahl].dispose();
				
				Var.notenLinienAnzahl = Var.notenLinienAnzahl + 1;
				Var.notenLinienYwert = Var.notenLinienYwert + 220;
				
				Var.mitläufer = Var.mitläufer + 1; 
			}
		}	
		
		Var.mitläufer = 1;
			

			
		Var.notenLinienYwert = Var.notenLinienYwert + 20;
		
		
		System.out.println("hello");
	}
}
