package edu.Jones;

	import java.util.Scanner;
					
public class InsuranceQuote 
{
	/**
	 * InsuranceQuote.java
	 * To calculate multiple users life insurance principles. 
	 * @author Jamie Jones
	 */
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		//Declare and initialize all variables
		String	firstName = " ";
		String	lastName = " ";
		char 	plan = ' ';
		double	prem = 0.0;
		double	addPrem = 0.0;
		double	finalPrem = 0.0;
		char	runProgram = ' ';
		char	smoker = ' ';
		double	totalPrem = 0.0;
		int		totalPlanA = 0;
		int		totalPlanB = 0;
		int		totalPlanC = 0;
		int		totalCust = 0;
		char	disability = ' ';
		char	lTc = ' ';
		
		
		//Ask customer if they would like to start a quote
		
		System.out.println("Hello! Welcome to LifePros life insurance!");
		System.out.println("Would you like to begin a Life Insurance Quote? Please press Y for Yes or N for No");
		runProgram = input.next().charAt(0);
		runProgram = Character.toUpperCase(runProgram);
		
		// Check for a valid response of N or Y
			while (runProgram != 'Y' && runProgram !='N')
			{
				System.out.println("I'm sorry that was an invalid selection.");
				System.out.println("Would you like an insurance quote? Y for Yes, or N for No");
				runProgram = input.next().charAt(runProgram);
				runProgram = Character.toUpperCase(runProgram);
			}
			
		// Run program when user enters Y	
		while (runProgram == 'Y')
		{
			System.out.println("Please enter your First Name:");
			firstName = input.next();
			System.out.println("Thank You, " + firstName + " please enter your Last Name:");
			lastName = input.next();
			System.out.println("Let's get started " + firstName + " " + lastName + ".");
		}
	}	
}			