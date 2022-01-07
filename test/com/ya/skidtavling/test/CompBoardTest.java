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
	//Testet g�r en ny �kare och sl�nger med den i t�vlingen
	@BeforeAll
	static void init() {
		FillFromFile FFF = new FillFromFile(testCompBoard);
		testParticipant = new Participants(0, "F�rnamn", "EfterNamn", 0, null, 0, false,false);
		testCompBoard.participantsList.add(testParticipant);
		testCompBoard.randomizeList();
		
		Race testRace = new Race();
		testRace.race(testCompBoard);
	}
	// Ser om den nya �karen vinner loppet sl�r den h�r R�tt och testet Misslyckas Har �karen 
	// Som las till Vunnit :)
	@Test
	void testMostUnlickyTohappendWhatSoEverItIsActallyPosibleThisWouldBeTrue() {
		assertNotEquals(true, testCompBoard.resultBoard.get(0) == testParticipant);
	}

}
