package com.neotech.Review4;

import java.util.Arrays;

public class PrintArray {

	public static void main(String[] args) {

		int[] numbers = { 4, 18, -10, 5, 12 };

		// When you try to print the Array we see something that doesn't make sense
		System.out.println(numbers[2]);

		// To print 1d-Array we use toString() method
		System.out.println(Arrays.toString(numbers));

		int[][] nums = { { 3, 4, 6 }, { 2, 0, 9 }, { 5, 8, 1 } };

		// To print 2d-Array we use deepToString() method
		System.out.println(Arrays.deepToString(args));
	}

}
