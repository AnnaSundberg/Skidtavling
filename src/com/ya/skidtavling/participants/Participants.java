package com.ya.skidtavling.participants;

import com.ya.skidtavling.person.Person;
import com.ya.skidtavling.time.Time;

public class Participants extends Person {
	// egenskaperna för klassen Participants
	private int participantNumber;
	private int place;
	public Time startTime;
	private int distance;
	private boolean notFinished;
	private boolean passedMiddle;


	public Participants(String forName, String lastName) { 
		super(forName,lastName);
		
	}
	public Participants(int participantNumber, String forName, String lastName, int place, Time startTime, int distance,
			boolean notFinished,boolean passedMiddle) {
		super(forName, lastName);
		this.participantNumber = participantNumber;
		this.place = place;
		this.startTime = startTime;
		this.distance = distance;
		this.notFinished = notFinished;
		this.passedMiddle=passedMiddle;

	}

	public boolean isNotFinished() {
		return notFinished;
	}

	public void setNotFinished(boolean notFinished) {
		this.notFinished = notFinished;
	}
	
//	@Override
//	public String toString() {
//		return participantNumber + " " + forName + " " + lastName + "        " + "\t\t\t place=" + place + " :  " + startTime
//				+ " har kommit : " + distance;
//		
//	}
	@Override
	public String toString() {// trimmad Sträng för utskriften// Qi Ra Blir fortfarande konstig utskrift . . .:( 
		String prettierOutPutString = participantNumber + forName.trim() + "  "+ lastName.trim();
		int Length = prettierOutPutString.length();
		if (Length < 10)  
			return participantNumber + " " + forName.trim() 
					+ " " + lastName.trim() + "\t\t" + "\t place=" + place 
					+ " :   " + startTime
					+ " har kommit : " + distance ;
		if (Length > 17)
		return participantNumber + " " + forName.trim() 
				+ " " + lastName.trim() + "\t" + "\t place=" 
				+ place + " :  " + startTime
				+ " har kommit : " + distance ;
		else
			return participantNumber + " " + forName.trim() 
					+ " " + lastName.trim() + "              " 
					+ "\t place=" + place + " :  " + startTime
					+ " har kommit : " + distance ;
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

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public boolean isPassedMiddle() {
		return passedMiddle;
	}

	public void setPassedMiddle(boolean passedMiddle) {
		this.passedMiddle = passedMiddle;
	}

}