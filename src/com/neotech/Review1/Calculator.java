package com.neotech.Review1;

import java.util.Scanner;

public class Calculator {
	// Ask the user to enter 2 numbers
		// Ask the user for the operator (+,-,*,/)
		// Calculate the result using if-else

		public static void main(String[] args) {

			Scanner fatma = new Scanner(System.in);

			System.out.println("Please enter the first number:");
			double d1 = fatma.nextDouble();

			System.out.println("Please enter the second number:");
			double d2 = fatma.nextDouble();

			System.out.println("Please enter the operator (+,-,*,/)");
			String operator = fatma.next();

			// System.out.println(d1 + " " + d2 + " " + operator);

			if (operator.equals("+")) {
				System.out.println("The result is " + (d1 + d2));
			} else if (operator.equals("-")) {
				System.out.println("The result is " + (d1 - d2));
			} else if (operator.equals("*")) {
				System.out.println("The result is " + (d1 * d2));
			} else if (operator.equals("/")) {
				System.out.println("The result is " + (d1 / d2));
			} else {
				System.out.println("Invalid operator");
			}

		}

}
