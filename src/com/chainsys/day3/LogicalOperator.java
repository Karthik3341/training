package com.chainsys.day3;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		long accountNumber;
		int aadharNumber = 5663, transactionPin = 1234, password = 1234;
		System.out.println("Enter Account Holder Name");
		Scanner sc = new Scanner(System.in);
		String accountHolderName = sc.next();
		if ((accountHolderName.trim() != null) && (accountHolderName.length() >= 5)) {
			System.out.println("Enter account number");
			accountNumber = sc.nextLong();
			System.out.println("enter aadhar number");
			aadharNumber = sc.nextInt();
			if (aadharNumber == 5663) {
				System.out.println("enter transaction pin and password");
				transactionPin = sc.nextInt();
				password = sc.nextInt();
			}
			if ((transactionPin == 1234) || (password == 1234)) {
				System.out.println("Successful Transaction");
			} else {
				System.out.println("Invalid credentials");
			}
		} else {
			System.out.println("Invalid aadhar details");
		}
		{
			System.out.println("Enter valid Acount holder name");
		}

	}
}
