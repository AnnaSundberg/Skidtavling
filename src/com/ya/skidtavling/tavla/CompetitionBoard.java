package com.ya.skidtavling.tavla;

import java.util.*;

import com.ya.skidtavling.participants.Participants;
import com.ya.skidtavling.time.Time;

public class CompetitionBoard {
	
	// Instanser f�r listorna som anv�nds i programmet
	public List<Participants> participantsList = new ArrayList<>();
	public List<Participants> resultBoard = new ArrayList<>();
	public List<Participants> midTimeList = new ArrayList<>();
	
	// St�ller upp listan men med en slumpad metod detta g�r att det inte �r f�rsta namnet som 
	// skrivs ut , utan ett slumpat namn ,Denna metod anropar �ven TidsTilldelnings metoden.
	public void randomizeList() {
		Collections.shuffle(participantsList);
		startingTime();
		for (Participants s : participantsList) {
			System.out.println(s);
		}
			   
	}
// tilldela tiden mer efter ett klockslag och inte en random. f�r att g�ra det helt verkligare.
	public void startingTime() {// hur fungerar detta ???? 

		long twoPm = 50400;// kl �r 1400.
		long plusTime = 0;
		for(Participants p:participantsList) {
			Time startTime = new Time(twoPm+plusTime);
			p.setStartTime(startTime);
			plusTime+=15;// l�gger p� 15 f�r tilldelning av intervallstart
			
			// vi Skiter i detta !! 
			// beh�ver n�gon typ av start och m�l tid f�r att f� n�gon typ av offset 
			// funderar p� om man kanske inte skall ha en till parameter i Participant som 
			// heter just finnishingTime lr n�got 
			
		}
	}
	
// Dessa tre kanske kan g�ras om till egna klasser. 
	public void printParticipantsBoard() {// den h�r andv�nds inte l�ngre 

		for (Participants s : participantsList) {
			System.out.println(s);
		}
	}

	public void printResultBoard() {// Skriver ut resultalistan

		for (Participants s : resultBoard) {
			System.out.println(s);
		}
	}
	public void printMidTimeList() { // Skriver ut mellantidslistan
		for (Participants s : midTimeList) {
			System.out.println(s);
		}
	}
	public void printWinnerBoard()// Skriver ut vinnarna i t�vlingen 
	{
		try
		{// g�r en str�ngar av index 1,3,2 i Resultatlistan Och sparar dessa 3s f�r och efternamn 
			// f�r att sedan skirva utt dessa p� sk�rmen lite snyggt
		String firstPlaced = resultBoard.get(0).getForName()+" "+resultBoard.get(0).getLastName();
		String secondPlaced = resultBoard.get(1).getForName()+" "+resultBoard.get(1).getLastName();
		String thirdPlaced =resultBoard.get(2).getForName()+" "+resultBoard.get(2).getLastName();
		System.out.print("\n\t"+firstPlaced+"\n\t    1#\n"+secondPlaced +"\t"+thirdPlaced+"\n\t#2\t    #3\n");
		}
		catch (Exception e)
		{
			System.out.print("Finns inga eller f�r f� vinnare...");
			return ;
		}
		  

	}
}
