package com.ya.skidtavling.main;

import com.ya.skidtavling.competion.Competitions;
import com.ya.skidtavling.menu.Menu;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Competitions comp1 = new Competitions();
		
		Menu menu = new Menu(); // instans f�r meny klassen
		menu.runMenu(comp1); // kallar p� runMenu klassen som skriver ut v�lkommen rutan och sedan valen

	}

}
