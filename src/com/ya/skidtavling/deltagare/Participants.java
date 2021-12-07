package com.ya.skidtavling.deltagare;

import com.ya.skidtavling.person.Person;

public class Participants {

	private int participantNumber;
	private int place;
	Person person;
	private long startTid;

	public Participants(int participantNumber, String forName, String lastName, int place, long startTid) {
		super();
		this.participantNumber = participantNumber;
		this.person = new Person(forName, lastName);
		this.place = place;
		this.startTid = startTid;

	}

	@Override
	public String toString() {
		return participantNumber + " " + person + "\t place=" + place + " startar  10:00:  " + startTid;
	}

}

/*
 * - Räkna ut mellantiden på åkare på skidspåret - Hålla koll på vilka platser
 * åkarna har - Tider - Tidtagning– tänkbar klass - deltagarinformation– tänkbar
 * klass - Tävlingsnummer - personer - Spår plats för den som leder -
 * Filhanteringar - spara resultat och /hämta föregående resultat
 * 
 */