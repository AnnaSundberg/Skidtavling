package com.ya.skidtavling.simulering;

import java.util.Random;

import com.ya.skidtavling.menu.Menu;

public class Simulator {
	public Simulator() throws InterruptedException {
		Random rand = new Random();
		
		// gissing �r att det �r typ h�r man kan kasta in data fr�n deltagare som ska vara med i t�vling som 
		// s� skriver ut en simulering nu �'r det bara en random som g�r x antal sj�rnor.
//		for (int i = 0; i <TavlingsTavla.deltagareLista; i++) {
//			System.out.println(menu.tagare.deltagareLista[i].getDistance());
//		}
		
		int outPut = rand.nextInt(100);
		 
		System.out.println(outPut);
		PrintStars.PrintStars(outPut);

	}

}
