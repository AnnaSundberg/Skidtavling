package com.ya.skidtavling.competion.compmenueManager;

import java.util.Scanner;

import com.ya.skidtavling.competion.Competitions;

public class Tia {
	public static float tia(Competitions tavl) {
		Scanner scan = new Scanner(System.in);
		int langd = tavl.getSparLangd(); // l�ngd i 10-tal meter;
		langd = langd * 10;
		int nytt = 0;
		System.out.println("Nuvarande l�ngd i meter	: " + langd * 10);
		System.out.println("�ndra l�ngd till meter - avrundas  ...");
		// nytt = Input.inputInt("ny l�ngd i meter 0..350000 ",0,350000);
		nytt = scan.nextInt();
		tavl.setSparLangd((nytt / 10));
		tavl.setSenUppd();
		// TODO Auto-generated method stub
		System.out.println("Utf�rt.  g�ller fr�n n�sta t�vling .. gl�m inte spara..");
		return 0;

	}
}
