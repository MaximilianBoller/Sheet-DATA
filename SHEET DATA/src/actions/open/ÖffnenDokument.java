package actions.open;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import HauptPackage.*;


import actions.WActions.AcEmptyPage;
import actions.WActions.AcEmptyWorkspace;
import actions.WActions.AcImageArea;
import actions.WActions.AcNotationArea;
import actions.WActions.AcTextArea;
import actions.setup.SetupProgram;
import funktionBundles.Funktion;
import funktionBundles.Var;
import obj.UIobj.footer.Footer;
import obj.UIobj.workspace.Workspace;
import rumpelkiste.NotenBlattLayOut;
import rumpelkiste.notenblattBausteine.notenpanel;

public class ÖffnenDokument 
{
	
	public static FileReader datei;
	
	public static void öffnen(String textdateiname) throws FileNotFoundException
	{
		datei = new FileReader(textdateiname);
		Var.logInfo = "öffnen...";
		Funktion.infoLogUpdate(1000);
		
		String inhalt = "";
		
		try
		{
			Var.mainLayout[1].Mitte.removeAll();
			
			BufferedReader br = new BufferedReader(datei);
			
			String zeile = br.readLine();
			
			for(int i = 0; i<= 2000; i++)
			{
				inhalt = inhalt + zeile + "\n";
				
				if(zeile.contentEquals("<Properties>"))
				{		
					System.out.println("PROPERTIES");
					AcEmptyWorkspace.run();
				}
				
				else if(zeile.contentEquals("<project name>"))
				{
					System.out.println("//project name");
					Var.projectName = br.readLine();	
//			       	Footer.infos.setText(Var.projectName);
			       	Var.mainLayout[1].setTitle("Sheet/ " + Var.projectName);
				}
				
				else if(zeile.contentEquals("<page width>"))
				{		
					System.out.println("//project page width");
					Var.pageWidth = Integer.parseInt(br.readLine());
				}		
				
				else if(zeile.contentEquals("<page height>"))
				{	
					System.out.println("//project page height");
					Var.pageHeight = Integer.parseInt(br.readLine());
				}
				
				else if(zeile.contentEquals("<page border>"))
				{	
					System.out.println("//project page border");
					Var.pageBorder = Integer.parseInt(br.readLine());
				}
				
				else if(zeile.contentEquals("[EmptyPage]"))
				{	
					AcEmptyPage.run(br.readLine());
				}
				
				else if(zeile.contentEquals("[TextArea]"))
				{							
					AcTextArea.run(br.readLine(),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),Float.parseFloat(br.readLine()),br.readLine(),br.readLine());
				}
				
				else if(zeile.contentEquals("[ImageArea]"))
				{							
					AcImageArea.run(br.readLine(),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()));
				}
				
				else if(zeile.contentEquals("[NotationArea]"))
				{							
					AcNotationArea.run(Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()));
				}
				
				
				
				

				
				
				
				
				
				
				
				
				
				
				else if(zeile.contentEquals("<Untertitel:"))
				{			
					System.out.println("<Untertitel");
					Var.Untertitel = br.readLine();	
				}
				
				else if(zeile.contentEquals("<Tempo:"))
				{			
					System.out.println("<Tempo");
					Var.Tempo = br.readLine();	
				}
				
				else if(zeile.contentEquals("<Komponist:"))
				{			
					System.out.println("<Komponist");
					Var.Komponist = br.readLine();	
				}
				
				else if(zeile.contentEquals("<Notenanzahl:"))
				{			
					Var.notenAnzahlInt = Integer.parseInt(br.readLine());
					System.out.println("<Notenanzahl " + Var.notenAnzahlInt);

				}
				
				else if(zeile.contentEquals("Notenlinienanzahl"))
				{	
					System.out.println("<Notenlinieerstellen");
					
					Var.NotenLinienAnzahlÖffnen = Integer.parseInt(br.readLine());
					
					
					for(int b = 0; b < Var.NotenLinienAnzahlÖffnen / Integer.parseInt(Var.instrumentAnzahl); ++b)
					{
						rumpelkiste.AcMusicalStaff.run();
					}

					
//					Var.NotenLinienAnzahlÖffnen = Integer.parseInt(br.readLine());
					
				}
				
				
				
				else if(zeile.contentEquals("<Notenlinie"))
				{	

					Var.notenlinien[Var.EinstellungsLäufer].schlüssel = br.readLine();
					Var.notenlinien[Var.EinstellungsLäufer].vorzeichen = br.readLine();
					Var.notenlinien[Var.EinstellungsLäufer].zählzeit = br.readLine();
					Var.notenlinien[Var.EinstellungsLäufer].xPosition = Integer.parseInt(br.readLine());
					
					
					Var.EinstellungsLäufer = Var.EinstellungsLäufer +1;
				}
				
				else if(zeile.contentEquals("<Note"))
				{	

					System.out.println("<Note");
					
					int höhe = Integer.parseInt(br.readLine());
					int länge = Integer.parseInt(br.readLine());
					String Notenwert = br.readLine();
					int x = Integer.parseInt(br.readLine());
					int y = Integer.parseInt(br.readLine());
					String Art = br.readLine();
					String Vorzeichen = br.readLine();
					
					
					System.out.println( höhe);
					System.out.println( länge);
					System.out.println( Notenwert);
					System.out.println(x);
					System.out.println(y);
					System.out.println( Art);


					notenpanel Note = new notenpanel(höhe,länge, Art, Notenwert, Vorzeichen);	
					Var.notenArray[Var.Notenwiederherstellen] = Note;
				
					
					Var.notenArray[Var.Notenwiederherstellen].setBounds(x, y, länge, 200);
					Var.notenArray[Var.Notenwiederherstellen].setVisible(true);
					Var.notenBlattHintergrundArray[1].setLayer(Var.notenArray[Var.Notenwiederherstellen], 4); 
					Var.notenBlattHintergrundArray[1].add(Var.notenArray[Var.Notenwiederherstellen]);
					
					Var.Notenwiederherstellen = Var.Notenwiederherstellen + 1;
				}
				
				zeile = br.readLine();

				if(zeile == null)
				{
					break;
				}
			
			}
			br.close();
			


		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		Var.ProjectLOG = inhalt;
		
		Var.projectData[1].update();

	}
}
