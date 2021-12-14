package com.ya.skidtavling.tavla;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

import com.ya.skidtavling.deltagare.Participants;
import com.ya.skidtavling.time.Time;

public class TavlingsTavla {

	Random rand = new Random();
	public List<Participants> dl = new ArrayList<>();// kanske skall byta ut arrayen till en LISTA istället.
	public List<Participants> resultBoard = new ArrayList<>();

	public void fill() {

		// Läser in deltagarena från filen
		try (BufferedReader fReader = new BufferedReader(new FileReader("Deltagare.txt"))) {

			String line;
			int i = 0;

			// Time newTime = new Time(13507);

			// ställer upp deltagarna rad för rad
			while ((line = fReader.readLine()) != null) {
				String split[] = line.split(" ");// stringSplitar raden
				String fName = split[0];// sparar förnamn
				String lName = split[1];// sparar efternamn
				int randNum = rand.nextInt(100);

				Participants newDeltag = new Participants(randNum, fName, lName, i + 1, null, 0, false);

				dl.add(newDeltag);
				i++;

			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Succes!");
		}

	}

	public void tidsDelning() {
		long max = 500;
		long min = 100;

		for (Participants p : dl) {
			long longsetTid = rand.nextLong() % (max - min) + max;
			Time nytid = new Time(longsetTid);
			p.setStartTid(nytid);
		}
	}

	public void printList() {

		for (Participants s : dl) {
			System.out.println(s);
		}
	}

	public void printList2() {

		for (Participants s : resultBoard) {
			System.out.println(s);
		}
	}

	public void race() {
		boolean raceOn = true;
		do {

			for (Participants p : dl) {

				if (!p.isNotFinished()) {
					p.setDistance(p.getDistance() + rand.nextInt(10));

					System.out.println(p.toString());

					if (p.getDistance() >= 100) {
						System.out.println("\n  " + p.getForName() + " " + p.getLastName() + " Har Gått i mål");

						p.setDistance(p.getDistance());
						resultBoard.add(p);
						p.setNotFinished(true);

					}
					if (p.isNotFinished()) {
						for (Participants p1 : dl) {
							if (p1.isNotFinished()) {
								raceOn = false;
							} else
								raceOn = true;
						}
					}
				}
			}

		} while (raceOn);
	}

}
