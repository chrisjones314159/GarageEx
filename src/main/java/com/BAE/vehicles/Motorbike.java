package com.BAE.vehicles;

import com.BAE.main.Runner;

public class Motorbike extends Vehicle{
	
	private boolean hasStand;

	
	
	
	public Motorbike(int topSpeed, int gears, int doors, String manufacturer, String model, int id, boolean hasStand) {
		super(topSpeed, gears, doors, manufacturer, model, id);
		// TODO Auto-generated constructor stub
		this.hasStand = hasStand;
	}

	
	
	
	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		double bill = 200 + (12*this.getTopSpeed());
		return bill;
	}

}
