package com.neotech.Review5;

public class StringMethods {

	public static void main(String[] args) {

		String str = "Pershendetje";

		System.out.println(str.length());

		System.out.println(str.isEmpty());

		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		System.out.println(str); // The original has NOT changed

		boolean equals = str.equals("PERSHENDETJE");
		System.out.println("equals -> " + equals);

		System.out.println("equalsIgnoreCase -> " + str.equalsIgnoreCase("PERSHENDETJE"));

		System.out.println("---------------");

		System.out.println(str.contains("SH"));

		System.out.println(str.contains("SH".toLowerCase()));

		boolean start = str.startsWith("per");
		System.out.println(start);

		System.out.println("Does Pershendetje start with Pershendetje?");
		System.out.println(str.startsWith("Pershendetje"));

		System.out.println("Does Pershendetje end with E?");
		System.out.println(str.endsWith("E")); // false because of case sensitivity

		System.out.println("---------------");

		String name = "Javier" + "-" + "Rodriguez";
		System.out.println(name);

		String name2 = "Javier".concat("-").concat("Rodriguez"); // Method chaining
		System.out.println(name2);

		String name3 = "Javier".toUpperCase().concat("-").concat("Rodriguez");
		System.out.println(name3);

		//S"Javier".length().concat("Rodriguez"); //Compile Time Error
		// 6.concat("Rodriguez");
		
		"Javier".concat("Rodriguez").length(); //This is OK
		System.out.println("Javier".concat("Rodriguez").length());
		
		System.out.println("---------------");
		
		String str2 = "     Monisha      is      very     smart    ";
		System.out.println(str2.trim());
		
		System.out.println(str2.length());
		System.out.println(str2.trim().length());
		
		System.out.println("---------------");
		
		String str3 = "Konichiwa our dear Mai";
		char letter = str3.charAt(4);
		System.out.println(letter);
		
		System.out.println("The index of letter 'i' is -> " + str3.indexOf('i'));
		
		//Find the index of letter 'i', but start looking after index 10
		int indexOfThirdI = str3.indexOf('i', 10);
		System.out.println("indexOfThirdI -> " + indexOfThirdI);
		
		//When the letter does not exist in the String, returns -1
		System.out.println("The index of letter 't' is -> " + str3.indexOf('t'));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
