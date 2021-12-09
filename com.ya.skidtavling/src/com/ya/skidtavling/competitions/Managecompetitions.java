package com.ya.skidtavling.competitions;

import com.ya.skidtavling.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.time.*;
import java.text.*;

public class Managecompetitions {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String wrk = "";
		String prmt = "";
		int win = 0;
		long wlong = 0;
		Boolean wbool = false;
		//raderaKonsole(5);
		System.out.println("Ange de uppräknade egenskaperna för aktuell tävling");
		Competitions tavl1 = new Competitions();
		
		wrk = inputString("Ange tävlingens namn", false, 0);

		tavl1.setTavlingsnamn(wrk);

		wbool = inputBool("Obligatorisk förhandsanmälan");
		tavl1.setForHandsanmalanKrav(wbool);
		wlong = inputDatum(" Senaste Anmälningsdag ");
		tavl1.setSistaAnmalningsdatum(wlong);	
		
		wbool = inputBool("Simulerad tidtagning");
		tavl1.setSimTidtagning(wbool);

		win = inputInt("Ange kod för startmetod 1-4 se manualen !!", 1, 4);
		tavl1.setStartmetod(win);
		win = inputInt("Ange Starnummer första startande !", 10, 500);
		tavl1.setFixedStartnbr(win);
		win = inputInt("Ange Startnummer i serie  !", 10, 750);
		tavl1.setNbrStart(win);
		win = inputInt("Ange Sista nummer i serie !", 10, 1000);
		tavl1.setNbrSlut(win);
		win = inputInt("Startintervall i sekunder!", 10, 120);

		tavl1.setStartIntervall(win);
		win = inputInt("Maximalt antal startande", 10, 150);
		tavl1.setMaxAntalstartande(win);

		

		wlong = inputDatum("Ange tävlingsdatum som ÅÅÅ-MM_DD ");
				tavl1.setForstaStartPlanned(wlong);		
		wlong = inputDatum("Ange Senaste uppdatering som ÅÅÅ-MM_DD ");
				tavl1.setSenUppd(wlong);
		
		
		System.out.println(tavl1.toString());

	}

	private static String inputString(String promptString, boolean b, int i) {
		boolean noNullstring = b;

		int specfunkt = i; // 1 return as Upper case;
		String inData = "";

		boolean isIndata = false;
		{
			System.out.println(promptString);
			Scanner scan = new Scanner(System.in);

			while (!isIndata) {

				inData = scan.nextLine();

				if ((inData.length() == 0) && (noNullstring)) {
					System.out.println("Måste anges!");
					// stannar kvar i whileloopen
				} else
					isIndata = true;
			}
			 //scan.close();
		}

		return inData;
	}

	private static int inputInt(String promptstringint, int min, int max) {
		// TODO Auto-generated method stub
		int inData = 0;
		boolean isIndata = false;
		{
			System.out.println(promptstringint);
			Scanner scan = new Scanner(System.in);
			inData = 0;

			while (!isIndata) {

				inData = scan.nextInt();

				if ((inData < min) || (inData > max)) {
					System.out.println("ogiltigt val, försök igen!");
					// stannar kvar i whileloopen
				} else
					isIndata = true;
			}
			// scan.close();
		}

		return inData;

	}

	private static boolean inputBool(String promptstring) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String inData = "";
		boolean isIndata = false;
		boolean ret = false;
		{
			System.out.println(promptstring + " Svara J eller N");
			inData = "";

			while (inData.length() == 0) {
				inData = scan.nextLine();
				inData = inData.toLowerCase();

				if (inData.equals("j")) {
					ret = true;
					isIndata = true;
				}

				if (inData.equals("n")) {
					ret = false;
					isIndata = true;
				}

				if (!isIndata) {
					System.out.println("ogiltigt val, försök igen!");
					// stannar kvar i whileloopen
					inData = "";
				}
			}

		}

		return ret;
	}	
	
		
		private static long inputDatum(String promt) {
			long time;
			boolean isError = false;
//			using Date and simpel Date Format
//			to add, subtract, print "any" time and format
//			https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/SimpleDateFormat.html
			
			String nytid = inputString("Ange datum som ÅÅÅÅ-MM-DD " + promt, true, 0);
			//System.out.println(nytid);
			 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			 
			 Date d = null;
			
			try {
				d = df.parse(nytid);
				} 
			catch (ParseException e) {
				// TODO Auto-generated catch block
				
				System.out.println("felangivet format");
				isError = true;
				
			} 
			if (isError)
			return 0;
				
				
			time = d.getTime();
//			System.out.println("timein sec" +timeInSecs);
//			
//			 System.out.println(df.format(d));
//			 time = (long)d;
//			 int sec = d.getSeconds();
//			 System.out.println(sec);
//			 long time = d.getTime();
//			 System.out.println(time);
//			
//			 time = time + (6000);	// long time format
//			 System.out.println(time);
//			 System.out.println("PRINTAR U I FORMATET LONG");
			 //dny = 

//			 Calendar cal = Calendar.getInstance();
//			 cal.setTime(d);
//			cal.add(Calendar.DATE, 10);
//			 System.out.println("LÄGGER TILL 10 DAGAR");
//			 String newTime = df.format(cal.getTime()); 
//			 System.out.println(newTime);
			
			
//			    Calendar date = ((Object) df).parseLocalTime(nytid);
//			    
//			    date = df.parseLocalTime(nytid);
//			    
//			    System.out.println(df.format(lt.plusMinutes(10)));
			
			
			// TODO Auto-generated method stub
			return time;

	}

	private static void raderaKonsole(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("\n" + "\n" + "\n" + "\n" + "\n");
		}

		return;
	}
	// TODO Auto-generated method stub

}

