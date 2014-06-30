package com.homedepot.headfirst;

import java.util.ArrayList;

import com.homedepot.headfirst.PrimeNumbers;

public class TestPrime {
	public static void main(String[] args) {
		try {
			Integer fromInt = Integer.parseInt(args[0]);
			boolean isPrime = PrimeNumbers.isPrime(fromInt);
			if (isPrime) {
				System.out.println(fromInt + " is a prime number!");
			} else {
				ArrayList<Integer> divisors = PrimeNumbers.getDivisibleBy(fromInt);
				String str = "";
				for (Integer i =  0; i < divisors.size(); i++) {
					if (i<divisors.size()-1) {
						str += divisors.get(i) + ", ";
						
					} else {
						str += "and " + divisors.get(i);
					}
				}
				
				System.out.println(fromInt + " is not a prime number. It is divislbe by "+ str + ".");
			}
			
			
		} catch(Exception e) {
			 System.err.println("You must pass command line arguments");
		}
	};
}
