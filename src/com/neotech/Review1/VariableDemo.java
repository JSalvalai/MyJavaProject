package com.neotech.Review1;

public class VariableDemo {

	// ALWAYS FORMAT YOUR CODE
		// ctrl + shift + f
		// command + shift + f

		public static void main(String[] args) {

			// Declare a variable
			String firstName;

			// System.out.println("My name is -> " + firstName);

			// Assign a value (initialize)
			firstName = "Jennifer";

			System.out.println("My name is -> " + firstName);

			// Declare a variable & Assign a value
			String lastName = "Bourdierd";

			int age = 26;

			System.out.println(firstName + " " + lastName + " " + age + 1);
			System.out.println(firstName + " " + lastName + " " + (age + 1));

			System.out.println(age);

			// After 3 years
			// re-assign a new value to the container
			age += 3;
			lastName = "Pitt";

			System.out.println(firstName + " " + lastName + " " + age);
	}

}
