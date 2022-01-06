package com.ya.skidtavling.tavla;

import java.util.Scanner;

import com.ya.skidtavling.participants.Participants;
import com.ya.skidtavling.time.Time;

public class TimeDifference {
// Lägg till Lite mer data i Utskrift tex : namn och tid. 
	// kanske göra något liknande med mellantiderna
	public TimeDifference(CompetitionBoard comBoard) {
		try {
			Participants winner = comBoard.resultBoard.get(0);// Indexet för första åkaren som kommer i mål

			long found = 0;

			Scanner input = new Scanner(System.in);
			String search = input.nextLine();

			{
				for (Participants p : comBoard.resultBoard) {
					if (p.getForName().equals(search) || p.getLastName().equals(search)) {
						System.out.println(p.startTime + " vad är det här ??");

						found = p.startTime.getSec();
					}
				}

				long difTime = found - winner.startTime.getSec();
				System.out.println(difTime);
				Time newTime = new Time(difTime);
				System.out.print("Vinnaren är :" + winner.getForName() + " " + winner.getLastName());
				System.out.print(winner.startTime.toString() + "\n");
				System.out.println(" Skillnaden är : " + newTime.toPrettyString());
			}
		} catch (Exception e) {
			System.out.println("Det finns ingen som har kommit till mål ännu. . .");

		}
	}
}
