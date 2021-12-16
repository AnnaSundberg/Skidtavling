package com.ya.skidtavling.main;

import java.util.ArrayList;
import java.util.List;

import com.ya.skidtavling.menu.Menu;
import com.ya.skidtavling.participants.Participants;
import com.ya.skidtavling.time.Time;

public class Main {
//	public List<Participants> participantsList = new ArrayList<>();
//	public List<Participants> resultBoard = new ArrayList<>();
	public static void main(String[] args) throws InterruptedException {
		
		Time newTime = new Time(13507);
		System.out.println(newTime.toString());
		Menu menu = new Menu(); // instans för meny klassen
		menu.runMenu(); // kallar på runMenu klassen som skriver ut välkommen rutan och sedan valen
	
		System.out.println("\n");
		menu.compBoard.printResultBoard();

		
	}

}
