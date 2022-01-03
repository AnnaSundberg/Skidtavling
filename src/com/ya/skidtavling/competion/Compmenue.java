package com.ya.skidtavling.competion;

//Compmenue.java
import java.text.ParseException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Compmenue {
	static Scanner scan = new Scanner(System.in);

	public static void Compmain(Competitions comp1) {

		Competitions tavl;
		Incidents ins;

		Incidents ins1 = new Incidents();
		tavl = comp1;
		ins1.setForvantatAntalanrop(10025);
		ins = ins1;

		int fv = 0;
		float result;
		int input = -1;
		boolean doRunmenue = true;
		String textinput = "";

		while (doRunmenue) {

			visameny();

			fv = gorfunkval();
			if (fv == 0)
				doRunmenue = false;

			ins = branchval(fv, tavl, ins);

		}

	}

	private static void visameny() {

		System.out.println("\t\tMENY v�lj funktion en av nedanst�ende ange nummer");
		System.out.println("\t\t0. Tillbaks Huvudmeny");
		System.out.println("\t\t1.Ny t�vling");
		System.out.println("\t\t2.Lista T�vlingsdata");
		System.out.println("\t\t3.Spara T�vling p� disk ...");
		System.out.println("\t\t4.�ppna t�vlingsdata fr�n fil..");
		System.out.println("\t\t5.L�gga  f�rsta starttid");
		System.out.println("\t\t6.�ndra deltagarantal");
		System.out.println("\t\t7.Lista loggfil p� konsolen");
		System.out.println("\t\t8.Nollst�ll Loggfil");
		System.out.println("\t\t9.Flytta m�tpunkt mellantider");
		System.out.println("\t\t10.�ndra Sp�rl�ngd");
		System.out.println("\t\t11.Visa Meny");

		return;

	}

	private static Incidents branchval(int fv, Competitions tavl, Incidents ins) {

		float result = 0f;
		System.out.println("menyvalet: " + fv);

		switch (fv) {

		case 0:
			break;
		case 1:
			result = etta(tavl);
			break;
		case 2:
			result = tvaa(tavl);
			break;
		case 3:
			result = trea(tavl);
			break;
		case 4:
			result = fyra(tavl);
			break;
		case 5:
			result = fem(tavl);
			break;
		case 6:
			result = sex(tavl);
			break;
		case 7:
			result = sju(tavl);
			break;
		case 8:
			result = atta(tavl);
			break;
		case 9:
			result = nia(tavl);
			break;
		case 10:
			result = tia(tavl);
			break;
		case 11:
			visameny();
			break;

		}

		return ins;
	}

	private static float nolla(Competitions tavl) {

//		menu2.runMenu(tavl);

		return 0f;
	}

	private static float tia(Competitions tavl) {

		int langd = tavl.getSparLangd(); // l�ngd i 10-tal meter;
		langd = langd * 10;
		int nytt = 0;
		System.out.println("Nuvarande l�ngd i meter	: " + langd * 10);
		System.out.println("�ndra l�ngd till meter - avrundas  ...");
		// nytt = Input.inputInt("ny l�ngd i meter 0..350000 ",0,350000);
		nytt = scan.nextInt();
		tavl.setSparLangd((nytt / 10));
		tavl.setSenUppd();
		// TODO Auto-generated method stub
		System.out.println("Utf�rt.  g�ller fr�n n�sta t�vling .. gl�m inte spara..");
		return 0;

	}

	private static float nia(Competitions tavl) {
		int proc = tavl.getPlaceMellantid();
		int nytt = 0;
		System.out.println("Nuvarande placering % av t�vl l�ngd: " + proc);
		System.out.println("�ndra antalet procenta..");
		// nytt = Input.inputInt("ny placering: 0..100 ",0,100);
		nytt = scan.nextInt();
		tavl.setPlaceMellantid(nytt);
		tavl.setSenUppd();
		// TODO Auto-generated method stub
		System.out.println("Utf�rt.  g�ller fr�n n�sta t�vling .. gl�m inte spara..");
		return 0;

	}

	private static float atta(Competitions tavl) {
//		boolean isOK = Input.inputBool("Nollst�lla loggfil - �r Du s�ker ?");
		boolean isOk = scan.nextBoolean();
		if (isOk)
			isOk = Wlogg.nollalogglist();

		return 0;
	}

	private static float sju(Competitions tavl) {
		boolean isOK = showlogglista();
		System.out.println("Utf�rt klart...");
		return 0f;
	}

	private static float sex(Competitions tavl) {
		int ant = tavl.getFixedStartnbr();
		int nytt = 0;
		System.out.println("Antalet an�lda deltagare �r: " + ant);
		System.out.println("�ndra antalet anm�lda..");
		// nytt = Input.inputInt("nytt antal anm�lda:",0, (ant+25));
		nytt = scan.nextInt();
		tavl.setFixedStartnbr(nytt);
		tavl.setSenUppd();
		// TODO Auto-generated method stub
		System.out.println("Utf�rt klart...");
		return 0;
	}

	private static float fem(Competitions tavl) {
		System.out.println("�ndra prelimin�rt stardatum till definitivt..");
		long wlong = scan.nextLong();// Input.inputDatum("Ange Nytt t�vlingsdatum: ");
		tavl.setForstaStartVerklig(wlong);
		tavl.setSenUppd();
		System.out.println("Utf�rt klart...");
		return 0;
	}

	private static float fyra(Competitions tavl) {
		boolean isOK;
		System.out.println("l�sa in fr�n fil, skriva �ver befintlig ");
//		boolean cont = Input.inputBool("l�sa in fr�n fil, skriva �ver befintlig ");
		boolean cont = scan.nextBoolean();
		if (!cont)
			return 0;
		if (cont) {
			isOK = getfromdisk(tavl);
			if (!isOK) {

				System.out.println("Misslyckades...");
				return -1f;
			}

			// TODO Auto-generated method stub
			tavl.setStatuskod(1);
			System.out.println("Utf�rt klart...");
			return 0f;
		}
		return 0f;
	}

	private static float trea(Competitions tavl) {
		// TODO Auto-generated method stub
		float success = 0;
		boolean isOK = savetodisk(tavl);
		System.out.println("Utf�rt klart...");
		return 0;
	}

	public static boolean savetodisk(Competitions tavl) {
		// TODO Auto-generated method stub
		String destpath = "skidtavling.csv";
		String[] param = new String[14];
		boolean append = false;
		boolean isOK = false;
		String line = "";
		/*
		 * prepare data to bee written in a sTRING ARRAY.
		 */
		param[0] = "01  " + tavl.getTavlingsnamn();
		param[1] = "02  " + tavl.isForHandsanmalanKrav();
		param[2] = "03  " + tavl.getSistaAnmalningsdatum();
		param[3] = "04  " + tavl.getStartmetod();
		param[4] = "05  " + tavl.getFixedStartnbr();
		param[5] = "06  " + tavl.getMaxAntalstartande();
		param[6] = "07  " + tavl.getForstaStartPlanned();
		param[7] = "08  " + tavl.getForstaStartVerklig();
		param[8] = "09  " + tavl.getStartIntervall();
		param[9] = "10  " + tavl.getSenUppd();
		param[10] = "11  " + tavl.getNbrStart();
		param[11] = "12  " + tavl.getNbrSlut();
		param[12] = "13  " + tavl.getSparLangd();
		param[13] = "14  " + tavl.getPlaceMellantid();
		/*
		 * �ppna en kanal "str�m" f�r att skriva till disk. skriv all parametrar p�
		 * formatet "X  parametervalue \n"
		 *
		 */
		try {
			PrintWriter utstrom = new PrintWriter(new BufferedWriter(new FileWriter(destpath, append)));

			/*
			 * use skriv sedan till filen till exempel med en forllop
			 * 
			 */
			for (int i = 0; i <= 13; i++) {
				utstrom.println(param[i] + " ;");
			}

			utstrom.close();
			isOK = true;

		} catch (Exception ex) {
			System.out.println("n�got gick snett vid skrivning till disk, det gick inte att skapa fil etc");
			isOK = false;
		}

		System.out.println("sparat: " + isOK);
		return isOK;
	}

	private static boolean getfromdisk(Competitions tavl) {
		String srcepath = "skidtavling.csv";
		String[] param = new String[20];
		String info = "  ";
		boolean isOK;
		boolean atend = false; // TODO Auto-generated method stub

		{
			String[] inData = new String[25];
			String line = "xx";
			int i = 0;
			try {
				var instrom = new BufferedReader(new FileReader(srcepath));
				while (line != null) {
					line = instrom.readLine();
					param[i] = line;
//				System.out.println(line + i);
					i++;

				}
				instrom.close();

			} catch (Exception ex) {
				System.out.println("Fel vid fill�sning !!");
				inData[0] = "readerror";
				return false;
			}
			isOK = loadparam(param, tavl, (i - 1));
		}
		return isOK;
	}

	private static boolean loadparam(String[] inD, Competitions ta, int n) {
		String param;
		String info = " ";
		int pend;
		boolean wbool;
		long wlong;
		int wint = 0;
		char e = ';';
//				System.out.println("radantal" +n );
		for (int i = 0; i < n; i++) {
			pend = inD[i].indexOf(e);
			pend = pend - 1;
			param = inD[i].substring(4, pend);

//					System.out.println(param);

			switch (i) {
			// t�vlingsnamn
			case 0:
				ta.setTavlingsnamn(param);
				break;
			// F�rhandsanm�lan krav
			case 1: {
				if (param.equals("true"))
					wbool = true;
				else
					wbool = false;
			}
				ta.setForHandsanmalanKrav(wbool);
				break;
			// sista anm�lningsdatum
			case 2: {
				wlong = getlongtime(param);
				ta.setSistaAnmalningsdatum(wlong);
			}
				break;
			// startmetod
			case 3: {
				wint = getint(param);
				ta.setStartmetod(wint);
			}
				break;
			// getFixedStartnbr
			case 4: {
				wint = getint(param);
				ta.setFixedStartnbr(wint);
			}
				break;

			// getMaxAntalstartande
			case 5: {
				wint = getint(param);
				ta.setMaxAntalstartande(wint);
			}
				break;
			// getForstaStartPlanned
			case 6: {
				wlong = getlongtime(param);
				ta.setForstaStartPlanned(wlong);
			}
				break;
			// getForstaStartVerklig
			case 7: {
				wlong = getlongtime(param);
				ta.setForstaStartVerklig(wlong);
			}
				break;
			// StartIntervall()

			case 8: {
				wint = getint(param);
				ta.setStartIntervall(wint);
			}
				break;
			// getSenUppd
			case 9: {
				info = param;
				ta.setSenUppd();
			}
				;
				break;
			// getNbrStart
			case 10: {
				wint = getint(param);
				ta.setNbrStart(wint);
			}
				break;
			// getNbrSlut
			case 11: {
				wint = getint(param);
				ta.setNbrSlut(wint);
				break;
			}
			// get sparlangd
			case 12: {
				wint = getint(param);
				ta.setSparLangd(wint);
				break;
			}
			// get midtimeplace
			case 13: {
				wint = getint(param);
				ta.setPlaceMellantid(wint);
			}

				break;
			}

		}

		System.out.println("fildata fr�n datum  " + info + " har laddats");
		return true;
	}

	private static int getint(String param) {
		int x;

		param = param.trim();

		try {
			x = Integer.parseInt(param);
		} catch (Exception f) {
			System.out.println("formatfel i fldata");
			x = 0;
		}

		return x;

	}

	private static long getlongtime(String param) {
		boolean isError;
		long time = 0;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date d = null;

		try {
			d = df.parse(param);
		} catch (ParseException e) {

			System.out.println("felangivet formati datum");
			isError = true;
			return 0;
		}

		time = d.getTime();

		return time;
	}

	private static float tvaa(Competitions tavl) {
		int raderpervy = 10;
		int radcount = 0;
		if (tavl.toString() == null) {
			System.out.println("Finns inget att visa..");
			return 0;
		}
		System.out.println("T�vlingsnamn:  " + tavl.getTavlingsnamn());
		System.out.println("Krav p� f�rhandsanm�lan  " + tavl.isForHandsanmalanKrav());
		System.out.println("sista_anmalningsdatum:  " + tavl.getSistaAnmalningsdatum());
		System.out.println(" Startmetod:  " + tavl.getStartmetod());
		System.out.println("Antalet anm�lda startande " + tavl.getFixedStartnbr());
		System.out.println("Maximalt Antalstartande=.." + tavl.getMaxAntalstartande());
		System.out.println("Plannerad f�rsta start. " + tavl.getForstaStartPlanned());
		System.out.println("Verklig f�rsta start:  " + tavl.getForstaStartVerklig());
		System.out.println("StartIntervall.sekunder: " + tavl.getStartIntervall());
		System.out.println("Senast Uppdatering: " + tavl.getSenUppd());

		// boolean goon = Input.inputEnter("forts�tt visa mer...");
		scan.next();

		System.out.println("ID-numrering");
		System.out.println("Nummerlappar f�r dekorering");
		System.out.println("L�gsta nummer f�r startande " + tavl.getNbrStart());
		System.out.println("H�gsta nummer f�r startande " + tavl.getNbrSlut());
		System.out.println("Test o utv�rdering");
		System.out.println("Banl�ngd i 10-tal meter: " + tavl.getSparLangd());
		System.out.println("Mellantidtagning i % av banl r�knat fr�n start: " + tavl.getPlaceMellantid());


		// goon = Input.inputEnter("till menyn klar...");
		System.out.println("forts�tt");
		scan.next();
		return 0;
	}


	private static int gorfunkval() {
		int fv = 0; // aktuellt funktionsval definieras av menyfunktionen.
		String[] funk = { "Exit", "Ny", "Visa", "Spara", "�ppna", "Uppdatera", "delt antsal", "TAN", "SQR", "Mstore",
				"MRecall", "Meny" };
		String sv = "";
		int val = 0;
		int menyMax = 11;

		boolean doShowval = false;
		boolean doScanval = true;

		if (doShowval) {
			// must be aviabljavax.swing
//			while (sv.length() == 0) {
//				sv = JOptionPane.showInputDialog("Ange menyval 1....."+ menyMax+ "eller '0' f�r att avsluta");
//				{
//
//				try {
//						val = Integer.parseInt(sv);
//					}
//				catch (Exception e)// om sv inte �r ett integer heltal
//					{
//						System.out.println("ogiltigt val, f�rs�k igen!");
//						sv = ""; // stannar kvar i whileloopen
//
//
//							if  ((val < 0) ||(val >menyMax))
//							{
//								System.out.println("ogiltigt val, f�rs�k igen!");
//								sv = ""; // stannar kvar i whileloopen
//							}
//						}
//				}
//			}
		} else {
			System.out.println("Ange ditt menyval: ");

			Scanner scan = new Scanner(System.in);
			val = -1;

			while ((val == -1) && (doScanval)) {

				val = scan.nextInt();

				if ((val < 0) || (val > menyMax)) {
					System.out.println("ogiltigt val, f�rs�k igen!");
					val = -1; // stannar kvar i whileloopen
				}
			}
			// scan.close();
		}

		return val;
	}

	private static void raderaKonsole(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("\n" + "\n" + "\n" + "\n" + "\n");
		}

		// TODO Auto-generated method stub

	}

	private static float etta(Competitions tavl) {

		// TODO Auto-generated method stub

		String wrk = "";
		String prmt = "";
		int win = 0;
		float wflot = 0f;
		long wlong = 0;
		Boolean wbool = false;
		// raderaKonsole(5);
		System.out.println("Ange de uppr�knade egenskaperna f�r aktuell t�vling");
		Competitions tavl1 = new Competitions();

//		wrk =  Input.inputString("Ange t�vlingens namn", false, 0);
		System.out.println("Ange t�vlingens namn");
		wrk = scan.nextLine();
		tavl.setTavlingsnamn(wrk);

//		wbool = Input.inputBool("Obligatorisk f�rhandsanm�lan");
		System.out.println("Obligatorisk f�rhandsanm�lan");
		tavl.setForHandsanmalanKrav(wbool);

//		wlong =  Input.inputDatum(" Senaste Anm�lningsdag ");
		System.out.println(" Senaste Anm�lningsdag ");
		wlong = scan.nextLong();
		tavl.setSistaAnmalningsdatum(wlong);

//		wbool = Input.inputBool("Simulerad tidtagning");
		System.out.println("Simulerad tidtagning");
		wbool = scan.nextBoolean();
		tavl.setSimTidtagning(wbool);
		// sp�rl�ngd o mellantid
		System.out.println("Ange sp�rl�ngd i 10-tals meter");
//		win = Input.inputInt("Ange sp�rl�ngd i 10-tals meter", 10,30000);
		win = scan.nextInt();
		tavl.setSparLangd(win);
		System.out.println("Mellantidstagning i hela  procent av banl�ngd r�knat fr�n start tex 50 mittpunkt");
//		win = Input.inputInt("Mellantidstagning i hela  procent av banl�ngd r�knat fr�n start tex 50 mittpunkt", 1,100);
		win = scan.nextInt();
		tavl.setPlaceMellantid(win);
		System.out.println("Ange kod f�r startmetod 1-4 se manualen !!");
//		win =  Input.inputInt("Ange kod f�r startmetod 1-4 se manualen !!", 1, 4);
		win = scan.nextInt();
		tavl.setStartmetod(win);
		System.out.println("Ange Antalet anm�lda startande!");
//		win =  Input.inputInt("Ange Antalet anm�lda startande!", 10, 500);
		win = scan.nextInt();
		tavl.setFixedStartnbr(win);
		System.out.println("Ange Startnummer i serie  !");
//		win =  Input.inputInt("Ange Startnummer i serie  !", 1, 750);
		win = scan.nextInt();
		tavl.setNbrStart(win);
		// win = Input.inputInt("Ange Sista nummer i serie !", 10, 1000);
		System.out.println("Ange Sista nummer i serie !");
		tavl.setNbrSlut(win);
		System.out.println("Startintervall i sekunder!");
		// win = Input.inputInt("Startintervall i sekunder!", 10, 120);

		tavl.setStartIntervall(win);
		System.out.println("Maximalt antal startande");
//		win =  Input.inputInt("Maximalt antal startande", 10, 300);
		win = scan.nextInt();
		tavl.setMaxAntalstartande(win);

		System.out.println("Ange t�vlingsdatum som ���-MM_DD ");
//		wlong =  Input.inputDatum("Ange t�vlingsdatum som ���-MM_DD ");
		wlong = scan.nextLong();
		tavl.setForstaStartPlanned(wlong);

		tavl.setSenUppd();

		tavl.setStatuskod(1);
		// System.out.println(tavl.toString());

		System.out.println("Utf�rt klart...");
		return 0;

	}

	public static boolean showlogglista() {
		String srcepath = "tavlingslogg.txt";
		boolean isOK;

		int PostID = 1;
		boolean atend = false; // TODO Auto-generated method stub
		System.out.println("Utf�rt p� g�ng...");
		int postant = getFilesize(srcepath);
		System.out.println("postantal" + postant);
		Eventlogg[] events = new Eventlogg[postant];
		for (int k = 0; k < postant; k++) {
			Eventlogg event = new Eventlogg();
			events[k] = event;
		}

		{

			{
				String line = "";
				int i = 1;
				try {
					var instrom = new BufferedReader(new FileReader(srcepath));
					while (line != null) {
						line = instrom.readLine();
						// System.out.println(line + i);
						if (line != null) {
							Eventlogg event = new Eventlogg();
							event = loadparam(events[i - 1], line, i);
							events[i - 1] = event;

						}
						i++;

					}
					instrom.close();
					i = i - 2;
					System.out.println("post i" + i);
				} catch (Exception ex) {
					System.out.println("Tom lista eller Fel vid fill�sning !!");
					return false;
				}
				int l = 0;
				for (int k = 0; k < i; k++, l++) {
					System.out.println(events[k].toString());
					if (l == 19) {
//											Input.inputEnter("visa fler 'enter'");	
						System.out.println("visa fler 'enter'");
						scan.next();
						l = 0;
					}

				}
				System.out.println("�terv�nd menyn 'enter'");
				scan.next();
//						Input.inputEnter("�terv�nd menyn 'enter'");

				// event = loadparam(event,line,PostID);
			}
		}

		return true;
	}

	private static Eventlogg loadparam(Eventlogg event, String row, int pid) {

		String[] item = new String[12];
		item = row.split(";");
		int wint = 0; // wor output from parse;
		int i = 0;
		for (i = 0; i < 10; i++)

			switch (i) {
			// postid
			case 0:
				event.setEventID(pid);
				break;
			// tidpunkt som string
			case 1:
				event.setHandelsetidpunkt(item[1].trim());
				break;
			// faltid
			case 2:
				break;
			// startmetod
			case 3: {
				wint = getint(item[3]);
				event.setEventkod(wint);
			}
				;
				break;
			case 4:
				break;
			case 5:
				event.setEventdescr(item[5].trim());
				break;
			case 6:
				break;
			case 7: {
				wint = getint(item[7]);
			}
				event.setEventsrce(wint);
				break;
			case 8:
				break;
			case 9:
				event.setEventobj(item[9].trim());
				break;
			}
		return event;
	}

	public static int getFilesize(String path) {
		/*
		 * read file to determine number of rows
		 */
		String row = "";
		int rowcnt = 0;
		try {
			var instrom = new BufferedReader(new FileReader(path));
			while (row != null) {
				row = instrom.readLine();

//							System.out.println(line + i);
				rowcnt++;

			}
			instrom.close();
		} catch (Exception io) {
			System.out.println("fel vid fill�sning!!" + rowcnt);
			rowcnt = -1;

		}
		rowcnt--;

		System.out.println("antal l�sta rader!!" + rowcnt);
		return rowcnt;
	}

}
