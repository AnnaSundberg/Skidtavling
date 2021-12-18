package com.ya.skidtavling.menu;

public class PrintMenu {
	
	public static void printWelcomeBox() {

		System.out.println("¤---------------¤------------------¤");
		System.out.println("|      Välkommen till denna        |");
		System.out.println("|           Skidtävling            |");
		System.out.println("¤---------------¤------------------¤");
	}

	public static void printMenu() {
		
		System.out.println("\nGör ett av valen:\n"
				+ "0. Avsluta.\n"
				+ "1. Fyll Tävlingstavla\n" 
				+ "2. Skriv ut Tävlingstavla\n" 
				+ "3. Sök en Deltagare\n"
				+ "4. Starta Tävling.\n" 
				+ "5. Menyval 5.\n" 
				+ "6. ETT ANNAT VAL");
	}
	public static void printByeByeBox() {

		System.out.println("¤---------------¤------------------¤");
		System.out.println("|      Tack och Välkommen          |");
		System.out.println("|         Åter, Hej Då!            |");
		System.out.println("¤---------------¤------------------¤");
	}
	
}
