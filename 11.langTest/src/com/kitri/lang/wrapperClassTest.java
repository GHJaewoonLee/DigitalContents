package com.kitri.lang;

// Wrapper Class : �⺻ dataType�� Ŭ����ȭ  (Ŭ������ ����)

// �⺻ dataType		Wrapper Class
//	boolean				Boolean
//  char				Character
//  byte				Byte
//  short				Short
//  int					Integer
//  long				Long
//  float				Float
//  double				Double

public class wrapperClassTest {

	public static void main(String[] args) {
		
		Boolean b1 = new Boolean("tRUe");
		boolean b2 = b1.booleanValue();
		
		boolean b3 = Boolean.parseBoolean("true");
		
		if (b2)
			System.out.println("b2�� ��");
		
		if (b3)
			System.out.println("b3�� ��");
		
		
		String s = "123";
		// Integer i = new Integer(s);
		// int x = i.intValue();
		int x = Integer.parseInt(s);
		System.out.println(x + 4);
		
		s = "123.45";
		// double d = Double.parseDouble(s);
		double d = new Double(s).doubleValue();
		System.out.println(d + 4);
		

		// AutoBoxing : Wrapper class���� ���� dataType�� ����
		Integer i2 = new Integer(3);
		// Unboxing : Reference class�� ������ �ִ� ����� ������ dataType���� ��ȯ
		int y = i2;
		// Boxing
		Integer i3 = y;
	}

}
