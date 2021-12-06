package com.ya.skidtavling.simulering;

public class PrintStars {

	public static void PrintStars(int i) throws InterruptedException {
		if (i > 0) {
			String star = "*";
			Thread.sleep(100);
			System.out.print(star);
			PrintStars(i - 1);
		}
		
	}

	
}
