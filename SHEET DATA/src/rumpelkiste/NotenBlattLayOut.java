package rumpelkiste;


import java.awt.Dimension;


import funktionBundles.Var;
import rumpelkiste.notenblattBausteine.Komponist;
import rumpelkiste.notenblattBausteine.Tempo;
import rumpelkiste.notenblattBausteine.Titel;
import rumpelkiste.notenblattBausteine.Untertitel;


public class NotenBlattLayOut 
{
	
	public static void neu()
	{
		
		System.out.println(Var.blattAnzahl);

		
		if(Var.blattAnzahl == 1)
		{
			NotenBlattHintergrund notenBlattHintergrund = new NotenBlattHintergrund();
			NotenBlatt notenBlatt = new NotenBlatt(Var.blattAnzahl);
			Label hintergrundBild = new Label();
			
			
			Var.notenBlattHintergrundArray[Var.blattAnzahl]= notenBlattHintergrund;
			Var.NotenBlätter[Var.blattAnzahl] = notenBlatt;
			Var.hintergrundbild[Var.blattAnzahl] = hintergrundBild;
			
			
			Var.hintergrundbild[Var.blattAnzahl].setBounds(0,0,Var.arbeitsbereichbreite,Var.arbeitsbereichhöhe);
			Var.notenBlattHintergrundArray[Var.blattAnzahl].setBounds(0, 0,Var.arbeitsbereichbreite,Var.arbeitsbereichhöhe);
			Var.NotenBlätter[Var.blattAnzahl].setBounds(0, 0,Var.arbeitsbereichbreite,Var.arbeitsbereichhöhe);
			
			
			
			
			
			Var.hintergrundbild[Var.blattAnzahl].setVisible(true);
		    Var.notenBlattHintergrundArray[Var.blattAnzahl].setVisible(true);
			Var.NotenBlätter[Var.blattAnzahl].setVisible(true);
		    
		    
		    
			
			Var.notenBlattHintergrundArray[Var.blattAnzahl].setLayer(Var.hintergrundbild[Var.blattAnzahl], 1);
			Var.notenBlattHintergrundArray[Var.blattAnzahl].setLayer(Var.NotenBlätter[Var.blattAnzahl], 2);


			


			Var.notenBlattHintergrundArray[Var.blattAnzahl].add(Var.hintergrundbild[Var.blattAnzahl]);		
		    Var.notenBlattHintergrundArray[Var.blattAnzahl].add(Var.NotenBlätter[Var.blattAnzahl]);			


		    
		    
		    
		    //--------------------------------------------------
		    Var.draggableworkspace[1].drag.setLayer(Var.notenBlattHintergrundArray[Var.blattAnzahl], 1);
		    Var.draggableworkspace[1].drag.add(Var.notenBlattHintergrundArray[Var.blattAnzahl]);
		    
			//Var.NotenBlattScrolls[1].arbeitsbereich.setLayer(Var.notenBlattHintergrundArray[Var.blattAnzahl], 1);
		    //Var.NotenBlattScrolls[1].arbeitsbereich.add(Var.notenBlattHintergrundArray[Var.blattAnzahl]);	
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
			Titel titel1 = new Titel();
			titel1.setPreferredSize(new Dimension(1300,80));
			titel1.setBounds(380,100,1300,80);
			titel1.setVisible(true);
			Var.titel[1] = titel1;
			
			Var.notenBlattHintergrundArray[1].setLayer(Var.titel[1], 2); 
			Var.notenBlattHintergrundArray[1].add(Var.titel[1]);
			

			
			Untertitel untertitel = new Untertitel();
			untertitel.setPreferredSize(new Dimension(600,80));
			untertitel.setBounds(380,200,600,80);
			Var.untertitel[1]= untertitel;
			
			Var.notenBlattHintergrundArray[1].setLayer(Var.untertitel[1], 2); 
			Var.notenBlattHintergrundArray[1].add(Var.untertitel[1]);
			
			
			
			Tempo tempo = new Tempo();
			tempo.setPreferredSize(new Dimension(600,60));
			tempo.setBounds(380,300,600,60);
			Var.tempo[1] = tempo;
			
			Var.notenBlattHintergrundArray[1].setLayer(Var.tempo[1], 2); 
			Var.notenBlattHintergrundArray[1].add(Var.tempo[1]);
			
			
			
			
			
			Komponist komponist = new Komponist();
			komponist.setPreferredSize(new Dimension(640,60));
			komponist.setBounds(1040,300,640,60);
			Var.komponist[1] = komponist;
			
			Var.notenBlattHintergrundArray[1].setLayer(Var.komponist[1] , 2); 
			Var.notenBlattHintergrundArray[1].add(Var.komponist[1] );
			
			
/*			
			InfoText info = new InfoText();
			info.setPreferredSize(new Dimension(240,260));
			info.setBounds(100,100,240,260);
			Var.infotext[1] = info;
			
			Var.notenBlattHintergrundArray[1].setLayer(Var.infotext[1] , 2); 
			Var.notenBlattHintergrundArray[1].add(Var.infotext[1] );
			
*/			
			

			
			int topmargin = 400;
			
			
			
			
			
			
			
			


			
			
			
			
			
			
			
			
			
			Var.blattAnzahl = Var.blattAnzahl + 1;
			Var.Seitenzahl = Var.Seitenzahl + 1;
		}
	}
}