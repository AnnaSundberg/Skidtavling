package com.ya.skidtavling.menu;


import com.ya.skidtavling.participants.NewRegistration;
import com.ya.skidtavling.participants.SearchParticipant;
import com.ya.skidtavling.tavla.CompetitionBoard;
import com.ya.skidtavling.tavla.Race;
import com.ya.skidtavling.tavla.TimeDifference;

public class MenuManager {
	
	public static void switchMenu(int userChoice, CompetitionBoard compBoard) throws InterruptedException {
	
		// beh?ver ses igenom
		// beh?ver vi under menyer f?r diverse menyval
		switch (userChoice) {			// 
		case 0:
			PrintMenu.printByeByeBox();
			System.exit(0);// END
		case 1:
			System.out.println("\nS?k en Deltagare:\n? Skriv F?rnamn och/eller Efternamn ?");
			SearchParticipant test = new SearchParticipant(compBoard);
			break;
		case 2:
			System.out.println("Reg ny ?kare");
			NewRegistration reg = new NewRegistration();
			reg.Registration(compBoard);
			
			break;
		case 3:
			System.out.println("Starta t?vling");
			try {
				
			
			Race race = new Race();// skapar en instans f?r Rejset.
			race.race(compBoard);// anropar metoden race
			}catch (Exception e) {
				System.out.println("T?vlingen kan inte startas \n"
						+ "B?rja med att Sriva ut T?vlingstavlan.");
				}
			break;
		case 4:
			System.out.println("Skriv ut T?vlingstavla");
			compBoard.randomizeList();// nya metoden randomizare listans utfall och tilldelar nya tider 15 secs intervall
//			compBoard.startingTime();
//			compBoard.printParticipantsBoard();
			
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
			System.out.println("S?k ett Namn f?r Tidskillnad");
			TimeDifference timeDiff = new TimeDifference(compBoard);
			break;
		case 9:
			compBoard.randomizeList();
			break;
		default:
			System.out.println("N?got gick snett");
		}
	}

	
	
}
