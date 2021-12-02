package com.ya.skidtavling.person;

public class Person {

	private String forName;
	private String lastName;



	public Person() {
		
	}

	@Override
	public String toString() {
		return "Person [forName=" + forName + ", lastName=" + lastName + "]";
	}

	public String getForName() {
		return forName;
	}

	public void setForName(String forName) {
		this.forName = forName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
