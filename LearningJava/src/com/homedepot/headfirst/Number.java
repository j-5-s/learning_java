package com.homedepot.headfirst;

import java.util.ArrayList;

interface NumberInterface {
    //  wheel revolutions per minute
    public Boolean isPrime();
    public ArrayList<Integer> getDivisibleBy();

}

public class Number implements NumberInterface {
	Integer n;
	ArrayList<Integer> divisors;
	Boolean isPrime;
	public Number(Integer n){
		this.n = n;
		this.isPrime = this.isPrime();
		this.divisors = this.getDivisibleBy();
	}
	
	/**
	 * Determines if the number is prime.
	 * 
	 * @param number
	 * @return boolean
	 */
	public Boolean isPrime() {
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
	
	public ArrayList<Integer> getDivisibleBy(){
		ArrayList<Integer> divisibleBy = new ArrayList<Integer>();
		
		for (Integer i = 2; i < this.n; i++) {
			if (n % i == 0 ){
				divisibleBy.add(i);
			}
		}
		
		return divisibleBy;
	};
	
	public Integer getValue() {
		return this.n;
	}
	
	public Boolean getIsPrime() {
		return this.isPrime;
	}
	
	public ArrayList<Integer> getDivisors() {
		return this.divisors;
	}
}
