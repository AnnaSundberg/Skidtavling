package com.ya.skidtavling.competitions;
import java.io.*;
//Compmenue.java
import java.text.ParseException;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import com.ya.skidtavling.*;
public class Compmenue {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub	
		Competitions tavl;
		Competitions tavl1 = new Competitions();
		tavl = tavl1;
		tavl1.setTavlingsnamn("Skidspelen");
	

//		System.out.println(tavl1.getTavlingsnamn()+ "1");
//		System.out.println(tavl.getTavlingsnamn()+ "2");
		
			int fv = 0;
			float result;
			int input = -1;
			String textinput= "";
			//raderaKonsole(10);
			//visameny();
		
			while(true)
			{
			
			//raderaKonsole(25);
			visameny();
			//raderaKonsole(0);
			fv =gorfunkval();
			//result = inputFloat("divisor",0,5);
			//4extinput= inputString("Ange ditt förnamn",false,0);
			//System.out.println(textinput);
			//input =inputInt("födelseår", 1600, 2028);
			result = (float) branchval(fv, tavl);
			
			}
	}
	private static void visameny() {
	
	// TODO Auto-generated method stub
	System.out.println("\t\tMENY välj funktion en av nedanstående ange nummer");
	System.out.println("\t\t0. Avsluta");
	System.out.println("\t\t1.Ny tävling_registrera egenskaper");
	System.out.println("\t\t2.Visa aktuella uppgifter på skärmen, lista");
	System.out.println("\t\t3.Spara som fil ...");
	System.out.println("\t\t4.Öppna tävlingsdata från fil..");
	System.out.println("\t\t5.Lägga till definitiv  första starttid");
	System.out.println("\t\t6.Ändra deltagarantal");
	System.out.println("\t\t7.Reserv");
	System.out.println("\t\t9.Visa Meny");

	return;
	
}


	private static float branchval(int fv, Competitions tavl) {
		// TODO Auto-generated method stub
	
		float result= 0f;
		System.out.println("menyvalet: "+fv);
		
		switch (fv)
		{
		
		case 0: System.exit(0);
		case 1:	result = etta(tavl); break;
		case 2:	result = tvaa(tavl);break;
		case 3:	result = trea(tavl);break;
		case 4:	result = fyra(tavl);break;
		case 5:	result = fem(tavl);break;
		case 6:	result = sex(tavl);break;
		case 7:	result = sju(tavl);break;
		case 8: result = atta(tavl);break;
		case 9:	visameny();break;
		//case 9: result = nia(result);break;
	
		}
//		if (fv !=4)
//		System.out.println(result);
//		
		return result; 
	}
		


	private static float atta(Competitions tavl) {
		// TODO Auto-generated method stub
		
		System.out.println("Utfört klart...");
		return 0;
	}


	private static float sju(Competitions tavl) {
		// TODO Auto-generated method stub
		System.out.println("Utfört klart...");
		return 0;
	}


	private static float sex(Competitions tavl) {
		int ant = tavl.getFixedStartnbr();
		int nytt =0;
		System.out.println("Antalet anälda deltagare är: " + ant);
		System.out.println("Ändra antalet anmälda..");
		nytt = inputInt("nytt antal anmälda:",0, (ant+25));
		tavl.setFixedStartnbr(nytt);
		tavl.setSenUppd();
		// TODO Auto-generated method stub
		System.out.println("Utfört klart...");
		return 0;
	}


	private static float fem(Competitions tavl) {
		System.out.println("Ändra preliminärt stardatum till definitivt..");
		long wlong = inputDatum("Ange Nytt tävlingsdatum: ");
		tavl.setForstaStartVerklig(wlong);
		tavl.setSenUppd();
		System.out.println("Utfört klart...");
		return 0;
	}


	private static float fyra(Competitions tavl)  {
		boolean isOK;
		boolean cont = inputBool("läsa in från fil, skriva över befintlig ");
				if (!cont)
					return 0;
				if (cont)
				{
					 isOK = getfromdisk(tavl);
				if(!isOK)
				{
					
					System.out.println("Misslyckades...");	
					return -1f;
				}
				
					
		// TODO Auto-generated method stub
		System.out.println("Utfört klart...");
		return 0f;
	    }
				return 0f;
	}



	private static float trea(Competitions tavl)  {
		// TODO Auto-generated method stub
		float success = 0;
		boolean isOK = savetodisk(tavl);
		System.out.println("Utfört klart...");
		return 0;
	}


	private static boolean savetodisk(Competitions tavl) {
		// TODO Auto-generated method stub
		String destpath = "C://test//skidtavling.csv";
		String[] param = new String[12];
		boolean append = false;
		boolean isOK = false;
		String line= "";
		/*
		prepare data to bee written in a sTRING ARRAY.
		*/
		param[0] = "01  " +tavl.getTavlingsnamn();
		param[1] = "02  " + tavl.isForHandsanmalanKrav();
		param[2] = "03  " + tavl.getSistaAnmalningsdatum();
		param[3] = "04  " + tavl.getStartmetod();
		param[4] = "05  " + tavl.getFixedStartnbr();
		param[5] = "06  " + tavl.getMaxAntalstartande();
		param[6] = "07  " + tavl.getForstaStartPlanned();
		param[7]  ="08  " + tavl.getForstaStartVerklig();
		param[8]  ="09  " + tavl.getStartIntervall();
		param[9]  ="10  " + tavl.getSenUppd();
		param[10] ="11  " + tavl.getNbrStart();
		param[11] ="12  "+ tavl.getNbrSlut();
	
			/*
			 *öppna en kanal "ström" för att skriva till disk.
			 *skriv all parametrar på formatet "X  parametervalue \n"
			 *
			 */
			try
			{
				PrintWriter utstrom = new PrintWriter(new BufferedWriter
											(new FileWriter(destpath,append)));
			

				/*
				 * use 
				 * skriv sedan till filen till exempel med en forllop
				 * 
				 */
				for (int i =0; i<=11 ; i++)
				{
				utstrom.println(param[i]+ " ;");
				}
				
			utstrom.close(); 
			isOK = true;
			
			}
			catch (Exception ex)
			{
				System.out.println("något gick snett vid skrivning till disk, det gick inte att skapa fil etc");
				isOK = false;
			}
			
			System.out.println("sparat: " + isOK);
			return isOK;
		}
	
	private static boolean getfromdisk(Competitions tavl) {
		String srcepath = "C://test//skidtavling.csv";
		String[] param = new String[20];
		String info="  ";
		boolean isOK;
		boolean atend = false;		// TODO Auto-generated method stub
		
		
		{
			String[] inData = new String[25];
			String line="xx";
			int i=0;
			try
			{
				var instrom = new BufferedReader
							(new FileReader(srcepath));
			while (line != null)
			{
				line = instrom.readLine();
				param[i] = line;
//				System.out.println(line + i);
				i++;
				
			}
			instrom.close();
		
			}
			catch (Exception ex)
			{
				System.out.println("Fel vid filläsning !!");
				inData[0] = "readerror";
				return false;
			}
			isOK = loadparam(param,tavl,(i-1));
		}			
			return isOK;
	}
			
			private static boolean loadparam(String[] inD,Competitions ta,int n)
			{
				String param;
				String info = " ";
				int pend;
				boolean wbool;
				long wlong;
				int wint=0;
				char e = ';';
//				System.out.println("radantal" +n );
				for(int i =0; i<n; i++)
				{
					pend = inD[i].indexOf(e);
					pend = pend-1;
					param = inD[i].substring(4,pend);
					
//					System.out.println(param);
					
					
					switch (i)
					{
					//tävlingsnamn
					case 0: ta.setTavlingsnamn(param);break;
					//Förhandsanmälan krav
					case 1:	{if (param.equals("true"))
							wbool = true;
							else wbool = false;
							}
							ta.setForHandsanmalanKrav(wbool);
							break;
					//	sista anmälningsdatum	
					case 2:{ wlong = getlongtime(param);						
						 ta.setSistaAnmalningsdatum(wlong);
						 }
						break;
					//startmetod
					case 3:{ wint = getint(param);						
					 ta.setStartmetod(wint);
					 }
					break;
					//getFixedStartnbr
					case 4:{ wint = getint(param);						
					 ta.setFixedStartnbr(wint);
					 }
					break;
					
					//getMaxAntalstartande
					case 5:{ wint = getint(param);						
					 ta.setMaxAntalstartande(wint);
					 }
					break;
					//getForstaStartPlanned
					case 6:{ wlong = getlongtime(param);						
					 ta.setForstaStartPlanned(wlong);
					 }
					break;
					//getForstaStartVerklig
					case 7:{ wlong = getlongtime(param);						
					ta.setForstaStartVerklig(wlong);
					 }
					break;
					// StartIntervall()
					
					case 8:{ wint = getint(param);
					ta.setStartIntervall(wint);
					 }
					break;
					//getSenUppd	
					case 9:{
					info = param;
					ta.setSenUppd();
					};
					break;
					//getNbrStart
					case 10:{ wint = getint(param);						
					 ta.setNbrStart(wint);
					 }
					break;
					//getNbrSlut
					case 11:{ wint = getint(param);						
					 ta.setNbrSlut(wint);
					 }
					break;
					}
						
				}
			
			System.out.println("fildata från datum  " + info + " har laddats");
				return true;
	}
	private static int getint(String param) {
		int x;
		
		param = param.trim();
		
		
		try
		{
			x = Integer.parseInt(param);
		}
		catch (Exception f)
		{
		System.out.println("formatfel i fldata");
		x=0;
		}
	
		return x;
		
	}
			
			
	private static long getlongtime(String param) {
		boolean isError;
		long time =0;
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		 Date d = null;
			
			try {
				d = df.parse(param);
				} 
			catch (ParseException e) {
				// TODO Auto-generated catch block
				
				System.out.println("felangivet formati datum");
				isError = true;
				return 0;
			}
				
			
			time = d.getTime();
			
			return time;
	}
			
			
			
			
			
			
	private static float tvaa(Competitions tavl) {
		int raderpervy =10;
		int radcount =0;
		if (tavl.toString() == null)
		{
			System.out.println("Finns inget att visa..");
			return 0;
		}
		System.out.println("Tävlingsnamn:  " + tavl.getTavlingsnamn());
		System.out.println("Krav på förhandsanmälan  " + tavl.isForHandsanmalanKrav());
		System.out.println("sista_anmalningsdatum:  " + tavl.getSistaAnmalningsdatum());
		System.out.println(" Startmetod:  " + tavl.getStartmetod());
		System.out.println("Antalet anmälda startande " + tavl.getFixedStartnbr());
		System.out.println("Maximalt Antalstartande=.." + tavl.getMaxAntalstartande());
		System.out.println("Plannerad första start. " + tavl.getForstaStartPlanned());
		System.out.println("Verklig första start:  " +tavl.getForstaStartVerklig());
		System.out.println("StartIntervall.sekunder: " + tavl.getStartIntervall());
		System.out.println("Senast Uppdatering: "+ tavl.getSenUppd());
		
		boolean goon = inputEnter("fortsätt visa mer...");
		
		System.out.println("ID-numrering");
		System.out.println("Nummerlappar för dekorering");
		System.out.println("Lägsta nummer för startande " + tavl.getNbrStart());
		System.out.println("Högsta nummer för startande " + tavl.getNbrSlut());
		System.out.println("Test o utvärdering");;
		System.out.println("Simulerad tidtagning: "+ tavl.isSimTidtagning());
		
//		System.out.println("Finns inget att visa..");
//		System.out.println("Finns inget att visa..");
//		System.out.println("Finns inget att visa..");
//		System.out.println("Finns inget att visa..");
//		System.out.println("Finns inget att visa..");
	
		
		goon = inputEnter("till menyn klar...");
		return 0;
	}

