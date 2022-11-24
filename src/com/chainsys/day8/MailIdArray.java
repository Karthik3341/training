package com.chainsys.day8;

import java.util.Scanner;

public class MailIdArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] mailId = new String[3];
		System.out.println("Enter mailId:");
		for (int i = 0; i < mailId.length; i++) {
			mailId[i] = sc.next();
			if (mailId[i].length() >8) {
				System.out.println("Your mailId is valid");
			} else {
				System.out.println("invalid mailId");
			}
			for (int i1 = 0; i1 < mailId.length; i1++) {
				if (mailId.length > 10) {
					System.out.println("mailId:" + mailId[i1]);
				}
			}
		}

	}
}
