package com.ya.skidtavling.main;

import com.ya.skidtavling.menu.Menu;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Menu menu = new Menu(); // instans för meny klassen
		menu.runMenu(); // kallar på runMenu klassen som skriver ut välkommen rutan och sedan valen

	}
	/*Det som behövs göras nu är tänka ut en utveckling av gemförande med tiderna 
	 * öm det jag kan tänka mig fungera är att man kanske skall ha en variable som spara start tid och målgångs
	 * tid och vid gemförelsen får vi en offset som vi måste använda oss av vid uträkningen av 
	 * tidsskillnaden på vinnaren och deltagaren i fråga 
	 * min gissning är att det är egentligen det sista som behövs och 
	 * ja sedan kommentera alla kodblock men det kanske går snabbt om vi sitter ihop
	 * Gissar på att det kan bli enklare att få ihop kommentarer när man försöker förklara för varandra :) 
	 * */  
}
