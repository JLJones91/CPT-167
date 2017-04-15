package edu.jones;

import java.util.Scanner;

/**
 * File		:	 BookstoreCalulator.java
 * Purp		: 	 Calculate sale cost for bookstore purchases
 * @author	:	 Jamie Jones
 */

public class BookstoreCalculator 
		{
	public static void main(String[] args) 
		{
		Scanner input = new Scanner(System.in);
			
		String userName = "";
		int yearsAttended = 0;
		String itemName = "";
		double origPrice = 0.0;
		int howMany =0;
		double discountPrice = 0.0;
		double totalCost = 0.0;
	
		System.out.println("Welcome to the Bookstore! All items on sale, today only!");
		System.out.println("Let me know what I can help you find today! May I ask your name?");
		
		System.out.println("What is your first name?");
		userName = input.nextLine();
		
		//System.out.println("The name you entered was " + userName);
		
		System.out.println("Nice to meet you, " + userName);
		System.out.println("How many years have you been attending this school?");
		yearsAttended = input.nextInt();
		
		System.out.println("What can I help you find today " + userName + "?");
		input.nextLine();
		itemName = input.nextLine();
		System.out.println("What is the original price?");
		origPrice = input.nextDouble();
		
		discountPrice = origPrice * .63;
		
		System.out.println("For today only, the price of that item is: $" + discountPrice + ".");
		System.out.println("How many " + itemName + "'s would you like to buy?");
		howMany = input.nextInt();
		
		totalCost = howMany * discountPrice;
		
		System.out.println("Ok," + userName + ", here's what it all comes up to.");
		System.out.println("You are buying, " + howMany + " " + itemName + "s.");
		System.out.println("The original price was $" + origPrice + ".");
		System.out.println("Since all items are 37% off today, your discounted price will be $" + discountPrice);
		System.out.println("The Total comes to $" + totalCost + ".");
		System.out.println("You've done well over the last " + yearsAttended + " years " + userName + ". Good luck with the coming semester!");
		
		input.close();
		
		
		}
		}
