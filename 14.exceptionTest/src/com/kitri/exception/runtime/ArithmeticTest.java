package com.kitri.exception.runtime;

import java.util.Random;


public class ArithmeticTest {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int x = 30;
		
		// ArithmeticException�� Runtime Exception�̹Ƿ� Logic���� ó��
//		int y = random.nextInt(5);
//		try {
//			int z = x / y;
//			System.out.println(x + " / " + y + " = " + z);
//		} catch (ArithmeticException ae) {
//			System.out.println(ae.getMessage());
//			System.out.println("0���� ���� �� �����ϴ�.");
//		}
		
		// ��� 1
		int y = random.nextInt(5);
		if (y != 0) {
			int z = x / y;
			System.out.println(x + " / " + y + " = " + z);
		} else {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		// ��� 2
//		int y = random.nextInt(4) + 1;
//		int z = x / y;
//		System.out.println(x + " / " + y + " = " + z);
	}
}
