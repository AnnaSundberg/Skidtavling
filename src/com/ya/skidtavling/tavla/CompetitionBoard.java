package com.ya.skidtavling.tavla;

import java.util.*;

import com.ya.skidtavling.participants.Participants;
import com.ya.skidtavling.time.Time;

public class CompetitionBoard {
	
	// Instanser för listorna som används i programmet
	public List<Participants> participantsList = new ArrayList<>();
	public List<Participants> resultBoard = new ArrayList<>();
	public List<Participants> midTimeList = new ArrayList<>();
	
	// Ställer upp listan men med en slumpad metod detta gör att det inte är första namnet som 
	// skrivs ut , utan ett slumpat namn ,Denna metod anropar även TidsTilldelnings metoden.
	public void randomizeList() {
		Collections.shuffle(participantsList);
		startingTime();
		for (Participants s : participantsList) {
			System.out.println(s);
		}
			   
	}
// tilldela tiden mer efter ett klockslag och inte en random. för att göra det helt verkligare.
	public void startingTime() {// hur fungerar detta ???? 

		long twoPm = 50400;// kl är 1400.
		long plusTime = 0;
		for(Participants p:participantsList) {
			Time startTime = new Time(twoPm+plusTime);
			p.setStartTime(startTime);
			plusTime+=15;// lägger på 15 för tilldelning av intervallstart
			
			// vi Skiter i detta !! 
			// behöver någon typ av start och mål tid för att få någon typ av offset 
			// funderar på om man kanske inte skall ha en till parameter i Participant som 
			// heter just finnishingTime lr något 
			
		}
	}
	
// Dessa tre kanske kan göras om till egna klasser. 
	public void printParticipantsBoard() {// den här andvänds inte längre 

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
	public void printWinnerBoard()// Skriver ut vinnarna i tävlingen 
	{
		try
		{// gör en strängar av index 1,3,2 i Resultatlistan Och sparar dessa 3s för och efternamn 
			// för att sedan skirva utt dessa på skärmen lite snyggt
		String firstPlaced = resultBoard.get(0).getForName()+" "+resultBoard.get(0).getLastName();
		String secondPlaced = resultBoard.get(1).getForName()+" "+resultBoard.get(1).getLastName();
		String thirdPlaced =resultBoard.get(2).getForName()+" "+resultBoard.get(2).getLastName();
		System.out.print("\n\t"+firstPlaced+"\n\t    1#\n"+secondPlaced +"\t"+thirdPlaced+"\n\t#2\t    #3\n");
		}
		catch (Exception e)
		{
			System.out.print("Finns inga eller för få vinnare...");
			return ;
		}
		  

	}
}
