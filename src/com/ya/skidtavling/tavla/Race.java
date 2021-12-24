package com.ya.skidtavling.tavla;

import java.util.Random;

import com.ya.skidtavling.participants.Participants;

public class Race {// Flyttad till egen klass för att snygga till det hela 
	
	Random rand = new Random();

	public void race(CompetitionBoard compBoard) {
		boolean raceOn = true;
		long plusSec = 15;
		
		do {

			for (Participants p : compBoard.participantsList) {

				if (!p.isNotFinished()) {
					p.setDistance(p.getDistance() + rand.nextInt(5));
					/*Idé 'är att vi skall använda randen för att generera fram en tid som blir kopplad 
					 * till tid
					 * */
					p.startTime.setSec(p.startTime.getSec()+plusSec);// man måste ta class metoderna så fungera det :) 
					System.out.println(p.toString());
					//Här måste tittas över 
					if (!p.isPassedMiddle() && p.getDistance()>=50) {
						if(!p.isPassedMiddle() && p.getDistance()<=55) {
							
							System.out.println("midList Update-----------------------------------------");
							midListUpdate(p,compBoard);
//							compBoard.midTimeList.add(p);
							p.setPassedMiddle(true);
						}else break;
			
					}else if(p.isPassedMiddle() && p.getDistance()>50) {
						System.out.println(" ----");}
					
					if (p.getDistance() >= 100) {
						System.out.println("\n  " + p.getForName() + " " + p.getLastName() + " Har Gått i mål");

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
	}// verkar stämma med Hans Hypotés att det var en pekare som behövdes korrigera nu får vi ut mellantiden som det är tänkt 
	public void midListUpdate(Participants p,CompetitionBoard compBoard) {
		
		Participants midListPar = new Participants(p.getParticipantNumber(),p.getForName(),p.getLastName(), p.getPlace(), p.getStartTime(), p.getDistance(), p.isNotFinished(),p.isPassedMiddle());
		compBoard.midTimeList.add(midListPar);
	}

}
