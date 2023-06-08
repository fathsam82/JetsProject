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
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApp ja = new JetsApp();
		ja.run();

	}

	public void run() {
		System.out.println("Please choose a choice from the menu");
		boolean running = true;
		while (running) {
			userMenu();
			String choice = sc.nextLine();
			// String choice = "0";
			switch (choice) {

			case "1":
				af.listFleet();
				break;
				
			case "2":
				af.flyAllJets();
				break;

			case "3":
				af.fastestJet();
				break;
				
			case "4":
				af.longestRangeJet();
				break;
				
			case "5":
				af.loadPlanes();
				break;

			case "6":
				af.fightPlanes();
				break;

			case "7":
				addAJetToFleet();
				break;

			case "8":
				removeAJetFromFleet();
				break;

			case "9":
				System.out.println("Program has ended");
				running = false;
				break;
			}
		}

	}

	public void addAJetToFleet() {
		System.out.println("Enter model");
		String typeModel = sc.nextLine();
		System.out.println("Enter speed");
		double speed = sc.nextDouble();
		System.out.println("Enter range");
		int range = sc.nextInt();
		System.out.println("Enter price");
		long price = sc.nextLong();
		af.addJet(typeModel, speed, range, price);
	}

	public void removeAJetFromFleet() {
		af.listFleet();
		System.out.println("Enter number to remove: ");
		int choice = sc.nextInt();
		sc.nextLine();
		af.removeJet(choice);
	}

	public void userMenu() {
		System.out.println();
		System.out.println("========= MENU ==============================");
		System.out.println("|                                           |");
		System.out.println("|    1. List fleet                          |");
		System.out.println("|    2. Fly all jets                        |");
		System.out.println("|    3. View fastest jet                    |");
		System.out.println("|    4. View jet with longest range         |");
		System.out.println("|    5. Load all cargo jets                 |");
		System.out.println("|    6. Dogfight                            |");
		System.out.println("|    7. Add a jet to Fleet                  |");
		System.out.println("|    8. Remove a jet from Fleet             |");
		System.out.println("|    9. Quit program                        |");
		System.out.println("|                                           |");
		System.out.println("=============================================");

	}

}