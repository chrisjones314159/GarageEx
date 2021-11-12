package com.BAE.vehicles;

import com.BAE.main.Runner;

public class Van extends Vehicle{

	private int spaceInBack;
	
	
	
	
	public Van(int topSpeed, int gears, int doors, String manufacturer, String model, int id, int spaceInBack) {
		super(topSpeed, gears, doors, manufacturer, model, id);
		// TODO Auto-generated constructor stub
		this.spaceInBack = spaceInBack;
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		double bill = 200 + (3*this.getspaceInBack());
		return bill;
	}

	private int getspaceInBack() {
		// TODO Auto-generated method stub
		return spaceInBack;
	}

}
