package com.chainsys.day5;

import java.util.Scanner;

public class PersonLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Enter your gender:");
		String gender = sc.next();
		if (age > 25 && gender.equals("M")) {
			System.out.println(age + "\t" + gender);
			System.out.println("Man");
		} else if (age <= 25 && gender.equals("M")) {
			System.out.println(age + "\t" + gender);
			System.out.println("Boy");
		} else if (age > 25 && gender.equals("F")) {
			System.out.println(age + "\t" + gender);
			System.out.println("Women");
		} else if (age <= 25 && gender.equals("F")) {
			System.out.println(age + "\t" + gender);
			System.out.println("Girl");
		} else
			System.out.println("Invalid");

	}
}
