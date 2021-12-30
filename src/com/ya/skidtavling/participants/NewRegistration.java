package com.ya.skidtavling.participants;

import java.util.Scanner;

import com.ya.skidtavling.tavla.CompetitionBoard;

public class NewRegistration {

	public void Registration(CompetitionBoard compBoard) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hur många åkare vill du registrera?: ");
		int size = scan.nextInt();
		for (int p = 0; p < size; p++) {
			System.out.println("Fyll i följande: Förnamn, Efternamn: ");
			compBoard.participantsList.add(new Participants(scan.next(), scan.next()));

		}
		
		for (Participants e : compBoard.participantsList) {		// Skriver ut alla åkare plus de nya åkarna som registrerats
		System.out.println(e);
		}
	}

}
