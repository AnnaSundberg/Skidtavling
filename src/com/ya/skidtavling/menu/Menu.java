package com.ya.skidtavling.menu;
import java.util.Scanner;


import com.ya.skidtavling.tavla.CompetitionBoard;


public class Menu {
	
	boolean quit;
	public CompetitionBoard compBoard = new CompetitionBoard();
	public void runMenu() throws InterruptedException {
		PrintMenu.printWelcomeBox();
		
		while(!quit) {
			PrintMenu.printMenu();
			int userChoice = getInput();		// getInput ny metod f�r att behandla anv�ndarens input 
			MenuManager.switchMenu(userChoice,compBoard);
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
	private int getInput2() {
		Scanner scan = new Scanner(System.in);
		int userChoice = -1;					// index p� -1 s� while loopen inte evighetsloopar
		while(userChoice < 0 || userChoice > 100) {		// Satte val 0 ifall anv�ndaren r�kar s� f�r den ett meddelande
			try {
				System.out.print("\nSkriv en siffra: ");
				userChoice = Integer.parseInt(scan.nextLine());
			}
			catch (NumberFormatException e) {
				System.out.println("F�rs�k igen");		
			}
			
		}
		return userChoice-1;// vet inte varf�r man m�ste ha -1 
	}
	

}