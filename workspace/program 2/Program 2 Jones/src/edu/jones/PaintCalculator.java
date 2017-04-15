package edu.jones;

import java.util.Scanner;
public class PaintCalculator 
{
	

	public static void main(String[] args) 
	{
		/**
		 * FILENAME	PaintCalculator.java
		 * Purpose	To calculate the amount of paint and brushes needed to paint a room
		 * @author	Jamie Jones
		 **/
	
	Scanner input = new Scanner(System.in);
	
	
	//Decalare and initialize all variables 
	String	userName = "";
	double	totalSqFeet = 0.0;
	int	numberOfCoats = 0;
	double	gallonsNeeded = 0.0;
	double	brushesNeeded = 0.0;
	double	length = 0.0;
	double	width = 0.0;
	double	height = 0.0;
	final int Sq_Feet_Per_Gallon = 350;
	final int Sq_Feet_Per_Brush = 1300;
	
	
	//Gather Name, Width, Length, Height
	System.out.println("Welcome to the Paint Store!");
	System.out.println("Let me help you figure out how much Paint you will need. May we begin with your first name.");
	
	System.out.println("What is your first name?");
	userName = input.nextLine();
	
	System.out.println("Nice to meet you, " + userName);
	System.out.println("Please enter the LENGTH of the room in feet you are painting.");
	length = input.nextDouble();
	
	System.out.println("Please enter the WIDTH of the room in feet you are painting.");
	width = input.nextDouble();
	
	System.out.println("Now, please enter the HEIGHT of the room in feet you are painting.");
	height = input.nextDouble();
	
	System.out.println("Excellent, " + userName);
	System.out.println("How many coats of paint would you like to apply?");
	numberOfCoats = input.nextInt();
	
	//Calculate totalSqFeet, gallonsNeeded, brushesNeeded
	totalSqFeet = ((width*height*2)+(length*height*2)+(length*width));
	gallonsNeeded =(totalSqFeet*numberOfCoats)/Sq_Feet_Per_Gallon ;
	brushesNeeded =(totalSqFeet*numberOfCoats)/Sq_Feet_Per_Brush;
	
	//Display Output userName, totalSqFeet, numberOfCoats, gallonsNeeded, brushesNeeded
	System.out.println("Thank you for the information, " + userName);
	System.out.println("You are looking to paint, " + totalSqFeet +" Sq. Feet.");
	System.out.println("You would like to apply, " + numberOfCoats + " coats.");
	System.out.printf("That will require %.0f gallons of paint %n", Math.ceil(gallonsNeeded));
	System.out.printf("and %.0f Paint Brushes %n", Math.ceil(brushesNeeded));
	
	input.close();
	}

}