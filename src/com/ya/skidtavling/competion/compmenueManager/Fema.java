package com.ya.skidtavling.competion.compmenueManager;

import java.util.Scanner;

import com.ya.skidtavling.competion.Competitions;
import com.ya.skidtavling.competion.Input;

public class Fema {
	
	public static float fem(Competitions tavl) {
		Scanner scan = new Scanner(System.in);
		Input input = new Input();
		System.out.println("�ndra prelimin�rt stardatum till definitivt..");
		long wlong = Input.inputDatum("Ange Nytt t�vlingsdatum: ");	
		tavl.setForstaStartVerklig(wlong);
		tavl.setSenUppd();
		System.out.println("Utf�rt klart...");
		return 0;
	}
}
