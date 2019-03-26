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
		
		// ��, ���ڴ� 0 ~ 9�� ���� ����. (������ ��� ����)
		str = "1242342a32";
		int len = str.length();
		System.out.println("length : " + len);
		
		boolean isNumber = false;
		//boolean isNumber = checkNumber1(str);

		for (int i = 0; i < len; i++) {
			// ������ ����� ���
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
			System.out.println(str + "�� �����Դϴ�.");
		} else {
			System.out.println(str + "�� ���ڰ� �ƴմϴ�.");
		}
		
		// ���ڿ� ������
		String str1 = "Hello";
		String str2 = "Java";
		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2));
		
		// Ư�� ���ڿ��� �����ϰų� ��������
		str = "Hello Java!!!";
		if (str.startsWith("He")) {
			System.out.println(str + "�� He�� �����Ѵ�.");
		}
		
		if (str.endsWith("o Java!!!")) {
			System.out.println(str + "�� o Java!!!�� ������.");
		}
		
		// ���� �빮�ڷ�, �ҹ��ڷ�
		String s1 = "Java";
		String s2 = "JaVA";
		System.out.println("s1.toUpperCase() : " + s1.toUpperCase());		
		System.out.println("s2.toLowerCase() : " + s2.toLowerCase());		
		
		// ��ҹ��� �����Ͽ� ��
		if (s1.equals(s2)) {
			System.out.println(s1 + "�� " + s2 + "�� ���� ���ڿ�");
		} else {
			System.out.println(s1 + "�� " + s2 + "�� �ٸ� ���ڿ�");
		}
		
		//if (s1.toUpperCase().equals(s2.toUpperCase()) && s1.toLowerCase().equals(s2.toLowerCase())) {
		// ��ҹ��� �������� ��
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println(s1 + "�� " + s2 + "�� ��ҹ��� ���о��� ���� ���ڿ�");
		} else {
			System.out.println(s1 + "�� " + s2 + "�� ��ҹ��� ���о��� �ٸ� ���ڿ�");
		}
	}
	
	
	/* -0~9�� �̷�������� �Ǻ� */
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
	
	/* 0~9�� �̷�������� �Ǻ� */
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
