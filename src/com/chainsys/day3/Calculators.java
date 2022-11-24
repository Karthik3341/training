package com.chainsys.day3;

import java.util.Scanner;

public class Calculators {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = sc.nextInt();
		System.out.println("Enter number2");
		int b = sc.nextInt();
		System.out.println("Enter the operation perform:");
		char c = sc.next().charAt(0);
		if (c == '+') {
			System.out.println(a + b);
		} else if (c == '-') {
			System.out.println(a - b);
		} else if (c == '*') {
			System.out.println(a * b);
		} else if (c == '%') {
			System.out.println(a % b);
		} else {
			System.out.println("Invalid input");
		}
	}
}