package com.kitri.lang;


public class stringTest5 {

	public static void main(String[] args) {
		
		String str = "Hello Java !!!";
		
		// 특정 문자
		int x = str.indexOf('a');
		System.out.println(str + "에서 a는 " + (x + 1) + "번째에 있다.");
		
		// 특정 위치 부터 검색
		x = str.indexOf('a', 8);
		System.out.println(str + "에서 a는 8번째 부터" + (x + 1) + "번째에 있다.");
		
		// 특정 문자열
		x = str.indexOf("Java");
		System.out.println(str + "에서 Java는 " + (x + 1) + "번째에 있다.");
		
		// 문자열의 마지막에서부터 검색
		x = str.lastIndexOf('a');
		System.out.println(str + "의 끝에서 부터 a는 " + (x + 1) + "번째에 있다.");
		
		String str2 = "";
		System.out.println(str2 + "의 길이 : " + str2.length());
		
		// 문자열이 비었는지 (길이가 0인지)
		if (str2.isEmpty()) {
			System.out.println("빈문자열");
		} else {
			System.out.println("str2 : " + str2);
		}
				
		// 공백 제거 (단, 문자열 사이의 공백은 제거되지 않음)
		String str3 = "  Hello   . ";
		System.out.println(str3 + "의 길이 : " + str3.length());
		System.out.println(str3.trim() + "의 공백을 제거한 길이 : " + str3.trim().length());
		
		// 문자열 교체
		String str4 = "Jaba";
		System.out.println(str4 + " :: " + str4.replace('b', 'v'));
		System.out.println(str4 + " :: " + str4.replace("Jaba", "java"));
		System.out.println(str4 + " :: " + str4.replaceAll("Jaba", "java"));
		
		// 문자열 나누기
		String str5 = "Hello Java !!!";
		String[] s = str5.split("");
		int len = s.length;
		for (int i = 0; i < len; i++) {
			System.out.println("s[" + i + "] : " + s[i]);
		}
		
		// 문자열의 일부분 추출
		System.out.println(str5.substring(6));		// 6부터 끝까지
		System.out.println(str5.substring(6, 9)); 	// 6 ~ 8
		
		// 숫자를 문자열로
		int num = 100;
		String sn1 = num + ""; 
		System.out.println(sn1 + 100);
		String sn2 = String.valueOf(num); 
		System.out.println(sn2 + 100);
		String sn3 = Integer.toString(num); 
		System.out.println(sn3 + 100);
		
		// 문자열을 숫자로
		String ns = "100";
		num = Integer.parseInt(ns);
		System.out.println(num + 100);
	}

}
