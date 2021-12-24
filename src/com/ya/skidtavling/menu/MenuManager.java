package com.ya.skidtavling.menu;


import com.ya.skidtavling.participants.SearchParticipant;
import com.ya.skidtavling.tavla.CompetitionBoard;
import com.ya.skidtavling.tavla.Race;

public class MenuManager {
	
	public static void switchMenu(int userChoice, CompetitionBoard compBoard) throws InterruptedException {
	
		// beh�ver ses igenom
		// beh�ver vi under menyer f�r diverse menyval
		switch (userChoice) {			// 
		case 0:
			PrintMenu.printByeByeBox();
			System.exit(0);// END
		case 1:
			compBoard.printMidTimeList();
			break;
		case 2:
			System.out.println("Skriv ut T�vlingstavla");
			compBoard.startingTime();
			compBoard.printParticipantsBoard();
			break;
		case 3:
			System.out.println("S�k en Deltagare");
			SearchParticipant test = new SearchParticipant(compBoard);
			break;
		case 4:
			System.out.println("Sim Demo Ish");
			Race race = new Race();// skapar en instans f�r Rejset.
			race.race(compBoard);// anropar metoden race
			break;
		case 5:
			System.out.println(" - ");
			compBoard.printResultBoard();
			break;
		case 6:
			compBoard.printWinnerBoard();
			break;

		default:
			System.out.println("N�got gick snett");
		}
	}

	
	
}
