package com.ya.skidtavling.competion.compmenueManager;

import java.util.Scanner;

import com.ya.skidtavling.competion.Competitions;
import com.ya.skidtavling.competion.Input;

public class Sexa {
	
	public static float sex(Competitions tavl) {
		Scanner scan = new Scanner(System.in);
		Input input = new Input();
		int ant = tavl.getFixedStartnbr();
		int nytt = 0;
		System.out.println("Antalet an�lda deltagare �r: " + ant);
		System.out.println("�ndra antalet anm�lda..");
		nytt = Input.inputInt("nytt antal anm�lda:",0, (ant+25));
//		nytt = scan.nextInt();
		tavl.setFixedStartnbr(nytt);
		tavl.setSenUppd();
		System.out.println("Utf�rt klart...");
		return 0;
	}
}
