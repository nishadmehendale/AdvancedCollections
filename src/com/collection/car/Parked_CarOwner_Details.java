package com.collection.car;

//
//a.	Create class Parked_CarOwner_Details which will have field’s 
//owerName, carModel, carNO, owerMobileNo, owerAddress with setter and getter methods.



public class Parked_CarOwner_Details {
	private String ownerName;
	private String carModel;
	private String carNo;
	private long ownerMobileNo;
	private String ownerAddress;
	private int token;
	public Parked_CarOwner_Details(String ownerName, String carModel, String carNo, long ownerMobileNo,
			String ownerAddress) {
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNo = carNo;
		this.ownerMobileNo = ownerMobileNo;
		this.ownerAddress = ownerAddress;
	}
	
	public String getOwnerName() {
		return ownerName;
	}

	public String getCarModel() {
		return carModel;
	}

	public String getCarNo() {
		return carNo;
	}

	public long getOwnerMobileNo() {
		return ownerMobileNo;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	@Override
	public String toString() {
		return "Parked_CarOwner_Details [ownerName=" + ownerName + ", carModel=" + carModel + ", carNo=" + carNo
				+ ", ownerMobileNo=" + ownerMobileNo + ", ownerAddress=" + ownerAddress + ", token=" + token + "]";
	}

	public int getToken() {
		Parked_CarOwnerList park = new Parked_CarOwnerList();
		park.add_new_car(this);
		return token;
	}
	public void setToken(int token) {
		this.token = token;
	}
}