package com.ya.skidtavling.deltagare;

import com.ya.skidtavling.person.Person;
import com.ya.skidtavling.time.Time;

public class Participants extends Person{

	

	private int participantNumber;
	private int place;
	Time startTid;
	private int distance;

	public Participants(int participantNumber, String forName, String lastName, int place, Time startTid,int distance) {
		super(forName, lastName);
		this.participantNumber = participantNumber;
		this.place = place;
		this.startTid = startTid;
		this.distance = distance;
		

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
 * - Räkna ut mellantiden på åkare på skidspåret - Hålla koll på vilka platser
 * åkarna har - Tider - Tidtagning– tänkbar klass - deltagarinformation– tänkbar
 * klass - Tävlingsnummer - personer - Spår plats för den som leder -
 * Filhanteringar - spara resultat och /hämta föregående resultat
 * 
 */