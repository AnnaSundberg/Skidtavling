package com.ya.skidtavling.main;

import java.util.Scanner;

import com.ya.skidtavling.tavla.TavlingsTavla;



public class Main {

	public static void main(String[] args) {
		TavlingsTavla tagare = new TavlingsTavla();
		Scanner scan = new Scanner(System.in);
		tagare.fill();// efter fyllning av listan kan man g�ra lite vad man vill 
		tagare.printList();
		System.out.println("\n\n\n\n");
		System.out.println("Skriv in ett Nummer 1-100\nf�r att se en T�vlande");
		int input = scan.nextInt();
		System.out.println(tagare.printOne(input-1));// Uppdaterad 
		
		scan.close();
		
	}
	
	
	

}
