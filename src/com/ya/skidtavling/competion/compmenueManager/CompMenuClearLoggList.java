package com.ya.skidtavling.competion.compmenueManager;

import java.util.Scanner;

import com.ya.skidtavling.competion.Competitions;
import com.ya.skidtavling.competion.Input;
import com.ya.skidtavling.competion.Wlogg;

public class CompMenuClearLoggList {
	
	public static float atta(Competitions tavl) {
		Scanner scan = new Scanner(System.in);
		Input input= new Input();
		boolean isOK = Input.inputBool("Nollställa loggfil - är Du säker ?");
//		boolean isOk = scan.nextBoolean();
		if (isOK)
			isOK = Wlogg.nollalogglist();

		return 0;
	}
}
