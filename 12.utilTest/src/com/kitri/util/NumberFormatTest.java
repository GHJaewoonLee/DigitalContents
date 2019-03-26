package com.kitri.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class NumberFormatTest {

	public static void main(String[] args) {

		double number = 42234241424.337847268476827462387627826578268627842869;
		
		// 345,787,242,462.34
		NumberFormat nf = new DecimalFormat(",###.##");
		System.out.println(nf.format(number));
	}
}
