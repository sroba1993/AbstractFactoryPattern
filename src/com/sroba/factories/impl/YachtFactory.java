package com.sroba.factories.impl;

import com.sroba.factories.IBoatFactory;

public class YachtFactory implements IBoatFactory{
	
	private String licensePlate ;
	private String boatType;
	private String mark;	
	private int model;
	private String color;
	
	
	public YachtFactory(String licensePlate, String mark, int model, String color) {
		this.licensePlate = licensePlate;
		this.boatType = "Yate";
		this.mark = mark;
		this.model = model;
		this.color = color;
	}

	@Override
	public void makeBoad() {
		System.out.println("Yate fabricado");		
	}

	@Override
	public String toString() {
		return "License Plate= " + licensePlate + ", Boat Type= " + boatType + ", mark= " + mark
				+ ", model= " + model  + ", color= " + color;
	}

}
