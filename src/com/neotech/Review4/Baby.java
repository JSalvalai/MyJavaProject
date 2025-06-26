package com.neotech.Review4;

public class Baby {

	//variables/attributes/properties
	String name;
	char gender;
	int weight;
	String hairColor;
	
	//method/behaviors/actions
	void talk() {
		System.out.println(name + " is talking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void cry() {
		System.out.println(name + " is crying");
	}
	
	void displayInformation() {
		System.out.println("My name is " + name);
		System.out.println("My gender is " + gender);
		System.out.println("My hair color is " + hairColor);
	}
}
