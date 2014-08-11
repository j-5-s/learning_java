package com.homedepot.headfirst;
import com.homedepot.headfirst.PrimeNumberTester;

public class PrimeNumberLauncher {
	public static void main(String[] args) {
		Integer number = Integer.parseInt(args[0]);

		
		new PrimeNumberPrinter().testPrime(number);

		
	}
}
