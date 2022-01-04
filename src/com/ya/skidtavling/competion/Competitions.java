package com.ya.skidtavling.competion;

import java.util.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

//Competitions.java
public class Competitions {
	/*
	 * default arbetskatalog skulle kunna l�ggas till..
	 */

	private boolean advanceNotification; // * krav p� f�rhandsanm�lan == h�r: inl�st lista �r alla
	private String competiotionName; // marknadsf�ringsnamn

	private int startmetod; // * kod f�r startmetod koder

	// =1 ; masstart
	// =2 ; jaktstart
	// =3 ; individuell start startintevall
	// =4 ; Random start lottad startordning

//		I f�rsta hand t�nks variabler med //* markering h�rkodas till fixerat editerbart v�rde medan �vriga
//		ges m�jlighet att via menyn variera.

	private int fixedStartnbr; // * Antaled anm�lda startande.
	private long lastNotificationDate; // Java time hourmin,sista anm�lan f�r deltagare;

	private int totalLimitStart; // * deltagarantal max
	private long startingTime; // Java time hourmin, first or only start time;
	private long forstaStartVerklig;// f�rvald datum tid f�r f�rstatart
	private int startIntervall; // in seconds for indiv,random startorder

	private int nbrStart; // * nummerserie startnummer "nummerlappar start nyckel till deltagare under
	private int nbrSlut; // * sista nummer i sviten nummerlappar t�vling genom l�sbarhet etc.
	private boolean simTidtagning; // f�r test och utv�rdering all manuell tidtagning ersatt med metod f�r
									// slumpad tidtagning;
	private String senUppd; // senaste uppdatering av posten string format.
	private String haschKod; // post check; integritet.
	private int statuskod; // anv�nds f�r att hantera ordningsf�ljden av �tg�rder;
	/*
	 * = 0 inga register laddade, deltagare kan inte laddas innan t�vling skapats
	 * eller laddats submeny alt 1. = 1 t�vling skapad och laddad.Nu kan/ skall
	 * starttid ev justeras och deltagare laddas; =2 deltagare laddade eller
	 * manuellt inlagda nu kan startlista skrivas och fr�gor g�ras p� deltagare. = 3
	 * Startlista utskriven, nu kan t�vling startas = 4 t�vling starad och p�g�r = 5
	 * t�vling avslutad, alla i m�l (incidenter ej inlagda ) nu kan resultatlistor
	 * och prispall plockas fram..
	 */
	public Incidents ins;

	public Competitions() {
		super();

	}

	/**
	 * @param forHandsanmalanKrav the forHandsanmalanKrav to set
	 */
	public void setAdvanceNotification(boolean advanceNotification) {
		this.advanceNotification = advanceNotification;
	}

