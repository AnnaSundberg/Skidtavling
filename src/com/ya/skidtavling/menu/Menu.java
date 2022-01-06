package com.ya.skidtavling.menu;

import java.util.Scanner;

import com.ya.skidtavling.tavla.CompetitionBoard;
import com.ya.skidtavling.tavla.FillFromFile;

//Kanske bör byta namn på denna klass för den börja komma ifrån Sitt syfte
public class Menu {

	boolean quit;
	public CompetitionBoard compBoard = new CompetitionBoard();

	public void runMenu() throws InterruptedException {
		PrintMenu.printWelcomeBox();
		FillFromFile FFF = new FillFromFile(compBoard);// instans till nya klassen för fil läsning
		while (!quit) {
			PrintMenu.printMenu();
			int userChoice = getInput(); // getInput ny metod för att behandla användarens input
			MenuHandler.switchMenu(userChoice, compBoard);

		}
	}

	private int getInput() {
		Scanner scan = new Scanner(System.in);
		int userChoice = -1; // index på -1 så while loopen inte evighetsloopar
		while (userChoice < 0 || userChoice > 8) { // Satte val 0 ifall användaren råkar så får den ett meddelande
			try {
				System.out.print("\nSkriv en siffra: ");
				userChoice = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Försök igen");
			}

		}
		return userChoice;
	}

}