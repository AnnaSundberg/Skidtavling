package com.ya.skidtavling.menu;

public class PrintMenu {
	
	public static void printWelcomeBox() {

		System.out.println("�---------------�------------------�");
		System.out.println("|      V�lkommen till denna        |");
		System.out.println("|           Skidt�vling            |");
		System.out.println("�---------------�------------------�");
	}

	public static void printMenu() {
		
//		System.out.println("\nG�r ett av valen:\n"
//				+ "0. Avsluta.\n"
//				+ "1. S�k Deltagare.\n" 
//				+ "2. Registrera ny �kare.\n" 
//				+ "3. Starta T�vling.\n"
//				+ "4. Skriv ut T�vlingstavla.\n" 
//				+ "5. Skriv ut Mellantiderna.\n" 
//				+ "6. Skriv ut Resultattavla.\n"
//				+ "7. Skriv ut Vinnarna 1-3.");
		//titta till detta f�r korigering 
		System.out.println("\nG�r ett av valen:\n"
				+ "0. Avsluta.\n"
				+ "1. T�vling undermeny setup mm\n"
				+ "2. Deltagare. \n"
				+ "3. S�k en Deltagare.\n"
				+ "4. Skriv ut Starttavla.\n"
				+ "5. Starta T�vling.\n" 
				+ "6. Skriv ut mellantiderna.\n" 
				+ "7. Skriv ut Resultattavla.\n" 
				+ "8. Skriv ut Vinnarna 1-3.\n"
				+ "9. Skriv ut Avbrutna lopp.\n"
				);
	}
	public static void printByeByeBox() {

		System.out.println("�---------------�------------------�");
		System.out.println("|      Tack och V�lkommen          |");
		System.out.println("|         �ter, Hej D�!            |");
		System.out.println("�---------------�------------------�");
	}
	
}
