package funktionBundles;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;

import HauptPackage.*;


import obj.UIobj.footer.Footer;
import obj.UIobj.header.Header;
import obj.UIobj.left.ClipboardDATA;
import obj.UIobj.left.LogView;
import obj.UIobj.left.ProjectDATA;
import obj.UIobj.right.ImageAreaHierarchy;
import obj.UIobj.right.NotationAreaHierarchy;
import obj.UIobj.right.PageHierarchy;
import obj.UIobj.right.TextAreaHierarchy;
import obj.UIobj.right.HierarchyPanel;
import obj.UIobj.workspace.WorkspaceProppertiesWindow;
import obj.UIobj.workspace.Workspace;
import obj.Wobj.ResizableComponentArea;
import obj.Wobj.imagearea.ImageAreaPropperties;
import obj.Wobj.imagearea.ImageArea;
import obj.Wobj.notationarea.NotationArea;
import obj.Wobj.notationarea.NotationAreaPropperties;
import obj.Wobj.notationarea.NotenLinie;
import obj.Wobj.notationarea.NotenLinienEinstellungen;
import obj.Wobj.page.emptyPage;
import obj.Wobj.textarea.TextAreaPropperties;

import obj.Wobj.textarea.TypefacePanel;
import obj.Wobj.textarea.TextArea;
import rumpelkiste.InfoPaneErsteSeiteErstellen;
import rumpelkiste.Label;
import rumpelkiste.NotenBlatt;
import rumpelkiste.NotenBlattHintergrund;
import rumpelkiste.addOnControlPanel;
import rumpelkiste.addOnPiano;
import rumpelkiste.notenblattBausteine.InfoText;
import rumpelkiste.notenblattBausteine.Komponist;
import rumpelkiste.notenblattBausteine.Schweif;
import rumpelkiste.notenblattBausteine.Tempo;
import rumpelkiste.notenblattBausteine.Titel;
import rumpelkiste.notenblattBausteine.Untertitel;
import rumpelkiste.notenblattBausteine.notenpanel;
import window.dialogWindows.dialogWindowNeuesProjektErstellen;
import window.dialogWindows.keyPianoinfo;
import window.viewports.PageViewer;
import obj.Wobj.Header_Footer.emptyHeader;

public class Var
{
	public static String standartTypeface = "Open Sans";
	// MAIN LAYOUT
	public static MainLayout mainLayout[] = new MainLayout[2];
	public static String filePath;

	public static PageHierarchy pageHierarchy[] = new PageHierarchy[100];

	
	public static Header header[] = new Header[2];
	public static Footer footer[] = new Footer[2];
	
	public static PageViewer pageViewer[] = new PageViewer[2];
	
	public static dialogWindowNeuesProjektErstellen neuesProjektErstellen[] = new dialogWindowNeuesProjektErstellen[2];
	
	public static Workspace[] draggableworkspace = new Workspace[2];
	
	public static emptyPage[] emptyPage = new emptyPage[100];
	public static emptyHeader[] emptyHeader = new emptyHeader[100];
	
	
	public static int pageXCoordinate = 0;
	public static int headerXCoordinate = 0;
	
	public static int pageXGap = 20;
	
	//Tool Acitve
	public static String ActiveTool;
	public static int ActivePage;
	
	//Maße

	
	public static int workspaceWidth = 0;
	public static int workspaceHeight = 0;
	
	public static int pageCount = 1;
	public static int headerCount = 1;
	public static int footerCount = 1;
	
	public static String activeTool;
	public static String recentTool = "selectTool";
	

	
	public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public static int screenWidth = (int) screenSize.getWidth();
	public static int screenHeight = (int) screenSize.getHeight();
	
	//OBJEKTE AUF DEN BLÄTTERN
	
	
	//TextArea
	public static TextArea[] TextArea = new TextArea[100];
	public static int TextAreaCount = 1;
	public static TextAreaPropperties[] TextAreaPropperties = new TextAreaPropperties[100];
	public static TextAreaHierarchy TextAreaHierarchy[] = new TextAreaHierarchy[100];

	
	//ImageArea
	public static ImageArea[] ImageArea = new ImageArea[100];
	public static int ImageAreaCount = 1;
	public static ImageAreaPropperties[] ImageAreaPropperties = new ImageAreaPropperties[100];
	public static ImageAreaHierarchy ImageAreaHierarchy[] = new ImageAreaHierarchy[100];
	
