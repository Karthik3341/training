package com.chainsys.day5;

import java.util.Scanner;

public class FizzBuzzLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to play:");
		int number = sc.nextInt();

		if ((number % 3 == 0) && (number % 5 == 0)) {
			System.out.println(number + " is FizzBuzz");
		} else if (number % 5 == 0) {
			System.out.println(number + " is Buzz");
		} else if (number % 3 == 0) {
			System.out.println(number + " is Fizz");
		} else {
			System.out.println(number);
		}

	}
}
