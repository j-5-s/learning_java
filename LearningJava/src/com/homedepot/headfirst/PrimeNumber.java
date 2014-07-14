package com.homedepot.headfirst;

import java.util.ArrayList;

public class PrimeNumber {
	
	Integer n;
	
	/**
	 * Constructor - pass in the prime min, max.
	 * 
	 * @param fromInt
	 * @param toInt
	 */
	public PrimeNumber(Integer number) {
		this.n = number;
	};
	
	
	/**
	 * Determines if the number is prime.
	 * 
	 * @param number
	 * @return boolean
	 */
	public boolean isPrime() {
		boolean isPrime = true;
		int i = 2;
		Integer number = Math.abs(this.n);
		while (i < number) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
			i++;
		}
		return isPrime;
	};
	
	
	public Integer[] getDivisibleBy(){
		ArrayList<Integer> divisibleBy = new ArrayList<Integer>();
		
		for (Integer i = 1; i <= this.n; i++) {
			if (n % i == 0 ){
				divisibleBy.add(i);
			}
		}
		
		return divisibleBy.toArray(new Integer[divisibleBy.size()]);
	};
	
	public void storeSet(Integer[] numberSet) {
		
	}
}
