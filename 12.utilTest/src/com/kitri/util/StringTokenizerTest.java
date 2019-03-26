package com.kitri.util;

import java.util.StringTokenizer;
import java.util.UUID;


public class StringTokenizerTest {

	public static void main(String[] args) {
		
		String str = "Hello Java !!!";
		
		// Default tokenizer : " "
		StringTokenizer st = new StringTokenizer(str);
		int cnt = st.countTokens();
		System.out.println("토큰 수 : " + cnt);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
		str = "TO|홍길동|안녕하세요 오늘 ~";
		StringTokenizer st2 = new StringTokenizer(str, "|");
		String protocal = st2.nextToken();
		String to = st2.nextToken();
		String msg = st2.nextToken();
		
		System.out.println("기능 : " + protocal);
		System.out.println("누구에게 : " + to);
		System.out.println("보내는 메세지 : " + msg);
		
		
		System.out.println(UUID.randomUUID());
	}
}
