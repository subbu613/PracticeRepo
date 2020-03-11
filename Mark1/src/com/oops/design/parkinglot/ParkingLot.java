package com.oops.design.parkinglot;


public class ParkingLot {

	private Floor [] floorArr;
	private int currFloor;
	
	public Floor[] getFloor() {
		return floorArr;
	}

	public void setFloor(Floor[] floor) {
		this.floorArr = floor;
	}

	public ParkingLot()
	{
		currFloor = 0;
	}

	public Ticket parkMyVehicle(Vehicle v) {
		// TODO Auto-generated method stub
	Ticket t = new Ticket();
	t.setVehicleNumber(v.getNumber());
		
	while(floorArr != null && floorArr[currFloor]!=null)
	{
		Floor floor = floorArr[currFloor];
		boolean isParked = floor.addVehicle(v);
		currFloor++;
		if(isParked) 
		{
			break;
		}
	}
	
		return t;
	}

	
	
	
	
}
