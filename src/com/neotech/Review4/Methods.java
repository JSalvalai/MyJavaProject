package com.neotech.Review4;

public class Methods {

	void sayWelcome() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}
	
	void sayWelcomeWithNumber(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}
	
	void sayGreeting(String greeting) {
		for(int i = 1; i <= 5; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();
	}
	
	void sayGreetingWithNumber(String greeting, int n) {
		for(int i = 1; i <= n; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Methods m = new Methods();
		m.sayWelcome();
		
		m.sayWelcomeWithNumber(4);
		m.sayWelcomeWithNumber(7);
		
		//Compile-time error: The method accepts only integers, not String
		//m.sayWelcomeWithNumber("5");
		
		m.sayGreeting("Ciao");
		m.sayGreeting("Grüezi");
		
		System.out.println("--------------------");
		
		m.sayGreetingWithNumber("Grüezi", 3);
		m.sayGreetingWithNumber("Bonjour", 6);
		
		//Compile-time error
		//You have to provide 2 parameters -> String & int
		//m.sayGreetingWithNumber("Hallo");

		//Terminology -> invoke/call/execute a method (like in line 49 for example)
	}

}
