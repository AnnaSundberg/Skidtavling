package com.ya.skidtavling.tavla;

import java.util.Random;

import com.ya.skidtavling.participants.Participants;

public class Race {// Flyttad till egen klass f�r att snygga till det hela

	Random rand = new Random();
	
	public void race(CompetitionBoard compBoard) {// tar listan som Parameter
		boolean raceOn = true;
		int trackDistance = 250;// Ny variable som s�tter v�rdet av loppets L�ngd
		long plusSec = 15;// l�gger p� 15 sekunder f�r alla varje varv
		int finishPlace = 1;//f�r m�lg�ngsPlats
		int midPlace = 1;// midTimePlats
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
					if (!p.isPassedMiddle() && p.getDistance()>=trackDistance/2) {
						if(!p.isPassedMiddle() && p.getDistance()<=(trackDistance/2)+5) {// vet inte om detta g�r s� mkt l�ngre
							// om l�ngd �r 500 ha denna p� 250
							System.out.println("midList Update-----------------------------------------");
							p.setPlace(midPlace);
							midListUpdate(p,compBoard);// ny metod som g�r jobbet 
							midPlace++;
							p.setPassedMiddle(true);
						}else break;
						
					}else if(p.isPassedMiddle() && p.getDistance()>trackDistance/2) {
						System.out.println(" ----");}// kan det vara detta som buggar det hela och g�r s� det krashar ?
					
					if (p.getDistance() >= trackDistance) {// gissar p� att denna �r den som styr loppets l�ngd. testa om det g�r att g�ra det l�ngre med 500 ist�llet
						p.setPlace(finishPlace);
						System.out.println("\n  " + p.getForName() + " " + p.getLastName() + " Har G�tt i m�l");
						finishPlace++;
						p.setDistance(p.getDistance());
						compBoard.resultBoard.add(p);
						p.setNotFinished(true);
 
					}
					// F�redetta buggar �r nu l�st med denna kod. Alla Deltagare f�r faktiskt komma i m�l! 
					int winnerListSize = compBoard.participantsList.size();// bryr vi oss om det �r n�gon stackare som inte kommer till m�l n�r vi l�gger in nya �kare f�r hand ?? 
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

	}// verkar st�mma med Hans Hypot�s att det var en pekare som beh�vdes korrigera
		// nu f�r vi ut mellantiden som det �r t�nkt

	public void midListUpdate(Participants p, CompetitionBoard compBoard) {
		// g�r en ny deltagare och copy n pastear V�rderna f�r att sedan spara in dem i
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
