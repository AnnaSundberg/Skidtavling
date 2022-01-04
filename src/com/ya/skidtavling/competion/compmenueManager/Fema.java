package com.ya.skidtavling.competion.compmenueManager;

import java.util.Scanner;

import com.ya.skidtavling.competion.Competitions;
import com.ya.skidtavling.competion.Input;

public class Fema {
	
	public static float fem(Competitions tavl) {
		Scanner scan = new Scanner(System.in);
		Input input = new Input();
		System.out.println("Ändra preliminärt stardatum till definitivt..");
		long wlong = Input.inputDatum("Ange Nytt tävlingsdatum: ");	
		tavl.setForstaStartVerklig(wlong);
		tavl.setSenUppd();
		System.out.println("Utfört klart...");
		return 0;
	}
}
