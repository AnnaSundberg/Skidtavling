package com.ya.skidtavling.tavla;

import java.util.Random;

import com.ya.skidtavling.participants.Participants;

public class Race {// Flyttad till egen klass f�r att snygga till det hela 
	
	Random rand = new Random();

	public void race(CompetitionBoard compBoard) {// tar listan som Parameter
		boolean raceOn = true;
		long plusSec = 15;// l�gger p� 15 sekunder f�r alla varje varv
		
		do {

			for (Participants p : compBoard.participantsList) {// st�ller upp listan

				if (!p.isNotFinished()) {
					p.setDistance(p.getDistance() + rand.nextInt(5));
					/*Id� '�r att vi skall anv�nda randen f�r att generera fram en tid som blir kopplad 
					 * till tid
					 * */
					p.startTime.setSec(p.startTime.getSec()+plusSec);// man m�ste ta class metoderna s� fungera det :) 
					System.out.println(p.toString());
					//H�r m�ste tittas �ver 
					if (!p.isPassedMiddle() && p.getDistance()>=50) {
						if(!p.isPassedMiddle() && p.getDistance()<=55) {// vet inte om detta g�r s� mkt l�ngre
							
							System.out.println("midList Update-----------------------------------------");
							midListUpdate(p,compBoard);// ny metod som g�r jobbet 
//							compBoard.midTimeList.add(p);
							p.setPassedMiddle(true);
						}else break;
						
					}else if(p.isPassedMiddle() && p.getDistance()>50) {
						System.out.println(" ----");}
					
					if (p.getDistance() >= 100) {
						System.out.println("\n  " + p.getForName() + " " + p.getLastName() + " Har G�tt i m�l");

						p.setDistance(p.getDistance());
						compBoard.resultBoard.add(p);
						p.setNotFinished(true);

					}
					// den h�r beh�ver ses �ver en del g�nger kommer de alla fram andra inte .... 
					if (p.isNotFinished()) {// kollar om n�gon inte kommit till m�l �n 
						for (Participants p1 : compBoard.participantsList) {
							if (p1.isNotFinished()) {
								raceOn = false;
							} else
								raceOn = true;
						}
					}
				}
			}

		} while (raceOn);
	}// verkar st�mma med Hans Hypot�s att det var en pekare som beh�vdes korrigera nu f�r vi ut mellantiden som det �r t�nkt 
	public void midListUpdate(Participants p,CompetitionBoard compBoard) {
		// g�r en ny deltagare och copy n pastar V�rderna f�r att sedan spara in dem i
		// Mid mellantidsListan 
		Participants midListPar = new Participants(p.getParticipantNumber(),
				p.getForName(),
				p.getLastName(), 
				p.getPlace(),
				p.getStartTime(),
				p.getDistance(),
				p.isNotFinished(),
				p.isPassedMiddle());
		compBoard.midTimeList.add(midListPar);
	}

}
