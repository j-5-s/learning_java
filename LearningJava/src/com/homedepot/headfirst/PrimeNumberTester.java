package com.homedepot.headfirst;

import java.util.ArrayList;
import com.homedepot.headfirst.PrimeNumbers;

/**
 * Class PrimeNumberTester
 * 
 * @author jamescharlesworth
 * 
 */
public class PrimeNumberTester {

	/**
	 * testDrive
	 * 
	 * @override
	 * @param i
	 * @return Integer[] primes
	 */
	public Integer[] testPrime(Integer i) {
		ArrayList<Integer> divisors = PrimeNumbers.getDivisibleBy(i);
		Integer[] primes = divisors.toArray(new Integer[divisors.size()]);
		return primes;
	};

}
