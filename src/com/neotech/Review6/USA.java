package com.neotech.Review6;

public class USA {

	//Access modifier, we define where the variable/method can be accessed from 
	public String bestSchool = "Neotech"; //Project level
	String state = "Texas"; //Package level
	protected String mainState = "New York"; //Package level
	private String capitalCity = "Washington DC"; //Class level
	
	public void attendNeoTech() {
		System.out.println("Neotech can be attended from everywhere!");
	}
	
	protected void playNBA() {
		System.out.println("Only countries in the same package can join NBA!");
	}
	
	private void selectPresident() {
		System.out.println("The US president can only be selected within USA!");
	}
	
	public static void main(String[] args) {
		
		USA us = new USA();
		
		System.out.println("Accessing the variables from inside USA");
		
		System.out.println("Public -> " + us.bestSchool);
		System.out.println("Default -> " + us.state);
		System.out.println("Protected -> " + us.mainState);
		System.out.println("Private -> " + us.capitalCity);

		System.out.println("---------------");

		us.attendNeoTech();
		us.playNBA();
		us.selectPresident();

	}
}
