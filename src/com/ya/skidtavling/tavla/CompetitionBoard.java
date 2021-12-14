package com.ya.skidtavling.tavla;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

import com.ya.skidtavling.participants.Participants;
import com.ya.skidtavling.time.Time;

public class CompetitionBoard {

	Random rand = new Random();
	public List<Participants> participantsList = new ArrayList<>();
	public List<Participants> resultBoard = new ArrayList<>();

	public void fill() {

		// Läser in deltagarena från filen
		try (BufferedReader fReader = new BufferedReader(new FileReader("Deltagare.txt"))) {

			String line;
			int i = 0;			


			// ställer upp deltagarna rad för rad
			while ((line = fReader.readLine()) != null) {
				String split[] = line.split(" ");// stringSplitar raden
				String fName = split[0];// sparar förnamn
				String lName = split[1];// sparar efternamn
				int randNum = rand.nextInt(100);

				Participants newParticipant = new Participants(randNum, fName, lName, i + 1, null, 0, false);

				participantsList.add(newParticipant);
				i++;

			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Listan är nu fylld!");
		}

	}

	public void startingTime() {
		long max = 500;
		long min = 100;

		for (Participants p : participantsList) {
			long longSetTime = rand.nextLong() % (max - min) + max;
			Time newTime = new Time(longSetTime);
			p.setStartTime(newTime);
		}
	}

	public void printParticipantsBoard() {

		for (Participants s : participantsList) {
			System.out.println(s);
		}
	}

	public void printResultBoard() {

		for (Participants s : resultBoard) {
			System.out.println(s);
		}
	}

	public void race() {
		boolean raceOn = true;
		do {

			for (Participants p : participantsList) {

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
						for (Participants p1 : participantsList) {
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
