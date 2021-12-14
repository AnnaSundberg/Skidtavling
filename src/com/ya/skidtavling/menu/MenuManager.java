package com.ya.skidtavling.menu;

import com.ya.skidtavling.deltagare.Participants;
import com.ya.skidtavling.simulering.Simulator;
import com.ya.skidtavling.tavla.TavlingsTavla;

public class MenuManager {
	
	public static void switchMenu(int userChoice, TavlingsTavla tagare) throws InterruptedException {
	
		
		switch (userChoice) {			// 
		case 0:
			System.out.println("Det här var inget val ajabaja");
			break;
		case 1:
			System.out.println("Fyll Tävlingstavla");
			tagare.fill();			//Min eclipse bugga ur så här tar jag en paus
			break;
		case 2:
			System.out.println("Skriv ut Tävlingstavla");
			
			tagare.startingTime();
			
			tagare.printList();
			break;
		case 3:
			System.out.println("Sök en Deltagare");

		//	System.out.println(tagare.printOne(getInput2()));
			break;
		case 4:
			System.out.println("Sim Demo Ish");
			//tagare.Race();
			tagare.race();
			break;
		case 5:
			System.out.println("liilili");
			tagare.printList2();
			break;
		case 6:
			System.out.println("BYE\n");
			PrintMenu.printByeByeBox();
			//quit = true;
			tagare.printList2();
			break;
		default:
			System.out.println("Något gick snett");
		}
	}

	
	
}
