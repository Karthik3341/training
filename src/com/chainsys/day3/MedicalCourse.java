package com.chainsys.day3;

import java.util.Scanner;

public class MedicalCourse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you have medical issues?");
		String response = sc.nextLine();
		if (response.equals("yes")) {
			System.out.println("You are allowed");
		} else {
			System.out.println("You are not allowed");
		}
	}

}
