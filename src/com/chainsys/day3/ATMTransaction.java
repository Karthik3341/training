
package com.chainsys.day3;

import java.util.Scanner;

public class ATMTransaction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount");
		int amount = sc.nextInt();

		if (amount > 650) {
			System.out.println("Transaction is Completed");
		}
		if (amount < 650) {
			System.out.println("Transaction is not Completed");
		} else if (amount == 650) {
			System.out.println("Transaction is Equal");
		}
	}

}
