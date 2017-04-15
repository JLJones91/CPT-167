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
		char	smoker = ' ';
		char	runProgram = ' ';
		char	disability = ' ';
		char	lTc = ' ';
		
		double	prem = 0.0;
		double	addPrem = 0.0;
		double	morePrem = 0.0;
		double	finalPrem = 0.0;
		double	ltcPrem = 0.0;
		double	disPrem = 0.0;
		double	smokePrem = 0.0;
		double	totalDis = 0.0;
		double	totalLtC = 0.0;
		double 	totalSmoke = 0.0;
		double	totalBase = 0.0;
		double	totalPrem = 0.0;		
		
		int		totalPlanA = 0;
		int		totalPlanB = 0;
		int		totalPlanC = 0;
		int		totalCust = 0;
		
		
		
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
				runProgram = input.next().charAt(0);
				runProgram = Character.toUpperCase(runProgram);
			}
			
		// Run program when user enters Y	
		while (runProgram == 'Y')
		{
			totalCust ++;
			
			System.out.println("Please enter your First Name:");
			firstName = input.next();
			System.out.println("Thank You, " + firstName + " please enter your Last Name:");
			lastName = input.next();
			System.out.println("Let's get started " + firstName + " " + lastName + ".");
			
			//Select Policy
			plan = getPlan(input);
			
			if (plan == 'A')
			{
				totalPlanA++;
			}
			else if (plan == 'B')
			{
				totalPlanB++;
			}
			else 
			{
			totalPlanC++;
			}
			
			//Test Policy Selection and retrieve premium
			prem = getPrem(plan);
			
			//Ask about additional Coverage
			System.out.println("Would you like to add Disability Coverage? Select (Y)es or (N)o");
			disability = input.next().charAt(0);
			disability = Character.toUpperCase(disability);
				
				// Check for a valid response of N or Y
				while (disability != 'Y' && disability != 'N')
				{
					System.out.println("I'm sorry that was an invalid selection.");
					System.out.println("Please select: Y for Yes, or N for No");
					disability = input.next().charAt(0);
					disability = Character.toUpperCase(disability);
				}
			if (disability == 'Y')
			{
				
				addPrem = prem + 76;
				disPrem = 76;
			}
			else
			{	
				addPrem = prem;
				disPrem = 0;
			}	
			System.out.println("Would you like to add Long Term Care ? Select (Y)es or (N)o");
			lTc = input.next().charAt(0);
			lTc = Character.toUpperCase(lTc);
				
				// Check for a valid response of N or Y
				while (lTc != 'Y' && lTc != 'N')
				{
					System.out.println("I'm sorry that was an invalid selection.");
					System.out.println("Please select: Y for Yes, or N for No");
					lTc = input.next().charAt(0);
					lTc = Character.toUpperCase(lTc);
				}
			if (lTc == 'Y')
			{
				morePrem = addPrem + 110;
				ltcPrem = 110;
			}
			else
			{
				morePrem = addPrem;
				ltcPrem = 0;
			}
					
			//Ask if customer is a smoker.
			System.out.println("Do you smoke?");
			System.out.println("Y for Yes or N for No");
			smoker = input.next().charAt(0);
			smoker = Character.toUpperCase(smoker);
				// Check for a valid response of N or Y
				while (smoker != 'Y' && smoker != 'N')		
				{
					System.out.println("I'm sorry that was an invalid input please select again.");
					System.out.println("Do you smoke? Y for Yes or N for No.");
					smoker = input.next().charAt(smoker);
					smoker = Character.toUpperCase(smoker);
				}
		
			if (smoker == 'Y')
			{
				finalPrem = morePrem + (morePrem * .05);
				smokePrem = (morePrem * .05);
			}
			else if (smoker == 'N')
			{
				finalPrem = morePrem;
				smokePrem = 0;
			}
			totalBase += prem;
			totalDis += disPrem;
			totalLtC +=	ltcPrem;
			totalSmoke += smokePrem;
			totalPrem += finalPrem;
			
			System.out.printf("%-30s%-10s%10s\n", "User Name:", firstName, lastName);
			System.out.printf("%-30s%-30c\n", 	"Selected Plan:", plan);
			System.out.printf("%-30s%-30.2f\n", "Base Plan Premium:", prem);
			System.out.printf("%-30s%-30.2f\n", "Disablility:", disPrem);
			System.out.printf("%-30s%-30.2f\n", "Long Term Care:", ltcPrem);
			System.out.printf("%-30s%-30.2f\n", "Smoker:", smokePrem);
		    System.out.printf("%-30s%-30.2f\n", "Total Premium:", finalPrem);
		    
			
			System.out.println("Would you like to add another person to your plan?");
			System.out.println("Press Y for Yes, or N for No");
			runProgram = input.next().charAt(0);
			runProgram = Character.toUpperCase(runProgram);
		
				while (runProgram != 'Y' && runProgram != 'N')
				{
					System.out.println("I'm sorry that was an invalid selection.");
					System.out.println("Would you like to add another person to your plan? Y for Yes, or N for No1");
					runProgram = input.next().charAt(0);
					runProgram = Character.toUpperCase(runProgram);
				}	
					
		}//End While
			if (totalCust > 0)
			{
				displayFinalResults(totalPlanA, totalPlanB, totalPlanC, totalBase, totalDis, totalLtC, totalSmoke, totalPrem);
			}
			else 
			{
				System.out.println("No data entered, thanks for stopping by!");
			}
		
		
	input.close();	
	}	
		
		
		
		
		
	//Begin selectPlan
	/**
	 * Input customers selected plan
	 * 
	 * return plan
	 */
	static char getPlan (Scanner consoleIn)
	{
		char plan;
		
		System.out.println("Please select a plan: A, B, or C");
		plan = consoleIn.next().charAt(0);
		plan = Character.toUpperCase(plan);
		while (plan != 'A' && plan != 'B' && plan != 'C')
		{
			System.out.println("I'm sorry that was an invalid input.");
			System.out.println("Please select a Plan: A, B, C");
			plan = consoleIn.next().charAt(0);
			plan = Character.toUpperCase(plan);
		}				
		return plan;
	}	
	//End getPlan

	//Begin getPrem
	/**
	 * Input plan
	 * 
	 * return prem
	 * @param  
	 */
	static double getPrem(char plan)
	{
		int prem = 0;
		
		if (plan == 'A')
		
			prem = 175;
					
		else if (plan == 'B')
	
			prem = 198;
		
		else if (plan == 'C')
		
			prem = 225;	
	 
	return prem;
	}
	// End getPerm

	//Begin displayFinalResults
		/**
		 * Display totalPrem, totalPlanA, totalPlanB, totalPlanC, totalBase, totalDis, totalLtc, totalSmoke, totalPrem
		 * 
		 * @param totalPlanA, totalPlanB, totalPlanC
		 * 
		 * @param totalBase, totalDis, totalLtC, totalSmoke, totalPrem 
		 *  
		 */
		static void displayFinalResults(int totalPlanA, int totalPlanB, int totalPlanC, double totalBase, double totalDis, double totalLtC, double totalSmoke, double totalPrem)
		{
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.printf("%15s%15d\n", "Total People in Plan A:", totalPlanA);
			System.out.printf("%15s%15d\n", "Total People in Plan B:", totalPlanB);
			System.out.printf("%15s%15d\n", "Total People in Plan C:", totalPlanC);
			System.out.printf("%15s%22.2f\n", "Total Base Premium:", totalBase);
			System.out.printf("%15s%24.2f\n", "Total Disability:", totalDis);
			System.out.printf("%15s%20.2f\n", "Total Long Term Care:", totalLtC);
			System.out.printf("%14s%27.2f\n", "Total Smoking:", totalSmoke);
			System.out.printf("%15s%13.2f\n", "Total Premium for all Users:", totalPrem);
		}

}

