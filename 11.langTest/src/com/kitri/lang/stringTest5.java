package com.kitri.lang;


public class stringTest5 {

	public static void main(String[] args) {
		
		String str = "Hello Java !!!";
		
		// Ư�� ����
		int x = str.indexOf('a');
		System.out.println(str + "���� a�� " + (x + 1) + "��°�� �ִ�.");
		
		// Ư�� ��ġ ���� �˻�
		x = str.indexOf('a', 8);
		System.out.println(str + "���� a�� 8��° ����" + (x + 1) + "��°�� �ִ�.");
		
		// Ư�� ���ڿ�
		x = str.indexOf("Java");
		System.out.println(str + "���� Java�� " + (x + 1) + "��°�� �ִ�.");
		
		// ���ڿ��� �������������� �˻�
		x = str.lastIndexOf('a');
		System.out.println(str + "�� ������ ���� a�� " + (x + 1) + "��°�� �ִ�.");
		
		String str2 = "";
		System.out.println(str2 + "�� ���� : " + str2.length());
		
		// ���ڿ��� ������� (���̰� 0����)
		if (str2.isEmpty()) {
			System.out.println("���ڿ�");
		} else {
			System.out.println("str2 : " + str2);
		}
				
		// ���� ���� (��, ���ڿ� ������ ������ ���ŵ��� ����)
		String str3 = "  Hello   . ";
		System.out.println(str3 + "�� ���� : " + str3.length());
		System.out.println(str3.trim() + "�� ������ ������ ���� : " + str3.trim().length());
		
		// ���ڿ� ��ü
		String str4 = "Jaba";
		System.out.println(str4 + " :: " + str4.replace('b', 'v'));
		System.out.println(str4 + " :: " + str4.replace("Jaba", "java"));
		System.out.println(str4 + " :: " + str4.replaceAll("Jaba", "java"));
		
		// ���ڿ� ������
		String str5 = "Hello Java !!!";
		String[] s = str5.split("");
		int len = s.length;
		for (int i = 0; i < len; i++) {
			System.out.println("s[" + i + "] : " + s[i]);
		}
		
		// ���ڿ��� �Ϻκ� ����
		System.out.println(str5.substring(6));		// 6���� ������
		System.out.println(str5.substring(6, 9)); 	// 6 ~ 8
		
		// ���ڸ� ���ڿ���
		int num = 100;
		String sn1 = num + ""; 
		System.out.println(sn1 + 100);
		String sn2 = String.valueOf(num); 
		System.out.println(sn2 + 100);
		String sn3 = Integer.toString(num); 
		System.out.println(sn3 + 100);
		
		// ���ڿ��� ���ڷ�
		String ns = "100";
		num = Integer.parseInt(ns);
		System.out.println(num + 100);
	}

}
