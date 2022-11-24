package com.chainsys.day3;

public class Loan {

	public static void main(String[] args) {
		float P = 3000, R = 15, T = 1;

		float SI = (P * T * R) / 100;
		System.out.println("Simple Intrest =" + SI);
		do {
			System.out.println(SI);
			SI--;
		} while (SI > 1000);

	}

}
