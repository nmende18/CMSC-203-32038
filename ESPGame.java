/*
 * Class: CMSC203
 * Instructor: 
 * Description: A program that is an ESP game.
 * Due: 02/13/24
 * Platform/compiler: Eclipse.
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Napoleon Mendez.
 */

import java.util.Random;
import java.util.Scanner;

public class ESPgame {
	
	// color constants	
	static final String BLACK = "black";
	static final String RED = "red";
	static final String GOLD = "gold";
	static final String YELLOW = "yellow";
	static final String VIOLET = "violet";
	static final String WHITE ="white";
	static final String PINK = "pink";
	
	public static void main(String[] args) {
		
		// initialize scanner and random
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Enter your name: ");
		String name = keyboard.nextLine();
		System.out.print("Describe yourself: ");
		String description = keyboard.nextLine();
		System.out.print("Due Date: ");
		String date = keyboard.nextLine();
		System.out.println("CMSC203 Assigment1: Test your ESP skills!");
		
		
		
		 boolean answer = true;
		 int computerGuess = 0;
		 String computerColor = "";
		 int correctColor = 0;
		 int totalGuesses = 11;
		
		for (int i = 1; i <= 11; i++) {
			System.out.println("Round " + i);
			System.out.println();
			if(answer == true) {
				computerGuess = random.nextInt(7);  // 7 possible colors selected by the computer randomly
			System.out.println("I am thinking of a color.");
			System.out.println("Is it Black, Red, Gold, Yellow, Violet, White, or Pink?");
			System.out.println("Enter your guess:");
			String guess = keyboard.nextLine();
			
			// get the random number to the following colors
			switch(computerGuess) {
			case 0: 
				computerColor = BLACK;
				break;
			case 1:
				computerColor = RED;
				break;
			case 2:
				computerColor = GOLD;
				break;
			case 3: 
				computerColor = YELLOW;
				break;
			case 4:
				computerColor = VIOLET;
				break;
			case 5:
				computerColor = WHITE;
				break;
			case 6:
				computerColor = PINK;
				break;
			}
			
			// validate user input
			while(!(guess.equals(BLACK) || guess.equals(VIOLET) || guess.equals(RED) ||
					guess.equals(WHITE) || guess.equals(GOLD) || guess.equals(YELLOW) ||
					guess.equals(PINK))) {
				System.out.println("You entered incorrect color. Is It Black, Red, Gold,"
						+ " Yellow, Violet, or White");
				System.out.println("Enter your guess again: ");
				guess = keyboard.nextLine();
			}
			// check if user input its correct
			if((guess.equals(computerColor))) {
				System.out.println("I was thinking of " + computerColor + "\n");
				
				correctColor++;
			}
			else if(("black".equals(guess) || "red".equals(guess) || 
					"gold".equals(guess) || "yellow".equals(guess) ||
					"violet".equals(guess)) || "white".equals(guess) || 
					"pink".equals(guess) && !guess.equals(computerColor)) {
				
				System.out.println("I was thinking of " + computerColor + "\n");
			}
			}
			}

		// results
		System.out.println("Game Over");
		System.out.println("You guessed " + correctColor + " out of " + totalGuesses +
				" colors correctly.");
		System.out.println("Studnet Name: " + name);
		System.out.println("User Description: " + description + ".");
		System.out.println("Due Date: " + date);
		
	
	}
}
