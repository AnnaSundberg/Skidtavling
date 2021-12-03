package com.ya.skidtavling.main;

import java.util.Scanner;

import com.ya.joakim.test.TavlingsTavla;



public class Main {

	public static void main(String[] args) {
		TavlingsTavla tagare = new TavlingsTavla();
		Scanner scan = new Scanner(System.in);
		tagare.fill();
		tagare.printList();
		System.out.println("\n\n\n\n");
		System.out.println("Skriv in ett Nummer 1-100\nför att se en Tävlande");
		int input = scan.nextInt();
		System.out.println(tagare.printOne(input));
		
		scan.close();
		
	}
	
	
	

}
