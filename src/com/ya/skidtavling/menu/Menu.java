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
			int userChoice = getInput();		// getInput ny metod för att behandla användarens input 
			switchMenu(userChoice);
			
		}
	}
	private int getInput() {
		Scanner scan = new Scanner(System.in);
		int userChoice = -1;					// index på -1 så while loopen inte evighetsloopar
		while(userChoice < 0 || userChoice > 6) {		// Satte val 0 ifall användaren råkar så får den ett meddelande
			try {
				System.out.print("\nSkriv en siffra: ");
				userChoice = Integer.parseInt(scan.nextLine());
			}
			catch (NumberFormatException e) {
				System.out.println("Försök igen");		
			}
			
		}
		return userChoice;
	}
	
	public void switchMenu(int userChoice) throws InterruptedException {
	
		
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
			tagare.printList();
			break;
		case 3:
			System.out.println("Här händer ngt ");
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
			System.out.println("Något gick snett");
		}
	}
}