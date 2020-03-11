package com.oops.design.parkinglot;

public class Ticket {

	private int ticketId;
	private int vehicleNumber;
	private int floor;
	private int enterdTime;
	
	
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getEnterdTime() {
		return enterdTime;
	}
	public void setEnterdTime(int enterdTime) {
		this.enterdTime = enterdTime;
	}
	
}
