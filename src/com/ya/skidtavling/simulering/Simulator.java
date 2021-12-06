package com.ya.skidtavling.simulering;

import java.util.Random;

public class Simulator {
	public Simulator() throws InterruptedException {
		Random rand = new Random();
		int outPut = rand.nextInt(100);

		System.out.println(outPut);
		PrintStars.PrintStars(outPut);

	}

}
