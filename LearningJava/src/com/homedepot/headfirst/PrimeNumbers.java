package com.homedepot.headfirst;

public class PrimeNumbers {
	public static void main(String[] args) {
		int i = 1;
		while (i < 100) {
			int n = 2;
			boolean isPrime = true;
			while (n < i) {
				if (i % n == 0) {
					isPrime = false;
					break;
				}
				n++;
			}
			if (isPrime) { 
				System.out.print(i + " ");
			}
			i++;
		}
	}
}
