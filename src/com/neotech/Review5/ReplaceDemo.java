package com.neotech.Review5;

public class ReplaceDemo {

	public static void main(String[] args) {

		String longStr = "I am very happy today because today is not Monday";

		String anotherStr = longStr.replace('a', 'e');
		System.out.println(anotherStr);

		anotherStr = longStr.replace("today", "tomorrow");
		System.out.println(anotherStr);

		System.out.println("---------------");

		// Regular Expression
		anotherStr = longStr.replaceAll("[a-z]", "*");
		System.out.println(anotherStr);

		String ssn = "815-273-5061";
		System.out.println(ssn);

		String newSSN = ssn.replaceAll("[0-9]", "*");
		System.out.println(newSSN);

		System.out.println("Let's remove the dashes from ssn");
		String numbers = ssn.replaceAll("[^0-9]", "");
		System.out.println(numbers);

		//Hide all the numbers and leave the last four digits of ssn
		//****-***-5061
		
		System.out.println(ssn.substring(0, 8).replaceAll("[0-9]", "*").concat(ssn.substring(8)));
	}

}
