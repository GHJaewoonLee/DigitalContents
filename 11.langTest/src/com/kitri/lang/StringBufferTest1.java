package com.kitri.lang;


public class StringBufferTest1 {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Hello ");
		System.out.println("1. sb1 : " + sb1);
		int cap = sb1.capacity();
		System.out.println("초기 크기 : " + cap + "\t문자열 수 : " + sb1.length());
		
		// 문자열 붙이기
		sb1.append("Java");
		System.out.println("2. sb1 : " + sb1);
		
		sb1.append(" !!!!!");
		System.out.println("3. sb1 : " + sb1);
		cap = sb1.capacity();
		System.out.println("크기 : " + sb1.capacity() + "\t문자열 수 : " + sb1.length());
		
		sb1.append(" !!!!!!");
		System.out.println("4. sb1 : " + sb1);
		cap = sb1.capacity();
		System.out.println("크기 : " + sb1.capacity() + "\t문자열 수 : " + sb1.length());
		
		// 문자열 삽입
		sb1.insert(10, "@@@");
		System.out.println("5. sb1 : " + sb1);
		
		// 문자열 삭제 (하나 또는 여러개)
		sb1.delete(10, 12);
		System.out.println("6. sb1 : " + sb1);
		
		sb1.deleteCharAt(10);
		System.out.println("7. sb1 : " + sb1);
		
		// 문자열 변환
		sb1.replace(6, 10, "자바");
		System.out.println("8. sb1 : " + sb1);
		
		// 문자열 반대로
		sb1.reverse();
		System.out.println("9. sb1 : " + sb1);
		sb1.reverse();
		
		// 특정 위치의 문자열을 변환
		sb1.setCharAt(9, '@');
		System.out.println("10. sb1 : " + sb1);
		
		// 최종 문자열로 변환
		String s1 = new String(sb1);
		String s2 = sb1.toString();
		
		String str = "Hello 자바 !!!";
		String findstr = "자바";
		//String findstr = "오라클";
		String replaceStr = "java";
		
		// 방법 1) (StringBuffer X)
		String str1, str2, str3;
		int index = str.indexOf(findstr);
		
		if (index != -1) {
			str1 = str.substring(0, index);
			str2 = str.substring(index + findstr.length(), str.length());
			str3 = str1 + replaceStr + str2;
			System.out.println(str3);
		} else {
			System.out.println(findstr + "은 없습니다.");
		}
		
		// 방법 2) (StringBuffer O)
		if (index != -1) {
			StringBuffer sb2 = new StringBuffer(str);
			str = sb2.replace(index, index + findstr.length(), replaceStr).toString();
			System.out.println(str);
		} else {
			System.out.println(findstr + "은 없습니다.");
		}
	}
}
