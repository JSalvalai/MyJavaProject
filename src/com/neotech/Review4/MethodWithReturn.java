package com.neotech.Review4;

public class MethodWithReturn {

	public static void main(String[] args) {
		
		MethodWithReturn m = new MethodWithReturn();
		
		boolean res = m.isOdd(9);
		System.out.println("The number 9 is odd? " + res);
		
		boolean res2 = m.isOddEnhanced(22);
		System.out.println("The number 22 is odd? " + res2);
		
		System.out.println(m.isOddEnhanced(13));
		
	}
	//Divide the number by 2 (modulus)
	//if he result is equal to 1 -> return true
	//otherwise -> return false
	boolean isOddEnhanced(int num) {
		return num % 2 == 1;
	}
	
	boolean isOdd(int num) {
		boolean result;
		
		if(num % 2 == 1) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

}
