package com.chainsys.day7;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a;
		do {
			System.out.println("Enter the numbers:");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("Choose the any one operation:+,-,*,/");
			char operation = sc.next().charAt(0);
			switch (operation) {
			case '+':
				System.out.println("Addition of two number is:" + (num1 + num2));
				break;
			case '-':
				System.out.println("Subtraction of two number is:" + (num1 - num2));
				break;
			case '*':
				System.out.println("Multiplication of two number is:" + (num1 * num2));
				break;
			case '/':
				System.out.println("Division of two numbwr is:" + (num1 / num2));
				break;
			default:
				System.out.println("Invalid operation");
				break;
			}

		
		System.out.println("Do you want continue in this operation(Y/N)?:");
		a = sc.next().charAt(0);
		} while((a=='y')||(a=='Y'));

	}
}