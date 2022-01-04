package com.ya.skidtavling.competion;

import java.util.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

//Competitions.java
public class Competitions {
	/*
	 * default arbetskatalog skulle kunna läggas till..
	 */

	private boolean advanceNotification; // * krav på förhandsanmälan == här: inläst lista är alla
	private String competiotionName; // marknadsföringsnamn

	private int startmetod; // * kod för startmetod koder

	// =1 ; masstart
	// =2 ; jaktstart
	// =3 ; individuell start startintevall
	// =4 ; Random start lottad startordning

//		I första hand tänks variabler med //* markering hårkodas till fixerat editerbart värde medan övriga
//		ges möjlighet att via menyn variera.

	private int fixedStartnbr; // * Antaled anmälda startande.
	private long lastNotificationDate; // Java time hourmin,sista anmälan för deltagare;

	private int totalLimitStart; // * deltagarantal max
	private long startingTime; // Java time hourmin, first or only start time;
	private long forstaStartVerklig;// förvald datum tid för förstatart
	private int startIntervall; // in seconds for indiv,random startorder

	private int nbrStart; // * nummerserie startnummer "nummerlappar start nyckel till deltagare under
	private int nbrSlut; // * sista nummer i sviten nummerlappar tävling genom läsbarhet etc.
	private boolean simTidtagning; // för test och utvärdering all manuell tidtagning ersatt med metod för
									// slumpad tidtagning;
	private String senUppd; // senaste uppdatering av posten string format.
	private String haschKod; // post check; integritet.
	private int statuskod; // används för att hantera ordningsföljden av åtgärder;
	/*
	 * = 0 inga register laddade, deltagare kan inte laddas innan tävling skapats
	 * eller laddats submeny alt 1. = 1 tävling skapad och laddad.Nu kan/ skall
	 * starttid ev justeras och deltagare laddas; =2 deltagare laddade eller
	 * manuellt inlagda nu kan startlista skrivas och frågor göras på deltagare. = 3
	 * Startlista utskriven, nu kan tävling startas = 4 tävling starad och pågår = 5
	 * tävling avslutad, alla i mål (incidenter ej inlagda ) nu kan resultatlistor
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

	private int sparLangd; // spårlängd i 10-tal meter
							// rimlig åkarhastighet ca 100m på 15 sek;
	private int placeMellantid; // mätplats mellantid %*100 av spårlängd def 50;

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
