package com.ya.skidtavling.main;

import com.ya.skidtavling.menu.Menu;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Menu menu = new Menu(); // instans för meny klassen
		menu.runMenu(); // kallar på runMenu klassen som skriver ut välkommen rutan och sedan valen
		//System.out.println(menu.tagare.printOne(0));
//		System.out.println(menu.tagare.deltagareLista[66].getPlace());
		System.out.println("\n");
		
		System.out.println("\n\n\n\n");
//		menu.tagare.printOne(1);

	}

}
