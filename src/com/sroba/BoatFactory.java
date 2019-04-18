package com.sroba;

import com.sroba.factories.IAbstractFactory;
import com.sroba.factories.IBoatFactory;
import com.sroba.factories.IVehicleFactory;
import com.sroba.factories.impl.EmptyFactory;
import com.sroba.factories.impl.FastBoatFactory;
import com.sroba.factories.impl.VesselFactory;
import com.sroba.factories.impl.YachtFactory;

public class BoatFactory implements IAbstractFactory{
	
	@Override
	public IBoatFactory getBoat(String licensePlate, String boatType, String mark, int model, String color) {
		if (boatType == null) {
			return new EmptyFactory();
		} else if (boatType.equalsIgnoreCase("lancharapida")) {
			return new FastBoatFactory(licensePlate, mark, model, color);
		} else if (boatType.equalsIgnoreCase("buque")) {
			return new VesselFactory(licensePlate, mark, model, color);
		} else if (boatType.equalsIgnoreCase("yate")) {
			return new YachtFactory(licensePlate, mark, model, color);
		}
		return new EmptyFactory();
	}

	@Override
	public IVehicleFactory getVehicle(String licensePlate, String vehicleType, String mark, int model, int cylinder,
			String color) {
		return null;
	}
}
