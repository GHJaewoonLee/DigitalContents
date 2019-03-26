package com.kitri.lang;

import java.io.UnsupportedEncodingException;


public class stringTest4 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		// String -> byte[]
		String str = "ABCDEF";
		byte[] b = str.getBytes();
		int len = b.length;
		for (int i = 0; i < len; i++) {
			System.out.println("b[" + i + "] : " + (char)b[i]);
		}
		
		// 한글도 가능 (디폴트 값 : MS949)
		String str2 = "안녕하세요.";
		//byte[] b2 = str2.getBytes();
		byte[] b2 = str2.getBytes("utf-8");
		int len2 = b2.length;
		for (int i = 0; i < len2; i++) {
			System.out.println("b2[" + i + "] : " + b2[i]);
		}
		
		// String -> char[]
		char c[] = str2.toCharArray();
		int len3 = c.length;
		for (int i = 0; i < len3; i++) {
			System.out.println("c[" + i + "] : " + c[i]);
		}
	}

}
