package com.chainsys.day3;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[]args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Marks:");
	int marks=sc.nextInt();
	if(marks<25) {
		System.out.println("Your grade is U");
	}
	else if((marks>=25) && (marks<40)) {
		System.out.println("Your grade is B" );
	}
	else if((marks>=40) && (marks<50)) {
		System.out.println("Your grade is B+" );
	}
	else if((marks>=50) && (marks<60)) {
		System.out.println("Your grade is A " );
	}
	else if((marks>=60) && (marks<70)) {
		System.out.println("Your grade is A+" );
	}
	else if((marks>=70) && (marks<90)) {
		System.out.println("Your grade is O" );
	}
	else if((marks>=90) ) {
		System.out.println("Your grade is S" );
	}
	else {
		System.out.println("Invalid Number");
	}
}
}