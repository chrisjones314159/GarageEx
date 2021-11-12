package com.BAE.garage;

import java.util.ArrayList;
import java.util.List;

import com.BAE.vehicles.Vehicle;

public class Garage {
	
	List <Vehicle> vehicleList = new ArrayList<Vehicle>();
	

	public Garage() {
		
	}
	

	public void emptyGarage() {
		vehicleList.clear();
	}
	
	public void calculateRepairBill(Vehicle vehicle) {
		System.out.println("Your bill will be £ "+vehicle.calculateBill()+(vehicle.getDoors()*2));
	}
	
	
	public void addToList(Vehicle vehicle) {
		vehicleList.add(vehicle);
	}
	
	public void removeVehicle(Vehicle vehicle) {
		if (this.vehicleList.remove(vehicle)) {
			System.out.println("vehicle has been removed");
		}
		else {
			System.out.println("not found");
		}
	}
	
	
	public void removeById(int id) {
		Vehicle vehicleFound = null;
		for (Vehicle vehicle : vehicleList) {
			if (vehicle.getId() == id) {
				vehicleFound = vehicle;
			}
		}
		removeVehicle(vehicleFound);
	}
	
	
	public void removeByManufacturer(String manufacturer) {
		Vehicle vehicleFound = null;
		for (Vehicle vehicle: vehicleList) {
			if (vehicle.getManufacturer() == manufacturer) {
				vehicleFound = vehicle;
			}
			}
		removeVehicle(vehicleFound);
		}
	
	
	public void removeByMultipleByManufacturer(String manufacturer) {
		Vehicle vehicleFound = null;
		for (int i = 0; i < vehicleList.size();) {
			if (vehicleList.get(i).getManufacturer() == manufacturer) {
				vehicleFound = vehicleList.get(i);
				removeVehicle(vehicleFound);
			}
			else {
				i++;
			}
			}
		}
	
	
	public void calculateBillMethod() {
		
		for (Vehicle vehicle: this.vehicleList) {
			System.out.println(vehicle.calculateBill());
		}
	}

	
	public void getVehicles() {
		for (Vehicle vehicle : vehicleList) {
			System.out.println(vehicle);
		}
	}
}