	/**
	 * @param tavlingsnamn the tavlingsnamn to set
	 */
	public void setCompetiotionName(String competiotionName) {
		this.competiotionName = competiotionName;
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
	public void setLastNotificationDate(long lastNotificationDate) {
		this.lastNotificationDate = lastNotificationDate;
	}

	/**
	 * @param maxAntalstartande the maxAntalstartande to set
	 */
	public void setTotalLimitStart(int totalLimitStart) {
		this.totalLimitStart = totalLimitStart;
	}

	/**
	 * @param forstaStartPlanned the forstaStartPlanned to set
	 */
	public void setsStartingTime(long startingTime) {
		this.startingTime = startingTime;
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
	public void setSenUppd() {
		LocalDate idag = LocalDate.now();

		this.senUppd = idag.toString();
	}

	/**
	 * @param haschKod the haschKod to set
	 */
	public void setHaschKod(String haschKod) {
		this.haschKod = haschKod;
	}

	/**
	 * @param forHandsanmalanKrav
	 * @param competiotionName
	 * @param startmetod
	 * @param fixedStartnbr
	 * @param lastNotificationDate
	 * @param totalLimitStart
	 * @param startingTime
	 * @param forstaStartVerklig
	 * @param startIntervall
	 * @param nbrStart
	 * @param nbrSlut
	 * @param simTidtagning
	 * @param senUppd
	 * @param haschKod
	 */

	public int getSparLangd() {
		return sparLangd;
	}

	public void setSparLangd(int sparLangd) {
		this.sparLangd = sparLangd;
	}

	public int getPlaceMellantid() {
		return placeMellantid;
	}

	public void setPlaceMellantid(int placeMellantid) {
		this.placeMellantid = placeMellantid;
	}

	private int sparLangd; // sp�rl�ngd i 10-tal meter
							// rimlig �karhastighet ca 100m p� 15 sek;
	private int placeMellantid; // m�tplats mellantid %*100 av sp�rl�ngd def 50;

	public Incidents getIns() {
		return ins;
	}

	public void setIns(Incidents ins) {
		this.ins = ins;
	}

	public int getStatuskod() {
		return statuskod;
	}

	public void setStatuskod(int statuskod) {
		this.statuskod = statuskod;
	}

	/**
	 * 
	 */

	/**
	 * @return the forHandsanmalanKrav
	 */
	public boolean isForHandsanmalanKrav() {
		return advanceNotification;
	}

	/**
	 * @return the tavlingsnamn
	 */
	public String getTavlingsnamn() {
		return competiotionName;
	}

	/**
	 * @return the sista_anmalningsdatum
	 */
	public String getSistaAnmalningsdatum() {

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date(lastNotificationDate);

		String dettadatum = df.format(date);

		return dettadatum;
	}

	/**
	 * @return the startmetod
	 */
	public int getStartmetod() {
		return startmetod;
	}

	/**
	 * @return the fixedStartnbr
	 */
	public int getFixedStartnbr() {
		return fixedStartnbr;
	}
	/**
	 * @return the sistaAnmalningsdatum
	 */

	/**
	 * @return the maxAntalstartande
	 */
	public int getMaxAntalstartande() {
		return totalLimitStart;
	}

	/**
	 * @return the forstaStartPlanned
	 */
	public String getForstaStartPlanned() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date(startingTime);

		String dettadatum = df.format(date);

		return dettadatum;

	}

	/**
	 * @return the forstaStartVerklig
	 */
	public String getForstaStartVerklig() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date(forstaStartVerklig);

		String dettadatum = df.format(date);

		return dettadatum;

	}

	/**
	 * @return the startIntervall
	 */
	public int getStartIntervall() {
		return startIntervall;
	}

	/**
	 * @return the nbrStart
	 */
	public int getNbrStart() {
		return nbrStart;
	}

	/**
	 * @return the nbrSlut
	 */
	public int getNbrSlut() {
		return nbrSlut;
	}

	/**
	 * @return the simTidtagning
	 */
	public boolean isSimTidtagning() {
		return simTidtagning;
	}

	/**
	 * @return the senUppd
	 */
	public String getSenUppd() {

		return senUppd;
	}

	/**
	 * @return the haschKod
	 */
	public String getHaschKod() {
		return haschKod;
	}

	@Override
	public String toString() {
		return "Competitions [forHandsanmalanKrav=" + advanceNotification + ", tavlingsnamn=" + competiotionName
				+ "startmetod=" + startmetod + "\n" + ", fixedStartnbr=" + fixedStartnbr + ", sistaAnmalningsdatum="
				+ lastNotificationDate + ", maxAntalstartande=" + totalLimitStart + ", forstaStartPlanned="
				+ startingTime + ", forstaStartVerklig=" + forstaStartVerklig + ", startIntervall=" + startIntervall
				+ "\n" + ", nbrStart=" + nbrStart + ", nbrSlut=" + nbrSlut + ", simTidtagning=" + simTidtagning
				+ ", senUppd=" + senUppd + ", haschKod=" + haschKod + "=";
	}

}
