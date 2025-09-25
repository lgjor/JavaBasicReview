package org.desviante.estruturasdecontrole.forloops.Factorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 0; i < number; ) {
            factorial *= ++i;
        }
        System.out.println("Factorial of " + number + ": " + factorial);
    }
}