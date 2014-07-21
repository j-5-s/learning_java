package com.homedepot.headfirst;

import com.homedepot.headfirst.Numbers;
import com.homedepot.headfirst.Number;
import java.util.Date;

public class PrimeNumbersTestDrive {
	public static void main(String[] args) {
			java.util.Date startTime = new java.util.Date();
			int[] n = {23479, 19991, 99997, 62711, 59197, 44521 };
			
	 		Numbers numbers = new Numbers(n);
	 		for (int i = 0; i < numbers.theList.size(); i++) {
	 			Number theNumber =  numbers.theList.get(i);
	 			String str = "";
	 			
	 			if (!theNumber.getIsPrime()) {
	 				str += theNumber + " is not a prime number.";
	 			} else {
	 				str += theNumber + " is a prime number.";
	 			}
	 			
	 			System.out.println(str);
	 			
	 			
	 		}
	 		java.util.Date endTime= new java.util.Date();
	 		
	 		System.out.println("\r\nTesting " + numbers.size() + " took " + (endTime.getTime() - startTime.getTime()) + " ms");
	 		
			

	};
}
