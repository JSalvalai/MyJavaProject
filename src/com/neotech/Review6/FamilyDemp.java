package com.neotech.Review6;

import com.neotech.Review4.Baby;

public class FamilyDemp {

	public static void main(String[] args) {

		// I CAN access static/class variables before I create an object
		FamilyMember.lastName = "Ronaldo";

		// I CANNOT access instance variables before I create an object
		// FamilyMember.firstName = "Cristiano";

		// I CAN access static/class methods before I create an object
		FamilyMember.printFamilyName();

		// I CANNOT access instance methods before I create an object
		// FamilyMember.printfullName();

		System.out.println("---------------");
		
		FamilyMember member1 = new FamilyMember();
		member1.firstName = "Cristiano";
		member1.age = 40;
		
		FamilyMember member2 = new FamilyMember();
		member2.firstName = "Georgina";
		member2.age = 34;
		
		member1.printFullName();
		member2.printFullName();
		
		
		System.out.println("---------------");
		System.out.println("They decided to change their lastname!");
		
		//Static variables CAN change
		FamilyMember.lastName = "GOAT";
		member1.firstName = "CR7";
		
		member1.printFullName();
		member2.printFullName();
		
		System.out.println("---------------");
		
		//They are making a baby
		FamilyMember baby = new FamilyMember();
		
		//Does the baby have a firstName?
		System.out.println("Baby firstName -> " + baby.firstName);
		
		//Does the baby have a lastName?
		System.out.println("Baby lastName -> " + FamilyMember.lastName);
		
		baby.printFullName();
		
		
	}
}
