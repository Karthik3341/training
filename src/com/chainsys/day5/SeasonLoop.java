package com.chainsys.day5;

import java.util.Scanner;

public class SeasonLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int month = sc.nextInt();
		{
			if (month <= 3 && month >= 1) {
				System.out.println("Spring season");
			} else if (month <= 6 && month >= 4) {
				System.out.println("Summer season");
			} else if (month <= 9 && month >= 7) {
				System.out.println("Monsoon season");
			} else if (month <= 12 && month >= 10) {
				System.out.println("Winter season");
			} else {
				System.out.println("Invalid number");
			}
		}

	}
}
