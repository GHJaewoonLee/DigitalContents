package com.kitri.lambda;

import com.kitri.dto.Test;
import com.kitri.dto.TestImpl;


public class LambdaTest {

	public static void test(Test t) {
		t.m(238923478);
	}
	
	public static void main(String[] args) {
//		TestImpl impl = new TestImpl();
//		test(impl);
		
		// ���� �� inteface�� implement �� ��ü�� ����
		// 
		
		test(i -> System.out.println(i));
	}
}
