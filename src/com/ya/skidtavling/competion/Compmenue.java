package com.ya.skidtavling.competion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

import com.ya.skidtavling.competion.compmenueManager.Atta;
import com.ya.skidtavling.competion.compmenueManager.Etta;
import com.ya.skidtavling.competion.compmenueManager.Fema;
import com.ya.skidtavling.competion.compmenueManager.Fyra;
import com.ya.skidtavling.competion.compmenueManager.Nia;
import com.ya.skidtavling.competion.compmenueManager.Sexa;
import com.ya.skidtavling.competion.compmenueManager.Sju;
import com.ya.skidtavling.competion.compmenueManager.Tia;
import com.ya.skidtavling.competion.compmenueManager.Trea;
import com.ya.skidtavling.competion.compmenueManager.Tvaa;
import com.ya.skidtavling.menu.ConsolePrinting;

public class Compmenue {
	static Scanner scan = new Scanner(System.in);

	public static void Compmain(Competitions comp1) {
// KOLLA IGENOM BORTKOMMENTERAD KOD OM VI BEHÖVER DESSA BEHÅLLA || TA BORT
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

			ConsolePrinting.subMenu();

			fv = gorfunkval();
			if (fv == 0)
				doRunmenue = false;

			ins = branchval(fv, tavl, ins);

		}

	}

// kan den här kastas in i en egen klass ?? 
	private static Incidents branchval(int fv, Competitions tavl, Incidents ins) {
		// titta igenom om vi ska byta ut floaten till int istället 
		float result = 0f;
		System.out.println("menyvalet: " + fv);

		switch (fv) {

		case 0:
			break;
		case 1:
//			result = etta(tavl);
			//Etta etta = new Etta();
			Etta.etta(tavl);
			break;
		case 2:
//			result = tvaa(tavl);
			Tvaa.tvaa(tavl);
			break;
		case 3:
//			result = trea(tavl);
			Trea.trea(tavl);
			break;
		case 4:
//			result = fyra(tavl);
			Fyra.fyra(tavl);
			break;
		case 5:
//			result = fem(tavl);
			Fema.fem(tavl);
			break;
		case 6:
//			result = sex(tavl);
			Sexa.sex(tavl);
			break;
		case 7:
//			result = sju(tavl);
			Sju.sju(tavl);
			break;
		case 8:
//			result = atta(tavl);
			Atta.atta(tavl);
			break;
		case 9:
//			result = nia(tavl);
			Nia.nia(tavl);
			break;
		case 10:
//			result = tia(tavl);
			Tia.tia(tavl);
			break;
		case 11:
			ConsolePrinting.subMenu();
			break;

		}

		return ins;
	}



	private static int gorfunkval() {
		int fv = 0; // aktuellt funktionsval definieras av menyfunktionen.
		String[] funk = { "Exit", "Ny", "Visa", "Spara", "Öppna", "Uppdatera", "delt antsal", "TAN", "SQR", "Mstore",
				"MRecall", "Meny" };
		String sv = "";
		int val = 0;
		int menyMax = 11;

		boolean doShowval = false;
		boolean doScanval = true;

		if (doShowval) {

		} else {
			System.out.println("Ange ditt menyval: ");

			Scanner scan = new Scanner(System.in);
			val = -1;

			while ((val == -1) && (doScanval)) {

				val = scan.nextInt();

				if ((val < 0) || (val > menyMax)) {
					System.out.println("ogiltigt val, försök igen!");
					val = -1; // stannar kvar i whileloopen
				}
			}
			// scan.close();
		}

		return val;
	}
// används detta alls? 
	private static void raderaKonsole(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("\n" + "\n" + "\n" + "\n" + "\n");
		}


	}


	public static boolean showlogglista() {
		String srcepath = "tavlingslogg.txt";
		boolean isOK;

		int PostID = 1;
		boolean atend = false; 
		System.out.println("Utfört på gång...");
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
					System.out.println("Tom lista eller Fel vid filläsning !!");
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
				System.out.println("återvänd menyn 'enter'");
				scan.next();
//						Input.inputEnter("återvänd menyn 'enter'");

				// event = loadparam(event,line,PostID);
			}
		}

		return true;
	}

	public static Eventlogg loadparam(Eventlogg event, String row, int pid) {

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
				wint = Fyra.getint(item[3]);
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
				wint = Fyra.getint(item[7]);
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
			System.out.println("fel vid filläsning!!" + rowcnt);
			rowcnt = -1;

		}
		rowcnt--;

		System.out.println("antal lästa rader!!" + rowcnt);
		return rowcnt;
	}

}