//
//	private static float etta(float result) {
//		
//		
//		// TODO Auto-generated method stub
//		
//		
//		System.out.println("Utfört klart...");
//		return 0;
//	}


	private static int gorfunkval() {		
		int fv = 0; // aktuellt funktionsval definieras av menyfunktionen.
		String[] funk = {"Exit", "Ny", "Visa", "Spara", "Öppna", "Uppdatera", "delt antsal", "TAN", "SQR", "Mstore", "MRecall", "Meny" };
			String sv = "";
			int val= 0;
			int menyMax =9;
			
			boolean doShowval = false;
			boolean doScanval = true;
			
			
			if (doShowval)
			{
				// must be aviabljavax.swing
//			while (sv.length() == 0) {
//				sv = JOptionPane.showInputDialog("Ange menyval 1....."+ menyMax+ "eller '0' för att avsluta");
//				{
//
//				try {
//						val = Integer.parseInt(sv);
//					}
//				catch (Exception e)// om sv inte är ett integer heltal
//					{
//						System.out.println("ogiltigt val, försök igen!");
//						sv = ""; // stannar kvar i whileloopen
//
//
//							if  ((val < 0) ||(val >menyMax))
//							{
//								System.out.println("ogiltigt val, försök igen!");
//								sv = ""; // stannar kvar i whileloopen
//							}
//						}
//				}
//			}
			}
				else
				{
					System.out.println("Ange ditt menyval: ");
					
					Scanner scan = new Scanner(System.in);
					val = -1;
				
					while ((val == -1)&&(doScanval))
					{
						
						val = scan.nextInt();
					
								if  ((val < 0) ||(val >menyMax))
								{
									System.out.println("ogiltigt val, försök igen!");
									val = -1; // stannar kvar i whileloopen
								}
					}
					//scan.close();
				}
					
				return val;	
	}
	
		private static void raderaKonsole(int n) {
			for (int i = 0 ; i < n; i++)
			{
				System.out.print("\n"+"\n"+"\n"+"\n"+"\n");
			}	
			
			
		// TODO Auto-generated method stub
		
	}	

		private static float etta(Competitions tavl){
			
			
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

		tavl.setTavlingsnamn(wrk);

		wbool = inputBool("Obligatorisk förhandsanmälan");
		tavl.setForHandsanmalanKrav(wbool);
		
		wlong = inputDatum(" Senaste Anmälningsdag ");
		tavl.setSistaAnmalningsdatum(wlong);	
					
		wbool = inputBool("Simulerad tidtagning");
		tavl.setSimTidtagning(wbool);


		win = inputInt("Ange kod för startmetod 1-4 se manualen !!", 1, 4);
		tavl.setStartmetod(win);
		win = inputInt("Ange Antalet anmälda startande!", 10, 500);
		tavl.setFixedStartnbr(win);
		win = inputInt("Ange Startnummer i serie  !", 10, 750);
		tavl.setNbrStart(win);
		win = inputInt("Ange Sista nummer i serie !", 10, 1000);
		tavl.setNbrSlut(win);
		win = inputInt("Startintervall i sekunder!", 10, 120);

		tavl.setStartIntervall(win);
		win = inputInt("Maximalt antal startande", 10, 150);
		tavl.setMaxAntalstartande(win);

		

		wlong = inputDatum("Ange tävlingsdatum som ÅÅÅ-MM_DD ");
				tavl.setForstaStartPlanned(wlong);		
		
				tavl.setSenUppd();
		
		
		//System.out.println(tavl.toString());
		
		System.out.println("Utfört klart...");
		return 0;

	}

	private static void Compmenue() {
		// TODO Auto-generated method stub
		
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
	private static boolean inputEnter(String promptstring) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String inData = "";
		boolean isIndata = false;
		boolean ret = true;
		{
			System.out.println(promptstring + "tryck 'enter' för att fortsätta");
			inData = "";
			inData = scan.nextLine();
		
		}

		return ret;
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
	
			public String hamtaTid (float result,int val)
			{
				String tidResultat= "";
			
				{
					LocalDate idag = LocalDate.now();
					LocalTime now = LocalTime.now();
					
			//		 parse date from yyyy-mm-dd pattern
					 LocalDate birthday = LocalDate.parse("2021-05-20");

					 // add one day..etc.
					 LocalDate anotherday = birthday.minusYears(75);
					System.out.println("Datumtid:"+ idag.toString());
					System.out.println("Datumtid:"+ now.toString());
					System.out.println("Datumtid:"+ anotherday.toString());
					tidResultat = "Datumtid:"+ now.toString(); 
					return tidResultat;
				}
				
			
	}


	// TODO Auto-generated method stub

}


	
	
	
	
	

