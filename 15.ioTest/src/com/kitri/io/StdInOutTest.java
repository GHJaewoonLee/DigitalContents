package com.kitri.io;

import java.io.IOException;


public class StdInOutTest {

	public static void main(String[] args) {
		
		try {
//			System.out.print("�Է�1 : ");
//			int x = System.in.read();
//			System.out.println("1. x = : " + x);
//			System.out.println("1. x = : " + (char)x);
			
			System.out.print("�Է�2 : ");
			byte[] b = new byte[100];
			int x = System.in.read(b);
			System.out.println("2. x = : " + x);
			int len = b.length;
			for (int i = 0; i < len; i++) {
				System.out.println(b[i]);
			}
			String s = new String(b, 0, x-2);	// \n
			System.out.println(s);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
