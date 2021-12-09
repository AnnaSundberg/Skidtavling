package com.ya.skidtavling.tavla;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

import com.ya.skidtavling.deltagare.Participants;

public class TavlingsTavla {

	//public Participants[] deltagareLista = new Participants[100];
	Random rand = new Random();
	public List<Participants> dl = new ArrayList<>();//kanske skall byta ut arrayen till en LISTA ist�llet.

	public void fill() {

		// L�ser in deltagarena fr�n filen
		try (BufferedReader fReader = new BufferedReader(new FileReader("Deltagare.txt"))) {

			String line;
			int i = 0;
			long tid = 0;
			// st�ller upp deltagarna rad f�r rad
			while ((line = fReader.readLine()) != null) {
				String split[] = line.split(" ");// stringSplitar raden
				String fName = split[0];// sparar f�rnamn
				String lName = split[1];// sparar efternamn
				int randNum = rand.nextInt(100);

				Participants newDeltag = new Participants(randNum, fName, lName, i + 1, tid, 0);
				// skapar objektet som innan men nu kopplat med Personklassen.
				//deltagareLista[i] = newDeltag;
				dl.add(newDeltag);
				i++;
				tid += 15;

			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Succes!");
		}
	}

	public void printList() {
//		for (int k = 0; k < deltagareLista.length; k++) {
//			System.out.println(deltagareLista[k]);
//		}
		for(Participants s: dl) {
			System.out.println(s);
		}
	}
	public void race() {
		boolean winner = false;
		do {
			for(Participants p:dl) {
				p.setDistance(p.getDistance()+rand.nextInt(10));
				System.out.println(p.toString());
				if(p.getDistance()>=100) {
					System.out.println("\n Vinnaren f�r t�vlingen �r "+p.getForName()+" "+p.getLastName());
					winner = true;
				}
			}
			
		}while(!winner);
	}

//	public Participants printOne(int x) {// den H�r verkar inte fungera*note Uppdaterad
//		return deltagareLista[x];
//	}
	/*tankar runt detta �r : 
	 * kan man g�ra en egen klass med detta d� iform av att kasta in den existerande arrayen i 
	 * klassen och f� ut en ny array som man d� sedan kan skriva till en fil som blir TIDIGARE_resultat.txt
	 * gissar p� att man kanske kan g�ra n�got �t �kartiderna h�r ox� 
	 * om man l�gger starttiderna p� n�got annat s�tt i uppst�llningen av t�vlingstavlan 
	 * kan man v�l med .get&set method g�ra �ndringar h�r 
	 * 
	 * 
	 * Note* jag �r ox� v�ldigt intresserad att implimentara hans H�ndelse Logg h�r ox� 
	 * n�got kan h�nda �karen l�ngs v�gen som g�r att den inte kan forts�tta.'
	 * 
	 * 
	 * 
	 * 
	 * */
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
