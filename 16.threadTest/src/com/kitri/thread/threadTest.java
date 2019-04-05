package com.kitri.thread;


public class threadTest {
	
	public static void main(String[] args) {
		
		Thread t1 = new threadExt("퐁");
		Thread t2 = new threadExt("당");
		Thread t3 = new threadExt("!!");
		
		// 일반 메소드 처럼 수행됨.
//		t1.run();
//		t2.run();
//		t3.run();
		
		t1.start();
		t2.start();
		t3.start();
	
		System.out.println("프로그램 종료");
	}
}
