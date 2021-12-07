package com.ya.skidtavling.tavla;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

import com.ya.skidtavling.deltagare.Participants;

public class TavlingsTavla {

	Participants[] deltagareLista = new Participants[100];
	
	ArrayList<Participants> dl = new ArrayList<Participants>();
	
	public void fill() {
		Random rand = new Random();
		// Läser in deltagarena från filen
		try (BufferedReader fReader = new BufferedReader(new FileReader("Deltagare.txt"))) {

			String line;
			int i = 0;
			long tid = 0;
			//ställer upp deltagarna rad för rad
			while ((line = fReader.readLine()) != null) {
				String split[] = line.split(" ");// stringSplitar raden 
				String fName = split[0];// sparar förnamn 
				String lName = split[1];// sparar efternamn
				int randNum = rand.nextInt(100);
				
				Participants newDeltag = new Participants(randNum, fName, lName, i + 1,tid);
										//skapar objektet som innan men nu kopplat med Personklassen.					
				deltagareLista[i] = newDeltag;
				i++;
				tid +=15;

			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Succes!");
		}
	}

	public void printList() {
		for (int k = 0; k < deltagareLista.length; k++) {
			System.out.println(deltagareLista[k]);
		}
	}
		public Participants printOne(int x) {// den Här verkar inte fungera*note Uppdaterad
		return deltagareLista[x];
	}

}
