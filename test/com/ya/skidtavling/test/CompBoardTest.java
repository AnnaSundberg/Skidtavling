package com.ya.skidtavling.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ya.skidtavling.participants.Participants;
import com.ya.skidtavling.tavla.CompetitionBoard;
import com.ya.skidtavling.tavla.FillFromFile;
import com.ya.skidtavling.tavla.Race;

class CompBoardTest {

	public static CompetitionBoard testCompBoard = new CompetitionBoard();
	static Participants testParticipant;
	//Testet gör en ny åkare och slänger med den i tävlingen
	@BeforeAll
	static void init() {
		FillFromFile FFF = new FillFromFile(testCompBoard);
		testParticipant = new Participants(0, "Förnamn", "EfterNamn", 0, null, 0, false,false);
		testCompBoard.participantsList.add(testParticipant);
		testCompBoard.randomizeList();
		
		Race testRace = new Race();
		testRace.race(testCompBoard);
	}
	// Ser om den nya åkaren vinner loppet slår den här Rött och testet Misslyckas Har åkaren 
	// Som las till Vunnit :)
	@Test
	void testMostUnlickyTohappendWhatSoEverItIsActallyPosibleThisWouldBeTrue() {
		assertNotEquals(true, testCompBoard.resultBoard.get(0) == testParticipant);
	}

}
