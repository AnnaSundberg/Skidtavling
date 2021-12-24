package com.ya.skidtavling.tavla;

import java.util.Random;

import com.ya.skidtavling.participants.Participants;

public class Race {// Flyttad till egen klass för att snygga till det hela 
	
	Random rand = new Random();

	public void race(CompetitionBoard compBoard) {// tar listan som Parameter
		boolean raceOn = true;
		long plusSec = 15;// lägger på 15 sekunder för alla varje varv
		
		do {

			for (Participants p : compBoard.participantsList) {// ställer upp listan

				if (!p.isNotFinished()) {
					p.setDistance(p.getDistance() + rand.nextInt(5));
					/*Idé 'är att vi skall använda randen för att generera fram en tid som blir kopplad 
					 * till tid
					 * */
					p.startTime.setSec(p.startTime.getSec()+plusSec);// man måste ta class metoderna så fungera det :) 
					System.out.println(p.toString());
					//Här måste tittas över 
					if (!p.isPassedMiddle() && p.getDistance()>=50) {
						if(!p.isPassedMiddle() && p.getDistance()<=55) {// vet inte om detta gör så mkt längre
							
							System.out.println("midList Update-----------------------------------------");
							midListUpdate(p,compBoard);// ny metod som gör jobbet 
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
					// den här behöver ses över en del gånger kommer de alla fram andra inte .... 
					if (p.isNotFinished()) {// kollar om någon inte kommit till mål än 
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
		// gör en ny deltagare och copy n pastar Värderna för att sedan spara in dem i
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
