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
		
		// 教芹 矫 inteface甫 implement 茄 按眉啊 积己
		// 
		
		test(i -> System.out.println(i));
	}
}
