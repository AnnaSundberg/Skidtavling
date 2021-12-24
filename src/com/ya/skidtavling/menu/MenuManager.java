package com.ya.skidtavling.menu;


import com.ya.skidtavling.participants.SearchParticipant;
import com.ya.skidtavling.tavla.CompetitionBoard;
import com.ya.skidtavling.tavla.Race;

public class MenuManager {
	
	public static void switchMenu(int userChoice, CompetitionBoard compBoard) throws InterruptedException {
	
		// behöver ses igenom
		// behöver vi under menyer för diverse menyval
		switch (userChoice) {			// 
		case 0:
			PrintMenu.printByeByeBox();
			System.exit(0);// END
		case 1:
			compBoard.printMidTimeList();
			break;
		case 2:
			System.out.println("Skriv ut Tävlingstavla");
			compBoard.startingTime();
			compBoard.printParticipantsBoard();
			break;
		case 3:
			System.out.println("Sök en Deltagare");
			SearchParticipant test = new SearchParticipant(compBoard);
			break;
		case 4:
			System.out.println("Sim Demo Ish");
			Race race = new Race();// skapar en instans för Rejset.
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
			System.out.println("Något gick snett");
		}
	}

	
	
}
