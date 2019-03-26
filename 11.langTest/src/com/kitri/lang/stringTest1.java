package com.kitri.lang;

public class stringTest1 {

	public static void main(String[] args) {
		
		// s1, s2는 literal 영역에 만들어 짐. s3, s4는 heap 영역에 만들어 짐
		// String Class로 생성된 문자열은 불변
		String s1 = "java";					  // java라는 문자열 값이 없기 때문에 생성됨
		String s2 = "java";					  // 이미 같은 값이 있기 때문에 s1의 주소를 가리킴
		String s3 = new String("java");
		String s4 = new String("java");
		
		
		if (s1 == s2) {
			System.out.println("s1 s2는 주소값이 같다"); // O
		}
		if (s1 == s3) {
			System.out.println("s1 s3는 주소값이 같다"); // X
		}
		if (s1 == s4) {
			System.out.println("s1 s4는 주소값이 같다"); // X
		}
		if (s2 == s3) {
			System.out.println("s2 s3는 주소값이 같다"); // X
		}
		if (s2 == s4) {
			System.out.println("s2 s4는 주소값이 같다"); // X
		}
		if (s3 == s4) {
			System.out.println("s3 s4는 주소값이 같다"); // X
		}
		
		// String Class에서 equals 메소드를 override 함.  따라서 equals 메소드는 문자열 비교를 함. 
		if (s1.equals(s2)) {
			System.out.println("s1 s2는 문자열값이 같다"); // O
		}
		if (s1.equals(s3)) {
			System.out.println("s1 s3는 문자열값이 같다"); // O
		}
		if (s1.equals(s4)) {
			System.out.println("s1 s4는 문자열값이 같다"); // O
		}
		if (s2.equals(s3)) {
			System.out.println("s2 s3는 문자열값이 같다"); // O
		}
		if (s2.equals(s4)) {
			System.out.println("s2 s4는 문자열값이 같다"); // O
		}
		if (s3.equals(s4)) {
			System.out.println("s3 s4는 문자열값이 같다"); // O
		}
	}

}
