package com.ya.skidtavling.tavla;

import java.util.*;

import com.ya.skidtavling.participants.Participants;
import com.ya.skidtavling.time.Time;

public class CompetitionBoard {

	Random rand = new Random();
	public List<Participants> participantsList = new ArrayList<>();
	public List<Participants> resultBoard = new ArrayList<>();
	public List<Participants> midTimeList = new ArrayList<>();
	
	
// tilldela tiden mer efter ett klockslag och inte en random. f�r att g�ra det helt verkligare.
	public void startingTime() {// hur fungerar detta ???? 
		long max = 500;
		long min = 100;
		long twoPm = 50400;// kl �r 1400.
//		for (Participants p : participantsList) {
//			long longSetTime = rand.nextLong() % (max - min) + max;
//			Time newTime = new Time(longSetTime);
//			p.setStartTime(newTime);
//		}
		for(Participants p:participantsList) {
			Time startTime = new Time(twoPm);
			p.setStartTime(startTime);
			
		}
	}
// Dessa tre kanske kan g�ras om till egna klasser. 
	public void printParticipantsBoard() {

		for (Participants s : participantsList) {
			System.out.println(s);
		}
	}

	public void printResultBoard() {

		for (Participants s : resultBoard) {
			System.out.println(s);
		}
	}
	public void printMidTimeList() {
		for (Participants s : midTimeList) {
			System.out.println(s);
		}
	}
	//ett f�rs�k till vinnar upvissning . . .. 
	public void printWinnerBoard() {
		String firstPlaced = resultBoard.get(0).getForName()+" "+resultBoard.get(0).getLastName();
		String secondPlaced = resultBoard.get(1).getForName()+" "+resultBoard.get(1).getLastName();
		String thirdPlaced =resultBoard.get(2).getForName()+" "+resultBoard.get(2).getLastName();
		System.out.print("\n\t"+firstPlaced+"\n\t    1#\n"+secondPlaced +"\t"+thirdPlaced+"\n\t#2\t    #3\n");
		
	}
// g�ra om till en egen klass ha som objekt n�gon annanstans
	
	public void race() {
		boolean raceOn = true;
		long plusSec = 15;
		
		do {

			for (Participants p : participantsList) {

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
							midTimeList.add(p);
							p.setPassedMiddle(true);
						}else break;
			
					}else if(p.isPassedMiddle() && p.getDistance()>50) {
						System.out.println(" ----");}
					
					if (p.getDistance() >= 100) {
						System.out.println("\n  " + p.getForName() + " " + p.getLastName() + " Har G�tt i m�l");

						p.setDistance(p.getDistance());
						resultBoard.add(p);
						p.setNotFinished(true);

					}
				
					if (p.isNotFinished()) {
						for (Participants p1 : participantsList) {
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
