package com.kitri.exception.runtime;


public class NumberFormatTest {

	public static void main(String[] args) {
		
		String s = "123";
		
//		try {
//			int x = Integer.parseInt(s);
//			System.out.println(x + 100);
//		} catch (NumberFormatException nfe) {
//			System.out.println("숫자가 아닙니다.");
//		}
		
		if (isIntegerNumber(s)) {
			int x = Integer.parseInt(s);
			System.out.println(x + 100);
		} else {
			System.out.println("숫자가 아닙니다.");
		}
	}
	
	private static boolean isIntegerNumber(String str) {
		boolean flag = true;
		int len = str.length();
		
		if (len == 0) {
			return false;
		}
		
		for (int i = 0; i < len; i++) {
			if (((str.charAt(i) < '0') || (str.charAt(i) > '9'))) {
				flag = false;
				break;
			}
		}
		
		return flag;
	}
}
