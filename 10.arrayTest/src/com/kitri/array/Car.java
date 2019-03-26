package com.kitri.array;

public class Car {

	private String carName;
	private String color;
	private String carMaker;
	
	
	public Car(String carName, String color, String carMaker) {
		super();
		this.carName = carName;
		this.color = color;
		this.carMaker = carMaker;
	}


	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getCarMaker() {
		return carMaker;
	}


	public void setCarMaker(String carMaker) {
		this.carMaker = carMaker;
	}


	@Override
	public String toString() {
		return "Car [carName=" + carName + ", color=" + color + ", carMaker=" + carMaker + "]";
	}
}
