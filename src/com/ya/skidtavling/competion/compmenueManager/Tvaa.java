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
		System.out.println("T�vlingsnamn:  " + tavl.getTavlingsnamn());
		System.out.println("Krav p� f�rhandsanm�lan  " + tavl.isForHandsanmalanKrav());
		System.out.println("sista_anmalningsdatum:  " + tavl.getSistaAnmalningsdatum());
		System.out.println(" Startmetod:  " + tavl.getStartmetod());
		System.out.println("Antalet anm�lda startande " + tavl.getFixedStartnbr());
		System.out.println("Maximalt Antalstartande=.." + tavl.getMaxAntalstartande());
		System.out.println("Plannerad f�rsta start. " + tavl.getForstaStartPlanned());
		System.out.println("Verklig f�rsta start:  " + tavl.getForstaStartVerklig());
		System.out.println("StartIntervall.sekunder: " + tavl.getStartIntervall());
		System.out.println("Senast Uppdatering: " + tavl.getSenUppd());

		// boolean goon = Input.inputEnter("forts�tt visa mer...");
		scan.next();

		System.out.println("ID-numrering");
		System.out.println("Nummerlappar f�r dekorering");
		System.out.println("L�gsta nummer f�r startande " + tavl.getNbrStart());
		System.out.println("H�gsta nummer f�r startande " + tavl.getNbrSlut());
		System.out.println("Test o utv�rdering");
		System.out.println("Banl�ngd i 10-tal meter: " + tavl.getSparLangd());
		System.out.println("Mellantidtagning i % av banl r�knat fr�n start: " + tavl.getPlaceMellantid());


		// goon = Input.inputEnter("till menyn klar...");
		System.out.println("forts�tt");
		scan.next();
		return 0;
	}
}
