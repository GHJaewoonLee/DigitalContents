package com.kitri.thread;


public class threadTest {
	
	public static void main(String[] args) {
		
		Thread t1 = new threadExt("��");
		Thread t2 = new threadExt("��");
		Thread t3 = new threadExt("!!");
		
		// �Ϲ� �޼ҵ� ó�� �����.
//		t1.run();
//		t2.run();
//		t3.run();
		
		t1.start();
		t2.start();
		t3.start();
	
		System.out.println("���α׷� ����");
	}
}
