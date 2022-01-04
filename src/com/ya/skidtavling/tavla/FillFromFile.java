package com.ya.skidtavling.tavla;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

import com.ya.skidtavling.competion.Competitions;
import com.ya.skidtavling.competion.Wlogg;
import com.ya.skidtavling.participants.Participants;

public class FillFromFile {
	Random rand = new Random();
	public FillFromFile(CompetitionBoard compBoard, Competitions comp1) {

		// L�ser in deltagarena fr�n filen
		try (BufferedReader fReader = new BufferedReader(new FileReader("Deltagare.txt"))) {
//		try(BufferedReader fReader = new BufferedReader(new FileReader("PreviusResult.txt"))){// Nytt nerbantad deltagarlista
			String line;
			//int i = 0;
			int stMetod = comp1.getStartmetod();  // styr numrering mm
			int stNbr = comp1.getNbrStart();
			int i = comp1.getNbrStart();
//			Time time = time.setSec(49000);
			
				

			// st�ller upp deltagarna rad f�r rad
			while ((line = fReader.readLine()) != null) {
				String split[] = line.split(" ");// stringSplitar raden
				String fName = split[0];// sparar f�rnamn
				String lName = split[1];// sparar efternamn
				int randNum = rand.nextInt(100);
				
				if (stMetod == 3)
				{
				Participants newParticipant = new Participants(randNum, fName, lName, i + 1, null, 0, false,false);
				compBoard.participantsList.add(newParticipant);
				i++;
				comp1.setNbrStart(i);
				}
				if (stMetod == 1)
				{
					
					Participants newParticipant = new Participants(stNbr, fName, lName,stNbr, null, 0, false,false);
					comp1.setNbrStart(stNbr);
					compBoard.participantsList.add(newParticipant);
					stNbr++;
				}
				if(stMetod == 2) {
					Participants newParticipant = new Participants(fName, lName,stNbr, null);
					compBoard.participantsList.add(newParticipant);
				}
				
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
//			System.out.println("Listan �r nu fylld!");
			System.out.println("Listan �r nu laddad!");
			boolean isOK = Wlogg.nyevent(1,"Deltagarlista inl�st st�rsta startnr: " + comp1.getNbrStart() ,2,"fr�n fil: PreviusResult.txt");
	//		;
		}

	}
}
