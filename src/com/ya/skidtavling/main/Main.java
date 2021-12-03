package com.ya.skidtavling.main;

import com.ya.joakim.test.TavlingsTavla;
import com.ya.skidtavling.person.Person;


public class Main {

	public static void main(String[] args) {
		TavlingsTavla tagare = new TavlingsTavla();

		tagare.fill();
		//tagare.printList();
		System.out.println(tagare.printOne(44));
		
		
		
	}
	
	
	

}
