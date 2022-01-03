package com.ya.skidtavling.participants;

import java.util.Random;
import java.util.Scanner;

import com.ya.skidtavling.competion.Competitions;
import com.ya.skidtavling.tavla.CompetitionBoard;

public class NewRegistration {

	public void Registration(CompetitionBoard compBoard, Competitions comp1) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);

		int regnr = 0;
		int place = 0;
		if (comp1.getStartmetod() == 1) {
			regnr = comp1.getNbrStart();
			place = comp1.getNbrStart();
		}
		if (comp1.getStartmetod() == 3) {
			place = comp1.getNbrStart();
			regnr = rand.nextInt(100);
		}
		// System.out.println("Hur många åkare vill du registrera?: ");

		try {

			int size = Integer.parseInt(scan.nextLine());
			for (int p = 0; p < size; p++) {
				System.out.println("Fyll i följande: Förnamn, Efternamn: ");
				place++;
				regnr++;
				compBoard.participantsList.add(new Participants(scan.next(), scan.next(), place, regnr));

				for (Participants e : compBoard.participantsList) { // Skriver ut alla åkare plus de nya åkarna som
																	// registrerats
					System.out.println(e);
				}
			}
		} catch (NumberFormatException ex) {
			System.out.println("Fel inmatning av antal, försök igen\n");
		}
//
//		for (int p = 0; p < size; p++) {
//			
//			place++;
//			regnr++;
//			
//			String ForName = scan.next();
//			String LastName = scan.next(); 
//			compBoard.participantsList.add(new Participants(ForName, LastName,place, regnr));
//			boolean isOK = Wlogg.nyevent(1,"Ny deltagare",2,ForName +" "+ LastName);
//			
//		}
//		tavl1.setNbrStart(regnr);
//		for (int i = 0; i < compBoard.participantsList.size(); i++) {	
//		System.out.println(compBoard.participantsList.get(i));
//		}
//		//System.out.println("place nr " + place);
	}

}
