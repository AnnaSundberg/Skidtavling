package com.ya.skidtavling.deltagare;

import com.ya.skidtavling.person.Person;

public class Participants extends Person{// kan �rvas av person titta vidare p� detta !!! :) 

	private int participantNumber;
	private int place;
	private long startTid;

	public Participants(int participantNumber, String forName, String lastName, int place, long startTid) {
		super(forName, lastName);
		this.participantNumber = participantNumber;
		this.place = place;
		this.startTid = startTid;

	}

	@Override
	public String toString() {
		return participantNumber + " " + forName  +" "+lastName+""+"\t place=" + place + " startar  10:00:  " + startTid;
	}

}

/*
 * - R�kna ut mellantiden p� �kare p� skidsp�ret - H�lla koll p� vilka platser
 * �karna har - Tider - Tidtagning� t�nkbar klass - deltagarinformation� t�nkbar
 * klass - T�vlingsnummer - personer - Sp�r plats f�r den som leder -
 * Filhanteringar - spara resultat och /h�mta f�reg�ende resultat
 * 
 */