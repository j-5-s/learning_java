package com.homedepot.headfirst;

import java.util.*;

/**
 * Simple class for working with prime numbers For chapter 1 of Learning Java
 * 
 * @author jamescharlesworth
 * 
 */
public class PrimeNumbers {

	static List<Integer> primeNumbers = new ArrayList<Integer>();

	/**
	 * Constructor - pass in the prime min, max.
	 * 
	 * @param fromInt
	 * @param toInt
	 */
	public PrimeNumbers(Integer fromInt, Integer toInt) {
		this.setPrimeNumbers(fromInt, toInt);
	};

	/**
	 * returns a list of prime numbers for a given set.
	 * 
	 * @param fromInt
	 * @param toInt
	 * @return List<Integer>
	 */
	public List<Integer> getPrimeNumbers(Integer fromInt, Integer toInt) {
		return primeNumbers;
	};

	public void setPrimeNumbers(Integer fromInt, Integer toInt) {
		primeNumbers.clear();

		while (fromInt < toInt) {
			if (this.isPrime(fromInt)) {
				primeNumbers.add(fromInt);
			}
			fromInt++;
		}
	};

	/**
	 * Determines if the number is prime.
	 * 
	 * @param number
	 * @return boolean
	 */
	public boolean isPrime(int number) {
		boolean isPrime = true;
		int i = 2;
		number = Math.abs(number);
		while (i < number) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
			i++;
		}
		return isPrime;
	};

	/**
	 * Turns the list of numbers to a string;
	 * 
	 * @param list
	 * @return String
	 */
	public String toString() {
		return this.toString(" ");
	};

	/**
	 * Turns the list of numbers to a string;
	 * 
	 * @param list
	 * @param deliminator
	 * @return
	 */
	public String toString(String deliminator) {
		String listString = "";
		for (int i = 0; i < primeNumbers.size(); i++) {
			listString += primeNumbers.get(i);
			if (i < primeNumbers.size() - 1) {
				listString += deliminator;
			}

		}
		return listString;
	};

	public static void main(String[] args) {
		PrimeNumbers p = new PrimeNumbers(1, 100);
		System.out.print(p);
	};
}
