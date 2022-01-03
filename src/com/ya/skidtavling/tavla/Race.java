package com.ya.skidtavling.tavla;

import java.util.Random;

import com.ya.skidtavling.competion.Competitions;
import com.ya.skidtavling.competion.HandleIncidents;
import com.ya.skidtavling.competion.Incidents;
import com.ya.skidtavling.competion.Wlogg;
import com.ya.skidtavling.participants.Participants;

public class Race {// Flyttad till egen klass för att snygga till det hela

	Random rand = new Random();
	
	public void race(CompetitionBoard compBoard,Competitions comp1) {// tar listan som Parameter
		Incidents ins = new Incidents();
		new HandleIncidents(ins);
		boolean raceOn = true;
		long plusSec = 15;// lägger på 15 sekunder för alla varje varv
		int raknavarv= 0;
		int antdiskade =0;
		int speed = 5;
		int placering =1;
		//Incidents ins;
		ins = comp1.getIns();
		
		
		// Set upp tävlingskörning; lopplängd, mellantid,väntetid
		int sl = comp1.getSparLangd();
		int pmt = comp1.getPlaceMellantid();
		int mt = sl*pmt/100;
		int vanta= comp1.getNbrSlut()* 10;
		
		boolean isOK;
		//skriv loggpost tävlinsstart;
		
		isOK=Wlogg.nyevent(1,"start_tavling",5,"längd:"+ sl/100 + " km mellantid: " + mt/100 );
		Participants expelledpartlist;
		for (Participants p1 : compBoard.participantsList) {
			p1.setNotFinished(false);
			p1.setDistance(0);
			p1.setExpelled(false);
		}
		
		do {

			for (Participants p : compBoard.participantsList) {// ställer upp listan

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
					 * Idé 'är att vi skall använda randen för att generera fram en tid som blir
					 * kopplad till tid
					 */
					p.startTime.setSec(p.startTime.getSec() + plusSec);// man måste ta class metoderna så fungera det :)
//					System.out.println(p.toString());
					// Här måste tittas över
					if (!p.isPassedMiddle() && p.getDistance() >= 50) {
						if (!p.isPassedMiddle() && p.getDistance() <= 55) {// vet inte om detta gör så mkt längre

							System.out.println("midList Update-----------------------------------------");
							midListUpdate(p, compBoard);// ny metod som gör jobbet
//							compBoard.midTimeList.add(p);
							p.setPassedMiddle(true);
						} else
							break;

					} else if (p.isPassedMiddle() && p.getDistance() > 50) {
						System.out.println(" ----");
					}

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
	}// verkar stämma med Hans Hypotés att det var en pekare som behövdes korrigera
		// nu får vi ut mellantiden som det är tänkt
//	public void midListUpdate(Participants p,CompetitionBoard compBoard) {
//		// gör en ny deltagare och copy n pastar Värderna för att sedan spara in dem i
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
//	Kodförklaringar:
//	konsekvenskod		1->Tidstilägg; enskild åkare saktar ner
//						2->uteslutning ur tävlingen diskvalificerad
//						3->Sjukvård utgår ur tävlingen
//						4->kollektiv fartminskning berör samtliga tex snöyra
//						5->Stillastående en period av betydelse	

	private int konsekvenshandler(Participants p, int konsekvensKod, int hast) {
		// TODO Auto-generated method stub
		int pos = p.getDistance();
		switch (konsekvensKod) {

		case 0:
			pos = (pos - rand.nextInt(15));
			break;// tidsförlust, måttlig
		case 1:
			pos = (pos - rand.nextInt(30));
			break;// tidsförlust större
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
			break; // bromsa alla hårt
		default:
			pos = (pos - rand.nextInt(10));
		}
		p.setDistance(pos); // uppdatera position obs mellantider...

		return hast;
	}

	// verkar stämma med Hans Hypotés att det var en pekare som behövdes korrigera
	// nu får vi ut mellantiden som det är tänkt
	public void midListUpdate(Participants p, CompetitionBoard compBoard) {
		// gör en ny deltagare och copy n pastar Värderna för att sedan spara in dem i
		// Mid mellantidsListan
//		System.out.println("2midlist " +p.getDistance());
		Participants midListPar = new Participants(p.getParticipantNumber(), p.getForName(), p.getLastName(),
				p.getPlace(), p.getStartTime(), p.getDistance(), p.isNotFinished(), p.isPassedMiddle());
		compBoard.midTimeList.add(midListPar);

		boolean isOK = Wlogg.nyevent(1, "Mellantid", 5, p.getForName() + " " + p.getLastName());
	}

}
