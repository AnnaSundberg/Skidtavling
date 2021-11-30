package com.ya.skidtavling.deltagare;

public class Participants {
	
	
	
	public Participants(String participantNumber, String forName, int place) {
		super();
		this.participantNumber = participantNumber;
		this.forName = forName;
		this.place = place;
		
		
	}
	
	
	@Override
	public String toString() {
		return "StartNummer = " + participantNumber + "\tNamn = " + forName + "\tPlats = " + place;
	}


	private String participantNumber;
	private String forName;
	private int place;
	

	

	

	

}

/*
 * -    Räkna ut mellantiden på åkare på skidspåret
-    Hålla koll på vilka platser åkarna har 
-    Tider
-    Tidtagning– tänkbar klass
-    deltagarinformation– tänkbar klass
-    Tävlingsnummer - personer
-    Spår plats för den som leder
-    Filhanteringar - spara resultat och /hämta föregående resultat
 
*/