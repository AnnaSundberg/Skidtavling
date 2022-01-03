package com.ya.skidtavling.main;

import com.ya.skidtavling.competion.Competitions;
import com.ya.skidtavling.menu.Menu;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Competitions comp1 = new Competitions();
		
		Menu menu = new Menu(); // instans för meny klassen
		menu.runMenu(comp1); // kallar på runMenu klassen som skriver ut välkommen rutan och sedan valen

	}

}
