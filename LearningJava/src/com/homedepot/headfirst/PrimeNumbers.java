package com.homedepot.headfirst;

import java.util.*;

/**
 * Simple class for working with prime numbers
 * For chapter 1 of Learning Java
 * @author jamescharlesworth
 *
 */
public class PrimeNumbers {

	public static void main(String[] args) {
		PrimeNumbers p = new PrimeNumbers();
		List<Integer> primes = p.getPrimeNumbers(1, 100);
		System.out.print(p.toString(primes, " "));
	};

	/**
	 * returns a list of prime numbers for a given set.
	 * 
	 * @param fromInt
	 * @param toInt
	 * @return List<Integer>
	 */
	public List<Integer> getPrimeNumbers(Integer fromInt, Integer toInt) {
		List<Integer> primeNumbers = new ArrayList<Integer>();

		while (fromInt < toInt) {
			if (this.isPrime(fromInt)) {
				primeNumbers.add(fromInt);
			}
			fromInt++;
		}
		return primeNumbers;
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
	public String toString(List<Integer> list) {
		return this.toString(list, " ");
	};

	/**
	 * Turns the list of numbers to a string;
	 * 
	 * @param list
	 * @param deliminator
	 * @return
	 */
	public String toString(List<Integer> list, String deliminator) {
		String listString = "";
		for (int i = 0; i < list.size(); i++) {
			listString += list.get(i);
			if (i < list.size() - 1) {
				listString += deliminator;
			}
			;
		}
		return listString;
	};
}
