package com.homedepot.headfirst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

import com.homedepot.headfirst.PrimeNumber;

//collection of Numbers
public class Numbers {
	
	HashMap numbers;

	public Numbers() {
		numbers = new HashMap();
		
	};
	
	public String isPrime(int i) {
		if (numbers.containsKey(i)) {
			return numbers.get(i).toString();
		} else if (PrimeNumber.isPrime(i)) {
			String s = i + " is a prime number";
			numbers.put(i, s);
			return s;
		} else {
			String s = i + " is not a prime number it is divisble by ";
			ArrayList<Integer> al = PrimeNumber.getDivisibleBy(i);
			for (int i1 = 0 ; i1 < al.size(); i1++ ){
				s += al.get(i1);
				if (i1 < al.size() -2) {
					s +=", ";
				} else if (i1 < al.size() -1) {
					s += " and ";
				}
			}
			numbers.put(i, s);
			return s;
		}
	}
}
