package com.homedepot.headfirst;

public class BinaryWorld {
	public static void main(String[] args) {
		System.out.println("It's a binary world");
		int x = 1;
		int y = 2;
		while (x < 16) {
			System.out.println(y);
			y = y * 2;
			x = x + 1;
		}
	}
}
