package com.ya.skidtavling.deltagare;

import com.ya.skidtavling.person.Person;
import com.ya.skidtavling.time.Time;

public class Participants extends Person{

	

	private int participantNumber;
	private int place;
	Time startTid;
	private int distance;
	private boolean notFinished;

//public Participants(String fName, String lName, int participantNumber, int place, Time startTid, int distance,
//			boolean notFinished) {
//		super(fName, lName);
//		this.participantNumber = participantNumber;
//		this.place = place;
//		this.startTid = startTid;
//		this.distance = distance;
//		this.notFinished = notFinished;
//	}

	public Participants(int participantNumber, String forName, String lastName, int place, Time startTid,int distance,boolean notFinished) {
		super(forName, lastName);
		this.participantNumber = participantNumber;
		this.place = place;
		this.startTid = startTid;
		this.distance = distance;
		this.notFinished= notFinished;
		

	}


	public boolean isNotFinished() {
		return notFinished;
	}

	public void setNotFinished(boolean notFinished) {
		this.notFinished = notFinished;
	}

	@Override
	public String toString() {
		return participantNumber + " " + forName  +" "+lastName+""+"\t place=" + place 
				+ " :  " + startTid
				+" har kommit : "+ distance;
				
	}

	public int getParticipantNumber() {
		return participantNumber;
	}

	public void setParticipantNumber(int participantNumber) {
		this.participantNumber = participantNumber;
	}

	public int getPlace() {
		return place;
	}

	public void setPlace(int place) {
		this.place = place;
	}

	public Time getStartTid() {
		return startTid;
	}

	public void setStartTid(Time startTid) {
		this.startTid = startTid;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
}

/*
 * - R�kna ut mellantiden p� �kare p� skidsp�ret - H�lla koll p� vilka platser
 * �karna har - Tider - Tidtagning� t�nkbar klass - deltagarinformation� t�nkbar
 * klass - T�vlingsnummer - personer - Sp�r plats f�r den som leder -
 * Filhanteringar - spara resultat och /h�mta f�reg�ende resultat
 * 
 */