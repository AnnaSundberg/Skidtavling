package com.ya.skidtavling.simulering;

import java.util.Random;

import com.ya.skidtavling.deltagare.Participants;
import com.ya.skidtavling.menu.Menu;

public class Simulator {
	Random rand = new Random();
	public Simulator(Participants dl) {
		 // ett s�tt jag fick ihop simuleringen funkar lite sis�d�r
//			boolean winner = false;
//			do {
//				for (int i = 0; i < deltagareLista.length; i++) {
//					int distancedTraveled = rand.nextInt(10);
//					deltagareLista[i].setDistance(deltagareLista[i].getDistance() + distancedTraveled);
//					System.out.println(deltagareLista[i]);
//					if (deltagareLista[i].getDistance() >= 100) {
//						System.out.println("\n\nVinnaren f�r t�vlingen �r " + deltagareLista[i].getForName() + " "
//								+ deltagareLista[i].getLastName().toString());
//						winner = true;
//					}
//				}
//			} while (!winner);
//		
//			this.lista = dl;
//			boolean winner = false;
//			do {
//				for(Participants p:dl) {
//					p.setDistance(p.getDistance()+rand.nextInt(10));
//					if(p.getDistance()>=100) {
//						System.out.println("\n Vinnaren f�r t�vlingen �r "+p.getForName()+" "+p.getLastName());
//						winner = true;
//					}
//				}
//				
//			}while(!winner);
//		}
//
//	}

}}
