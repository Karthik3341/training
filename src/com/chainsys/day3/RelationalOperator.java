package com.chainsys.day3;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		int userAge = sc.nextInt();
		if (userAge > 18) {
			System.out.println("Enter nationality");
			String nationality = sc.next();
			if (nationality.equals("Indian")) {
				System.out.println("your eligible");
			} else {
				System.out.println("You are not an Indian");
			}
		} else
			System.out.println("Not eligible");
	}

}
