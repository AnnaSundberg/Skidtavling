package com.ya.skidtavling.competion;

import java.util.*;

public class HandleIncidents {

	
	
	public HandleIncidents(Incidents ins) {
		// TODO Auto-generated constructor stub
	
		// TODO Auto-generated method stub
		
	System.out.println("nu main testaincidents");
//		Incidents ins = new Incidents();
		String srcepath = "incidents.txt";
		String[] incidents = Filio.readfiledatatoString(srcepath);
		int rowant =incidents.length;
//		System.out.println(rowant);
//		for (int i =0; i<6; i++)
		{
//			System.out.println(incidents[i]);
//		System.out.println("Main testainc");
		}
	
		ins.setAntIncidentFall(rowant);
		ins.setAnropsCnt(0);
		ins.setInsidentAntal(0);
		ins.setAnropsIntervall(500);//testansats
//		ins = determineincidenttyp(ins);		//test
		
		 return;
	}
	
	public static Incidents CheckInsident(Incidents ins){
		int wrk;
		int cntanrop = ins.getAnropsCnt();
		cntanrop++;
		
//		System.out.println("CHeck" +cntanrop);
		ins.setAnropsCnt(cntanrop);
		/*
		första check ca 10 incidenter under loppet
		*/
		if (cntanrop == ins.getAnropsIntervall())
		{
			 ins = determineincidenttyp(ins);
			 ins.setAnropsCnt(0);                         // nollställ räknare
					 
		}
		wrk = ins.getTotalanropscnt();
		wrk++;
		ins.setTotalanropscnt(wrk);		
		
		return ins;
	}
	private static Incidents determineincidenttyp(Incidents ins) {
		/*
		 * För vart anrop; incident har hänt skapa en struktur utifrån
		 * konffigurationsfilen för att ta reda på vilken typ av
		 * incident som inträffat.
		 */
		int wrk = ins.getInsidentAntal();
		wrk++;
		ins.setInsidentAntal(wrk);

		
		int typ;
//		System.out.println("kalkylerar olyckstyp");
		
		String srcepath = "incidents.txt";
		String[] incidents = Filio.readfiledatatoString(srcepath);
		String[] items = new String[7];
		int rowant =incidents.length;
//		System.out.println(rowant);
		String[] incText = new String[rowant];	//textbeskrivning
		int[] incKonskod = new int[rowant];
		int[] incProkod = new int[rowant];
		boolean[] incComp = new boolean[rowant];
//		for (int i =0; i<rowant; i++)
//		{
//			System.out.println(incidents[i]);
//		}
		// plocka sönder konf data till resp. arrayer
		for (int i =0; i<rowant; i++)
		{
				items= incidents[i].split(";");
				incText[i]=items[1];
				incKonskod[i]=itemtoint(items[2]);
				incComp[i]=itemtobool(items[3]);
				incProkod[i]=itemtoint(items[4]);
		}
// för test enbart				
//		for (int j = 0; j<rowant; j++)
//		{
//			System.out.println("\nindex" +j);
//			System.out.println(incText[j]);
//			System.out.println(incKonskod[j]);
//			System.out.println(incComp[j]);
//			System.out.println(incProkod[j]);
//		}	
///*testa
// * 
// * 	
// */
//			int utf;
//			int[] result = new int[6];
//			for (int p = 0; p < 10; p++)
//			{
//				utf  = getutfall();
//				result [utf]++;
//				System.out.println(incText[utf]);
//		
//			}
//			for (int m = 0; m<rowant; m++)
//			{
//				System.out.println("result" +m + "  "+result[m]);
//				
//			}			
//
		
		int utfallskod = getutfall();
		/*
		 * uppdatera incidenten som skall returneras
		 */

		
	//	ins.insidentAntal++;
		ins.setInsidentKod(utfallskod);
		int kod = incKonskod[utfallskod];
		ins.setKonsekvensKod(kod);
		ins.setInsidentBeskrivning(incText[utfallskod]);
		ins.setTavlingsrelated(incComp[utfallskod]);
		
//		System.out.println( ins.toString(2));
		// TODO Auto-generated method stub
		ins.setIsnewIncident(true);
		return ins;
		
	}
	private static int getutfall() {
		
		 Random randomno = new Random();
		 int rand = randomno.nextInt(1000);
		 int gr= 0;
		 {
		 if (rand <710)
			 return 0;
		 if (rand <874 )
			 return 1;
 		 if (rand <953 )
			 return 2;
		 if (rand <991)
			 return 3;
		 if (rand <997)
			 return 4;
		 else
			 return 5;
		 }
		
 }
		
		

	private static boolean itemtobool(String exp) {

		String bool = exp.toLowerCase();
		bool= bool.trim();
//		System.out.println(bool.trim());
		if (bool.equals("true"))
			return true;
		else
			return false;
		}
	private static int itemtoint(String exp) {
		/*
		 * omvandlar textsträng integer till till integer värde
		 */
		
		int tal;
		try {
			tal = Integer.parseInt(exp.trim());
		}
		catch(Exception f)
		{
			System.out.println("Formatfel vid läsning av konfiguration incidenter");
			tal =0;
		}
		// TODO Auto-generated method stub
		return tal;
	}

}
