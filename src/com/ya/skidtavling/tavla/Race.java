package com.ya.skidtavling.tavla;

import java.util.Random;

import com.ya.skidtavling.participants.Participants;

public class Race {// Flyttad till egen klass för att snygga till det hela

	Random rand = new Random();
	
	public void race(CompetitionBoard compBoard) {// tar listan som Parameter
		boolean raceOn = true;
		int trackDistance = 250;// Ny variable som sätter värdet av loppets Längd
		long plusSec = 15;// lägger på 15 sekunder för alla varje varv
		int finishPlace = 1;//för målgångsPlats
		int midPlace = 1;// midTimePlats
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
					if (!p.isPassedMiddle() && p.getDistance()>=trackDistance/2) {
						if(!p.isPassedMiddle() && p.getDistance()<=(trackDistance/2)+5) {// vet inte om detta gör så mkt längre
							// om längd är 500 ha denna på 250
							System.out.println("midList Update-----------------------------------------");
							p.setPlace(midPlace);
							midListUpdate(p,compBoard);// ny metod som gör jobbet 
							midPlace++;
							p.setPassedMiddle(true);
						}else break;
						
					}else if(p.isPassedMiddle() && p.getDistance()>trackDistance/2) {
						System.out.println(" ----");}// kan det vara detta som buggar det hela och gör så det krashar ?
					
					if (p.getDistance() >= trackDistance) {// gissar på att denna är den som styr loppets längd. testa om det går att göra det längre med 500 istället
						p.setPlace(finishPlace);
						System.out.println("\n  " + p.getForName() + " " + p.getLastName() + " Har Gått i mål");
						finishPlace++;
						p.setDistance(p.getDistance());
						compBoard.resultBoard.add(p);
						p.setNotFinished(true);
 
					}
					// Föredetta buggar är nu löst med denna kod. Alla Deltagare får faktiskt komma i mål! 
					int winnerListSize = compBoard.participantsList.size();// bryr vi oss om det är någon stackare som inte kommer till mål när vi lägger in nya åkare för hand ?? 
						if (compBoard.resultBoard.size()<=99) {
//						if (compBoard.resultBoard.size()<=winnerListSize) {
							System.out.println(compBoard.participantsList.size());
							raceOn = true;
					}
						else
							raceOn = false;
				}
			}

	}while(raceOn);

	}// verkar stämma med Hans Hypotés att det var en pekare som behövdes korrigera
		// nu får vi ut mellantiden som det är tänkt

	public void midListUpdate(Participants p, CompetitionBoard compBoard) {
		// gör en ny deltagare och copy n pastear Värderna för att sedan spara in dem i
		// Mid mellantidsListan
		Participants midListPar = new Participants(p.getParticipantNumber()
				, p.getForName()
				, p.getLastName()
				, p.getPlace()
				, p.getStartTime()
				, p.getDistance()
				, p.isNotFinished()
				, p.isPassedMiddle());
		compBoard.midTimeList.add(midListPar);
	}

}
