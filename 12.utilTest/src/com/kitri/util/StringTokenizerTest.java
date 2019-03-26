package com.kitri.util;

import java.util.StringTokenizer;
import java.util.UUID;


public class StringTokenizerTest {

	public static void main(String[] args) {
		
		String str = "Hello Java !!!";
		
		// Default tokenizer : " "
		StringTokenizer st = new StringTokenizer(str);
		int cnt = st.countTokens();
		System.out.println("��ū �� : " + cnt);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		str = "TO|ȫ�浿|�ȳ��ϼ��� ���� ~";
		StringTokenizer st2 = new StringTokenizer(str, "|");
		String protocal = st2.nextToken();
		String to = st2.nextToken();
		String msg = st2.nextToken();
		
		System.out.println("��� : " + protocal);
		System.out.println("�������� : " + to);
		System.out.println("������ �޼��� : " + msg);
		
		
		System.out.println(UUID.randomUUID());
	}
}
