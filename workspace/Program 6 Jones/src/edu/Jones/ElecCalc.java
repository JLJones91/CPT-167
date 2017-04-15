package edu.Jones;

import java.util.Scanner;
					/**
					 * ElecCalc.java
					 * To calculate multiple customers total electric bill, and displaying total customers, electricity usage, average usage, and total charges
					 * @author Jamie Jones
					 */
public class ElecCalc 
{

	public static void main(String[] args) 
	{
	
		Scanner input = new Scanner(System.in);
		//Declare and initialize all variables
		String	custId = "";
		double	custKwh = 0.0;
		double	charge = 0.0;
		double	totalKwh =0.0;    
		double	totalCharge = 0.0; 
		int	totalCust = 0;
		char	runProgram = ' ';
		
		
		System.out.println("Hello, Press Y if you would like to enter a Customer Id, press any other key to end program");
		runProgram = input.next().charAt(0);
		runProgram = Character.toUpperCase(runProgram);
		while (runProgram == 'Y')
		{
			//Get Customer's ID
			custId = getCustId(input);
			
			//Get Customers Electricity usage
			custKwh = getCustKwh(input);
		
			//Calculate Charges
			charge = calcCharge(custKwh, charge);
		
			//Display Customers Data
			displayCustData(custId, custKwh, charge);
		
			//Increase customers, total electricity used, and total charge
			totalCust++;
			totalKwh += custKwh;
			totalCharge += charge;
			
			System.out.println("Press Y if you would like to enter a Customer Id, press any other key to end program");
			runProgram = input.next().charAt(0);
			runProgram = Character.toUpperCase(runProgram);
		}
		if (totalCust > 0)
		{	
		displayFinalReport(totalCust, totalKwh, avgKwh, totalCharge);
		}
		else
		{
		System.out.println("No data entered, Have a Nice Day!");
		}
		input.close();
	
	}
	//Begin getCustId
	/**
	 * Input Customer 3 digit ID.
	 * 
	 * @return customer ID
	 */
	static String getCustId(Scanner consoleIn)
	{
		Scanner input = new Scanner(System.in);
		String custId;
		System.out.print("Please enter your 3 Digit Customer ID.");
		custId = input.nextLine();
		
		// this is what broke the program ---> input.close(); <---- once deleted the program ran fine.
		
		return custId;
	}	
	//End getCustId
	
	//Begin getCustKwh	
	/**
	 * Input Customers KWH usage
	 * 
	 * 	@return custKwh
	 */
	static double getCustKwh(Scanner consoleInput) 
	{	
	double custKwh;
		
	System.out.print("Enter Kilowatts/Hour used:");
	custKwh = consoleInput.nextDouble();
	consoleInput.nextLine();
		
		while (custKwh < 0)
		{	
			System.out.print("Sorry Kilowatts/Hour must be a positive value.");
			System.out.print("Please Enter Kilowatts/Hour:");
			custKwh = consoleInput.nextDouble();
			consoleInput.nextLine();
		}	
		
	return custKwh;
	}	
	//End getCustKwh
	
	//Begin calcCharge
	/**
	 * Input custKwh and rate
	 *
	 * @return charge
	 */
	static double calcCharge(double custKwh, double charge)
	{
			if (custKwh <= 300)
			{
				charge = custKwh * .12;
			}
			else if (custKwh <= 600)
			{
			charge = ((custKwh - 300) * .09) + (300 * .12);
			}
			else if (custKwh <= 1000)
			{
				charge = ((custKwh - 600) * .06) + (300 * .09) + (300 * .12);
			}	
			else 
			{
				charge = ((custKwh - 1000) * .04) + (400 * .06)+ (300 * .09) + (300 * .12);
			}

	return charge;
	}
	//End calCharge	
		
	//Begin displayCustData
	/**
	 * Display Customer ID, Kilowatts used, and Charge
	 * 
	 * @param custId 
	 * @param custKwh 
	 * @param charge
	 * 
	 */
	static void displayCustData(String custId, double custKwh, double charge)
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.printf("%s%30s%30s\n", "Customer ID", "Kilowatts Used", "Monthly Charges", custId, custKwh, charge);
		System.out.printf("%s%30s%30s\n", custId, custKwh, charge);  
	}
	//End displayCustData

	//Begin displayFinalReport
	/**
	 * Display number of customers, total kwh used, average kwh, total charges
	 * 
	 * @param totalCust
	 * @param totalKwh
	 * @param avgKwh
	 * @param totalCharge
	 */
	static void displayFinalReport(double totalCust, double totalKwh, double avgKwh, double totalCharge)
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		
		System.out.printf("%15s%18.0f\n", "Number of Customers:", totalCust);
		System.out.printf("%15s%17.2f\n", "Total Kilowatts Used:", totalKwh);
		System.out.printf("%15s%15.2f\n", "Average Kilowatts Used:", totalKwh / totalCust);
		System.out.printf("%15s%17.2f\n", "Total Amount Charged:", totalCharge);
	}

}
