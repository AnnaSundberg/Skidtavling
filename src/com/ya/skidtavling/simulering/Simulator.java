package com.ya.skidtavling.simulering;

import java.util.Random;

import com.ya.skidtavling.menu.Menu;

public class Simulator {
	public Simulator() throws InterruptedException {
		Random rand = new Random();
		
		// gissing är att det är typ här man kan kasta in data från deltagare som ska vara med i tävling som 
		// så skriver ut en simulering nu ä'r det bara en random som gör x antal sjärnor.
//		for (int i = 0; i <TavlingsTavla.deltagareLista; i++) {
//			System.out.println(menu.tagare.deltagareLista[i].getDistance());
//		}
		
		int outPut = rand.nextInt(100);
		 
		System.out.println(outPut);
		PrintStars.PrintStars(outPut);

	}

}
