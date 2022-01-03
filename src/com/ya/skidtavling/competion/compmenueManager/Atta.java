package com.ya.skidtavling.competion.compmenueManager;

import java.util.Scanner;

import com.ya.skidtavling.competion.Competitions;
import com.ya.skidtavling.competion.Wlogg;

public class Atta {
	
	public static float atta(Competitions tavl) {
		Scanner scan = new Scanner(System.in);
//		boolean isOK = Input.inputBool("Nollställa loggfil - är Du säker ?");
		boolean isOk = scan.nextBoolean();
		if (isOk)
			isOk = Wlogg.nollalogglist();

		return 0;
	}
}
