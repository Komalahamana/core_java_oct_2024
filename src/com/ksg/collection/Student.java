package com.ksg.collection;

public class Student implements Comparable<Student>   {

	

		private int id;
	    private String name;
	    
	    public Student(int id, String name) {
	        super();
	        this.id = id;
	        this.name = name;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    @Override
	    public String toString() {
	        return "Student [id=" + id + ", name=" + name + "]";
	    }
	    
	    @Override
	    public int compareTo(Student s) {
	        
	        if(this.id<s.id) {
	            return -1;
	        }else if(this.id>s.id) {
	            return 1;
	        }else {
	            return 0;
	        }
	        
	    
	}

}
