package com.ya.skidtavling.tavling;

import java.util.*;


public class Tavling {
	
	

		private boolean forHandsanmalanKrav;       //* krav p� f�rhandsanm�lan == h�r: inl�st lista �r alla
		private String tavlingsnamn;				// marknadsf�ringsnamn  
		private int starmetod;						//* kod f�r startmetod koder 
	 
		// =1 ; masstart
		// =2 ; jaktstart
		// =3 ; individuell start startintevall 
		// =4 ; Random start lottad startordning
		
//		I f�rsta hand t�nks variabler med //* markering h�rkodas till fixerat editerbart v�rde medan �vriga
//		ges m�jlighet att via menyn variera.


		private int fixedStartnbr;		//* Vid Jaktstart fixerad startordning .
		private int	maxAntalstartande;	//* deltagarantal max
		private long forstaStartPlanned; // Java time hourmin, first or only start time;
		private int	startIntervall;   //in seconds for indiv,random startorder
		private long forstaStartVerklig;// f�rvald datum tid f�r f�rstatart
		private int nbrStart;			//* nummerserie startnummer "nummerlappar start nyckel till deltagare under
		private int nbrSlut;			//* sista nummer i sviten nummerlappar t�vling genom l�sbarhet etc.
		private boolean simTidtagning;   // f�r test och utv�rdering all manuell tidtagning ersatt med metod f�r
										//slumpad tidtagning; 
		private long senUppd;			// senaste uppdatering av posten java.time format.
		private String haschKod	;		// post check; integritet.

		public static void main(String[] args) {
		



		private String getTavlingsnamn() {
			return tavlingsnamn;
		}

		private void setTavlingsnamn(String tavlingsnamn) {
			this.tavlingsnamn = tavlingsnamn;
		}

		private int getStartIntervall() {
			return startIntervall;
		}

		private void setStartIntervall(int startIntervall) {
			this.startIntervall = startIntervall;
		}

		private long getForstaStartVerklig() {
			return forstaStartVerklig;
		}

		private void setForstaStartVerklig(long forstaStartVerklig) {
			this.forstaStartVerklig = forstaStartVerklig;
		}

		private int getNbrStart() {
			return nbrStart;
		}

		private void setNbrStart(int nbrStart) {
			this.nbrStart = nbrStart;
		}

		private boolean isSimTidtagning() {
			return simTidtagning;
		}

		private void setSimTidtagning(boolean simTidtagning) {
			this.simTidtagning = simTidtagning;
		}

		private long getSenUppd() {
			return senUppd;
		}

		private void setSenUppd(long senUppd) {
			this.senUppd = senUppd;
		}

		private String getHaschKod() {
			return haschKod;
		}

		private void setHaschKod(String haschKod) {
			this.haschKod = haschKod;
		}

//		@Override
//		public String toString() {
//			return "Tavling [forHandsanmalanKrav=" + forHandsanmalanKrav + ", tavlingsnamn=" + tavlingsnamn
//					+ ", starmetod=" + starmetod + ", fixedStartnbr=" + fixedStartnbr + ", maxAntalstartande="
//					+ maxAntalstartande + ", forstaStartPlanned=" + forstaStartPlanned + ", startIntervall="
//					+ startIntervall + ", forstaStartVerklig=" + forstaStartVerklig + ", nbrStart=" + nbrStart
//					+ ", nbrSlut=" + nbrSlut + ", simTidtagning=" + simTidtagning + ", senUppd=" + senUppd
//					+ ", haschKod=" + haschKod + "]";
//		}



		/**
		 * @param forHandsanmalanKrav
		 * @param tavlingsnamn
		 * @param starmetod
		 * @param fixedStartnbr
		 * @param maxAntalstartande
		 * @param forstaStartPlanned
		 * @param startIntervall
		 * @param forstaStartVerklig
		 * @param nbrStart
		 * @param nbrSlut
		 * @param simTidtagning
		 * @param senUppd
		 * @param haschKod
		 */
		private Tavling(boolean forHandsanmalanKrav, String tavlingsnamn, int starmetod, int fixedStartnbr,
				int maxAntalstartande, long forstaStartPlanned, int startIntervall, long forstaStartVerklig,
				int nbrStart, int nbrSlut, boolean simTidtagning, long senUppd, String haschKod) 
		{
		
			this.forHandsanmalanKrav = forHandsanmalanKrav;
			this.tavlingsnamn = tavlingsnamn;
			this.starmetod = starmetod;
			this.fixedStartnbr = fixedStartnbr;
			this.maxAntalstartande = maxAntalstartande;
			this.forstaStartPlanned = forstaStartPlanned;
			this.startIntervall = startIntervall;
			this.forstaStartVerklig = forstaStartVerklig;
			this.nbrStart = nbrStart;
			this.nbrSlut = nbrSlut;
			this.simTidtagning = simTidtagning;
			this.senUppd = senUppd;
			this.haschKod = haschKod;
		}
		
}
}

