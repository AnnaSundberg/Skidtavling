package com.ya.joakim.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

import com.ya.skidtavling.deltagare.Participants;

public class TavlingsTavla {

	Participants[] deltagareLista = new Participants[100];

	public void fill() {
		Random rand = new Random();

		try (BufferedReader fReader = new BufferedReader(new FileReader("Deltagare.txt"))) {

			String line;

			int i = 0;
			while ((line = fReader.readLine()) != null) {
				String split[] = line.split(" ");
				String fName = split[0];
				String lName = split[1];
				int randNum = rand.nextInt(100);

				Participants newDeltag = new Participants(randNum, fName, lName, i + 1);

				deltagareLista[i] = newDeltag;
				i++;

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

	public Participants printOne(int x) {
		return deltagareLista[x];
	}

}
