package com.ya.java.skidtavling.deltagare;

public class Participants {

	private String participantNumber;
	private String place;
	private int trackNumber;
	private int finishTime;
	private int currentTime;
	
	
	public String getParticipantNumber() {
		return participantNumber;
	}
	public void setParticipantNumber(String participantNumber) {
		this.participantNumber = participantNumber;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getTrackNumber() {
		return trackNumber;
	}
	public void setTrackNumber(int trackNumber) {
		this.trackNumber = trackNumber;
	}
	public int getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(int finishTime) {
		this.finishTime = finishTime;
	}
	public int getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
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