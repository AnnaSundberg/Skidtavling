package com.ya.skidtavling.tavla;

import java.util.Scanner;

import com.ya.skidtavling.participants.Participants;
import com.ya.skidtavling.time.Time;

public class TimeDifference {
// L�gg till Lite mer data i Utskrift tex : namn och tid. 
	// kanske g�ra n�got liknande med mellantiderna
	public TimeDifference(CompetitionBoard comBoard) {
		try {
			Participants winner = comBoard.resultBoard.get(0);// Indexet f�r f�rsta �karen som kommer i m�l

			long found = 0;

			Scanner input = new Scanner(System.in);
			String search = input.nextLine();

			{
				for (Participants p : comBoard.resultBoard) {
					if (p.getForName().equals(search) || p.getLastName().equals(search)) {
						System.out.println(p.startTime + " vad �r det h�r ??");

						found = p.startTime.getSec();
					}
				}

				long difTime = found - winner.startTime.getSec();
				System.out.println(difTime);
				Time newTime = new Time(difTime);
				System.out.print("Vinnaren �r :" + winner.getForName() + " " + winner.getLastName());
				System.out.print(winner.startTime.toString() + "\n");
				System.out.println(" Skillnaden �r : " + newTime.toPrettyString());
			}
		} catch (Exception e) {
			System.out.println("Det finns ingen som har kommit till m�l �nnu. . .");

		}
	}
}
