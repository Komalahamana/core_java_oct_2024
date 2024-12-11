package com.ksg.flowcontrol;

public class StudentClient1 {
	
	public static void main(String[] args) {
		
		Student student1 = new Student(0, null);
		
		student1.setId(101);
        student1.setName("Jyoti");
        
        System.out.println(student1.getId());
        
        System.out.println(student1.getName());
        
        Student student2 = new Student(0, null);
        student2.setId(102);
        student2.setName("Nikita");
        
        System.out.println(student2.getId());
        System.out.println(student2.getName());

		
		
	}

}
