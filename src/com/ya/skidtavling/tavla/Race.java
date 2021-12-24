package com.ya.skidtavling.tavla;

import java.util.Random;

import com.ya.skidtavling.participants.Participants;

public class Race {// Flyttad till egen klass f�r att snygga till det hela 
	
	Random rand = new Random();

	public void race(CompetitionBoard compBoard) {
		boolean raceOn = true;
		long plusSec = 15;
		
		do {

			for (Participants p : compBoard.participantsList) {

				if (!p.isNotFinished()) {
					p.setDistance(p.getDistance() + rand.nextInt(5));
					/*Id� '�r att vi skall anv�nda randen f�r att generera fram en tid som blir kopplad 
					 * till tid
					 * */
					p.startTime.setSec(p.startTime.getSec()+plusSec);// man m�ste ta class metoderna s� fungera det :) 
					System.out.println(p.toString());
					//H�r m�ste tittas �ver 
					if (!p.isPassedMiddle() && p.getDistance()>=50) {
						if(!p.isPassedMiddle() && p.getDistance()<=55) {
							
							System.out.println("midList Update-----------------------------------------");
							compBoard.midTimeList.add(p);
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
				
					if (p.isNotFinished()) {
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
	}

}
