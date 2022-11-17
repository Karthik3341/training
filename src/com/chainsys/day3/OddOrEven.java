package com.chainsys.day3;
import java.util.Scanner;
public class OddOrEven {

	public static void main(String[] args) {
		int number,remainder;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		number=sc.nextInt();
		remainder=number%2;
		if(remainder==0)
		{
			System.out.println("Given number is even");
		}
		else {
			System.out.println("Given number is odd");
		}
	}

}
