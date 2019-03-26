package com.kitri.lang;

import java.io.UnsupportedEncodingException;


public class stringTest2 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		/* Constructor */
		
		//String str1 = null;
		String str1 = new String();	// ""
		System.out.println("���ڿ� ���� : " + str1.length());
		
		// �ϼ��� �ѱ� (EUC-KR)
		//byte[] b = {97, 98, 99, 100};
		byte[] b = {-66, -56, -77, -25, -57, -49, -68, -68, -65, -28, 46};
		String str2 = new String(b);
		//String str2 = new String(b, "euc-kr");
		System.out.println("str2 : " + str2);
		
		// ������Ʈ���� �ѱ��� ������ ��츦 ���
		// UTF-8 ������ ��� ���ڸ� ó������ (��, 3����Ʈ ������ ó��)
		byte[] b2 = {-20, -107, -120, -21, -123, -107, -19, -107, -104, -20, -124, -72, -20, -102, -108, 46};
		String str3 = new String(b2, "utf-8");
		System.out.println("str3 : " + str3);
		
		// ���ϴ� ��ġ���� ���ϴ� ���� ��ŭ ���ڿ��� ��ȯ
		byte[] b3 = {97, 98, 99, 100, 101, 102, 103, 104};
		String str4 = new String(b3, 2, 4);
		System.out.println("str4 : " + str4);
		
		
		// �ѱ��� Character �迭�� ���°� �� ����
		//char[] c = {'a', 'b', 'c', 'd', 'e', 'f'};
		char[] c = {'��', '��', '��', '��', '��', '.'};
		String str5 = new String(c);
		System.out.println("str5 : " + str5);
		
		// ���ϴ� ��ġ���� ���ϴ� ���� ��ŭ ���ڿ��� ��ȯ
		String str6 = new String(c, 2, 4);
		System.out.println("str6 : " + str6);
	}
}
