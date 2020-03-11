package com.oops.design.parkinglot;

import java.util.Scanner;


public class ParkingLotApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Desin Your own Praking lot");
		System.out.println("Total no of floors ");
		int floors = sc.nextInt();
		sc.nextLine();
		int i = 0;
		Floor [] floorArr = new Floor[floors];
		while(i >= 0 && i < floors)
		{
			System.out.println(" Enter space available for Bikes and cars in floor "+(i+1));
			String[] no = sc.nextLine().split(" ");
			
			floorArr[i] = new Floor(Integer.parseInt(no[0]),Integer.parseInt(no[1]));
			i++;
		}
	
		ParkingLot parkingLot = new ParkingLot();
		parkingLot.setFloor(floorArr);
		
		System.out.println("Your parkinglot is ready ");
		System.out.println("***********************************************************************************************************");
			while(true)
			{
				
				System.out.println("Enter 0 for bike 1 for car ");
				int vehicleType = sc.nextInt();
				Vehicle v = vehicleType == 0 ?  new Bike() : new Car();
				
				System.out.println("Enter No ");
				int vehicleNumber = sc.nextInt();
				 v.setNumber(vehicleNumber);
				 
				Ticket t= parkingLot.parkMyVehicle(v);
				System.out.println("Here are your parking ticket Details ");
				System.out.println( t.getVehicleNumber());
				System.out.println("***********************************************************************************************************");	 
			}
			
		}
		
		
	}

