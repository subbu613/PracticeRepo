package com.oops.design.parkinglot;

public class Floor {
	
	private Vehicle[] vehicleArr;
	private int noOfBikes;


	private int noOfCars;

	public Vehicle[] getVehicle() {
		return vehicleArr;
	}

	public void setVehicle(Vehicle[] vehicle) {
		this.vehicleArr = vehicle;
	}
	
	public Floor(int noOfBikes,int noOfCars)
	{
		this.noOfBikes = noOfBikes;
		this.noOfCars = noOfCars;
		this.vehicleArr = new Vehicle [noOfBikes+noOfCars];
	}
	public int getNoOfBikes() {
		return noOfBikes;
	}

	public void setNoOfBikes(int noOfBikes) {
		this.noOfBikes = noOfBikes;
	}

	public int getNoOfCars() {
		return noOfCars;
	}

	public void setNoOfCars(int noOfCars) {
		this.noOfCars = noOfCars;
	}

	public boolean addVehicle(Vehicle v) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
