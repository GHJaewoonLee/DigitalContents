package com.kitri.lang;


public class StringVSBuffer {

	public static void main(String[] args) {
		
		long start;
		long end;
		
		String str = "Hello ";
		start = System.nanoTime();
		for (int i = 0; i < 5000; i++) {
			str += i;
		}
		end = System.nanoTime();
		System.out.println((end - start) / 1000 + "us");
		
		StringBuffer sb = new StringBuffer(str);
		start = System.nanoTime();
		for (int i = 0; i < 5000; i++) {
			sb.append(i);
		}
		end = System.nanoTime();
		System.out.println((end - start) / 1000 + "us");
	}
}
