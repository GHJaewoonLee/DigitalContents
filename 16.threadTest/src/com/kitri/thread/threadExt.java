package com.kitri.thread;

public class threadExt extends Thread {

	String msg;

	
	public threadExt(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println(msg + (i + 1));
		}
	}
}
