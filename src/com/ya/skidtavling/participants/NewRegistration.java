package com.ya.skidtavling.participants;

import java.util.Scanner;

import com.ya.skidtavling.tavla.CompetitionBoard;

public class NewRegistration {

	public void Registration(CompetitionBoard compBoard) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Hur m�nga �kare vill du registrera?: ");

		try {
			
			int size = Integer.parseInt(scan.nextLine());
			for (int p = 0; p < size; p++) {
				System.out.println("Fyll i f�ljande: F�rnamn, Efternamn: ");
				compBoard.participantsList.add(new Participants(scan.next(), scan.next()));

				for (Participants e : compBoard.participantsList) { // Skriver ut alla �kare plus de nya �karna som
																	// registrerats
					System.out.println(e);
				}
			}
		} catch (NumberFormatException ex) {
			System.out.println("Fel inmatning av antal, f�rs�k igen\n");
		}

	}

}
