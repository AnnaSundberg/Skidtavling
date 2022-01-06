package com.ya.skidtavling.tavla;

import java.util.Random;

import com.ya.skidtavling.participants.Participants;
import com.ya.skidtavling.time.Time;
/*Race Klassen fungerar så att man kasta in listan av Deltagare och loopar 
 * igenom den med en forEach, för varje deltagare så ändrar han 
 * på dess diverse värden som Distanc och tid
 * När deltagaren har nått 50% av loppet så sparas 
 * den in i en MellantidsLista
 * för att sedan fortsätta till mål och då sparas deltagaren i en ResultatLista  
 * */
public class Race {// Flyttad till egen klass för att snygga till det hela

	Random rand = new Random();

	public void race(CompetitionBoard compBoard) {// tar listan som Parameter
		boolean raceOn = true;
		int trackDistance = 250;// Ny variable som sätter värdet av loppets Längd
		long plusSec = 15;// lägger på 15 sekunder för alla varje varv
		int finishPlace = 1;// för målgångsPlats
		int midPlace = 1;// midTimePlats
		long getMidTimeFromPartic = 0;// long för mellantiden

		do {

			for (Participants p : compBoard.participantsList) {// ställer upp listan

				if (!p.isNotFinished()) {
					p.setDistance(p.getDistance() + rand.nextInt(5));
					p.startTime.setSec(p.startTime.getSec() + plusSec);// man måste ta class metoderna så fungera det :)
					System.out.println(p.toString());
					// Har åkaren nått mitten ?
					if (!p.isPassedMiddle() && p.getDistance() >= trackDistance / 2) {
						if (!p.isPassedMiddle() && p.getDistance() <= (trackDistance / 2) + 5) {
							System.out.println("midList Update-----------------------------------------");
							p.setPlace(midPlace);
							getMidTimeFromPartic = p.getStartTime().getSec();
							Time midTime = new Time(getMidTimeFromPartic); // skapar ett Time Objekt för mellan tiden
							midListUpdate(p, compBoard, midTime);// ny metod som gör jobbet
							midPlace++;
							p.setPassedMiddle(true);
						} else
							break;

					} else if (p.isPassedMiddle() && p.getDistance() > trackDistance / 2) {
						System.out.println(" ----");
					} // kan det vara detta som buggar det hela och gör så det krashar ?

					if (p.getDistance() >= trackDistance) {
						p.setPlace(finishPlace);
						System.out.println("\n  " + p.getForName() + " " + p.getLastName() + " Har Gått i mål");
						finishPlace++;
						p.setDistance(p.getDistance());
						compBoard.resultBoard.add(p);// Sparar deltagaren i ResultatListan
						p.setNotFinished(true);

					}
					// Föredetta buggar är nu löst med denna kod. Alla Deltagare får faktiskt komma
					// i mål!
					// Om man inte registerar ny åkare . . .
					if (compBoard.resultBoard.size() <= 99) {

						raceOn = true;
					} else
						raceOn = false;
				}
			}

		} while (raceOn);

	}// verkar stämma med Hans Hypotés att det var en pekare som behövdes korrigera
		// nu får vi ut mellantiden som det är tänkt

	public void midListUpdate(Participants p, CompetitionBoard compBoard, Time midTime) {// kastar nu in mellantiden
		// gör en ny deltagare och copy n pastear Värderna för att sedan spara in dem i
		// Mid mellantidsListan
		Participants midListPar = new Participants(p.getParticipantNumber()
				, p.getForName()
				, p.getLastName()
				, p.getPlace()
				, p.getStartTime()//Den här går inte att ta bort Men i o med midTime Så sparas han rätt.
				, p.getDistance()
				, p.isNotFinished()
				, p.isPassedMiddle());
		midListPar.setStartTime(midTime);// sätter mellantiden för mellantidslistan
		compBoard.midTimeList.add(midListPar);// lägger till åkaren i listan för mellantid
	}

}
