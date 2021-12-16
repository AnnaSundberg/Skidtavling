package com.ya.skidtavling.main;

import com.ya.skidtavling.menu.Menu;
import com.ya.skidtavling.time.Time;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Time newTime = new Time(13507);
		System.out.println(newTime.toString());
		Menu menu = new Menu(); // instans för meny klassen
		menu.runMenu(); // kallar på runMenu klassen som skriver ut välkommen rutan och sedan valen
	
		System.out.println("\n");
		

		
	}

}
