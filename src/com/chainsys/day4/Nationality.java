package com.chainsys.day4;

import java.util.Scanner;

public class Nationality {

	public static void main(String[] args) {
		String nationality = "Indian";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nationality:");
		nationality = sc.next();
		switch (nationality) {
		case "Indian": {
			System.out.println("Enter State:");
			String state = sc.next();
			System.out.println(state);
			break;
		}
		default: {
			System.out.println("Invalid data");

		}
		case "NRI": {
			System.out.println("Only indian citizens are eligible");
		}
		}
	}

}
