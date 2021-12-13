package com.ya.skidtavling.tavla;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

import com.ya.skidtavling.deltagare.Participants;
import com.ya.skidtavling.time.Time;

public class TavlingsTavla {

	// public Participants[] deltagareLista = new Participants[100];
	Random rand = new Random();
	public List<Participants> dl = new ArrayList<>();// kanske skall byta ut arrayen till en LISTA ist�llet.
	public List<Participants> resultBoard = new ArrayList<>();

	public void fill() {
//		int sec=+14;
//		Time newTime = new Time(9, 10, sec);

		// L�ser in deltagarena fr�n filen
		try (BufferedReader fReader = new BufferedReader(new FileReader("Deltagare.txt"))) {

			String line;
			int i = 0;
			// int sec= 0;
			Time newTime = new Time(13507);

			// int tid = 0;
			// st�ller upp deltagarna rad f�r rad
			while ((line = fReader.readLine()) != null) {
				String split[] = line.split(" ");// stringSplitar raden
				String fName = split[0];// sparar f�rnamn
				String lName = split[1];// sparar efternamn
				int randNum = rand.nextInt(100);
//				long secPlus = 15;
				// Participants newDeltag = new Participants(randNum, fName, lName, i + 1,
				// tid,tid, 0);
//				Participants newDeltag = new Participants(fName, lName, i, randNum, newTime, i, false);
				Participants newDeltag = new Participants(randNum, fName, lName, i + 1, null, 0, false);
				// skapar objektet som innan men nu kopplat med Personklassen.
				// deltagareLista[i] = newDeltag;
				dl.add(newDeltag);
				i++;
				// tid += 15;
				// sec++;

//				newTime.setSec(newTime.getSec()+secPlus);

			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Succes!");
		}

	}

	public void tidsDelning() {
		long max = 500;
		long min = 100;

		for (Participants p : dl) {
			long longsetTid = rand.nextLong() % (max - min) + max;
			Time nytid = new Time(longsetTid);
			p.setStartTid(nytid);
		}
	}

	public void printList() {
//		for (int k = 0; k < deltagareLista.length; k++) {
//			System.out.println(deltagareLista[k]);
//		}
		for (Participants s : dl) {
			System.out.println(s);
		}
	}
	public void printList2() {
//		for (int k = 0; k < deltagareLista.length; k++) {
//			System.out.println(deltagareLista[k]);
//		}
		for (Participants s : resultBoard) {
			System.out.println(s.toString());
		}
	}
	

//	public void race() {
//		boolean winner = false;
//		do {
//			for(Participants p:dl) {
//				long plus = 15;
//				Time plusTime = new Time(plus);
//				p.setDistance(p.getDistance()+rand.nextInt(10));
//				
//				System.out.println(p.toString());
//				
//				if(p.getDistance()>=100) {
//					System.out.println("\n Vinnaren f�r t�vlingen �r "+p.getForName()+" "+p.getLastName());
//					winner = true;
//				}
//			}
//			
//		}while(!winner);
//	}
	public void race() {
		boolean raceOn = true;
		do {
			
			for(Participants p:dl) {
				
				if(!p.isNotFinished()) {
				p.setDistance(p.getDistance()+rand.nextInt(10));
				
				System.out.println(p.toString());
				
//					raceOn=false;
				
				if(p.getDistance()>=100) {
					System.out.println("\n  "+p.getForName()+" "+p.getLastName()+" Har G�tt i m�l");
					//winner = true;
					p.setDistance(p.getDistance());
					resultBoard.add(p);
					p.setNotFinished(true);
//					dl.remove(p);
					
				}
				if(p.isNotFinished()) {
					for(Participants p1:dl) {
						if(p1.isNotFinished()) {
							raceOn = false;
						}
						else
							raceOn = true;
					}
				}
			}
			}
		
			
		}while(raceOn);
	}

//	public Participants printOne(int x) {// den H�r verkar inte fungera*note Uppdaterad
//		return deltagareLista[x];
//	}
	/*
	 * tankar runt detta �r : kan man g�ra en egen klass med detta d� iform av att
	 * kasta in den existerande arrayen i klassen och f� ut en ny array som man d�
	 * sedan kan skriva till en fil som blir TIDIGARE_resultat.txt gissar p� att man
	 * kanske kan g�ra n�got �t �kartiderna h�r ox� om man l�gger starttiderna p�
	 * n�got annat s�tt i uppst�llningen av t�vlingstavlan kan man v�l med .get&set
	 * method g�ra �ndringar h�r
	 * 
	 * 
	 * Note* jag �r ox� v�ldigt intresserad att implimentara hans H�ndelse Logg h�r
	 * ox� n�got kan h�nda �karen l�ngs v�gen som g�r att den inte kan forts�tta.'
	 * 
	 * 
	 * 
	 * 
	 */
//	static public void Race() { // ett s�tt jag fick ihop simuleringen funkar lite sis�d�r
////		boolean winner = false;
////		do {
////			for (int i = 0; i < deltagareLista.length; i++) {
////				int distancedTraveled = rand.nextInt(10);
////				deltagareLista[i].setDistance(deltagareLista[i].getDistance() + distancedTraveled);
////				System.out.println(deltagareLista[i]);
////				if (deltagareLista[i].getDistance() >= 100) {
////					System.out.println("\n\nVinnaren f�r t�vlingen �r " + deltagareLista[i].getForName() + " "
////							+ deltagareLista[i].getLastName().toString());
////					winner = true;
////				}
////			}
////		} while (!winner);
//		boolean winner = false;
//		do {
//			for(Participants p:dl) {
//				p.setDistance(p.getDistance()+rand.nextInt(10));
//				if(p.getDistance()>=100) {
//					System.out.println("\n Vinnaren f�r t�vlingen �r "+p.getForName()+" "+p.getLastName());
//					winner = true;
//				}
//			}
//			
//		}while(!winner);
//	}

}
