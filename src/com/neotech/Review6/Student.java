package com.neotech.Review6;

public class Student {

	//Instance/object variables
	String name;
	int age;
	
	//Static/class variables
	static String school;
	
	//Constructor
	public Student(String name, int age) {
		this.name = name; //To distinguish between the parameter and instance variable
		this.age = age; 
	}
	
	public void displayStudetnInfo() {
		System.out.println("My name is -> " + name + " AND my age is -> " + age + " AND my school is -> " + school);
	}
	
	public static void main(String[] args) {
		
		Student.school = "Neotech";
		
		//CANNOT be used without an object
		//Student.name = "Anna";
		
		//We don't have the Default Constructor
		//Student s1 = new Student();
		
		Student s2 = new Student("Jennifer", 24);
		s2.displayStudetnInfo();
		
		Student s3 = new Student("Berfin", 27);
		s3.displayStudetnInfo();
		
		
	}
}
