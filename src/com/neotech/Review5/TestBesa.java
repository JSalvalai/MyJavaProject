package com.neotech.Review5;

public class TestBesa {

	public static void main(String[] args) {
		Besa b = new Besa();
		
		b.addTwoNumbers();
		b.addTwoThatIgive(12, 17);
		
		int res = b.addTwoNumbersAndGiveMeTheResult();
		System.out.println("The result was " + res);
		
		int res2 = b.addTwoNumbersThatIGiveAndGiveMeTheResult(12, 17);
		
		if (res2 == 29) {
			System.out.println("Good job Besa!");
		} else {
			System.out.println("I still love you!");
		}
		
		//I can directly print the result/return of the method
		System.out.println(b.addTwoNumbersThatIGiveAndGiveMeTheResult(14, 16));
		
	}
}
