package com.ksg.flowcontrol;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Student[] s1 = {new Student(101,"Komal"), new Student(102, "Gourav"), new Student(103, "Neha"), new Student(104, "Akash")};
	        
	        for(int i=0; i<s1.length; i++) {
	            System.out.println(s1[i]);
	        }

	    
	}

}
