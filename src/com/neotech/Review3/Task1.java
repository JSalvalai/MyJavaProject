package com.neotech.Review3;

import java.util.Scanner;

//Ask the user: How many numbers do you want to store in the array?
//Ask him to enter the numbers: Read numbers and enter them into the array
//Print the numbers from the array

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to store in the array?");
		
		int size = scan.nextInt();
		
		//Declaring the aray
		int[] array = new int[size];
		
		//Read the numbers and enter them into the array
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter a number:");
			array[i] = scan.nextInt();
		}
		
		//Print the numbers from the array
		System.out.println("Let's print the numbers form the array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println("Let's print the numbers using enhanced for loop");
		for (int num:array) {
			System.out.print(num + " ");
		}
		
	}

}
