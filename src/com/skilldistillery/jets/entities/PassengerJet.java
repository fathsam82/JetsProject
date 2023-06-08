package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet {

	public PassengerJet() {

	}

	@Override
	public String getModel() {

		return super.getModel();
	}

	@Override
	public void setModel(String model) {

		super.setModel(model);
	}

	@Override
	public double getSpeed() {

		return super.getSpeed();
	}

	@Override
	public void setSpeed(double speed) {

		super.setSpeed(speed);
	}

	@Override
	public int getRange() {

		return super.getRange();
	}

	@Override
	public void setRange(int range) {

		super.setRange(range);
	}

	@Override
	public long getPrice() {

		return super.getPrice();
	}

	@Override
	public void setPrice(long price) {

		super.setPrice(price);
	}

	@Override
	public int hashCode() {

		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		return super.equals(obj);
	}

	@Override
	public String toString() {

		return super.toString();
	}

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

}
