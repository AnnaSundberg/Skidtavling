package com.ya.skidtavling.main;

import com.ya.skidtavling.menu.Menu;
import com.ya.skidtavling.tavla.TavlingsTavla;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Menu menu = new Menu(); // instans f�r meny klassen
		menu.runMenu(); // kallar p� runMenu klassen som skriver ut v�lkommen rutan och sedan valen
		System.out.println(menu.tagare.printOne(1));
		System.out.println("\n");
		
		System.out.println("\n\n\n\n");
		menu.tagare.printOne(1);

	}

}
