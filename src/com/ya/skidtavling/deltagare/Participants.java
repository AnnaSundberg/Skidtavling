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
 * -    R�kna ut mellantiden p� �kare p� skidsp�ret
-    H�lla koll p� vilka platser �karna har 
-    Tider
-    Tidtagning� t�nkbar klass
-    deltagarinformation� t�nkbar klass
-    T�vlingsnummer - personer
-    Sp�r plats f�r den som leder
-    Filhanteringar - spara resultat och /h�mta f�reg�ende resultat
 
*/