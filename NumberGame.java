/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.util.Scanner;

/**
 *
 * @author purvi
 */
public class NumberGame 
{

    public static void main(String[] args)
    {
       
        Scanner sc = new Scanner(System.in);
        int targetNumber = (int) (Math.random() * 100) + 1;
        int userGuess = 0;
        int attempts = 0;
        int maxAttempts = 5;  // Set a limit for the number of attempts

        System.out.println("Welcome to the Number Game!");
        System.out.println("Guess a number between 1 and 100:");
        System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");

        while (userGuess != targetNumber && attempts < maxAttempts) 
        {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            attempts++;

            if (userGuess < targetNumber) 
            {
                System.out.println("Too low! Try again.");
            } 
            else if (userGuess > targetNumber)
            {
                System.out.println("Too high! Try again.");
            }
            else
            {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }

        if (userGuess != targetNumber) 
        {
            System.out.println("You've used all your attempts. The correct number was " + targetNumber + ".");
        }

        sc.close();
    }
}
