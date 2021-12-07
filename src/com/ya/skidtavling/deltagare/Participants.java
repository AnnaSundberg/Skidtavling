package com.ya.skidtavling.deltagare;

import com.ya.skidtavling.person.Person;

public class Participants extends Person{// kan ärvas av person titta vidare på detta !!! :) 

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
 * - Räkna ut mellantiden på åkare på skidspåret - Hålla koll på vilka platser
 * åkarna har - Tider - Tidtagning– tänkbar klass - deltagarinformation– tänkbar
 * klass - Tävlingsnummer - personer - Spår plats för den som leder -
 * Filhanteringar - spara resultat och /hämta föregående resultat
 * 
 */