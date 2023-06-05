package com.skilldistillery.jets.app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.CargoPlane;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerJet;

public class JetsApp {
	protected AirField af = new AirField();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JetsApp ja = new JetsApp();
		ja.run(sc);
		//FighterJet fighterJet1 = new FighterJet();
		//FighterJet fighterJet2 = new FighterJet();
		//PassengerJet passengerJet1 = new PassengerJet();
		//PassengerJet passengerJet2 = new PassengerJet();
		//CargoPlane cargoPlane = new CargoPlane();
	
	}
	
	public void run(Scanner sc) {
		System.out.println("Please choose a choice from the menu");
		

		userMenu();
		boolean running = true;
		boolean done = false;
		while (running) {
			userMenu();
			String choice = sc.nextLine();
			//String choice = "0";
			switch (choice) {

			case "1":
				listFleet(toString());
				break;
		/*	case "2":
				flyAllJets();
				break;
			case "3":
				fastestJet(fleet);
				break;
			case "4":
				viewJetWithLongestRange(fleet);
			case "5":
				loadCargo();
				break;
			case "6":
				fight ();
				break;
			case "7":
				addAJetToFleet(fleet);
				break;
			case "8":
				removeAJetFromFleet(fleet);
				break;*/
			case "9":
				System.out.println("Exit");
				break;
			}
		}
		
		done = true;
		}

	public void listFleet(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (string != null) {
				System.out.println(string.toString());
			}
		}
	}
	
//	public String toString() {
//		return super.toString();
//	}

	public void userMenu() {
		System.out.println();
		System.out.println("========= MENU ==============================");
		System.out.println("|                                           |");
		System.out.println("|    1. List fleet                          |");
		System.out.println("|    2. Fly all jets                        |");
		System.out.println("|    3. View fastest jet                    |");
		System.out.println("|    4. View jet with longest range         |");
		System.out.println("|    5. Load all cargo jets                 |");
		System.out.println("|	 6. Dogfight                            |");
		System.out.println("|    7. Add a jet to Fleet                  |");
		System.out.println("|    8. Remove a jet from Fleet             |");
		System.out.println("|    9. Quit program                        |");
		System.out.println("|                                           |");
		System.out.println("=============================================");

	}

}