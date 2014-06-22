package com.homedepot.headfirst;

import com.homedepot.headfirst.PrimeNumbers;

public class PrimeNumbersTestDrive {
	public static void main(String[] args) {
		try {
			Integer fromInt = Integer.parseInt(args[0]);
			Integer toInt = Integer.parseInt(args[1]);
	 		PrimeNumbers p = new PrimeNumbers(fromInt, toInt);
			System.out.println(p.toString("\n"));
		} catch(Exception e) {
			 System.err.println("You must pass command line arguments");
		}
	};
}
