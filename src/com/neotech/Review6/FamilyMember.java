package com.neotech.Review6;

public class FamilyMember {

	String firstName; // Instance variable, belongs to the instance/object
	static String lastName; // Static/class variable, belongs to the class
	int age; // Instance variable
	
	//With non-static methods, I can access ALL variables
	void printFullName() {
		System.out.println("Full name is " + firstName + " " + lastName);
	}
	
	//With static methods, I can access ONLY static variables
	static void printFamilyName() {
		System.out.println("Family name is " + lastName);
	}
}
