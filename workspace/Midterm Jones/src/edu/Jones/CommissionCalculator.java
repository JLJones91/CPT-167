package edu.Jones;
			/**
			 * FILENAME	CommissionCalculator.java
			 * Purpose	To calculate how much an empoyee's commission is based off employment status and total sales
			 * @author	Jamie Jones
			 */
import java.util.Scanner;

public class CommissionCalculator 
{

	public static void main(String[] args) 
	{
				Scanner input = new Scanner(System.in);
				//Declare and initialize all variables
				String	userName ="";
				char	status = ' ';
				double	totalSales = 0.0;
				double	commissionRate = 0.0;
				double	commissionEarned = 0.0;
				double	companyProfit = 0.0;
				
				//Gather userName, status, totalSales
				System.out.println("Hello ACME Hammer Employee!");
				System.out.println("Let's begin with your Name.");
				userName = input.nextLine();
				
				System.out.println("Thank you " + userName + " , Are you a (F)ull or (P)art time employee?");
				status = input.nextLine().charAt(0);
				status = Character.toUpperCase(status);
				
				System.out.println("Excellent, Please enter your Total Sales for the month.");
				totalSales = input.nextDouble();
				
				//Calculate commissionRate, commissionEarned, companyProfit
				if (status == ('F'))
				{
					if (totalSales >= 10000.0)
					{
						commissionRate = 0.075;
					}
				else
					{
					commissionRate = 0.05;
					}	
				}
				else
				{
					commissionRate = 0.035;
				}
				commissionEarned = commissionRate * totalSales;
				companyProfit = totalSales - commissionEarned;
				
				//Display userName, status, totalSales, commissionRate, commissionEarned, companyProfit
				System.out.println("Thank you " + userName + " , as a " + status + " employee.");
				System.out.printf("With your Sales of %.2f this month %n", totalSales);
				System.out.println("You have earned a Commission Rate of " + commissionRate +"%.");
				System.out.printf("That makes your monthly commission %.2f !%n", commissionEarned);
				System.out.printf("Which means you have made the company %.2f%n", companyProfit, " this month! Keep up the good work " + userName + "!");
	
			input.close();
	}

}
