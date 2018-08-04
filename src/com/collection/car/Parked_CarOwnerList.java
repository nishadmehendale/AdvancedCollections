package com.collection.car;

import java.util.TreeSet;

//b.	Create class Parked_CarOwenerList which will have method’s int add_new_car(Parked_CarOwner_Details obj),
//remove_car(), get_parked_car_location(token)

public class Parked_CarOwnerList {
	

	private int token;
	private static int[][][] alloted = new int[3][4][20];
	private static TreeSet<Parked_CarOwner_Details> parkedCars=new TreeSet<Parked_CarOwner_Details>();
	
	public void add_new_car(Parked_CarOwner_Details carToPark)
	{
		
		for(int i =0; i<3; i++)
			for(int j=0; j<4; j++)
				for(int k=0; k<20; k++)
					if(alloted[i][j][k] == 0) {
						alloted[i][j][k] = 1;
						token = i*100 + j*10 + k;
						carToPark.setToken(token);
						break;
					}
		parkedCars.add(carToPark);
	}
	
	public void remove_car(Parked_CarOwner_Details parkedCar)
	{
		token = parkedCar.getToken();
		alloted[token/100][(token%100)/10][(token%100)/10] = 0;
		parkedCars.remove(parkedCar);
		
	}
	
	public void get_parked_car_location(int token)
	{
		System.out.println("Floor: "+(token/100)+" Section: "+(token%100)/10+" Plot: "+(token%100)/10);
	}
	
}