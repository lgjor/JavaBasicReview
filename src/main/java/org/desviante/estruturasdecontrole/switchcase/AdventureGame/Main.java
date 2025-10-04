package org.desviante.estruturasdecontrole.switchcase.AdventureGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Adventure Game!");
        System.out.println("Choose your path: 1) Forest, 2) Cave, 3) Castle");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You entered the mysterious forest");
                break;
            case 2:
                System.out.println("You enter a dark cave. It is pitch black inside.");
                break;
            case 3:
                System.out.println("You approach a majestic castle. Guards are at the entrance");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}