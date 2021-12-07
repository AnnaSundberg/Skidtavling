package com.ya.skidtavling.menu;
import java.util.Scanner;

import com.ya.skidtavling.simulering.Simulator;
import com.ya.skidtavling.tavla.TavlingsTavla;


public class Menu {
	
	boolean quit;
	TavlingsTavla tagare = new TavlingsTavla();
	public void runMenu() throws InterruptedException {
		PrintMenu.printWelcomeBox();
		
		while(!quit) {
			PrintMenu.printMenu();
			int userChoice = getInput();		// getInput ny metod f�r att behandla anv�ndarens input 
			switchMenu(userChoice);
			
		}
	}
	private int getInput() {
		Scanner scan = new Scanner(System.in);
		int userChoice = -1;					// index p� -1 s� while loopen inte evighetsloopar
		while(userChoice < 0 || userChoice > 6) {		// Satte val 0 ifall anv�ndaren r�kar s� f�r den ett meddelande
			try {
				System.out.print("\nSkriv en siffra: ");
				userChoice = Integer.parseInt(scan.nextLine());
			}
			catch (NumberFormatException e) {
				System.out.println("F�rs�k igen");		
			}
			
		}
		return userChoice;
	}
	
	public void switchMenu(int userChoice) throws InterruptedException {
	
		
		switch (userChoice) {			// 
		case 0:
			System.out.println("Det h�r var inget val ajabaja");
			break;
		case 1:
			System.out.println("Fyll T�vlingstavla");
			tagare.fill();			//Min eclipse bugga ur s� h�r tar jag en paus
			break;
		case 2:
			System.out.println("Skriv ut T�vlingstavla");
			tagare.printList();
			break;
		case 3:
			System.out.println("H�r h�nder ngt ");
			tagare.printOne(userChoice);
			break;
		case 4:
			System.out.println("Sim Demo Ish");
			new Simulator();
			break;
		case 5:
			System.out.println("liilili");
			break;
		case 6:
			System.out.println("BYE\n");
			quit = true;
			break;
		default:
			System.out.println("N�got gick snett");
		}
	}
}