package com.ya.skidtavling.competion.compmenueManager;

import java.util.Scanner;

import com.ya.skidtavling.competion.Competitions;

public class Tvaa {
	
	public static float tvaa(Competitions tavl) {
		Scanner scan = new Scanner(System.in);
		int raderpervy = 10;
		int radcount = 0;
		if (tavl.toString() == null) {
			System.out.println("Finns inget att visa..");
			return 0;
		}
		System.out.println("Tävlingsnamn:  " + tavl.getTavlingsnamn());
		System.out.println("Krav på förhandsanmälan  " + tavl.isForHandsanmalanKrav());
		System.out.println("sista_anmalningsdatum:  " + tavl.getSistaAnmalningsdatum());
		System.out.println(" Startmetod:  " + tavl.getStartmetod());
		System.out.println("Antalet anmälda startande " + tavl.getFixedStartnbr());
		System.out.println("Maximalt Antalstartande=.." + tavl.getMaxAntalstartande());
		System.out.println("Plannerad första start. " + tavl.getForstaStartPlanned());
		System.out.println("Verklig första start:  " + tavl.getForstaStartVerklig());
		System.out.println("StartIntervall.sekunder: " + tavl.getStartIntervall());
		System.out.println("Senast Uppdatering: " + tavl.getSenUppd());

		// boolean goon = Input.inputEnter("fortsätt visa mer...");
		scan.next();

		System.out.println("ID-numrering");
		System.out.println("Nummerlappar för dekorering");
		System.out.println("Lägsta nummer för startande " + tavl.getNbrStart());
		System.out.println("Högsta nummer för startande " + tavl.getNbrSlut());
		System.out.println("Test o utvärdering");
		System.out.println("Banlängd i 10-tal meter: " + tavl.getSparLangd());
		System.out.println("Mellantidtagning i % av banl räknat från start: " + tavl.getPlaceMellantid());


		// goon = Input.inputEnter("till menyn klar...");
		System.out.println("fortsätt");
		scan.next();
		return 0;
	}
}
