package com.neotech.Review5;

import java.util.Arrays;

public class ArrayParameter {

	public static void main(String[] args) {

		int[] array = { 3, 7, 4, 9, 1 };

		// to print one element from the array, with index 1
		// System.out.println(array[1]);

		// System.out.println(array);

		String str = Arrays.toString(array);
		System.out.println(str);
		
		ArrayParameter ap = new ArrayParameter();
		int result = ap.largestNumber(array);
		
		System.out.println("largest -> " + result);
	}
	
	//Input --> int[] (an array of integers)
	//logic --> given an array, find the largest number
	//Output --> int (the largest number)
	//visibility --> public
	//usage --> non-static
	public int largestNumber(int[] arr) {
		int largest = arr[0];
		
		for(int el : arr) {
			if(el > largest) {
				largest = el;
			}
		}
		return largest;
	}

}
