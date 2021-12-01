package com.ya.skidtavling.main;


import com.ya.skidtavling.deltagare.Participants;

public class Main {

	public static void main(String[] args) {
		Participants[] deltagareLista = new Participants[100];
		
		//int plats = 0;
		for(int i = 0;i<deltagareLista.length;i++) {
			Participants deltagare = new Participants("1","Gunde",i);
			deltagareLista[i]= deltagare;
			//plats++;
		}
		for(int i = 0;i<deltagareLista.length;i++) {
			System.out.println(deltagareLista[i]);
			
		}
		System.out.println("\n\n\n"+deltagareLista[9]);

	}

}
