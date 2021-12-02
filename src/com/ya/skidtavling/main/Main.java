package com.ya.skidtavling.main;


import java.io.BufferedReader;
import java.io.FileReader;

import com.ya.skidtavling.deltagare.Participants;

public class Main {

	public static void main(String[] args) {
		Participants[] deltagareLista = new Participants[100];
		
		try (BufferedReader fReader = new BufferedReader(new FileReader("Deltagare.txt"))){
			String line;
			int i = 0;
			while((line = fReader.readLine())!=null) {
				//System.out.println(line);
				Participants newDeltag = new Participants(line, line, i);
				deltagareLista[i] = newDeltag;
				i++;
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		for(int k =0;k<deltagareLista.length;k++) {
			System.out.println(deltagareLista[k]);
		}
		System.out.println(deltagareLista[15]);
		System.out.println("\n\n\n-------Meny-------\n");
		System.out.println("deltagare : namn Plats och skill");
	}

}
