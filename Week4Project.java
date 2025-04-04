
public class Week4Project {

	public static void main(String[] args) {
		int[] ages = {3, 9, 23, 64, 2, 8 ,28, 93}; 
		// this defines an int array named ages, and initializes it.
		
		int result = ages[ages.length - 1] - ages[0];
		System.out.println(result); 
		// ages.length -1 gets the index of the last element in the array.
		// ages[0] refers to first element in the array.
		
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 15};
		int result2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println(result2);
		// ages2.length -1 gets the index of the last element in the array.
		// ages2[0] entry for the first element of the array.
		
		int[] agesShort = {10, 20, 30, 40, 50, 60};
		int resultShort = agesShort[agesShort.length - 1] - agesShort[0];
		System.out.println(resultShort);
		// array agesShort with 6 elements.
		
		int[] agesSmall = {100, 200, 300, 400};
		int resultSmall = agesSmall[agesSmall.length - 1] - agesSmall[0];
		System.out.println(resultSmall);
		// array agesSmall with 4 elements.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		// a string array named names, and initializes it with the named values.
		int totalLetters = 0;
		for (String name : names) {
            totalLetters += name.length();
		}
            double averageLetters = (double) totalLetters / names.length;
    		System.out.println(averageLetters);
    		//totalLetters variable is used to show total number of letters across all names.
    		//for loop, you can access each name using names array. name.length() gives length for each name.
    		// average is calculated by dividing totalLetters by total number of names.
    		//using double because of decimal.

    		String concatenatedNames = "";
    		for (String name : names) {
    			concatenatedNames += name + " ";
    		}
    		System.out.println(concatenatedNames);
    		// use concatenatedNames to hold the result.
    		// add each name to the concatenatedNames string using (name + " ")
    		// .trim() removes extra spaces at the end of the string.
    		
    		//Q3. using (array.length - 1) the property gives the total number of elements in the array. Subtracting 1 gives the index of the last element.
    		//Q4. array(0) first element in an array is always index 0.
    		
    		//Method 5
    		int[] nameLengths = new int[names.length];
    		for (int i = 0; i < names.length; i++) {
    			nameLengths[i] = names[i].length();
    		}
    		System.out.print("Name lengths: ");
    		
    		//Method 6
    		int sum = 0;
    	    for (int length : nameLengths) {
    	   sum += length;
    	   }
    	     System.out.println(sum);
    	    // array nameLengths is created with the same size names, using (new int [names.length].
    	    // for loop runs from 0 to names.length - 1. for each name, the length is added to the appropriate index in nameLengths array.
    	    
    	     //Method 7
    	     String repeatedWord = repeatWord("Hello", 3);
			  System.out.println(repeatedWord);
    	    
    	    } // end of main ***********************************
    	     static String repeatWord(String word, int n) {
    		  StringBuilder result = new StringBuilder();
    		  for(int i = 0; i  < n; i++) {
    			  result.append(word);	  
    		  }
    		  return result.toString();
    		}
    	     // static method named repeatWord n: an int tells how many times the word should be repeated. Returns a String, contains the result of repeated concatenation.
    	     // use StringBuilder, object named result. for loop, append method of StringBuilder adds the word to the result each time. if n=3, the loop will run three times.
    	     // print return statement.
    	     
    	     // method 8
    	     static String getFullName(String firstName, String lastName) {
    	    	 return firstName + " " + lastName;
    	     }
    	     // two Strings firstName and lastName, and concatenates them with a space.
    	     
    	     //Method 9
    	     static boolean isSumGreaterThan100(int[] numbers) {
    	    	 int sum = 0;
    	    	 for (int number : numbers) {
    	    		 sum += number;
    	    		 
    	    	 }
    	    	 return sum > 100;
    	     }
    	     // takes an array of integers and calculates the sum of the elements.
    	     // if greater than 100 = true otherwise, false.
    	     
    	     // Method 10
    	     static double calculateAverage(double[] numbers) {
    	    	 if (numbers.length == 0) {
    	    		 return 0;
    	    	 }
    	    	 double sum = 0;
    	    	 for (double number : numbers) {
    	    		 sum += number;
    	    	 }
    	    	 return sum / numbers.length;
    	     }
    	     // an array of doubles. sums all its elements and divides the sum by the number of elements = average.
    	     
    	     //Method 11
    	     static boolean isFirstAverageGreater(double[] array1, double[] array2) {
    	    	 double average1 = calculateAverage(array1);
    	    	 double average2 = calculateAverage(array2);
    	    	 return average1 > average2;
    	     }
    	     // two arrays of doubles as input. 
    	     // uses the calculatesAverage method to show the average of each array.
    	     // compares average, returns true if average of the first array is greater than the second, otherwise false.
    	    
    	     //Method 12
    	     static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    	    	 return isHotOutside && moneyInPocket > 10.50;
    	     }
    	     // a static method. isHotOutside = boolean
    	     // moneyInPocket = double. uses logical, && to check both conditions.
    	     
    	     
    	     //Method 13
    	     static String convertMinutesToHours(int totalMinutes) {
    	    	 int hours = totalMinutes / 60;
    	    	 int minutes = totalMinutes % 60;
    	    	 return hours + " hour(s) and " + minutes + " minute(s)";
    	     }
    	     // the convertMinutesToHours method takes an integer totalMinutes as input.
    	     // calculates the number of hours by dividing totalMinutes by 60.
    	     // calculates the remainder by using % operator. 
    	     // the method returns as a string, such as "2 hour(s) and 15 minute(s)".
    	     // I created this because I was thinking about time management. And how important it is when going throughout each day.
    	     // 
    	     
    	     
    	     
} // end of class 	    
    

