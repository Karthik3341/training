package com.chainsys.day7;

import java.util.Scanner;

public class CabsDemo {

	public static void main(String[] args) {
		char a;
		do {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the type of cab:");
			System.out.println("1.mini  \t Rs.6/km");
			System.out.println("2.micro \t Rs.10/km");
			System.out.println("3.prime \t Rs.12/km");
			int cab = sc.nextInt();
			char k;
			if (cab == 1) {
				System.out.println("Mini_Rs.6");
				System.out.println("Continue with mini?");
				k = sc.next().charAt(0);
				if (k == 'y') {
					System.out.println("Enter the number of kilometer");
					int km = sc.nextInt();
					System.out.println("Payable amount=" + (6 * km));
					System.out.println("Payment successfully");
				} else {
					System.out.println("Enter the vaild kilometer");
				}
			} else if (cab == 2) {
				System.out.println("Micro_Rs.10");
				System.out.println("Continue with micro?");
				k = sc.next().charAt(0);
				if (k == 'y') {
					System.out.println("Enter the number of kilometer");
					int km = sc.nextInt();
					System.out.println("Payable amount=" + (10 * km));
					System.out.println("Payment successfully");
				} else {
					System.out.println("Enter the vaild kilometer");
				}
			} else if (cab == 3) {
				System.out.println("Prime_Rs.12");
				System.out.println("Continue with prime?");
				k = sc.next().charAt(0);
				if (k == 'y') {
					System.out.println("Enter the number of kilometer");
					int km = sc.nextInt();
					System.out.println("Payable amount=" + (12 * km));
					System.out.println("Payment successfully");
				} else {
					System.out.println("Enter the vaild kilometer");
				}
			} else {
				System.out.println("Enter valid details");
			}
			
	System.out.println("Do you want continue with cab(Y/N)?:");
	a = sc.next().charAt(0);

		}while ((a == 'y') || (a == 'Y'));
}
}
