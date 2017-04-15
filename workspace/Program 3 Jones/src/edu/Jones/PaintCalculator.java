package edu.Jones;

			/**
			 * FILENAME	 PaintCalculator.java
			 * Purpose	To calculate how much paint will be needed to paint a room
			 * @author 	Jamie Jones
			 **/

import java.util.Scanner;
public class PaintCalculator 
{
	public static void main(String[] args) 
	{
		
			Scanner input = new Scanner(System.in);
			//Declare and initialize all variables
			String	userName = "";
			String	paintColor = "";
			double	length = 0.0;
			double	width = 0.0;
			double	height = 0.0;
			double	numberOfWindows =0;
			double	totalSqFeet = 0.0;
			double	wallArea = 0.0;
			double	gallonsNeeded = 0.0;
			double	numberOfBtus = 0.0;
			double	cubicFeet = 0.0;
			int		numberOfCoats = 0;
			final int	WINDOW_PER_SQ_FEET = 145;
			final int	SQ_FEET_PER_WINDOW = 18;
			final int	GALLONS_PER_SQ_FEET = 350;
			final int	SQ_FEET_BTUS = 650;
		
			//Gather userName, length, width, height, paintColor, numberOfCoats
			System.out.println("Welcome to the Paint Store!");
			System.out.println("Let me help you figure out how much Paint you will need. Let's get to know each other!");
		
			System.out.println("What is your first name?");
			userName = input.nextLine();
		
			System.out.println("Nice to meet you, " + userName + ". Lets start with some dimensions");
			
			System.out.println("Please enter the LENGTH of the room in feet you are painting.");
			length = input.nextDouble();
		
			System.out.println("Please enter the WIDTH of the room in feet you are painting.");
			width = input.nextDouble();
		
			System.out.println("Now, please enter the HEIGHT of the room in feet you are painting.");
			height = input.nextDouble();
		
			System.out.println("Excellent, " + userName);
			System.out.println("How many coats of paint will you be applying?");
			numberOfCoats = input.nextInt();
		
			System.out.println("Very good, now all we need, is the color you will be using");
			paintColor = input.next();
		
			//Calculate totalSqFeet, numberOfWindows, wallArea, gallonsNeeded, cubicFeet, numberOfBtus
			totalSqFeet = ((width*height*2)+(length*height*2));
			numberOfWindows = totalSqFeet / WINDOW_PER_SQ_FEET;
			wallArea = totalSqFeet - (numberOfWindows * SQ_FEET_PER_WINDOW);
			gallonsNeeded = (wallArea * numberOfCoats) / GALLONS_PER_SQ_FEET;
			cubicFeet = length * width * height;
			numberOfBtus = (cubicFeet / SQ_FEET_BTUS)*1000;
		
			//Display userName, length, width, height, paintColor, numberOfCoats, wallArea, numberOfWindows, gallonsNeeded, numberOfBtus
			System.out.println("Thank you for the information, " + userName);
			System.out.println("Let's take a look at everything we entered. Your room has a length of " + length +" feet.");
			System.out.println("with a width of " + width +" feet, and a height of " + height +" feet.");
			System.out.println("You would like to apply, " + numberOfCoats + " coats of " + paintColor +" paint");
			System.out.printf("You have %.0f windows %n", Math.floor(numberOfWindows));
			System.out.printf("Which gives you an area of %.2f sq.feet to paint %n", wallArea);
			System.out.printf("That will require %.0f gallons of paint %n", Math.ceil(gallonsNeeded));
			System.out.println("Summer is quickly approaching! Better make sure you have the proper AC Unit!");
			System.out.printf("Based off the dimenisions you have already provided, we would recommend a unit that produces %.0f BTU's.", Math.ceil(numberOfBtus));
		
	input.close();
	}
}
