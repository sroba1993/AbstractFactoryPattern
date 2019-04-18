package com.sroba;

import com.sroba.factories.IAbstractFactory;
import com.sroba.factories.IBoatFactory;
import com.sroba.factories.IVehicleFactory;

public class App {

	public static void main(String[] args) {
		
		IAbstractFactory vehicleFactory = new ProductsFactory().getFactory("vehicle");
		
		IVehicleFactory car = vehicleFactory.getVehicle("xdp123", "carroparticular", "mazda", 2018, 1200, "rojo");
		car.makeVehicle();
		System.out.println(car.toString());
		
		IVehicleFactory motorcicle = vehicleFactory.getVehicle("frt12a", "moto", "honda", 2018, 125, "amarilla");
		motorcicle.makeVehicle();
		System.out.println(motorcicle.toString());
		
		IVehicleFactory autobus = vehicleFactory.getVehicle("frt12a", "autobus", "mazda", 2018, 1600, "amarilla");
		autobus.makeVehicle();
		System.out.println(autobus.toString());
		
		IAbstractFactory boatFactory = new ProductsFactory().getFactory("boat");
		
		IBoatFactory vessel = boatFactory.getBoat("2334332k", "buque", "Galeon", 2011, "blanco");
		vessel.makeBoad();
		System.out.println(vessel.toString());
		
		IBoatFactory fastBoat = boatFactory.getBoat("23000021l", "lancharapida", "Galeon", 2017, "verde");
		fastBoat.makeBoad();
		System.out.println(fastBoat.toString());
		
		IBoatFactory yacht = boatFactory.getBoat("09043211m", "yate", "Galeon", 2009, "rojo");
		yacht.makeBoad();
		System.out.println(yacht.toString());	
	}
}
