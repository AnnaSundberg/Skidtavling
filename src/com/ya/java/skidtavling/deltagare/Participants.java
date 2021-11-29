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
 * -    Räkna ut mellantiden på åkare på skidspåret
-    Hålla koll på vilka platser åkarna har 
-    Tider
-    Tidtagning– tänkbar klass
-    deltagarinformation– tänkbar klass
-    Tävlingsnummer - personer
-    Spår plats för den som leder
-    Filhanteringar - spara resultat och /hämta föregående resultat
 
*/