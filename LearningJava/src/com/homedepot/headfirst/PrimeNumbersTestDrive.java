package com.homedepot.headfirst;

import com.homedepot.headfirst.Numbers;
//import com.homedepot.headfirst.Number;
import java.util.Date;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumbersTestDrive {
	public static void main(String[] args) throws IOException {
		Numbers n = new Numbers();
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number to check\n");
        while (true) {
	        try{
	    		
	           
	            int i = Integer.parseInt(br.readLine());

	            System.out.println(i + " is" + ( (n.isPrime(i)) ? "" : " not") + " a prime number");
	            System.out.print("Please enter a number to check\n");
	        }catch(NumberFormatException nfe){
	            System.err.println("\nInvalid entry, goodbye.");
	        }
        }
	};
}
