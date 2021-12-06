package com.ya.skidtavling.main;

import java.util.Scanner;

import com.ya.skidtavling.menu.Menu;
import com.ya.skidtavling.simulering.Simulator;
import com.ya.skidtavling.tavla.TavlingsTavla;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Menu menu = new Menu(); // instans för meny klassen
		menu.runMenu(); // kallar på runMenu klassen som skriver ut välkommen rutan och sedan valen

		TavlingsTavla tagare = new TavlingsTavla();
		Scanner scan = new Scanner(System.in);
		tagare.fill();// efter fyllning av listan kan man göra lite vad man vill
		tagare.printList();
		System.out.println("\n");
		new Simulator();
		System.out.println("\n\n\n\n");
		System.out.println("Skriv in ett Nummer 1-100\nför att se en Tävlande");
		int input = scan.nextInt();
		System.out.println(tagare.printOne(input - 1));// Uppdaterad

		scan.close();

	}

}
