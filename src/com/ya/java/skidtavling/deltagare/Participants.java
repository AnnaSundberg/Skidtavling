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
 * -    R�kna ut mellantiden p� �kare p� skidsp�ret
-    H�lla koll p� vilka platser �karna har 
-    Tider
-    Tidtagning� t�nkbar klass
-    deltagarinformation� t�nkbar klass
-    T�vlingsnummer - personer
-    Sp�r plats f�r den som leder
-    Filhanteringar - spara resultat och /h�mta f�reg�ende resultat
 
*/