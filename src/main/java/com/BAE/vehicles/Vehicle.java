package com.BAE.vehicles;

public abstract class Vehicle {
	
	private int topSpeed;
	private int gears;
	private int doors;
	private String manufacturer;
	private String model;
	private int id;
	
	
	
	public Vehicle(int topSpeed, int gears, int doors, String manufacturer, String model, int id) {
		super();
		this.topSpeed = topSpeed;
		this.gears = gears;
		this.doors = doors;
		this.manufacturer = manufacturer;
		this.model = model;
		this.id = id;
	}


	public abstract double calculateBill();
	

	public int getTopSpeed() {
		return topSpeed;
	}



	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}



	public int getGears() {
		return gears;
	}



	public void setGears(int gears) {
		this.gears = gears;
	}



	public int getDoors() {
		return doors;
	}



	public void setDoors(int doors) {
		this.doors = doors;
	}



	public String getManufacturer() {
		return manufacturer;
	}



	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	
	
	@Override
	public String toString() {
		return "Vehicle [topSpeed=" + topSpeed + ", gears=" + gears + ", doors=" + doors + ", manufacturer="
				+ manufacturer + ", model=" + model + ", id=" + id + "]";
	}
	
	
	
	
	
	

	
	
	
}
