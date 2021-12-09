package com.ya.skidtavling.competitions;

	public class Competitions {
		
		

		/**
		 * @param forHandsanmalanKrav the forHandsanmalanKrav to set
		 */
		public  void setForHandsanmalanKrav(boolean forHandsanmalanKrav) {
			this.forHandsanmalanKrav = forHandsanmalanKrav;
		}
		/**
		 * @param tavlingsnamn the tavlingsnamn to set
		 */
		public void setTavlingsnamn(String tavlingsnamn) {
			this.tavlingsnamn = tavlingsnamn;
		}
		/**
		 * @param sista_anmalningsdatumg the sista_anmalningsdatumg to set
		 */
		public void setSista_anmalningsdatum(long sista_anmalningsdatumg) {
			this.sista_anmalningsdatum = sista_anmalningsdatumg;
		}
		/**
		 * @param startmetod the startmetod to set
		 */
		public void setStartmetod(int startmetod) {
			this.startmetod = startmetod;
		}
		/**
		 * @param fixedStartnbr the fixedStartnbr to set
		 */
		public void setFixedStartnbr(int fixedStartnbr) {
			this.fixedStartnbr = fixedStartnbr;
		}
		/**
		 * @param sistaAnmalningsdatum the sistaAnmalningsdatum to set
		 */
		public void setSistaAnmalningsdatum(long sistaAnmalningsdatum) {
			this.sistaAnmalningsdatum = sistaAnmalningsdatum;
		}
		/**
		 * @param maxAntalstartande the maxAntalstartande to set
		 */
		public void setMaxAntalstartande(int maxAntalstartande) {
			this.maxAntalstartande = maxAntalstartande;
		}
		/**
		 * @param forstaStartPlanned the forstaStartPlanned to set
		 */
		public void setForstaStartPlanned(long forstaStartPlanned) {
			this.forstaStartPlanned = forstaStartPlanned;
		}
		/**
		 * @param forstaStartVerklig the forstaStartVerklig to set
		 */
		public void setForstaStartVerklig(long forstaStartVerklig) {
			this.forstaStartVerklig = forstaStartVerklig;
		}
		/**
		 * @param startIntervall the startIntervall to set
		 */
		public void setStartIntervall(int startIntervall) {
			this.startIntervall = startIntervall;
		}
		/**
		 * @param nbrStart the nbrStart to set
		 */
		public void setNbrStart(int nbrStart) {
			this.nbrStart = nbrStart;
		}
		/**
		 * @param nbrSlut the nbrSlut to set
		 */
		public void setNbrSlut(int nbrSlut) {
			this.nbrSlut = nbrSlut;
		}
		/**
		 * @param simTidtagning the simTidtagning to set
		 */
		public void setSimTidtagning(boolean simTidtagning) {
			this.simTidtagning = simTidtagning;
		}
		/**
		 * @param senUppd the senUppd to set
		 */
		public void setSenUppd(long senUppd) {
			this.senUppd = senUppd;
		}
		/**
		 * @param haschKod the haschKod to set
		 */
		public void setHaschKod(String haschKod) {
			this.haschKod = haschKod;
		}
		/**
		 * @param forHandsanmalanKrav
		 * @param tavlingsnamn
		 * @param sista_anmalningsdatumg
		 * @param startmetod
		 * @param fixedStartnbr
		 * @param sistaAnmalningsdatum
		 * @param maxAntalstartande
		 * @param forstaStartPlanned
		 * @param forstaStartVerklig
		 * @param startIntervall
		 * @param nbrStart
		 * @param nbrSlut
		 * @param simTidtagning
		 * @param senUppd
		 * @param haschKod
		 */
		private Competitions(boolean forHandsanmalanKrav, String tavlingsnamn, long sista_anmalningsdatumg,
				int startmetod, int fixedStartnbr, long sistaAnmalningsdatum, int maxAntalstartande,
				long forstaStartPlanned, long forstaStartVerklig, int startIntervall, int nbrStart, int nbrSlut,
				boolean simTidtagning, long senUppd, String haschKod) {
			super();
			this.forHandsanmalanKrav = forHandsanmalanKrav;
			this.tavlingsnamn = tavlingsnamn;
			this.sista_anmalningsdatum = sista_anmalningsdatumg;
			this.startmetod = startmetod;
			this.fixedStartnbr = fixedStartnbr;
			this.sistaAnmalningsdatum = sistaAnmalningsdatum;
			this.maxAntalstartande = maxAntalstartande;
			this.forstaStartPlanned = forstaStartPlanned;
			this.forstaStartVerklig = forstaStartVerklig;
			this.startIntervall = startIntervall;
			this.nbrStart = nbrStart;
			this.nbrSlut = nbrSlut;
			this.simTidtagning = simTidtagning;
			this.senUppd = senUppd;
			this.haschKod = haschKod;
		}
		private boolean forHandsanmalanKrav;       //* krav på förhandsanmälan == här: inläst lista är alla
		private String tavlingsnamn;				// marknadsföringsnamn  
		private long sista_anmalningsdatum;
	

		private int startmetod;						//* kod för startmetod koder 
	 
		// =1 ; masstart
		// =2 ; jaktstart
		// =3 ; individuell start startintevall 
		// =4 ; Random start lottad startordning
		
//		I första hand tänks variabler med //* markering hårkodas till fixerat editerbart värde medan övriga
//		ges möjlighet att via menyn variera.


		private int fixedStartnbr;		//* Vid Jaktstart fixerad startordning .
		private long sistaAnmalningsdatum; // Java time hourmin,sista anmälan för deltagare;
				

		private int	maxAntalstartande;	//* deltagarantal max
		private long forstaStartPlanned; // Java time hourmin, first or only start time;
		private long forstaStartVerklig;// förvald datum tid för förstatart
		private int	startIntervall;   //in seconds for indiv,random startorder
	
		private int nbrStart;			//* nummerserie startnummer "nummerlappar start nyckel till deltagare under
		private int nbrSlut;			//* sista nummer i sviten nummerlappar tävling genom läsbarhet etc.
		private boolean simTidtagning;   // för test och utvärdering all manuell tidtagning ersatt med metod för
										//slumpad tidtagning; 
		private long senUppd;			// senaste uppdatering av posten java.time format.
		private String haschKod	;		// post check; integritet.
		/**
		 * 
		 */
		public Competitions() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Competitions [forHandsanmalanKrav=" + forHandsanmalanKrav + ", tavlingsnamn=" + tavlingsnamn
					+ ", sista_anmalningsdatum=" + sista_anmalningsdatum + ", startmetod=" + startmetod +"\n"
					+ ", fixedStartnbr=" + fixedStartnbr + ", sistaAnmalningsdatum=" + sistaAnmalningsdatum
					+ ", maxAntalstartande=" + maxAntalstartande + ", forstaStartPlanned=" + forstaStartPlanned
					+ ", forstaStartVerklig=" + forstaStartVerklig + ", startIntervall=" + startIntervall
					+"\n"+ ", nbrStart=" + nbrStart + ", nbrSlut=" + nbrSlut + ", simTidtagning=" + simTidtagning
					+ ", senUppd=" + senUppd + ", haschKod=" + haschKod + "="
				;
		}
	
		}
	
	



