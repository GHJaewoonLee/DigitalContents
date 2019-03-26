package com.kitri.test;

import com.kitri.car.Car;


public class CarUser {

	public static void main(String[] args) {
		
		Car car = new Car("Sonata", "Black", "Hyundai");
		System.out.println("Name : " + car.getName());
		System.out.println("Color : " + car.getColor());
		System.out.println("Maker : " + car.getMaker());
		System.out.println("Speed : " + car.getSpeed());
		
		car.setColor("White");
		System.out.println("Changed Color : " + car.getColor());
		System.out.println(car);
	}
}