	//NotationArea
	public static NotationArea[] NotationArea = new NotationArea[100];
	public static int NotationAreaCount = 1;
	public static NotationAreaPropperties[] NotationAreaPropperties = new NotationAreaPropperties[100];
	public static NotationAreaHierarchy[] NotationAreaHierarchy = new NotationAreaHierarchy[100];
	


	
	

	
	
	//ComponentArea
	public static ResizableComponentArea[] resizableComponentArea = new ResizableComponentArea[100];
	public static int componentareaCount = 1;
//	public static TextareaProppertiesWindow[] textareaProppertiesWindow = new TextareaProppertiesWindow[100];
	//Workspace
	public static WorkspaceProppertiesWindow[] pageProppertiesWindow = new WorkspaceProppertiesWindow[2];
	
	
	
	
	
	public static Font textareaFont = new Font("Open Sans", Font.PLAIN, 40);
	
	
	//Properties
	public static String projectName = "";
	
	public static int pageWidth;
	public static int pageHeight;
	
	public static int workspaceZoomWidth;
	public static int workspaceZoomHeight;
	
	public static int pageBorder;
	public static int randLinks;
	public static int randRechts;
	public static int randOben;
	public static int randUnten;
	
	public static int gridSize = 30;

	public static int dpi;
	
	//ProjectData
	public static ProjectDATA[] projectData = new ProjectDATA[2];
	
	//ClipboardData
	public static ClipboardDATA[] clipboardData = new ClipboardDATA[2];
	
	//Page hirarchie Viewer
	public static HierarchyPanel[] pageView = new HierarchyPanel[2];

	
	
	
	
	
	
	
	
	
	//Font
		static int fontSize = 12;
		
		public static Font OpenSans12 = new Font("Open Sans", Font.PLAIN, 12);
		public static Font OpenSans14 = new Font("Open Sans", Font.PLAIN, 14);		
		public static Font OpenSans16 = new Font("Open Sans", Font.PLAIN, 16);
		
		public static Font OpenSansThik12 = new Font("Open Sans", Font.BOLD, 12);
		public static Font OpenSansThik14 = new Font("Open Sans", Font.BOLD, 14);		
		public static Font OpenSansThik16 = new Font("Open Sans", Font.BOLD, 16);
		
		
		public static TypefacePanel[] typefacePanel = new TypefacePanel[2];
		
		
		
		
		public static Font FontThik = new Font("Open Sans", Font.BOLD, fontSize);
		
		
		public static Font standartFont8 = new Font("Myriad Pro", Font.PLAIN, 8);
		public static Font standartFont13 = new Font("Myriad Pro", Font.PLAIN, 13);
		public static Font standartFont15 = new Font("Myriad Pro", Font.PLAIN, 15);
		public static Font standartFont20 = new Font("Myriad Pro", Font.PLAIN, 20);
		public static Font standartFont25 = new Font("Myriad Pro", Font.PLAIN, 25);
		public static Font standartFont30 = new Font("Myriad Pro", Font.PLAIN, 30);
		public static Font standartFont60 = new Font("Myriad Pro", Font.PLAIN, 60);
		
		public static Font PostIt = new Font("Please write me a song", Font.PLAIN, 25);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int notenblattbreite = 1740;
	public static int notenblatthöhe = 2440;
	
	public static int arbeitsbereichhöhe = 2440;
	public static int arbeitsbereichbreite = 1740;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static keyPianoinfo[] keypiano = new keyPianoinfo[1];
	
	
	//Array für den Schweif bei doppellinien
	public static Schweif[] schweif2 = new Schweif[20];
	
	
	
	//notenschreiben
	public static int XPosition = 600;
	
	
	
	
	
	
	
	
	//Voreinstellungen
//	public static String taktart;
	public static boolean q = false;
	
	
	public static Titel[] titel = new Titel[2];
	public static String Titel = "titel";
	
	
	
	public static Untertitel[] untertitel = new Untertitel[2];
	public static String Untertitel = "untertitel";
	
	
	
	
	public static Tempo[] tempo = new Tempo[2];
	public static String Tempo = "tempo";
	
	public static Komponist[] komponist = new Komponist[2];
	public static String Komponist = "komponist";
	
	public static InfoText[] infotext = new InfoText[2];
	public static String InfoText = "infotext";
	
	
	public static dialogWindowNeuesProjektErstellen[] dialogwindowNeuesDokument = new dialogWindowNeuesProjektErstellen[2];
	
	

