package com.homedepot.headfirst;

import java.util.ArrayList;

public class PrimeNumber {
	
    public static boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                // number is perfectly divisible - no prime
                return false;
            }
        }
        return true;
    }
	
    
    public static ArrayList<Integer> getDivisibleBy(Integer n){
		ArrayList<Integer> divisibleBy = new ArrayList<Integer>();
		
		for (Integer i = 2; i < n; i++) {
			if (n % i == 0 ){
				divisibleBy.add(i);
			}
		}
		
		return divisibleBy;
	};
}