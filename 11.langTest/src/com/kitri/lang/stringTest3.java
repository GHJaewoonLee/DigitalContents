package com.kitri.lang;


public class stringTest3 {

	public static void main(String[] args) {
		
		/* Methods */
		String str = "Hello Java!!!";
		char c = str.charAt(4);
		System.out.println("c : " + c);
		
		str = "123";
		int x = str.charAt(0) - 48;
		System.out.println("x : " + x);
		
		// 단, 숫자는 0 ~ 9의 값만 가짐. (음수는 고려 안함)
		str = "1242342a32";
		int len = str.length();
		System.out.println("length : " + len);
		
		boolean isNumber = false;
		//boolean isNumber = checkNumber1(str);

		for (int i = 0; i < len; i++) {
			// 음수도 고려할 경우
			if (str.charAt(i) == '-') {
				if (i == 0) {
					continue;
				} else {
					isNumber = false;
					break;
				}
			}
			
			if (!((str.charAt(i) >= '0') && (str.charAt(i) <= '9'))) {
				isNumber = false;
				break;
			} else {
				isNumber = true;
			}
		}
		
		if (isNumber) {
			System.out.println(str + "은 숫자입니다.");
		} else {
			System.out.println(str + "은 숫자가 아닙니다.");
		}
		
		// 문자열 이으기
		String str1 = "Hello";
		String str2 = "Java";
		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2));
		
		// 특정 문자열로 시작하거나 끝나는지
		str = "Hello Java!!!";
		if (str.startsWith("He")) {
			System.out.println(str + "은 He로 시작한다.");
		}
		
		if (str.endsWith("o Java!!!")) {
			System.out.println(str + "은 o Java!!!로 끝난다.");
		}
		
		// 전부 대문자로, 소문자로
		String s1 = "Java";
		String s2 = "JaVA";
		System.out.println("s1.toUpperCase() : " + s1.toUpperCase());		
		System.out.println("s2.toLowerCase() : " + s2.toLowerCase());		
		
		// 대소문자 구별하여 비교
		if (s1.equals(s2)) {
			System.out.println(s1 + "과 " + s2 + "는 같은 문자열");
		} else {
			System.out.println(s1 + "과 " + s2 + "는 다른 문자열");
		}
		
		//if (s1.toUpperCase().equals(s2.toUpperCase()) && s1.toLowerCase().equals(s2.toLowerCase())) {
		// 대소문자 구별없이 비교
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println(s1 + "과 " + s2 + "는 대소문자 구분없이 같은 문자열");
		} else {
			System.out.println(s1 + "과 " + s2 + "는 대소문자 구분없이 다른 문자열");
		}
	}
	
	
	/* -0~9로 이루어졌는지 판별 */
	public static boolean checkNumber1(String s) {
		boolean isNumber = false;
		int i = s.length();
		
		if (i == 0) {
			return isNumber;
		}
		
		if (s.charAt(0) == '-') {
			isNumber = checkNumber2(s.substring(1, s.length()));
		} else if ((s.charAt(0) >= '0') && (s.charAt(0) <= '9')) {
			isNumber = checkNumber2(s);
		} else {
			return isNumber;
		}
		
		return isNumber;
	}
	
	/* 0~9로 이루어졌는지 판별 */
	public static boolean checkNumber2(String s) {
		boolean isNumber = false;
		int i = s.length();
		
		for (int idx = 0; idx < i; idx++) {
			if (!((s.charAt(idx) >= '0') && (s.charAt(idx) <= '9'))) {
				isNumber = false;
				break;
			} else {
				isNumber = true;
			}
		}
		
		return isNumber;
	}
}
