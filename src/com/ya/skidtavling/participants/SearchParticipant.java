package com.ya.skidtavling.participants;


import java.util.Scanner;
import com.ya.skidtavling.tavla.CompetitionBoard;
// EN tillfixad sökKlass den som anna gjorde nu fungerande :)
public class SearchParticipant {
	
	public SearchParticipant(CompetitionBoard compBoard) {

			boolean found = false;
			
			Scanner input = new Scanner(System.in);
			String search = input.nextLine();// tar emot Indata från användaren 
			{
				for (Participants p : compBoard.participantsList) {// ställer upp listan 
					if (p.getForName().equals(search) || p.getLastName().equals(search)) {// ser om datan användaren skrivit in finns i listan
						System.out.println(p);
						found = true;
					}
				}
				if (found != true) {
					System.out.println("Kunde inte hitta deltagare.");
					
				}
				
			}
			
		}

	}

