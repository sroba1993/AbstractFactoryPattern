package com.sroba.factories.impl;

import com.sroba.factories.IBoatFactory;
import com.sroba.factories.IVehicleFactory;

public class EmptyFactory implements IVehicleFactory, IBoatFactory{

	@Override
	public void makeVehicle() {
		System.out.println("No ha introducido un tipo de veh�culo v�lido");	
	}

	@Override
	public void makeBoad() {
		System.out.println("No ha introducido un tipo de bote v�lido");		
	}
}
