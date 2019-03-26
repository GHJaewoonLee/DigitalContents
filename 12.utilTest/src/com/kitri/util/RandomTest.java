package com.kitri.util;

import java.util.Random;


public class RandomTest {

	public static void main(String[] args) {

		Random r = new Random();
		
		boolean b = r.nextBoolean();
		System.out.println("b : " + b);
		
		// Similar to Math.random()
		double d = r.nextDouble();
		System.out.println("d : " + d);
		
		int i1 = r.nextInt();
		System.out.println("i1 : " + i1);
		
		int i2 = r.nextInt(256);
		System.out.println("i2 : " + i2);
	}
}
