package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField<E> {
	protected List<Jet> hangar;

	public AirField() {
		readJets("jets.txt");
	}

	public void fightPlanes() {
		for (Jet jet : hangar) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).fight();
			}
		}
	}

	public void loadPlanes() {
		for (Jet jet : hangar) {
			if (jet instanceof CargoPlane) {
				((CargoPlane) jet).loadCargo();
			}
		}
	}

	public void listFleet() {
		int counter = 0;
		for (Jet jet : hangar) {

			System.out.println(counter + " " + jet);
			counter++;
		}
	}

	public void fastestJet() {
		double topSpeed = 0.0;
		Jet fastestJet = null;

		for (Jet jet : hangar) {

			if (jet.getSpeed() > topSpeed) {
				topSpeed = jet.getSpeed();
				fastestJet = jet;

			}
		}
		System.out.println(fastestJet);

	}

	public void flyAllJets() {
		System.out.println("The jets take off!");
		double topSpeed = 0.0;
		int topRange = 0;
		for (Jet jet : hangar) {
			System.out.println(jet);
			topSpeed = jet.getSpeed();
			topRange = jet.getRange();
			double timeInAir = topRange / topSpeed;
			System.out.println(timeInAir + " hours of fly time.");

		}

	}

	public void longestRangeJet() {
		int topRange = 0;
		Jet longestRangeJet = null;

		for (Jet jet : hangar) {

			if (jet.getRange() > topRange) {
				topRange = jet.getRange();
				longestRangeJet = jet;
			}
		}
		System.out.println(longestRangeJet);

	}

	public void addJet(String model, double speed, int range, long price) {
		PassengerJet pj = new PassengerJet(model, speed, range, price);
		hangar.add(pj);
	}

	public void removeJet(int choice) {
		hangar.remove(choice);
	}

	public List<Jet> readJets(String fileName) {

		hangar = new ArrayList<>();
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetInfo = line.split(",");
				String jetType = jetInfo[0];
				String model = jetInfo[1];
				double speed = Double.parseDouble(jetInfo[2]);
				int range = Integer.parseInt(jetInfo[3]);
				long price = Long.parseLong(jetInfo[4]);
				Jet jet = null;
				if (jetType.equals("Fighter Jet")) {
					jet = new FighterJet(model, speed, range, price);

				}
				if (jetType.equals("Cargo")) {
					jet = new CargoPlane(model, speed, range, price);

				}
				if (jetType.equals("Passenger")) {
					jet = new PassengerJet(model, speed, range, price);
				}
				hangar.add(jet);
				// System.out.println(jet);

			}
		} catch (IOException e) {
			System.err.println(e);
		}

		return hangar;
	}

}
