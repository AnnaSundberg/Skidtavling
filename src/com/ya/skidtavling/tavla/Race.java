package com.ya.skidtavling.tavla;

import java.util.Random;

import com.ya.skidtavling.competion.Competitions;
import com.ya.skidtavling.competion.HandleIncidents;
import com.ya.skidtavling.competion.Incidents;
import com.ya.skidtavling.competion.Wlogg;
import com.ya.skidtavling.participants.Participants;

public class Race {// Flyttad till egen klass f�r att snygga till det hela

	Random rand = new Random();
	
	public void race(CompetitionBoard compBoard,Competitions comp1) {// tar listan som Parameter
		Incidents ins = new Incidents();
		new HandleIncidents(ins);
		boolean raceOn = true;
		long plusSec = 15;// l�gger p� 15 sekunder f�r alla varje varv
		int raknavarv= 0;
		int antdiskade =0;
		int speed = 5;
		int placering =1;
		//Incidents ins;
		ins = comp1.getIns();
		
		
		// Set upp t�vlingsk�rning; loppl�ngd, mellantid,v�ntetid
		int sl = comp1.getSparLangd();
		int pmt = comp1.getPlaceMellantid();
		int mt = sl*pmt/100;
		int vanta= comp1.getNbrSlut()* 10;
		
		boolean isOK;
		//skriv loggpost t�vlinsstart;
		
		isOK=Wlogg.nyevent(1,"start_tavling",5,"l�ngd:"+ sl/100 + " km mellantid: " + mt/100 );
		Participants expelledpartlist;
		for (Participants p1 : compBoard.participantsList) {
			p1.setNotFinished(false);
			p1.setDistance(0);
			p1.setExpelled(false);
		}
		
		do {

			for (Participants p : compBoard.participantsList) {// st�ller upp listan

				if (!p.isNotFinished()&&(!p.isExpelled())) {
					p.setDistance(p.getDistance() + rand.nextInt(5));
					if (speed !=5) {

						raknavarv++;
						if (raknavarv> vanta)
						{
						raknavarv =0;
						speed = 5;
						}
						
					}
					/*
					 * Id� '�r att vi skall anv�nda randen f�r att generera fram en tid som blir
					 * kopplad till tid
					 */
					p.startTime.setSec(p.startTime.getSec() + plusSec);// man m�ste ta class metoderna s� fungera det :)
//					System.out.println(p.toString());
					// H�r m�ste tittas �ver
					if (!p.isPassedMiddle() && p.getDistance() >= 50) {
						if (!p.isPassedMiddle() && p.getDistance() <= 55) {// vet inte om detta g�r s� mkt l�ngre

							System.out.println("midList Update-----------------------------------------");
							midListUpdate(p, compBoard);// ny metod som g�r jobbet
//							compBoard.midTimeList.add(p);
							p.setPassedMiddle(true);
						} else
							break;

					} else if (p.isPassedMiddle() && p.getDistance() > 50) {
						System.out.println(" ----");
					}

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
	}// verkar st�mma med Hans Hypot�s att det var en pekare som beh�vdes korrigera
		// nu f�r vi ut mellantiden som det �r t�nkt
//	public void midListUpdate(Participants p,CompetitionBoard compBoard) {
//		// g�r en ny deltagare och copy n pastar V�rderna f�r att sedan spara in dem i
//		// Mid mellantidsListan 
//		Participants midListPar = new Participants(p.getParticipantNumber(),
//				p.getForName(),
//				p.getLastName(), 
//				p.getPlace(),
//				p.getStartTime(),
//				p.getDistance(),
//				p.isNotFinished(),
//				p.isPassedMiddle());
//		compBoard.midTimeList.add(midListPar);
//	}
//	Kodf�rklaringar:
//	konsekvenskod		1->Tidstil�gg; enskild �kare saktar ner
//						2->uteslutning ur t�vlingen diskvalificerad
//						3->Sjukv�rd utg�r ur t�vlingen
//						4->kollektiv fartminskning ber�r samtliga tex sn�yra
//						5->Stillast�ende en period av betydelse	

	private int konsekvenshandler(Participants p, int konsekvensKod, int hast) {
		// TODO Auto-generated method stub
		int pos = p.getDistance();
		switch (konsekvensKod) {

		case 0:
			pos = (pos - rand.nextInt(15));
			break;// tidsf�rlust, m�ttlig
		case 1:
			pos = (pos - rand.nextInt(30));
			break;// tidsf�rlust st�rre
		case 2:
			p.setExpelled(true);
			break;
		case 3:
			p.setExpelled(true);
			break;
		case 4:
			hast = (hast - 2);
			break; // bromsa alla
		case 5:
			hast = (hast - 4);
			break; // bromsa alla h�rt
		default:
			pos = (pos - rand.nextInt(10));
		}
		p.setDistance(pos); // uppdatera position obs mellantider...

		return hast;
	}

	// verkar st�mma med Hans Hypot�s att det var en pekare som beh�vdes korrigera
	// nu f�r vi ut mellantiden som det �r t�nkt
	public void midListUpdate(Participants p, CompetitionBoard compBoard) {
		// g�r en ny deltagare och copy n pastar V�rderna f�r att sedan spara in dem i
		// Mid mellantidsListan
//		System.out.println("2midlist " +p.getDistance());
		Participants midListPar = new Participants(p.getParticipantNumber(), p.getForName(), p.getLastName(),
				p.getPlace(), p.getStartTime(), p.getDistance(), p.isNotFinished(), p.isPassedMiddle());
		compBoard.midTimeList.add(midListPar);

		boolean isOK = Wlogg.nyevent(1, "Mellantid", 5, p.getForName() + " " + p.getLastName());
	}

}
