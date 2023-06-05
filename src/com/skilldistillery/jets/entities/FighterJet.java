package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet() {
	}

	@Override
	public void fight() {
		System.out.println("BAM BOOM PEWWW");
	}

	@Override
	public void fly(double speed, int range) {
		super.fly();
		double z = (range/speed);
		return;
		
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

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

}
