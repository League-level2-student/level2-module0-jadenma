package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] fiveStrings = {"one", "two", "three", "four", "five"};
		//2. print the third element in the array
		System.out.println(fiveStrings[2]);
		//3. set the third element to a different value
		fiveStrings[2] = "3";
		//4. print the third element again
		System.out.println(fiveStrings[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (String printedStrings : fiveStrings) {
			System.out.println(printedStrings);
		}
		
		//6. make an array of 50 integers
		int[] fiftyInts = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random ran = new Random();
		for (int i = 0; i < fiftyInts.length; i++) {
			fiftyInts[i] = ran.nextInt(2147483647);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int min = fiftyInts[0];
		for (int i = 0; i < fiftyInts.length; i++) {
			if (fiftyInts[i] < min) {
				min = fiftyInts[i];
			}
		}
		System.out.println("The smallest number is " + min + ".");
		//9 print the entire array to see if step 8 was correct
		for (int fiftyInt : fiftyInts) {
			System.out.println(fiftyInt);
		}
		//10. print the largest number in the array.
		int max = fiftyInts[0];
		for (int i = 0; i < fiftyInts.length; i++) {
			if (fiftyInts[i] > max) {
				max = fiftyInts[i];
			}
		}
		System.out.println("The largest number is " + max + ".");
	}
}
