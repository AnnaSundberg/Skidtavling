package com.ya.skidtavling.participants;

import java.util.ArrayList;
import java.util.Scanner;

import com.ya.skidtavling.tavla.CompetitionBoard;

public class NewRegistration {

	public void Registration(CompetitionBoard compBoard) {

		Scanner scan = new Scanner(System.in);
//		var akare = participantsList;				// H�r ska det vara en kopiering av Listan som redan existerar men har inte f�tt till det.		
		
		System.out.println("Hur m�nga �kare vill du registrera?: ");
		int size = scan.nextInt();
		for (int p = 0; p < size; p++) {
			System.out.println("Fyll i f�ljande: F�rnamn, Efternamn: ");
			compBoard.participantsList.add(new Participants(scan.next(), scan.next()));

		}
		for (int i = 0; i < compBoard.participantsList.size(); i++) {
			System.out.println(compBoard.participantsList.get(i));
		}
	}

}
