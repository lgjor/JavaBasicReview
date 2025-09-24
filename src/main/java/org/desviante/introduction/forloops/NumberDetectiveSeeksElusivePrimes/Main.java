package org.desviante.introduction.forloops.NumberDetectiveSeeksElusivePrimes;

public class Main {
    public static void main(String[] args) {
        int number = 17; // Example number, you can change this or ask for a user input with scanner.
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

}
