package com.chainsys.day3;

import java.util.Scanner;

public class CricketScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two teams");
		String teamA = sc.next();
		String teamB = sc.next();
		System.out.println("Enter team scores:");
		int score = sc.nextInt();
		if (score > 200) {
			System.out.println("Team A is winner");
		} else if (score < 200) {
			System.out.println("Team B is winner");
		} else if (score == 200) {
			System.out.println("Match will be draw");
		} else {
			System.out.println("No match");
		}
	}

}
