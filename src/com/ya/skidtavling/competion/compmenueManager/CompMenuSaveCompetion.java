package com.ya.skidtavling.competion.compmenueManager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import com.ya.skidtavling.competion.Competitions;

public class CompMenuSaveCompetion {
	public static float trea(Competitions tavl) {
		// TODO Auto-generated method stub
		float success = 0;
		boolean isOK = savetodisk(tavl);
		System.out.println("Utfört klart...");
		return 0;
	}

//	private static boolean savetodisk(Competitions tavl) {
		public static boolean savetodisk(Competitions tavl) {// sparar till skidtavling.txt
			String destpath = "skidtavling.txt";
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
			 * öppna en kanal "ström" för att skriva till disk. skriv all parametrar på
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
				System.out.println("något gick snett vid skrivning till disk, det gick inte att skapa fil etc");
				isOK = false;
			}

			System.out.println("sparat: " + isOK);
			return isOK;
		
		
	}
}
