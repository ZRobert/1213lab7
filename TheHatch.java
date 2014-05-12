//TheHatch.java
//Robert Payne
//L02
//6/7/2012
//Lab 8
import java.util.Scanner;

public class TheHatch
{
	public static void main(String[] args)
	{
		//Object for input
		Scanner keyboard = new Scanner(System.in);
		boolean doesMatch;	//boolean return value for checkNumbers()
		int numberCounter = 0;	//counter for guesses
		Numbers game = new Numbers();	//object for Numbers
		
		//First guess input
		System.out.println("Enter your guess: ");
		int userGuess = keyboard.nextInt();
		
		numberCounter++;
			//check to see if the user continues the game
			doesMatch = game.checkNumbers(userGuess); 
		//The main game
		
		while(numberCounter < 6)
		{

			
			if(doesMatch)
			{
				//if continues, guesses again
				System.out.println("Enter your next guess: ");
				userGuess = keyboard.nextInt();
				numberCounter++;
				//check to see if the user continues the game
				doesMatch = game.checkNumbers(userGuess); 
			}
			//if incorrect guess quits the game	
			if(!doesMatch)
			{	
				System.out.println("You have destroyed the world!");
				return;
			}
		}
		
		System.out.println("You have saved the world!");
	}	
}

	