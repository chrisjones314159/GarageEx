package com.BAE.vehicles;

import com.BAE.main.Runner;

public class Car extends Vehicle{
	private boolean hasRadio;
	
	
	
	
	public Car(int topSpeed, int gears, int doors, String manufacturer, String model, int id, boolean hasRadio) {
		super(topSpeed, gears, doors, manufacturer, model, id);
		// TODO Auto-generated constructor stub
		this.hasRadio = hasRadio;
	}





	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		double bill = 200 + (10*this.getDoors());
		return bill;
	}
	
	
	
		

		
			
	
}
