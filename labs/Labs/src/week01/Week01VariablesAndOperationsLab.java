//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight
		int availablePlaneSeats = 5;
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 10.25; 

		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'T';
		
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isHotOutside = false;
		
		// 5. Create a variable to hold a customer's first name
		String customerFirstName = "Joey";
		
		// 6. Create a variable to hold a street address
		String streetAddress = "123 E Learning Ave";  

		// 7. Print all variables to the console
		System.out.println("Available seats left on the plane: " + availablePlaneSeats);
		System.out.println(costOfGroceries + " Is the cost for groceries.");
		System.out.println("The person's middle initial is " + middleInitial);
		System.out.println("It is hot outside = " + isHotOutside);
		System.out.println("The customer's first name is " + customerFirstName);
		System.out.println(streetAddress + " is where the person lives.");
		
		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		availablePlaneSeats = availablePlaneSeats - 2;
		availablePlaneSeats -=2;
		System.out.println(availablePlaneSeats);
		
		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		//costOfGroceries = costOfGroceries + 2.15;
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);
		
		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'C';
		System.out.println(middleInitial);
		
		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		isHotOutside = !isHotOutside;
		System.out.println(isHotOutside);
		
		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = customerFirstName + " " + middleInitial + " Smith";
		System.out.println(fullName);
		
		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("Hi, my name is " + fullName + " and I live at " + streetAddress + ".");
		
		
	}
}