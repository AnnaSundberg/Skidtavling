package com.ya.skidtavling.main;

import com.ya.skidtavling.menu.Menu;
import com.ya.skidtavling.time.Time;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Time newTime = new Time(13507);
		System.out.println(newTime.toString());
		Menu menu = new Menu(); // instans f�r meny klassen
		menu.runMenu(); // kallar p� runMenu klassen som skriver ut v�lkommen rutan och sedan valen
	
		System.out.println("\n");
		

		
	}

}
