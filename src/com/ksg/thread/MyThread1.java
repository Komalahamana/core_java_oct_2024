package com.ksg.thread;

public class MyThread1 extends Thread {
	
	@Override
	
	public void run() {
		for(int i=0; i<14;i++) {
			System.out.println("Child thread");
		}
	}
	
	

}
