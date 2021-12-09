package com.ya.skidtavling.tavla;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

import com.ya.skidtavling.deltagare.Participants;

public class TavlingsTavla {

	//public Participants[] deltagareLista = new Participants[100];
	Random rand = new Random();
	public List<Participants> dl = new ArrayList<>();//kanske skall byta ut arrayen till en LISTA istället.

	public void fill() {

		// Läser in deltagarena från filen
		try (BufferedReader fReader = new BufferedReader(new FileReader("Deltagare.txt"))) {

			String line;
			int i = 0;
			long tid = 0;
			// ställer upp deltagarna rad för rad
			while ((line = fReader.readLine()) != null) {
				String split[] = line.split(" ");// stringSplitar raden
				String fName = split[0];// sparar förnamn
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
					System.out.println("\n Vinnaren för tävlingen är "+p.getForName()+" "+p.getLastName());
					winner = true;
				}
			}
			
		}while(!winner);
	}

//	public Participants printOne(int x) {// den Här verkar inte fungera*note Uppdaterad
//		return deltagareLista[x];
//	}
	/*tankar runt detta är : 
	 * kan man göra en egen klass med detta då iform av att kasta in den existerande arrayen i 
	 * klassen och få ut en ny array som man då sedan kan skriva till en fil som blir TIDIGARE_resultat.txt
	 * gissar på att man kanske kan göra något åt åkartiderna här oxå 
	 * om man lägger starttiderna på något annat sätt i uppställningen av tävlingstavlan 
	 * kan man väl med .get&set method göra ändringar här 
	 * 
	 * 
	 * Note* jag är oxå väldigt intresserad att implimentara hans Händelse Logg här oxå 
	 * något kan hända åkaren längs vägen som gör att den inte kan fortsätta.'
	 * 
	 * 
	 * 
	 * 
	 * */
//	static public void Race() { // ett sätt jag fick ihop simuleringen funkar lite sisådär
////		boolean winner = false;
////		do {
////			for (int i = 0; i < deltagareLista.length; i++) {
////				int distancedTraveled = rand.nextInt(10);
////				deltagareLista[i].setDistance(deltagareLista[i].getDistance() + distancedTraveled);
////				System.out.println(deltagareLista[i]);
////				if (deltagareLista[i].getDistance() >= 100) {
////					System.out.println("\n\nVinnaren för tävlingen är " + deltagareLista[i].getForName() + " "
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
//					System.out.println("\n Vinnaren för tävlingen är "+p.getForName()+" "+p.getLastName());
//					winner = true;
//				}
//			}
//			
//		}while(!winner);
//	}

}
