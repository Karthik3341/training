package com.chainsys.day3;

import java.util.Scanner;

public class StudentAttendance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of classes:");
		int classes = sc.nextInt();
		System.out.println("Enter number of classes held:");
		int classesheld = sc.nextInt();
		System.out.println("Percentage of class attented");
		int percentage = sc.nextInt();
		System.out.println("Enter Attendance:");
		int attendance = sc.nextInt();
		if (percentage > 75) {
			System.out.println("Student allow to exam");
		} else if (percentage < 75) {
			System.out.println("Student didn't allow to exam");
		} else {
			System.out.println("Invalid details");
		}
	}
}
