package com.ya.skidtavling.menu;


import java.util.Scanner;

import com.ya.skidtavling.competion.Competitions;
import com.ya.skidtavling.competion.Compmenue;
import com.ya.skidtavling.competion.Incidents;
import com.ya.skidtavling.participants.NewRegistration;
import com.ya.skidtavling.participants.SearchParticipant;
import com.ya.skidtavling.tavla.CompetitionBoard;
import com.ya.skidtavling.tavla.FillFromFile;
import com.ya.skidtavling.tavla.Race;

public class MenuManager {
	static Scanner scan = new Scanner(System.in);
	public static void switchMenu(int userChoice, CompetitionBoard compBoard ,Competitions comp1) throws InterruptedException {
	
//		// behöver ses igenom
//		// behöver vi under menyer för diverse menyval
//		switch (userChoice) {			// 
//		case 0:
//			PrintMenu.printByeByeBox();
//			System.exit(0);// END
//		case 1:
//			System.out.println("Sök en Deltagare");
//			SearchParticipant test = new SearchParticipant(compBoard);
//			break;
//		case 2:
//			System.out.println("Reg ny åkare");
//			NewRegistration reg = new NewRegistration();
//			reg.Registration(compBoard);
//			
//			break;
//		case 3:
//			System.out.println("Starta tävling");
//			Race race = new Race();// skapar en instans för Rejset.
//			race.race(compBoard);// anropar metoden race
//			break;
//		case 4:
//			System.out.println("Skriv ut Tävlingstavla");
//			compBoard.startingTime();
//			compBoard.printParticipantsBoard();
//			
//			break;
//		case 5:
//			System.out.println("Skriv ut Mellantiderna");
//			compBoard.printMidTimeList();
//			break;
//		case 6:
//			System.out.println("Skriv ut Resultattavla");
//			compBoard.printResultBoard();
//			break;
//		case 7:
//			System.out.println("Skriv ut Vinnarna 1-3");
//			compBoard.printWinnerBoard();
//			break;
//
//		default:
//			System.out.println("Något gick snett");
//		}
//	}// detta måste ses över och kanske brytas ut 
		Incidents ins = new Incidents();
		int status = comp1.getStatuskod();	
		comp1.setIns(ins); // handtag, pekare till insidensklassen...
				
				
				
				switch (userChoice) {			 
				case 0:
					ConsolePrinting.printByeByeBox();
					System.exit(0);// END
					break;
				case 1:						//set up 	
					System.out.println("till undermenyn");
					Compmenue Smenue = new Compmenue();
					Smenue.Compmain(comp1);
					System.out.println(comp1.getTavlingsnamn());
					System.out.println(comp1.getNbrStart());
					System.out.println("tillbaks från  undermenyn");
				
					break;
				case 2:
				{
					if (status < 1)
					{
						System.out.println("Tävling ej angiven!! kör menu 1 först!!");
						break;
					}
					
					System.out.println("Deltagare ladda/ lägga till");
//					boolean doLoad = Input.inputBool("Ladda från fil");
					System.out.println("Ladda från fil");
					boolean doLoad = scan.nextBoolean();
					if (doLoad)
					{
					FillFromFile FFF = new FillFromFile(compBoard, comp1);// instans till nya klassen för fil läsning
//					System.out.println("Nytt placenr1 " + tavl1.getNbrStart());
					}
//					doLoad = Input.inputBool("Registrera Mannuellt");
					System.out.println("Registrera Mannuellt");
					doLoad = scan.nextBoolean();
//					System.out.println("Nytt placenr2" + tavl1.getNbrStart());
					if (doLoad)
					{
					NewRegistration reg = new NewRegistration();
					
					reg.Registration(compBoard,comp1);
								}
					comp1.setStatuskod(2);
					break;	
				}	
				case 3:
					if (status < 2)
					{
						System.out.println("Inga deltagare registrerade.. registrera först!!");
						break;
					}
					System.out.println("Sök en Deltagare");
					SearchParticipant test = new SearchParticipant(compBoard);
					break;	
					
				case 4:
					if (status < 2)
					{
						System.out.println("Inga deltagare registrerade.. registrera först!!");
						break;
					}
					System.out.println("Skriv ut Tävlingstavla");

					compBoard.startingTime();
					compBoard.printParticipantsBoard();
					comp1.setStatuskod(3);
					break;
					
				case 5:
					if (status < 3)
					{
						System.out.println("Inte klar med förbredelserna, tävling, deltagare, startlista fixa..först!!");
						break;
					}
					comp1.setStatuskod(4);	
					System.out.println("Simulering av tävling");
					Race race = new Race();// skapar en instans för Rejset.
					race.race(compBoard,comp1);// anropar metoden race
					comp1.setStatuskod(5);
					break;
					
				case 6:
					if (status < 5) {
						System.out.println("Inga resultat finns ännu - kör tävling klart först..");
						break;
					}
					compBoard.printMidTimeList();
					break;
				case 7:
					if (status < 5) {
					System.out.println("Inga resultat finns ännu - kör tävling klart först..");
					break;
				}
					System.out.println(" - ");
					compBoard.printResultBoard();
					break;
					
				case 8:
//					if (!isCompdone) {
//						System.out.println("Inga resultat finns ännu - kör tävling först..");
//						break;
//					}
					compBoard.printWinnerBoard();
					break;
				
				case 9:
					System.out.println("print Brutna lopp");
					try {
						compBoard.printExpelledlist();
					} catch (Exception e) {
						System.out.println("Listan tom...");
					}
					break;

			
				default:
					System.out.println("Något gick snett");
				}
			}


	
	
}
