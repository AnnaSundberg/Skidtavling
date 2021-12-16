package com.ya.skidtavling.menu;


import com.ya.skidtavling.participants.SearchParticipant;
import com.ya.skidtavling.tavla.CompetitionBoard;

public class MenuManager {
	
	public static void switchMenu(int userChoice, CompetitionBoard compBoard) throws InterruptedException {
	
		// behöver ses igenom
		// behöver vi under menyer för diverse menyval
		switch (userChoice) {			// 
		case 0:
			PrintMenu.printByeByeBox();
//			//quit = true;
			System.exit(0);// END
		case 1:
			System.out.println("Fyll Tävlingstavla");
			compBoard.fill();			//Min eclipse bugga ur så här tar jag en paus
			break;
		case 2:
			System.out.println("Skriv ut Tävlingstavla");
			
			compBoard.startingTime();
			
			compBoard.printParticipantsBoard();
			break;
		case 3:
			System.out.println("Sök en Deltagare");
			SearchParticipant test = new SearchParticipant(compBoard);
//			test(compBoard);
//			System.out.println(compBoard.printOne(getInput2()));
			break;
		case 4:
			System.out.println("Sim Demo Ish");
			//tagare.Race();
			compBoard.race();
			break;
		case 5:
			System.out.println(" - ");
			compBoard.printResultBoard();
			break;
		case 6:
			compBoard.printWinnerBoard();
//			System.out.println("BYE\n");
			break;

		default:
			System.out.println("Något gick snett");
		}
	}

	
	
}
