package com.ya.skidtavling.competion.compmenueManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.ya.skidtavling.competion.Competitions;
// gör egentligen samma som innan fast nu flyttat till en egen klass 
// gjorde nu så att alla methoder är med sedan innan för att det skulle fungera
// men går säkert att bryta ner detta i mindre delar ytligare 
public class Fyra {
	public static float fyra(Competitions tavl) {
		Scanner scan = new Scanner(System.in);
		boolean isOK;
		System.out.println("läsa in från fil, skriva över befintlig ");
//		boolean cont = Input.inputBool("läsa in från fil, skriva över befintlig ");
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
			System.out.println("Utfört klart...");
			return 0f;
		}
		return 0f;
}

	private static boolean getfromdisk(Competitions tavl) {
		String srcepath = "skidtavling.txt";
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
				System.out.println("Fel vid filläsning !!");
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
			// tävlingsnamn
			case 0:
				ta.setCompetiotionName(param);
				break;
			// Förhandsanmälan krav
			case 1: {
				if (param.equals("true"))
					wbool = true;
				else
					wbool = false;
			}
				ta.setAdvanceNotification(wbool);
				break;
			// sista anmälningsdatum
			case 2: {
				wlong = getlongtime(param);
				ta.setLastNotificationDate(wlong);
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
				ta.setTotalLimitStart(wint);
			}
				break;
			// getForstaStartPlanned
			case 6: {
				wlong = getlongtime(param);
				ta.setsStartingTime(wlong);
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

		System.out.println("fildata från datum  " + info + " har laddats");
		return true;
	}
	public static int getint(String param) {
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

}
