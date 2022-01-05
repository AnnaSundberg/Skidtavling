package com.ya.skidtavling.menu;


import com.ya.skidtavling.participants.NewRegistration;
import com.ya.skidtavling.participants.SearchParticipant;
import com.ya.skidtavling.tavla.CompetitionBoard;
import com.ya.skidtavling.tavla.Race;
import com.ya.skidtavling.tavla.TimeDifference;

public class MenuManager {
	
	public static void switchMenu(int userChoice, CompetitionBoard compBoard) throws InterruptedException {
	
		// behöver ses igenom
		// behöver vi under menyer för diverse menyval
		switch (userChoice) {			// 
		case 0:
			PrintMenu.printByeByeBox();
			System.exit(0);// END
		case 1:
			System.out.println("Sök en Deltagare\nFörnamn eller Efternamn");
			SearchParticipant test = new SearchParticipant(compBoard);
			break;
		case 2:
			System.out.println("Reg ny åkare");
			NewRegistration reg = new NewRegistration();
			reg.Registration(compBoard);
			
			break;
		case 3:
			System.out.println("Starta tävling");
			Race race = new Race();// skapar en instans för Rejset.
			race.race(compBoard);// anropar metoden race
			break;
		case 4:
			System.out.println("Skriv ut Tävlingstavla");
			compBoard.startingTime();
			compBoard.printParticipantsBoard();
			
			break;
		case 5:
			System.out.println("Skriv ut Mellantiderna");
			compBoard.printMidTimeList();
			break;
		case 6:
			System.out.println("Skriv ut Resultattavla");
			compBoard.printResultBoard();
			break;
		case 7:
			System.out.println("Skriv ut Vinnarna 1-3");
			compBoard.printWinnerBoard();
			break;
		case 8:
			System.out.println("Sök ett Namn för Tidskillnad");
			TimeDifference timeDiff = new TimeDifference(compBoard);
			break;

		default:
			System.out.println("Något gick snett");
		}
	}

	
	
}
