package com.homedepot.headfirst;

import com.homedepot.headfirst.PrimeNumberTester;

/**
 * Class PrimeNumberTester
 * 
 * @extends PrimeNumberTester
 * @author jamescharlesworth
 * 
 */
public class PrimeNumberPrinter extends PrimeNumberTester {
	public Integer[] testPrime(Integer i) {
		Integer[] divisors = super.testPrime(i);
		boolean isPrime = PrimeNumbers.isPrime(i);
		if (isPrime) {
			System.out.println(i + " is a prime number!");
		} else {
			String str = "";
			for (Integer n = 0; n < divisors.length; n++) {
				if (n < divisors.length - 1) {
					str += divisors[n] + ", ";

				} else {
					str += "and " + divisors[n];
				}
			}

			System.out.println(i + " is not a prime number. It is divislbe by "
					+ str + ".");
		}

		return divisors;
	}

	public void testPrime(Integer i, Boolean printed) {
		boolean isPrime = PrimeNumbers.isPrime(i);
		if (isPrime) {
			System.out.println(i + " is a prime number!");
		} else {
			if (printed) {
				this.testPrime(i);
			} else {
				System.out.println(i + " is not a prime number.");
			}
		}
	}
}
