package com.sroba.factories;

public interface IAbstractFactory {

	public IVehicleFactory getVehicle(String licensePlate, String vehicleType, String mark, int model, 
			int cylinder, String color);
	public IBoatFactory getBoat(String licensePlate, String boatType, String mark, int model, String color);
}
