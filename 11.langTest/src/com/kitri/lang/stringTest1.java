package com.kitri.lang;

public class stringTest1 {

	public static void main(String[] args) {
		
		// s1, s2�� literal ������ ����� ��. s3, s4�� heap ������ ����� ��
		// String Class�� ������ ���ڿ��� �Һ�
		String s1 = "java";					  // java��� ���ڿ� ���� ���� ������ ������
		String s2 = "java";					  // �̹� ���� ���� �ֱ� ������ s1�� �ּҸ� ����Ŵ
		String s3 = new String("java");
		String s4 = new String("java");
		
		
		if (s1 == s2) {
			System.out.println("s1 s2�� �ּҰ��� ����"); // O
		}
		if (s1 == s3) {
			System.out.println("s1 s3�� �ּҰ��� ����"); // X
		}
		if (s1 == s4) {
			System.out.println("s1 s4�� �ּҰ��� ����"); // X
		}
		if (s2 == s3) {
			System.out.println("s2 s3�� �ּҰ��� ����"); // X
		}
		if (s2 == s4) {
			System.out.println("s2 s4�� �ּҰ��� ����"); // X
		}
		if (s3 == s4) {
			System.out.println("s3 s4�� �ּҰ��� ����"); // X
		}
		
		// String Class���� equals �޼ҵ带 override ��.  ���� equals �޼ҵ�� ���ڿ� �񱳸� ��. 
		if (s1.equals(s2)) {
			System.out.println("s1 s2�� ���ڿ����� ����"); // O
		}
		if (s1.equals(s3)) {
			System.out.println("s1 s3�� ���ڿ����� ����"); // O
		}
		if (s1.equals(s4)) {
			System.out.println("s1 s4�� ���ڿ����� ����"); // O
		}
		if (s2.equals(s3)) {
			System.out.println("s2 s3�� ���ڿ����� ����"); // O
		}
		if (s2.equals(s4)) {
			System.out.println("s2 s4�� ���ڿ����� ����"); // O
		}
		if (s3.equals(s4)) {
			System.out.println("s3 s4�� ���ڿ����� ����"); // O
		}
	}

}
