package com.sroba.factories.impl;

import com.sroba.factories.IBoatFactory;

public class VesselFactory implements IBoatFactory {

	private String licensePlate ;
	private String boatType;
	private String mark;	
	private int model;
	private String color;
	
	
	public VesselFactory(String licensePlate, String mark, int model, String color) {
		this.licensePlate = licensePlate;
		this.boatType = "Buque";
		this.mark = mark;
		this.model = model;
		this.color = color;
	}

	@Override
	public void makeBoad() {
		System.out.println("Buque fabricado");		
	}

	@Override
	public String toString() {
		return "license Plate= " + licensePlate + ", Boat Type= " + boatType + ", mark= " + mark
				+ ", model= " + model  + ", color= " + color;
	}
}
