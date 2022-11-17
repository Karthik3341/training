package com.chainsys.day3;

import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:");
		int length=sc.nextInt();
		System.out.println("Enter breadth:");
		int breadth=sc.nextInt();
		if(length==breadth) {
			System.out.println("given value is Square");
		}
		else {
			System.out.println("this is not Square");
		}
	}

}
