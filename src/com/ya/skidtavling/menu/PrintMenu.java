package com.ya.skidtavling.menu;

public class PrintMenu {
	
	public static void printWelcomeBox() {

		System.out.println("¤---------------¤------------------¤");
		System.out.println("|      Välkommen till denna        |");
		System.out.println("|           Skidtävling            |");
		System.out.println("¤---------------¤------------------¤");
	}

	public static void printMenu() {
		
//		System.out.println("\nGör ett av valen:\n"
//				+ "0. Avsluta.\n"
//				+ "1. Sök Deltagare.\n" 
//				+ "2. Registrera ny åkare.\n" 
//				+ "3. Starta Tävling.\n"
//				+ "4. Skriv ut Tävlingstavla.\n" 
//				+ "5. Skriv ut Mellantiderna.\n" 
//				+ "6. Skriv ut Resultattavla.\n"
//				+ "7. Skriv ut Vinnarna 1-3.");
		//titta till detta för korigering 
		System.out.println("\nGör ett av valen:\n"
				+ "0. Avsluta.\n"
				+ "1. Tävling undermeny setup mm\n"
				+ "2. Deltagare. \n"
				+ "3. Sök en Deltagare.\n"
				+ "4. Skriv ut Starttavla.\n"
				+ "5. Starta Tävling.\n" 
				+ "6. Skriv ut mellantiderna.\n" 
				+ "7. Skriv ut Resultattavla.\n" 
				+ "8. Skriv ut Vinnarna 1-3.\n"
				+ "9. Skriv ut Avbrutna lopp.\n"
				);
	}
	public static void printByeByeBox() {

		System.out.println("¤---------------¤------------------¤");
		System.out.println("|      Tack och Välkommen          |");
		System.out.println("|         Åter, Hej Då!            |");
		System.out.println("¤---------------¤------------------¤");
	}
	
}
