package com.ya.skidtavling.tavla;

import java.util.Random;

import com.ya.skidtavling.participants.Participants;
import com.ya.skidtavling.time.Time;
/*Race Klassen fungerar s� att man kasta in listan av Deltagare och loopar 
 * igenom den med en forEach, f�r varje deltagare s� �ndrar han 
 * p� dess diverse v�rden som Distanc och tid
 * N�r deltagaren har n�tt 50% av loppet s� sparas 
 * den in i en MellantidsLista
 * f�r att sedan forts�tta till m�l och d� sparas deltagaren i en ResultatLista  
 * */
public class Race {// Flyttad till egen klass f�r att snygga till det hela

	Random rand = new Random();

	public void race(CompetitionBoard compBoard) {// tar listan som Parameter
		boolean raceOn = true;
		int trackDistance = 250;// Ny variable som s�tter v�rdet av loppets L�ngd
		long plusSec = 15;// l�gger p� 15 sekunder f�r alla varje varv
		int finishPlace = 1;// f�r m�lg�ngsPlats
		int midPlace = 1;// midTimePlats
		long getMidTimeFromPartic = 0;// long f�r mellantiden

		do {

			for (Participants p : compBoard.participantsList) {// st�ller upp listan

				if (!p.isNotFinished()) {
					p.setDistance(p.getDistance() + rand.nextInt(5));
					p.startTime.setSec(p.startTime.getSec() + plusSec);// man m�ste ta class metoderna s� fungera det :)
					System.out.println(p.toString());
					// Har �karen n�tt mitten ?
					if (!p.isPassedMiddle() && p.getDistance() >= trackDistance / 2) {
						if (!p.isPassedMiddle() && p.getDistance() <= (trackDistance / 2) + 5) {
							System.out.println("midList Update-----------------------------------------");
							p.setPlace(midPlace);
							getMidTimeFromPartic = p.getStartTime().getSec();
							Time midTime = new Time(getMidTimeFromPartic); // skapar ett Time Objekt f�r mellan tiden
							midListUpdate(p, compBoard, midTime);// ny metod som g�r jobbet
							midPlace++;
							p.setPassedMiddle(true);
						} else
							break;

					} else if (p.isPassedMiddle() && p.getDistance() > trackDistance / 2) {
						System.out.println(" ----");
					} // kan det vara detta som buggar det hela och g�r s� det krashar ?

					if (p.getDistance() >= trackDistance) {
						p.setPlace(finishPlace);
						System.out.println("\n  " + p.getForName() + " " + p.getLastName() + " Har G�tt i m�l");
						finishPlace++;
						p.setDistance(p.getDistance());
						compBoard.resultBoard.add(p);// Sparar deltagaren i ResultatListan
						p.setNotFinished(true);

					}
					// F�redetta buggar �r nu l�st med denna kod. Alla Deltagare f�r faktiskt komma
					// i m�l!
					// Om man inte registerar ny �kare . . .
					if (compBoard.resultBoard.size() <= 99) {

						raceOn = true;
					} else
						raceOn = false;
				}
			}

		} while (raceOn);

	}// verkar st�mma med Hans Hypot�s att det var en pekare som beh�vdes korrigera
		// nu f�r vi ut mellantiden som det �r t�nkt

	public void midListUpdate(Participants p, CompetitionBoard compBoard, Time midTime) {// kastar nu in mellantiden
		// g�r en ny deltagare och copy n pastear V�rderna f�r att sedan spara in dem i
		// Mid mellantidsListan
		Participants midListPar = new Participants(p.getParticipantNumber()
				, p.getForName()
				, p.getLastName()
				, p.getPlace()
				, p.getStartTime()//Den h�r g�r inte att ta bort Men i o med midTime S� sparas han r�tt.
				, p.getDistance()
				, p.isNotFinished()
				, p.isPassedMiddle());
		midListPar.setStartTime(midTime);// s�tter mellantiden f�r mellantidslistan
		compBoard.midTimeList.add(midListPar);// l�gger till �karen i listan f�r mellantid
	}

}
