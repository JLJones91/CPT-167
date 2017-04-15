package edu.Jones;

import java.util.Scanner;

/**
			 * FILENAME	 BtuCalculator.java
			 * Purpose	To calculate how much area is in a room, and recommend the proper AC unit
			 * @author 	Jamie Jones
			 **/
public class BtuCalculator 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		//Declare and initialize all variables
		String	userName = "";
		double	length = 0.0;
		double	width = 0.0;
		double	height = 0.0;
		double	totalArea = 0.0;
		double	winAllow = 0;
		double	winWanted = 0;
		double	cubicVol = 0.0;
		double	btus = 0.0;
		char	unit = ' ';
		final int	WINDOW_PER_SQ_FEET = 145;
		final int	SQ_FEET_BTUS = 650;
		
		//Gather userName, length, width, height, paintColor, numberOfCoats
		System.out.println("Welcome to our Store!");
		System.out.println("What is your first name?");
		userName = input.nextLine();
	
		System.out.println("Nice to meet you, " + userName + ". Lets start with some dimensions");
		
		System.out.println("Please enter the LENGTH of the room in feet.");
		length = input.nextDouble();
	
		System.out.println("Please enter the WIDTH of the room in feet.");
		width = input.nextDouble();
	
		System.out.println("Now, please enter the HEIGHT of the room in feet.");
		height = input.nextDouble();
		
		//Calculate totalArea, winAllow, Display how many winAllow, gather winWanted
		totalArea = ((length * height *2) + (width * height * 2));
		winAllow = totalArea / WINDOW_PER_SQ_FEET;
		
		System.out.printf("The total square feet of your room is %.1f%n", totalArea);
		System.out.printf("Accordnig to local building codes, you may install up to %.0f windows %n", Math.floor(winAllow));
		System.out.println("How many windows would you like installed?");
		winWanted = input.nextDouble();
			if (winWanted > winAllow)
			{
					winWanted = winAllow;
					System.out.printf("I'm sorry the maximum number of windows you can install is %.0f.%n", Math.floor(winAllow));
			}
			else	
			{
					;
			}
		//Calculate cubicVol, btus, and unit
		cubicVol = (length * width * height);
		btus = ((cubicVol / SQ_FEET_BTUS) * 1000);
				
			if (btus <= 12500)
			{
				unit = 'A';	
			}	
			else if (btus <= 27500)
			{
				unit = 'B';
			}	
			else if (btus <= 40000)
			{
				unit = 'C';
			}
			else if (btus <= 61300)
			{
				unit = 'D';
			}
			else if (btus <= 75000)
			{
				unit = 'E';
			}
			else if (btus <= 100000)
			{
				unit = 'F';
			}
			else
			{
				unit = 'G';
			}
		
		//Display userName, length, width, height, winWanted, cubicVol, btus, unit
		System.out.printf("\n%-30s%30s\n", "Customer Name", userName);
		System.out.printf("\n%-30s%30.1f\n", "Length", length);
		System.out.printf("\n%-30s%30.1f\n", "Width", width);
		System.out.printf("\n%-30s%30.1f\n", "Height", height);
		System.out.printf("\n%-30s%30s\n", "Number of Windows", winWanted);
		System.out.printf("\n%-30s%30.1f\n", "Cubic Feet", cubicVol);		
		System.out.printf("\n%-30s%30.1f\n", "Total BTU's", btus);
		System.out.printf("\n%-30s%30s\n", "Recommended Unit", unit);
		
	input.close();
	}
	
}	