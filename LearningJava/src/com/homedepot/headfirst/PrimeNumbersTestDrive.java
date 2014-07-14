package com.homedepot.headfirst;

import java.util.ArrayList;

import com.homedepot.headfirst.Numbers;
import com.homedepot.headfirst.Number;


public class PrimeNumbersTestDrive {
	public static void main(String[] args) {
	
			int[] n = {23479, 19991, 99997, 62711, 59197, 44521, 59197 };
			
	 		Numbers numbers = new Numbers(n);
	 		for (int i = 0; i < numbers.theList.size(); i++) {
	 			Number theNumber =  numbers.theList.get(i);
	 			String str = "";
	 			str += theNumber.getValue() + " is " + (!theNumber.getIsPrime() ? "not" : "") + "a prime number. ";
	 			if (!theNumber.getIsPrime()) {
	 				str += "It is divisble by ";
	 				str += Numbers.prettyPrint(theNumber.getDivisors(), ", ", " and ") + ".";
	 			}
	 			
	 			System.out.println(str);
	 			
	 		}
			

	};
}
