package com.mycompany.divisibilitycheck;
// Name: [Your Name]
// Assignment #: 2
// Program Description: This program prompts the user to enter an integer and then determines whether the integer is divisible by 5 and 6, by 5 or 6, and by 5 or 6 but not both.

// Import Scanner for user input
import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Please enter an integer: ");
        int number = input.nextInt();

        // Check if the number is divisible by both 5 and 6
        boolean divisibleByBoth = (number % 5 == 0) && (number % 6 == 0);

        // Check if the number is divisible by either 5 or 6
        boolean divisibleByEither = (number % 5 == 0) || (number % 6 == 0);

        // Check if the number is divisible by either 5 or 6 but not both
        boolean divisibleByEitherButNotBoth = (number % 5 == 0) ^ (number % 6 == 0);

        // Output the results
        System.out.println("Is " + number + " divisible by 5 and 6? " + divisibleByBoth);
        System.out.println("Is " + number + " divisible by 5 or 6? " + divisibleByEither);
        System.out.println("Is " + number + " divisible by 5 or 6 but not both? " + divisibleByEitherButNotBoth);
    }
}

