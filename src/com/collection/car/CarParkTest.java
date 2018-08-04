package com.collection.car;

public class CarParkTest {

	public static void main(String[] args) {
		Parked_CarOwner_Details owner1 = new Parked_CarOwner_Details("Nishad", "SX4", "1", 1, "BORIVALI");
		Parked_CarOwner_Details owner2 = new Parked_CarOwner_Details("Alfred", "S4", "2", 2, "Kandivali");
		Parked_CarOwner_Details owner3 = new Parked_CarOwner_Details("Swar", "X4", "3", 3, "BORIVAL");
		Parked_CarOwner_Details owner4 = new Parked_CarOwner_Details("Allisson", "SX", "4",4, "BORIVLI");
		Parked_CarOwner_Details owner5 = new Parked_CarOwner_Details("Frank", "S", "5", 5, "BORILI");
		Parked_CarOwner_Details owner6 = new Parked_CarOwner_Details("Hazard", "X", "6", 6, "BVALI");
		Parked_CarOwner_Details owner7 = new Parked_CarOwner_Details("Terry", "XA4", "7", 7, "BORIV");
		Parked_CarOwner_Details owner8 = new Parked_CarOwner_Details("David", "SS4", "8", 8, "BOVALI");
		int token = owner1.getToken();
		System.out.println(token);
		token = owner2.getToken();
		System.out.println(token);
		token = owner3.getToken();
		System.out.println(token);
		token = owner4.getToken();
		System.out.println(token);
		token = owner5.getToken();
		System.out.println(token);
		token = owner6.getToken();
		System.out.println(token);
	}

}
