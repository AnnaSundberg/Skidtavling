package com.ya.skidtavling.competion.compmenueManager;

import java.util.Scanner;

import com.ya.skidtavling.competion.Competitions;

public class CompMenuSetCompetionSetPlaceForNextTime {
	
	public static float nia(Competitions tavl) {
		Scanner scan = new Scanner(System.in);
		int proc = tavl.getPlaceMellantid();
		int nytt = 0;
		System.out.println("Nuvarande placering % av t�vl l�ngd: " + proc);
		System.out.println("�ndra antalet procenta..");
		// nytt = Input.inputInt("ny placering: 0..100 ",0,100);
		nytt = scan.nextInt();
		tavl.setPlaceMellantid(nytt);
		tavl.setSenUppd();
		// TODO Auto-generated method stub
		System.out.println("Utf�rt.  g�ller fr�n n�sta t�vling .. gl�m inte spara..");
		return 0;

	}
}
