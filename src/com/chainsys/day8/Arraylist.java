package com.chainsys.day8;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List phoneNo = new ArrayList();
		phoneNo.add(23);
		phoneNo.add(28);
		phoneNo.add(32);
		phoneNo.add(50);
		for (Object listOfPhoneNo : phoneNo) {
			System.out.println(phoneNo);
		}
		phoneNo.add(45);
		phoneNo.add(82);
		phoneNo.add(31);
		phoneNo.add(25);
		phoneNo.add(3,3);
		for (Object listOfPhoneNo : phoneNo) {
			System.out.println("Updated array" + listOfPhoneNo);
		}
	}

}