	public static String instrumentAnzahl = "";
	
//	public static String Taktart = "";
//	public static String SchlüsselLayout = "";
	
	

	
	
	
	
	public static int Ywert;
	public static int arbeitsflächenHöhe = 1820;
	
//	public static int postitPosition = 10;

	public static int blattAnzahl = 1;
	public static int Seitenzahl = 1;
	
	public static int projektanzahl = 1;
	
	public static InfoPaneErsteSeiteErstellen[] InfoPanelErsteSeite = new InfoPaneErsteSeiteErstellen[10];
	
	public static int BlattKoordinateX = 0;
	public static int BlattKoordinateY = 0;
	
	
	
	
	public static NotenBlatt[] NotenBlätter = new NotenBlatt[10];
	public static NotenBlattHintergrund[] notenBlattHintergrundArray = new NotenBlattHintergrund[10];
	public static Label[] hintergrundbild = new Label[10];
	
	
	//notizen
	/*public static NotizenHintergrund[] notizenHintergrundArray = new NotizenHintergrund[10];
	public static NotizLayoutHintergrundImage[] notizLayoutHintegrundImage = new NotizLayoutHintergrundImage[10];
	public static PostIt[] notizPanel = new PostIt[100];
	public static int notizYWert = 1;
	public static int notizAnzahl = 1;
	
	*/
	
	
	//NotenLinien
	public static NotenLinie[] notenlinien = new NotenLinie[50];
	public static NotenLinienEinstellungen[] notenLinienEinstelungen = new NotenLinienEinstellungen[50];
	public static int notenLinienAnzahl = 1;
	public static int NotenLinienAnzahlÖffnen;
	public static int EinstellungsLäufer = 1;
	
	
	
	public static int notenLinienYwert = 400;
	public static int mitläufer = 1;
	
	

	
	
	
	
	
	

	
	
	
	
	
	

	
	public static int notenAnzahlInt;
	public static notenpanel[] notenArray = new notenpanel[200];
	

	
	
	
	
	public static int RasterHintergrund = 10;
	public static Color rasterfarbe = Color.LIGHT_GRAY;
	
	
	public static boolean AddOnPiano = false;
	public static boolean AddOnControlPanel = false;
	
	
	
	
	
	
	//Color	
//	public static Color PrimColor = new Color(71,70,68);
//	public static Color SekColor = new Color(50,49,48); 
//	public static Color BorderColor = new Color(171,171,171); 
//	public static Color BlueHightlightColor = new Color(24,73,252);
//	public static Color PinkHightlightColor = new Color(251,1,91); 
//	public static Color GelbHightlightColor = new Color(254,189,35); 
	
	
	
	
	public static Color PrimColor;
	public static Color SekColor;
	public static Color BorderColor;
	public static Color WorkspaceBackgroundColor;
	public static Color PagebackgroundColor;
	
	public static Color ButtonHoverColor;
	public static Color ToolHoverColor;
	public static Color CloseButtonHover;
	
	public static Color PrimTextColor;
	public static Color SekTextColor;
	
	public static Color BlueHightlightColor;
	public static Color PinkHightlightColor;
	public static Color GelbHightlightColor;



	
	
	
	public static Color Color4 = new Color(60,65,70);
	public static Color neutralGrau = new Color(230,230,230);
	public static Color schlagschattenGrau = new Color(142,142,142);
	public static Color dunkelGrau = new Color(51,51,51);
	public static Color grün = new Color(205,215,91);
	public static Color orange = new Color(244,151,94);
	
	public static String ButtonColor02 = "Color.cyan";
	public static String ButtonColor03 = "Color.MAGENTA";
	
	
	
	
	public static String PNGName = "";
	
	
	
	
	public static addOnPiano[] piano = new addOnPiano[2];
	public static addOnControlPanel[] controlPanel = new addOnControlPanel[2];
	
	

	
//	public static int Postitanzahl = 5;
	


	public static String ProjectLOG = "";
	public static String ClipboardLOG = "";
	
	public static String logInfo = "";
//	static int voll = 0;
	
	
	public static String werkzeug;
	
	public static int Notenwiederherstellen = 1;
	
	
	public static boolean note = false;
	public static boolean pause = false;
	public static boolean takt = false;
	public static boolean notenWert1 = false;
	public static boolean notenWert2 = false;
	public static boolean notenWert4 = false;
	public static boolean notenWert8 = false;
	public static boolean notenWert16 = false;
	public static boolean notenWert32 = false;
	
	

	
	
	

}
