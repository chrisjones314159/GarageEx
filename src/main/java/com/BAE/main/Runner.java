package com.BAE.main;

import com.BAE.garage.Garage;
import com.BAE.vehicles.Car;
import com.BAE.vehicles.Motorbike;
import com.BAE.vehicles.Van;
import com.BAE.vehicles.Vehicle;



public class Runner {
	 

	


	public static void main(String[] args) {
		
		Garage garage1 = new Garage();
	
		
		Car vehicle1 = new Car(45, 5, 5, "Audi", "TT", 1, true);
		garage1.addToList(vehicle1);
		Car vehicle2 = new Car(70, 5, 3, "Ford", "Focus", 2, true);
		garage1.addToList(vehicle2);
		Motorbike vehicle3 = new Motorbike(60, 6, 0, "Yamaha", "Speedybike", 3, true);
		garage1.addToList(vehicle3);
		Motorbike vehicle4 = new Motorbike(90, 5, 0, "Pegeuot", "fastbike", 4, false);
		garage1.addToList(vehicle4);
		Van vehicle5 = new Van(38, 6, 5, "Ford", "Transit", 5, 30);
		garage1.addToList(vehicle5);
		Van vehicle6 = new Van(56, 5, 5, "Nissan", "Hauler", 6, 50);
		garage1.addToList(vehicle6);
		
		
		
//		garage1.calculateBillMethod();
		
		
		
		garage1.removeByMultipleByManufacturer("Ford");
		
		
//		garage1.removeById(3);
//		garage1.emptyGarage();
		garage1.calculateRepairBill(vehicle6);
		
		
		garage1.getVehicles();
		
	}
		
		
	
	
	
}
