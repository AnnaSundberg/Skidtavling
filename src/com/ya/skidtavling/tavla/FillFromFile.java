package com.ya.skidtavling.tavla;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

import com.ya.skidtavling.participants.Participants;

public class FillFromFile {
	Random rand = new Random();
	public FillFromFile(CompetitionBoard compBoard) {

		// L�ser in deltagarena fr�n filen
		try (BufferedReader fReader = new BufferedReader(new FileReader("Deltagare.txt"))) {
//		try(BufferedReader fReader = new BufferedReader(new FileReader("PreviusResult.txt"))){// Nytt nerbantad deltagarlista
			String line;
					


			// st�ller upp deltagarna rad f�r rad
			while ((line = fReader.readLine()) != null) {
				String split[] = line.split(" ");// stringSplitar raden
				String fName = split[0];// sparar f�rnamn
				String lName = split[1];// sparar efternamn
				int randNum = rand.nextInt(100);
				// skall vi ha det s�h�r vi uppst�llning lr hur vill vi g�ra = ? 
//				Participants newParticipant = new Participants(randNum, fName, lName, i + 1, null, 0, false,false);
				Participants newParticipant = new Participants(randNum, fName, lName, 0, null, 0, false,false);
				compBoard.participantsList.add(newParticipant);
			

			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Listan �r nu fylld!");
		}

	}
}
