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
				+ "1. Fyll T�vlingstavla\n" 
				+ "2. Skriv ut T�vlingstavla\n" 
				+ "3. H�r h�nder ngt\n"
				+ "4. Simulering.\n" 
				+ "5. Menyval 5.\n" 
				+ "6. Avlsuta.\n");
	}
}
