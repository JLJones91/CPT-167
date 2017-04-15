package edu.Jones;

import java.util.Scanner;
			/**
			 * FILENAME	ElectricityCalculator.java
			 * PURPOSE	To calculate customers monthly electricity charges and total all customers monthly usage
			 * @author  Jamie Jones
			 */

public class ElectricityCalculator 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//Declare and initialize all variables
		String	custId = "";
		double	kWh = 0.0;
		double	charge = 0.0;
		double	totalKwh =0.0;    
		double	totalCharge = 0.0; 
		int	custCount = 0;   
		char	runProgram = ' ';

		//Gather custId, kWh
		System.out.println("Hello, Press Y if you would like to enter a Customer Id, press any other key to end program");
		
		runProgram = input.next().charAt(0);
		runProgram = Character.toUpperCase(runProgram);
		
		while (runProgram == 'Y')
			{
				System.out.println("Enter the 3 digit Customer Id.");
				custId = input.next();
				System.out.println("Please enter your monthly KiloWatt Hour usage: ");
				kWh = input.nextDouble();
			
				if (kWh <= 300)
				{
					charge = kWh * .12;
				}
				else if (kWh <= 600)
				{
					charge = ((kWh - 300) * .09) + (300 * .12);
				}
				else if (kWh <= 1000)
				{
					charge = ((kWh - 600) * .06) + (300 * .09) + (300 * .12);
				}	
				else 
				{
					charge = ((kWh - 1000) * .04) + (400 * .06)+ (300 * .09) + (300 * .12);
				}	
			
			custCount++;
			totalKwh += kWh;
			totalCharge += charge;
				
			System.out.printf("%s%30s%30s\n", "Customer ID", "Kilowatts Used", "Monthly Charges", custId, kWh, charge);
			System.out.printf("%s%30s%30s\n", custId, kWh, charge);
		    System.out.println("Would you like to enter another Customer Id? Press (Y)es or (N)o.");
		    runProgram = input.next().charAt(0);
			runProgram = Character.toUpperCase(runProgram);
			}
				if (custCount <= 0)
		{	
			System.out.println("No data entered! Have a nice day.");
		}
		else
		{
			System.out.printf("%-30s%30s\n", "Number of Customers", custCount);
			System.out.printf("%-30s%30.2f\n", "Total Kilowatts Used", totalKwh);
			System.out.printf("%-30s%30.2f\n", "Average Kilowatts Used", totalKwh/custCount);
			System.out.printf("%-30s%30.2f\n", "Total Amount Charged", totalCharge);
		}
	    input.close();
	
	}

}
