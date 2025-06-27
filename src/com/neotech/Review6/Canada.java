package com.neotech.Review6;

public class Canada {

	public static void main(String[] args) {
		
		USA us = new USA();
		
		System.out.println("Accessing the variables from inside Canada");

		System.out.println("Public -> " + us.bestSchool);
		System.out.println("Default -> " + us.state);
		System.out.println("Protected -> " + us.mainState);
		
		//capitalCity is private
		//System.out.println("Private -> " + us.capitalCity);

		System.out.println("---------------");

		System.out.println("Accessing the methods from inside Canada");

		us.attendNeoTech();
		us.playNBA();
		
		//selectPresident() is private
		//us.selectPresident();
	}
}
