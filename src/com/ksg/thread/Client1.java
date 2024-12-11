package com.ksg.thread;

public class Client1 {
	
	public static void main(String[] args) {
		
		MyThread myThread = new MyThread ();
		
		myThread.start();
		
		for(int i=0; i<14;i++) {
			System.out.println("main thread");
		}
		
	}

}
