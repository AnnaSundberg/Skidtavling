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
				+ "1. Skriv Ut deltagarLista 1.\n" 
				+ "2. Menyval 2.\n" 
				+ "3. Menyval 3.\n"
				+ "4. Menyval 4.\n" 
				+ "5. Menyval 5.\n" 
				+ "6. Avlsuta.\n");
	}
}
