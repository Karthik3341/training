package com.chainsys.day8;

import java.util.Scanner;

public class GSTDemo {

	public static void main(String[] args) {
		char ans = 0;
		do {
			int coupon=100;
			Scanner sc = new Scanner(System.in);
			System.out.println("                               GST Invoice            ");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("*****************************WELCOME TO APJ SHOP*********************************");
			System.out.println("Date:23.11.2022");
			System.out.println("Enter the customer name:");
			String name = sc.next();
			System.out.println("Invoice No:");
			int invoice=sc.nextInt();			
			System.out.println("1.Cloths" + "\n" + "2.Snacks" + "\n" + "3.Mobiles" + "\n" + "4.Food" + "\n");
			System.out.println("Enter the type of product purchased:");
			String product = sc.next();
			char choice = 'y';
			switch (product) {
			case "Cloths": {
				System.out.println("1.Pant" + "\n" + "2.Shirt" + "\n" + "3.Shoes" + "\n");
				System.out.println("You have selected the cloths");
				System.out.println("Enter the product name");
				String prodName = sc.next();
				System.out.println(prodName);
				System.out.println("ProductId");
				int prodId = sc.nextInt();
				System.out.println(prodId);
				System.out.println("Quantity");
				int quantity = sc.nextInt();
				System.out.println(quantity);
				System.out.println("Price");
				int price = sc.nextInt();
				System.out.println(price);   
			    int amount = quantity*price;
				System.out.println("Amount="+amount);
				System.out.print("Want to add more items? (y or n): ");
				choice = sc.next().charAt(0);
				sc.nextLine();
				double discount = amount * 5 / 100;
				System.out.println("\n\t\t  Discount Rs. " + discount);
				double subtotal = amount - discount;
				System.out.println("\n\t\t  Subtotal " + subtotal);
				System.out.println("\n\t\t\t   Invoice Total " + subtotal);
				System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");
				System.out.println("\t\t\t\t                     Visit Again");
				sc.close();
				break;
			}
			case "Snacks": {
				System.out.println("1.Biscuits" + "\n" + "2.Chips" + "\n" + "3.Mixtures" + "\n");
				System.out.println("You have selected the Snacks");
				System.out.println("Enter the product name");
				String prodName = sc.next();
				System.out.println(prodName);
				System.out.println("ProductId");
				int prodId = sc.nextInt();
				System.out.println(prodId);
				System.out.println("Quantity");
				int quantity = sc.nextInt();
				System.out.println(quantity);
				System.out.println("Price");
				int price = sc.nextInt();
				System.out.println(price);   
			    int amount = quantity*price;
				System.out.println("Amount="+amount);
				System.out.print("Want to add more items? (y or n): ");
				choice = sc.next().charAt(0);
				sc.nextLine();
				int discount =amount * 10 / 100;	
				System.out.println("\n\t\t  Discount Rs. " + discount);
				int subtotal = amount - discount;
				System.out.println("\n\t\t  Subtotal " + subtotal);
				System.out.println("\n\t\t\t\t    Invoice Total " + subtotal);
				System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");
				System.out.println("\t\t\t\t                     Visit Again");
				sc.close();
				break;
			}
			case "Mobiles": {
				System.out.println("1.OnePlus" + "\n" + "2.Realme" + "\n" + "3.Oppo" + "\n");
				System.out.println("You have selected the Mobiles");
				System.out.println("Enter the product name");
				String prodName = sc.next();
				System.out.println(prodName);
				System.out.println("ProductId");
				int prodId = sc.nextInt();
				System.out.println(prodId);
				System.out.println("Quantity");
				int quantity = sc.nextInt();
				System.out.println(quantity);
				System.out.println("Price");
				int price = sc.nextInt();
				System.out.println(price);   
			    int amount = quantity*price;
				System.out.println("Amount="+amount);
				System.out.print("Want to add more items? (y or n): ");
				choice = sc.next().charAt(0);
				sc.nextLine();
				double discount = amount * 15 / 100;
				System.out.println("\n\t\t  Discount Rs. " + discount);
				double subtotal = amount - discount;
				System.out.println("\n\t\t  Subtotal " + subtotal);
				System.out.println("\n\t\t\t\t    Invoice Total " + subtotal);
				System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");
				System.out.println("\t\t\t\t                     Visit Again");
				sc.close();
				break;
			}
			case "Food": {
				System.out.println("1.Rice" + "\n" + "2.Briyani" + "\n" + "3.Noodles" + "\n");
				System.out.println("You have selected the Food");
				System.out.println("Enter the product name");
				String prodName = sc.next();
				System.out.println(prodName);
				System.out.println("ProductId");
				int prodId = sc.nextInt();
				System.out.println(prodId);
				System.out.println("Quantity");
				int quantity = sc.nextInt();
				System.out.println(quantity);
				System.out.println("Price");
			    int price = sc.nextInt();
				System.out.println(price);   
			    int amount = quantity*price;
				System.out.println("Amount="+amount);
				System.out.print("Want to add more items? (y or n): ");
				choice = sc.next().charAt(0);
				sc.nextLine();
				double discount = amount * 20 / 100;
				System.out.println("\n\t\t  Discount Rs. " + discount);
				double subtotal =amount - discount;
				System.out.println("\n\t\t  Subtotal " + subtotal);
				System.out.println("\n\t\t\t\t    Invoice Total " +subtotal);
				System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");
				System.out.println("\t\t\t\t                     Visit Again");
				sc.close();
				break;
			}
			default:
			{
				System.out.println("Enter valid details!!!");
			}
			}
		}while (ans== 'y' || ans == 'Y');

		}

}
