package com.ya.skidtavling.deltagare;



import com.ya.skidtavling.person.Person;

public class Participants {
	
	
	private int participantNumber;
	private int place;
	Person person;
	
	public Participants(int participantNumber, String forName,String lastName, int place) {
		super();
		this.participantNumber = participantNumber;
		this.person = new Person(forName,lastName);
		this.place = place;
			
	}

	@Override
	public String toString() {
		return  participantNumber + " " + person+ "\t place=" + place  ;
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