package com.ya.skidtavling.deltagare;

import com.ya.skidtavling.person.Person;

public class Participants extends Person{

	

	private int participantNumber;
	private int place;
	private long startTid;
	private int distance;

	public Participants(int participantNumber, String forName, String lastName, int place, long startTid,int distance) {
		super(forName, lastName);
		this.participantNumber = participantNumber;
		this.place = place;
		this.startTid = startTid;
		this.distance = distance;
		

	}

	@Override
	public String toString() {
		return participantNumber + " " + forName  +" "+lastName+""+"\t place=" + place 
				+ " startar  10:00:  " + startTid
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

	public long getStartTid() {
		return startTid;
	}

	public void setStartTid(long startTid) {
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