package com.ya.skidtavling.competion.compmenueManager;

import java.util.Scanner;

import com.ya.skidtavling.competion.Competitions;
import com.ya.skidtavling.competion.Input;

public class CompMenuCreatCompetion {

	public static float etta(Competitions tavl) {
		Input input = new Input();
		Scanner scan = new Scanner(System.in);
		// variable namen b�r ses �ver
		String wrk = "";
		String prmt = "";
		int win = 0;
		float wflot = 0f;
		long wlong = 0;
		Boolean wbool = false;
		// raderaKonsole(5);
		System.out.println("Ange de uppr�knade egenskaperna f�r aktuell t�vling");
//				Competitions tavl1 = new Competitions();

			wrk =  Input.inputString("Ange t�vlingens namn", false, 0);
//		System.out.println("Ange t�vlingens namn");
//		wrk = scan.nextLine();
		tavl.setCompetiotionName(wrk);

				wbool = Input.inputBool("Obligatorisk f�rhandsanm�lan");
//		System.out.println("Obligatorisk f�rhandsanm�lan");
		tavl.setAdvanceNotification(wbool);

				wlong =  Input.inputDatum(" Senaste Anm�lningsdag ");
//		System.out.println(" Senaste Anm�lningsdag ");
//		wlong = scan.nextLong();
		tavl.setLastNotificationDate(wlong);

				wbool = Input.inputBool("Simulerad tidtagning");
//		System.out.println("Simulerad tidtagning");
//		wbool = scan.nextBoolean();
		tavl.setSimTidtagning(wbool);
		// sp�rl�ngd o mellantid
//		System.out.println("Ange sp�rl�ngd i 10-tals meter");
				win = Input.inputInt("Ange sp�rl�ngd i 10-tals meter", 10,30000);
//		win = scan.nextInt();
		tavl.setSparLangd(win);
//		System.out.println("Mellantidstagning i hela  procent av banl�ngd r�knat fr�n start tex 50 mittpunkt");
				win = Input.inputInt("Mellantidstagning i hela  procent av banl�ngd r�knat fr�n start tex 50 mittpunkt", 1,100);
//		win = scan.nextInt();
		tavl.setPlaceMellantid(win);
//		System.out.println("Ange kod f�r startmetod 1-4 se manualen !!");
				win =  Input.inputInt("Ange kod f�r startmetod 1-4 se manualen !!", 1, 4);
//		win = scan.nextInt();
		tavl.setStartmetod(win);
//		System.out.println("Ange Antalet anm�lda startande!");
				win =  Input.inputInt("Ange Antalet anm�lda startande!", 10, 500);
//		win = scan.nextInt();
		tavl.setFixedStartnbr(win);
		System.out.println("Ange Startnummer i serie  !");
				win =  Input.inputInt("Ange Startnummer i serie  !", 1, 750);
//		win = scan.nextInt();
		tavl.setNbrStart(win);
		 win = Input.inputInt("Ange Sista nummer i serie !", 10, 1000);
//		System.out.println("Ange Sista nummer i serie !");
		tavl.setNbrSlut(win);
//		System.out.println("Startintervall i sekunder!");
		 win = Input.inputInt("Startintervall i sekunder!", 10, 120);

		tavl.setStartIntervall(win);
//		System.out.println("Maximalt antal startande");
				win =  Input.inputInt("Maximalt antal startande", 10, 300);
//		win = scan.nextInt();
		tavl.setTotalLimitStart(win);

//		System.out.println("Ange t�vlingsdatum som ���-MM_DD ");
				wlong =  Input.inputDatum("Ange t�vlingsdatum som ���-MM_DD ");
//		wlong = scan.nextLong();
		tavl.setLastNotificationDate(wlong);

		tavl.setSenUppd();

		tavl.setStatuskod(1);
		// System.out.println(tavl.toString());

		System.out.println("Utf�rt klart...");
		return 0;

	}

}
