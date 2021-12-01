package com.ya.skidtavling.tavling;

////För att hantera "grundläggande krav" behövs nedansående 
//variabler innan någon utdelning av starttider och nummerlappar kan ske
//Om forhandsanmalan krav = true krävs även deltagarlista med tex anmälningsnummer
public class Competition{
private boolean forHandsanmälanKrav;
private boolean avgBetald;  	// inga kommentarer
private boolean masStart;		// vald startmetod påverkar 
private boolean jaktStart;		// vald startmetod påverkar 
private boolean indivStart;		// vald startmetod påverkar 
private boolean randomStartorder; // vald startmetod påverkar lottat startordning.

private int fixedStartnbr;		// Vid Jaktstart fixerad startordning .
private int	maxAntalstartande;	// deltagarantal max
private long forstaStart;     // Java time hourmin, first or only start time;
private int	startIntervall;   //in minutes


	// TODO Auto-generated method stub


private int nbrStart;	// nummerlappsystem startar nr..
private int nbrSlut;	// nummerlappsystem startar nr..




}
