package com.ya.skidtavling.main;

import com.ya.joakim.test.UppstallningAvDeltagare;


public class Main {

	public static void main(String[] args) {
		UppstallningAvDeltagare tagare = new UppstallningAvDeltagare();

		tagare.fill();
		System.out.println("\n\n\n-------Meny-------\n");
		System.out.println("deltagare : namn Plats och skill");
		tagare.printList();

	}
	
	
	

}
