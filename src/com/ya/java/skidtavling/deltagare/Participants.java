package com.ya.java.skidtavling.deltagare;

public class Participants {

	private String participantNumber;
	private String forName;
	private int place;
	
	
		public String getForName() {
		return forName;
	}
	public String getParticipantNumber() {
		return participantNumber;
	}
	public void setParticipantNumber(String participantNumber) {
		this.participantNumber = participantNumber;
	}
	public int getPlace() {
		return place;
	}
	public void setPlace(int place) {
		this.place = place;
	}
	
	

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