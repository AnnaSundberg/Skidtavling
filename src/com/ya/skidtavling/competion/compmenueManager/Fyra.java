package com.ya.skidtavling.competion.compmenueManager;

import java.util.Scanner;

import com.ya.skidtavling.competion.Competitions;

public class Fyra {
	public static float fyra(Competitions tavl) {
		Scanner scan = new Scanner(System.in);
		boolean isOK;
		System.out.println("läsa in från fil, skriva över befintlig ");
//		boolean cont = Input.inputBool("läsa in från fil, skriva över befintlig ");
		boolean cont = scan.nextBoolean();
		if (!cont)
			return 0;
		if (cont) {
			isOK = getfromdisk(tavl);
			if (!isOK) {

				System.out.println("Misslyckades...");
				return -1f;
			}

			// TODO Auto-generated method stub
			tavl.setStatuskod(1);
			System.out.println("Utfört klart...");
			return 0f;
		}
		return 0f;
}

	private static boolean getfromdisk(Competitions tavl) {
		// TODO Auto-generated method stub
		return false;
	}
}
