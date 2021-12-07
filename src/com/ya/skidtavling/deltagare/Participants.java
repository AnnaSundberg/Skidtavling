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
 * - R�kna ut mellantiden p� �kare p� skidsp�ret - H�lla koll p� vilka platser
 * �karna har - Tider - Tidtagning� t�nkbar klass - deltagarinformation� t�nkbar
 * klass - T�vlingsnummer - personer - Sp�r plats f�r den som leder -
 * Filhanteringar - spara resultat och /h�mta f�reg�ende resultat
 * 
 */