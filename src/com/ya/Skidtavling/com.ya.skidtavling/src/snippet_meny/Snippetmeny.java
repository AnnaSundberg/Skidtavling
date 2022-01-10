package snippet_meny;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

//import javax.swing.JOptionPane;

public class Snippetmeny {

	public static void main(String[] args) {
		int fv = 0;
		float result;
		int input = -1;
		String textinput = "";
		raderaKonsole(10);
		// visameny();

		while (true) {

			 //1raderaKonsole(5);
			 visameny();
			 raderaKonsole(0);
			 fv = gorfunkval();
		
			result = (float) branchval(fv);

		}

	}

	private static String inputString(String promptString, boolean b, int i) {
		boolean noNullstring = b;

		int specfunkt = i; // 1 return as Upper case;
		String inData = "";

		boolean isIndata = false;
		{
			System.out.println(promptString);
			Scanner scan = new Scanner(System.in);

			while (!isIndata) {

				inData = scan.nextLine();

				if ((inData.length() == 0) && (noNullstring)) {
					System.out.println("Måste anges!");
					// stannar kvar i whileloopen
				} else
					isIndata = true;
			}
			// scan.close();
		}

		return inData;
	}

	private static int inputInt(String promptstringint, int min, int max) {
		// TODO Auto-generated method stub
		int inData = 0;
		boolean isIndata = false;
		{
			System.out.println(promptstringint);
			Scanner scan = new Scanner(System.in);
			inData = 0;

			while (!isIndata) {

				inData = scan.nextInt();

				if ((inData < min) || (inData > max)) {
					System.out.println("ogiltigt val, försök igen!");
					// stannar kvar i whileloopen
				} else
					isIndata = true;
			}
			// scan.close();
		}

		return inData;

	}

	private static float branchval(int fv) {
		// TODO Auto-generated method stub

		float result = 0f;
		System.out.println("menyvalet: " + fv);

		switch (fv) {

		case 0:
			System.exit(0);
		case 1:
			result = etta(result);
			break;
		case 2:
			result = tva(result);
			break;
		case 3:
			result = trea(result);
			break;
		case 4:
			String Enamn = fyra(result);
			System.out.println(Enamn);
			break;
		case 5:
			result = fem(result);
			break;
		case 6:
			result = sex(result);
			break;
		case 7:
			result = sju(result);
			break;
		case 8:
			result = atta(result);
			break;
		case 9:
			visameny();
			break;
		// case 9: result = nia(result);break;
		case 10:
			result = tia(result);
			break;
		case 11:
			result = elva(result);
			break;
		case 12:
			result = tolv(result);
			break;

		}
		if (fv != 4)
			System.out.println(result);

		return result;
	}

	private static int gorfunkval() {
		int fv = 0; // aktuellt funktionsval definieras av menyfunktionen.
		String[] funk = { "etta", "tvåa", "treas", "fyra", "femma", "sexa", "sjua", "åtta", "nia", "tia", "elva",
				"tolva" };
		String sv = "";
		int val = 0;
		int menyMax = 12;

		boolean doShowval = false;
		boolean doScanval = true;

		if (doShowval) {
			// must be aviabljavax.swing
//			while (sv.length() == 0) {
//				sv = JOptionPane.showInputDialog("Ange menyval 1....."+ menyMax+ "eller '0' för att avsluta");
//				{
//
//				try {
//						val = Integer.parseInt(sv);
//					}
//				catch (Exception e)// om sv inte är ett integer heltal
//					{
//						System.out.println("ogiltigt val, försök igen!");
//						sv = ""; // stannar kvar i whileloopen
//
//
//							if  ((val < 0) ||(val >menyMax))
//							{
//								System.out.println("ogiltigt val, försök igen!");
//								sv = ""; // stannar kvar i whileloopen
//							}
//						}
//				}
//			}
		} else {
			System.out.println("Ange ditt menyval: ");
			Scanner scan = new Scanner(System.in);
			val = -1;

			while ((val == -1) && (doScanval)) {

				val = scan.nextInt();

				if ((val < 0) || (val > menyMax)) {
					System.out.println("ogiltigt val, försök igen!");
					val = -1; // stannar kvar i whileloopen
				}
			}
			// scan.close();
		}

		return val;
	}

	private static void raderaKonsole(int n) {
		for (int i = 0; i < n; i++) {
		//	System.out.print("\n" + "\n" + "\n" + "\n" + "\n");
		}

		// TODO Auto-generated method stub

	}

	private static void visameny() {

		// TODO Auto-generated method stub
		System.out.println("\t\tMENY välj funktion en av nedanstående ange nummer");
		System.out.println("\t\t0. Avsluta");
		System.out.println("\t\t1. TÄVLING");
		System.out.println("\t\t2. DELTAGARE");
		System.out.println("\t\t3. LÄS IN DELTAGARLISTA");
		System.out.println("\t\t4. STARTLISTA");
		System.out.println("\t\t5. STARTA TÄVLING");
		System.out.println("\t\t6. MELLANTIDER REGISTRERA");
		System.out.println("\t\t7. MÅLGÅNG REGISTRERA");
		System.out.println("\t\t8. AVSLUTA PRISUTDELNING.");
		System.out.println("\t\t9. VISA MENYNn");
		System.out.println("\t\t10. UTSKRIFTER");
		System.out.println("\t\t11. XTRAS");
		System.out.println("\t\t12. XTRA 2");

		return;

	}

	private static float tolv(float result) {
		// TODO Auto-generated method stub
		System.out.println("tolv");
		return 0;
	}

	private static float elva(float result) {
		System.out.println("elva");
		// TODO Auto-generated method stub
		return 0;
	}

	private static float tia(float result) {
		System.out.println("tio");

		// TODO Auto-generated method stub
		return 0;
	}

	private static float nia(float result) {
		visameny();
		System.out.println("nio");
		// TODO Auto-generated method stub
		return 0;
	}

	private static float atta(float result) {
		System.out.println("åtta");
		return 0;
	}

	private static float sju(float result) {
		System.out.println("sju");
		return 0;
	}

	private static float sex(float result) {
		// TODO Auto-generated method stub
		System.out.println("sex");
			return 0;
	}

	private static float fem(float result) {
		// TODO Auto-generated method stub
		ystem.out.println("fem");
		return result;
	}

	private static String fyra(float result) {
		String svar = "";
		svar = inputString("Ange ditt Efternamn", true, 0);
		System.out.println("fyra");
		return svar;
	}

	private static float trea(float result) {
		float res = 0f;
		// TODO Auto-generated method stub
		System.out.println("tre");
		return res;
	}

	private static float tva(float result) {
		// TODO Auto-generated method stub
		float res = 0f;
		System.out.println("två");
		return res;
	}

	private static float etta(float result) {
		// TODO Auto-generated method stub
		System.out.println("ett");
		return 0f;
	}

}
