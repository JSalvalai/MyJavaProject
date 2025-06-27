package com.neotech.Review6;

public class Person {

	// Instance variables
	public String name;
	int age;
	protected int weight;
	private char gender;

	
	public Person() {
		
	}
	
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
	
	public Person(String peName, int peAge, int peWeight) {
		name = peName;
		age = peAge;
		weight = peWeight;
	}
	
	public void displayInfo() {
		System.out.println("Name: " + name + " age: " + age + " weight: " + weight);
	}
}
