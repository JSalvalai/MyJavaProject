package com.neotech.Review6;

public class World {

	public static void main(String[] args) {
		
		//1st way of creating an object, using the constructor with NO parameters
		Person p1 = new Person();
		p1.displayInfo();
		
		p1.name = "Nadim";
		p1.age = 32;
		p1.weight = 165;
		
		//Private
		//p1.gender = 'M';
		p1.displayInfo();
		
		System.out.println("---------------");

		//2nd way of creating an object, using the constructor with TWO parameters
		Person p2 = new Person("Sarosh", 21);
		p2.displayInfo();
		
		p2.weight = 100;
		p2.displayInfo();
		
		System.out.println("---------------");
		
		//3rd way of creating an object, using the constructor with THREE parameters
		Person p3 = new Person("Joël", 28, 150);
		p3.displayInfo();
	}
}
