package com.ya.skidtavling.participants;

import java.util.ArrayList;
import java.util.Scanner;

import com.ya.skidtavling.time.Time;
/**
 * 
 * @author annamsundberg
 * Meningen �r att man ska kunna s�ka i ArrayList efter F�r & Efternamn eller endast det ena eller det andra.
 * Men just nu funkar det ej men vi kan v�ll kolla tsm sen :D
 */
public class SearchParticipant{


	public String sp() {
		boolean found = false;
		this.sp();
//		ArrayList<Participants> searchPart;
		Scanner input = new Scanner(System.in);
		String search = input.nextLine();
		{
			for (Participants p : searchPart) {
				if (p.getForName().equals(search) || p.getLastName().equals(search)) {
					System.out.println(p);
					found = true;
				}
			}
			if (found != true) {
				System.out.println("Kunde inte hitta deltagare.");
				
			}
		}
		return search;
	}

}
