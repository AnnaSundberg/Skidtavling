package com.ya.joakim.test;

import java.io.BufferedReader;
import java.io.FileReader;

import com.ya.skidtavling.deltagare.Participants;

//test Kommentar

public class UppstallningAvDeltagare {

	// Participants[] deltagareLista;
	Participants[] deltagareLista = new Participants[100];

	public void fill() {
	try(
	BufferedReader fReader = new BufferedReader(new FileReader("Deltagare.txt")))
	{	
		
		String line;
		int i = 0;
		while ((line = fReader.readLine()) != null) {
			// System.out.println(line);
			Participants newDeltag = new Participants(line, line, i);
			deltagareLista[i] = newDeltag;
			i++;

		}
	}catch(
	Exception e)
	{
		System.out.println(e);
	}
	}
	public void printList() {
	for(int k = 0;k<deltagareLista.length;k++)
	{

		System.out.println(deltagareLista[k]);
	}
	}
}
