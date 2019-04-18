package com.sroba;

import com.sroba.factories.IAbstractFactory;
import com.sroba.factories.IBoatFactory;
import com.sroba.factories.IVehicleFactory;
import com.sroba.factories.impl.AutobusFactory;
import com.sroba.factories.impl.EmptyFactory;
import com.sroba.factories.impl.MotorcycleFactory;
import com.sroba.factories.impl.ParticularCarFactory;

public class VehicleFactory implements IAbstractFactory {
	
	@Override
	public IVehicleFactory getVehicle(String licensePlate, String vehicleType, String mark, int model, int cylinder,
			String color) {
		if (vehicleType == null) {
			return new EmptyFactory();
		} else if (vehicleType.equalsIgnoreCase("carroparticular")) {
			return new ParticularCarFactory(licensePlate, mark, model, cylinder, color);
		} else if (vehicleType.equalsIgnoreCase("moto")) {
			return new MotorcycleFactory(licensePlate, mark, model, cylinder, color);
		} else if (vehicleType.equalsIgnoreCase("autobus")) {
			return new AutobusFactory(licensePlate, mark, model, cylinder, color);
		}
		return new EmptyFactory();
	}

	@Override
	public IBoatFactory getBoat(String licensePlate, String boatType, String mark, int model, String color) {
		return null;
	}
}
