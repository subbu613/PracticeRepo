package com.oops.design.parkinglot;

public class Vehicle {
	
	private VehicleEnum type;
	private int number;
	
	public enum VehicleEnum{
		BIKE,CAR
	}

	public Vehicle(VehicleEnum type)
	{
		this.type = type;
	}
	
	public VehicleEnum getType()
	{
		return this.type;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
