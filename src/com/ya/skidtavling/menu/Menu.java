package com.ya.skidtavling.menu;
import java.util.Scanner;


public class Menu {
	
	boolean quit;
	
	public void printWelcomeBox() {

		System.out.println("¤---------------¤------------------¤");
		System.out.println("|      Välkommen till denna        |");
		System.out.println("|           Skidtävling            |");
		System.out.println("¤---------------¤------------------¤");
	}

	private void printMenu() {
		
		System.out.println("\nGör ett av valen:\n" 
				+ "1. Menyval 1.\n" 
				+ "2. Menyval 2.\n" 
				+ "3. Menyval 3.\n"
				+ "4. Menyval 4.\n" 
				+ "5. Menyval 5.\n" 
				+ "6. Avlsuta.\n");
	}

	public void runMenu() {
		printWelcomeBox();
		
		while(!quit) {
			printMenu();
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
	
	public void switchMenu(int userChoice) {
	
		
		switch (userChoice) {			// 
		case 0:
			System.out.println("Det här var inget val ajabaja");
			break;
		case 1:
			System.out.println("lalala");
//			Time();			//Min eclipse bugga ur så här tar jag en paus
			break;
		case 2:
			System.out.println("något annat");
			break;
		case 3:
			System.out.println("blablabla");
			break;
		case 4:
			System.out.println("hej hej hej");
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