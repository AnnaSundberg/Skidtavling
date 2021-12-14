package com.ya.skidtavling.menu;

import com.ya.skidtavling.participants.Participants;
import com.ya.skidtavling.simulering.Simulator;
import com.ya.skidtavling.tavla.CompetitionBoard;

public class MenuManager {
	
	public static void switchMenu(int userChoice, CompetitionBoard compBoard) throws InterruptedException {
	
		
		switch (userChoice) {			// 
		case 0:
			System.out.println("Det h�r var inget val ajabaja");
			break;
		case 1:
			System.out.println("Fyll T�vlingstavla");
			compBoard.fill();			//Min eclipse bugga ur s� h�r tar jag en paus
			break;
		case 2:
			System.out.println("Skriv ut T�vlingstavla");
			
			compBoard.startingTime();
			
			compBoard.printParticipantsBoard();
			break;
		case 3:
			System.out.println("S�k en Deltagare");

		//	System.out.println(tagare.printOne(getInput2()));
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
			System.out.println("BYE\n");
			PrintMenu.printByeByeBox();
			//quit = true;
			System.exit(0);// END
			break;
		default:
			System.out.println("N�got gick snett");
		}
	}

	
	
}
