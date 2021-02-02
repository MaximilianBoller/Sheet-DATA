package actions.WActions;

import java.awt.Dimension;

import HauptPackage.MainLayout;
import funktionBundles.Var;
import rumpelkiste.notenblattBausteine.notenpanel;

public class AcNote
{
	public static void ausführen(int Notenliniennummer, int anfangshöhe)
	{
		if(Var.notenWert1)
		{
			int notenlänge = 200;
			
			System.out.println("AcNote Werkzeug: " + Var.werkzeug);
			
			notenpanel Note = new notenpanel(anfangshöhe, notenlänge, Var.werkzeug,"Note1", "");
//			Note.note1 = true;
			Note.setPreferredSize(new Dimension(notenlänge,200));
			
			System.out.println(Var.notenlinien[Notenliniennummer].getY());	
			System.out.println("Notenliniennummer:" + Notenliniennummer);
			
			Var.notenArray[Var.notenAnzahlInt] = Note;
			Var.notenArray[Var.notenAnzahlInt].setBounds(Var.notenlinien[Notenliniennummer].xPosition, Var.notenlinien[Notenliniennummer].getY(), notenlänge, 200);
			Var.notenArray[Var.notenAnzahlInt].setVisible(true);
			Var.notenBlattHintergrundArray[1].setLayer(Var.notenArray[Var.notenAnzahlInt], 4); 
			Var.notenBlattHintergrundArray[1].add(Var.notenArray[Var.notenAnzahlInt]);
			Var.notenlinien[Notenliniennummer].xPosition = Var.notenlinien[Notenliniennummer].xPosition + notenlänge;
			Var.notenAnzahlInt = Var.notenAnzahlInt + 1;
			
			System.out.println("Var.notenAnzahlInt :" + Var.notenAnzahlInt);
		}
		
		else if(Var.notenWert2)
		{
			int notenlänge = 100;
			
			System.out.println("AcNote Werkzeug: " + Var.werkzeug);
			
			notenpanel Note = new notenpanel(anfangshöhe, notenlänge, Var.werkzeug,"Note1_2", "");
//			Note.note1_2 = true;
			Note.setPreferredSize(new Dimension(notenlänge,200));
			
			System.out.println(Var.notenlinien[Notenliniennummer].getY());	
			System.out.println("Notenliniennummer:" + Notenliniennummer);
			
			Var.notenArray[Var.notenAnzahlInt] = Note;
			Var.notenArray[Var.notenAnzahlInt].setBounds(Var.notenlinien[Notenliniennummer].xPosition, Var.notenlinien[Notenliniennummer].getY(), notenlänge, 200);
			Var.notenArray[Var.notenAnzahlInt].setVisible(true);
			Var.notenBlattHintergrundArray[1].setLayer(Var.notenArray[Var.notenAnzahlInt], 4); 
			Var.notenBlattHintergrundArray[1].add(Var.notenArray[Var.notenAnzahlInt]);
			Var.notenlinien[Notenliniennummer].xPosition = Var.notenlinien[Notenliniennummer].xPosition + notenlänge;
			Var.notenAnzahlInt = Var.notenAnzahlInt + 1;
			
			System.out.println("Var.notenAnzahlInt :" + Var.notenAnzahlInt);

			
			
			/*			
			int notenlänge = 100;
			
			notenpanel Note = new notenpanel(anfangshöhe, notenlänge, Var.werkzeug);
			Note.note1_2 = true;
			Note.setPreferredSize(new Dimension(notenlänge,200));
			Note.setBounds(Var.XPosition, 400, notenlänge, 200);
			Var.notenBlattHintergrundArray[Notenliniennummer].setLayer(Note, 4); 
			Var.notenBlattHintergrundArray[Notenliniennummer].add(Note);
			Var.XPosition = Var.XPosition + notenlänge;	
			
			Var.notenAnzahlInt = Var.notenAnzahlInt + 1;
			Var.notenArray[Var.notenAnzahlInt] = Note;
			System.out.println("Var.notenAnzahlInt :" + Var.notenAnzahlInt);
			*/
			
			
			
		}
		
		else if(Var.notenWert4)
		{
			int notenlänge = 60;
			
			System.out.println("AcNote Werkzeug: " + Var.werkzeug);
			
			notenpanel Note = new notenpanel(anfangshöhe, notenlänge, Var.werkzeug, "Note1_4", "");
//			Note.note1_4 = true;
			Note.setPreferredSize(new Dimension(notenlänge,200));
			
			System.out.println(Var.notenlinien[Notenliniennummer].getY());	
			System.out.println("Notenliniennummer:" + Notenliniennummer);
			
			Var.notenArray[Var.notenAnzahlInt] = Note;
			Var.notenArray[Var.notenAnzahlInt].setBounds(Var.notenlinien[Notenliniennummer].xPosition, Var.notenlinien[Notenliniennummer].getY(), notenlänge, 200);
			Var.notenArray[Var.notenAnzahlInt].setVisible(true);
			Var.notenBlattHintergrundArray[1].setLayer(Var.notenArray[Var.notenAnzahlInt], 4); 
			Var.notenBlattHintergrundArray[1].add(Var.notenArray[Var.notenAnzahlInt]);
			Var.notenlinien[Notenliniennummer].xPosition = Var.notenlinien[Notenliniennummer].xPosition + notenlänge;
			Var.notenAnzahlInt = Var.notenAnzahlInt + 1;
			
			System.out.println("Var.notenAnzahlInt :" + Var.notenAnzahlInt);
		}
		
		else if(Var.notenWert8)
		{
			int notenlänge = 40;
			
			System.out.println("AcNote Werkzeug: " + Var.werkzeug);
			
			notenpanel Note = new notenpanel(anfangshöhe, notenlänge, Var.werkzeug, "Note1_8" ,"");
//			Note.note1_8 = true;
			Note.setPreferredSize(new Dimension(notenlänge,200));
			
			System.out.println(Var.notenlinien[Notenliniennummer].getY());	
			System.out.println("Notenliniennummer:" + Notenliniennummer);
			
			Var.notenArray[Var.notenAnzahlInt] = Note;
			Var.notenArray[Var.notenAnzahlInt].setBounds(Var.notenlinien[Notenliniennummer].xPosition, Var.notenlinien[Notenliniennummer].getY(), notenlänge, 200);
			Var.notenArray[Var.notenAnzahlInt].setVisible(true);
			Var.notenBlattHintergrundArray[1].setLayer(Var.notenArray[Var.notenAnzahlInt], 4); 
			Var.notenBlattHintergrundArray[1].add(Var.notenArray[Var.notenAnzahlInt]);
			Var.notenlinien[Notenliniennummer].xPosition = Var.notenlinien[Notenliniennummer].xPosition + notenlänge;
			Var.notenAnzahlInt = Var.notenAnzahlInt + 1;
			
			System.out.println("Var.notenAnzahlInt :" + Var.notenAnzahlInt);
		}
		
		else if(Var.notenWert16)
		{
			int notenlänge = 40;
			
			System.out.println("AcNote Werkzeug: " + Var.werkzeug);
			
			notenpanel Note = new notenpanel(anfangshöhe, notenlänge, Var.werkzeug, "Note1_16", "");
//			Note.note1_16 = true;
			Note.setPreferredSize(new Dimension(notenlänge,200));
			
			System.out.println(Var.notenlinien[Notenliniennummer].getY());	
			System.out.println("Notenliniennummer:" + Notenliniennummer);
			
			Var.notenArray[Var.notenAnzahlInt] = Note;
			Var.notenArray[Var.notenAnzahlInt].setBounds(Var.notenlinien[Notenliniennummer].xPosition, Var.notenlinien[Notenliniennummer].getY(), notenlänge, 200);
			Var.notenArray[Var.notenAnzahlInt].setVisible(true);
			Var.notenBlattHintergrundArray[1].setLayer(Var.notenArray[Var.notenAnzahlInt], 4); 
			Var.notenBlattHintergrundArray[1].add(Var.notenArray[Var.notenAnzahlInt]);
			Var.notenlinien[Notenliniennummer].xPosition = Var.notenlinien[Notenliniennummer].xPosition + notenlänge;
			Var.notenAnzahlInt = Var.notenAnzahlInt + 1;
			
			System.out.println("Var.notenAnzahlInt :" + Var.notenAnzahlInt);
		}
		
		else if(Var.notenWert32)
		{
			int notenlänge = 40;
			
			System.out.println("AcNote Werkzeug: " + Var.werkzeug);
			
			notenpanel Note = new notenpanel(anfangshöhe, notenlänge, Var.werkzeug, "Note1_32", "");
//			Note.note1_32 = true;
			Note.setPreferredSize(new Dimension(notenlänge,200));
			
			System.out.println(Var.notenlinien[Notenliniennummer].getY());	
			System.out.println("Notenliniennummer:" + Notenliniennummer);
			
			Var.notenArray[Var.notenAnzahlInt] = Note;
			Var.notenArray[Var.notenAnzahlInt].setBounds(Var.notenlinien[Notenliniennummer].xPosition, Var.notenlinien[Notenliniennummer].getY(), notenlänge, 200);
			Var.notenArray[Var.notenAnzahlInt].setVisible(true);
			Var.notenBlattHintergrundArray[1].setLayer(Var.notenArray[Var.notenAnzahlInt], 4); 
			Var.notenBlattHintergrundArray[1].add(Var.notenArray[Var.notenAnzahlInt]);
			Var.notenlinien[Notenliniennummer].xPosition = Var.notenlinien[Notenliniennummer].xPosition + notenlänge;
			Var.notenAnzahlInt = Var.notenAnzahlInt + 1;
			
			System.out.println("Var.notenAnzahlInt :" + Var.notenAnzahlInt);

		}
		else if(Var.werkzeug.contentEquals("Takt"))
		{
			int notenlänge = 40;
			
			System.out.println("AcNote Werkzeug: " + Var.werkzeug);
			
			notenpanel Note = new notenpanel(anfangshöhe, notenlänge, Var.werkzeug, "", "");

			Note.setPreferredSize(new Dimension(notenlänge,200));
			
			System.out.println(Var.notenlinien[Notenliniennummer].getY());	
			System.out.println("Notenliniennummer:" + Notenliniennummer);
			
			Var.notenArray[Var.notenAnzahlInt] = Note;
			Var.notenArray[Var.notenAnzahlInt].setBounds(Var.notenlinien[Notenliniennummer].xPosition, Var.notenlinien[Notenliniennummer].getY(), notenlänge, 200);
			Var.notenArray[Var.notenAnzahlInt].setVisible(true);
			Var.notenBlattHintergrundArray[1].setLayer(Var.notenArray[Var.notenAnzahlInt], 4); 
			Var.notenBlattHintergrundArray[1].add(Var.notenArray[Var.notenAnzahlInt]);
			Var.notenlinien[Notenliniennummer].xPosition = Var.notenlinien[Notenliniennummer].xPosition + notenlänge;
			Var.notenAnzahlInt = Var.notenAnzahlInt + 1;
			
			System.out.println("Var.notenAnzahlInt :" + Var.notenAnzahlInt);
		}
		
		
		
		else
		{
			return;
		}
	}
}
