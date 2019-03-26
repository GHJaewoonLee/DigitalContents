package com.kitri.lang;

// Wrapper Class : 기본 dataType을 클래스화  (클래스로 포장)

// 기본 dataType		Wrapper Class
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
			System.out.println("b2는 참");
		
		if (b3)
			System.out.println("b3는 참");
		
		
		String s = "123";
		// Integer i = new Integer(s);
		// int x = i.intValue();
		int x = Integer.parseInt(s);
		System.out.println(x + 4);
		
		s = "123.45";
		// double d = Double.parseDouble(s);
		double d = new Double(s).doubleValue();
		System.out.println(d + 4);
		

		// AutoBoxing : Wrapper class에서 같은 dataType만 가능
		Integer i2 = new Integer(3);
		// Unboxing : Reference class가 가지고 있는 기능을 버리고 dataType으로 변환
		int y = i2;
		// Boxing
		Integer i3 = y;
	}

}
