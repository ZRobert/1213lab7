//ArraysLab1.java
//Robert Payne
//L02
//6/7/2012
//Lab 8
import java.util.Scanner;

public class ArraysLab1
{
	public static void main(String[] args)
	{
		//create scanner object
		Scanner keyboard = new Scanner(System.in);
		//create "numbers" array of 4 integers
		int[] numbers = new int[4];
		int index = 0;
		
		//user input values into the array
		for(index = 0;index < numbers.length; index++)
		{
			System.out.print("Enter an integer: ");
			numbers[index] = keyboard.nextInt();
		}
		
		//outputs the contents of the array
		for(index = 0; index < numbers.length; index++)
			System.out.println("numbers[" + index + "] = " + numbers[index]);
		
		//adds up each element of the array and outputs the sum
		int sum = 0;
		for(index = 0; index < numbers.length; index++)
			sum += numbers[index];
			
		System.out.println("The sum of the numbers is " + sum);
		
		//computes the average of the array's elements using sum
		double average;
			
		average = ((double)sum) /((double)(index));
		System.out.println("The average of the numbers is " + average);
		
		//looks for min/max values in the array and outputs the max/min
		int min = numbers[0];
		int max = numbers[0];
		
		for(index = 1; index < numbers.length; index++)
		{
			if(numbers[index] < min)
				min = numbers[index];
			if(numbers[index] > max)
				max = numbers[index];
		}
		
		System.out.println("The minimum of the numbers is " + min);
		System.out.println("The maximum of the numbers is " + max);
	}
}	
//Task 1 answers
//3. It adds each element of the array to the integer sum and outputs the sum of the elements of the array.
