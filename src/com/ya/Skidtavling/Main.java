package com.ya.skidtavling;

import com.ya.joakim.test.TestKlass;
import com.ya.skidtavling.deltagare.Participants;

public class Main {

	public static void main(String[] args) {
		// detta var bara fï¿½r test :) och det fungerade 
		TestKlass test = new TestKlass();
		System.out.println(test.toString());
		System.out.println("Hej");
		System.out.println();
		
		
		System.out.println("Årets deltagare Damer:");
		Participants p1 = new Participants("57", "Kalla", 0);
		Participants p2 = new Participants("88", "Hägström", 0);
		Participants p3 = new Participants("03", "Dahlqvist", 0);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
