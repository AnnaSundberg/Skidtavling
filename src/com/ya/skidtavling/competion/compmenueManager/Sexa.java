package com.ya.skidtavling.competion.compmenueManager;

import java.util.Scanner;

import com.ya.skidtavling.competion.Competitions;

public class Sexa {
	
	public static float sex(Competitions tavl) {
		Scanner scan = new Scanner(System.in);
		int ant = tavl.getFixedStartnbr();
		int nytt = 0;
		System.out.println("Antalet anälda deltagare är: " + ant);
		System.out.println("Ändra antalet anmälda..");
		// nytt = Input.inputInt("nytt antal anmälda:",0, (ant+25));
		nytt = scan.nextInt();
		tavl.setFixedStartnbr(nytt);
		tavl.setSenUppd();
		// TODO Auto-generated method stub
		System.out.println("Utfört klart...");
		return 0;
	}
}
