package org.desviante.estruturasdecontrole.whiledowhileloops.CheckCorrectness;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;

        do {
            try {
                System.out.print("Enter a positive integer: ");
                userInput = scanner.nextInt();

                if (userInput <= 0) {
                    System.out.println("Error: The number must be positive.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter an integer.");
                scanner.next(); // Discards the invalid input
                userInput = 0; // Resets to ensure the loop continues
            }
        } while (userInput <= 0);

        System.out.println("Valid input received: " + userInput);
        scanner.close();
    }
}
