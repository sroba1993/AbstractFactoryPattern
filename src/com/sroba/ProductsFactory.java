package com.sroba;

import com.sroba.factories.IAbstractFactory;

public class ProductsFactory {

	public IAbstractFactory getFactory(String factoryType) {

		if (factoryType.equalsIgnoreCase("vehicle")) {
			return new VehicleFactory();

		} else if (factoryType.equalsIgnoreCase("boat")) {
			return new BoatFactory(); 
		}
		return null;
	}
}
