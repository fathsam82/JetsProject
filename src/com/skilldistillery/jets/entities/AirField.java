package com.skilldistillery.jets.entities;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.jets.app.JetsApp;

public class AirField {
	protected List<Jet> hangar;

	public AirField() {
		readJets("jets.txt");
	}

	public void listFleet(List<Jet> jets) {
		for (int i = 0; i < jets.size(); i++) {
			if (jets != null) {
				System.out.println(jets.toString());
			}
		}
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
				System.out.println(jet);

			}
		} catch (IOException e) {
			System.err.println(e);
		}

		return hangar;
	}
}
