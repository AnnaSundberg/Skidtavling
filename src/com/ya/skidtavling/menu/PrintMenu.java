package com.ya.skidtavling.menu;

public class PrintMenu {
	
	public static void printWelcomeBox() {

		System.out.println("�---------------�------------------�");
		System.out.println("|      V�lkommen till denna        |");
		System.out.println("|           Skidt�vling            |");
		System.out.println("�---------------�------------------�");
	}

	public static void printMenu() {
		
		System.out.println("\nG�r ett av valen:\n"
				+ "0. Avsluta.\n"
				+ "1. Skriv ut mellantiderna\n" 
				+ "2. Skriv ut T�vlingstavla\n" 
				+ "3. S�k en Deltagare\n"
				+ "4. Starta T�vling.\n" 
				+ "5. Skriv ut Resultattavla.\n" 
				+ "6. Skriv ut Vinnarna 1-3");
	}
	public static void printByeByeBox() {

		System.out.println("�---------------�------------------�");
		System.out.println("|      Tack och V�lkommen          |");
		System.out.println("|         �ter, Hej D�!            |");
		System.out.println("�---------------�------------------�");
	}
	
}
