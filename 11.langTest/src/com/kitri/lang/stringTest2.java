package com.kitri.lang;

import java.io.UnsupportedEncodingException;


public class stringTest2 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		/* Constructor */
		
		//String str1 = null;
		String str1 = new String();	// ""
		System.out.println("문자열 길이 : " + str1.length());
		
		// 완성형 한글 (EUC-KR)
		//byte[] b = {97, 98, 99, 100};
		byte[] b = {-66, -56, -77, -25, -57, -49, -68, -68, -65, -28, 46};
		String str2 = new String(b);
		//String str2 = new String(b, "euc-kr");
		System.out.println("str2 : " + str2);
		
		// 웹사이트에서 한글이 깨지는 경우를 고려
		// UTF-8 형식은 모든 문자를 처리가능 (단, 3바이트 단위로 처리)
		byte[] b2 = {-20, -107, -120, -21, -123, -107, -19, -107, -104, -20, -124, -72, -20, -102, -108, 46};
		String str3 = new String(b2, "utf-8");
		System.out.println("str3 : " + str3);
		
		// 원하는 위치에서 원하는 길이 만큼 문자열로 변환
		byte[] b3 = {97, 98, 99, 100, 101, 102, 103, 104};
		String str4 = new String(b3, 2, 4);
		System.out.println("str4 : " + str4);
		
		
		// 한글은 Character 배열을 쓰는게 더 편함
		//char[] c = {'a', 'b', 'c', 'd', 'e', 'f'};
		char[] c = {'안', '녕', '하', '세', '요', '.'};
		String str5 = new String(c);
		System.out.println("str5 : " + str5);
		
		// 원하는 위치에서 원하는 길이 만큼 문자열로 변환
		String str6 = new String(c, 2, 4);
		System.out.println("str6 : " + str6);
	}
}
