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
 * -    R�kna ut mellantiden p� �kare p� skidsp�ret
-    H�lla koll p� vilka platser �karna har 
-    Tider
-    Tidtagning� t�nkbar klass
-    deltagarinformation� t�nkbar klass
-    T�vlingsnummer - personer
-    Sp�r plats f�r den som leder
-    Filhanteringar - spara resultat och /h�mta f�reg�ende resultat
 
*/