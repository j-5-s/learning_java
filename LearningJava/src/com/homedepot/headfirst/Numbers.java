package com.homedepot.headfirst;

import java.util.ArrayList;

import com.homedepot.headfirst.PrimeNumber;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


//collection of Numbers
public class Numbers {
	
	
	public class PrimeReader implements Runnable {
	     
		ArrayList<Integer> primes;

	     @Override
	     public void run() {
	    	 primes = new ArrayList();
	    	 BufferedReader br = null;
				try {
					br = new BufferedReader(new FileReader("primes2.txt"));
				    String line = br.readLine();
		
			        while (line != null) {
			        	int i = Integer.parseInt(line);
			            primes.add(i);
			            line = br.readLine();
			        }
			        
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
					
			}
	     
		     public ArrayList getValue() {
		         return primes;
		     }
	     }
	
	ArrayList primes;

	public Numbers() throws IOException{
		primes = this.readPrimes();
	}
	
	public boolean isPrime(int i) {
		
		if (primes.contains(i)) {
			return true;
		} else {
			return false;
		}
	}
	
	private Thread writePrimes( ){
		return new Thread( new Runnable() {
			public void run() {
				FileWriter writer;
				try {
					writer = new FileWriter("primes2.txt");

				for (int i = 0; i < 1000000; i++) {
					if (PrimeNumber.isPrime(i)) {
						 writer.write("" + i + "\n");
					}
				}
				writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	private ArrayList readPrimes() throws IOException {
		 File f = new File("primes2.txt");
		 Thread t;
		 
		 if(!f.exists()) {
			 t = this.writePrimes();
			 t.start();
			 try {
				 t.join();
			 } catch(InterruptedException e) {
				 e.printStackTrace();
			 }
		 }
		 

		 PrimeReader t2 = new PrimeReader();
		 t2.run();
		 
		 return t2.getValue();
	}
}
