package com.ksg.practice;

public class Test2 {

	

		 public static void m1(int...x) {
		        System.out.println("var arg method!");
		    }
		    

		    public static void main(String[] args) {
		        
		        m1();
		        m1(10);
		        m1(10,20);
		        m1(10,20,30);
		        
		        System.out.println("Hi good morning all!");

		    }

		}
	
