package com.homedepot.headfirst;

import com.homedepot.headfirst.PrimeNumbers;

public class PrimeNumbersTestDrive {
	public static void main(String[] args) {
		PrimeNumbers p = new PrimeNumbers(1, 100);
		System.out.println("["+ p.toString(",") + "]");
		System.out.println( "The first prime number is " + p.get(0));
		System.out.println( "The last prime number is "+ p.get(p.size() - 1 ));
	};
}
