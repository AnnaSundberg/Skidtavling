package com.ya.skidtavling.competion.compmenueManager;

import java.util.Scanner;

import com.ya.skidtavling.competion.Competitions;

public class Fema {
	
	public static float fem(Competitions tavl) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ndra prelimin�rt stardatum till definitivt..");
		long wlong = scan.nextLong();// Input.inputDatum("Ange Nytt t�vlingsdatum: ");
		tavl.setForstaStartVerklig(wlong);
		tavl.setSenUppd();
		System.out.println("Utf�rt klart...");
		return 0;
	}
}
