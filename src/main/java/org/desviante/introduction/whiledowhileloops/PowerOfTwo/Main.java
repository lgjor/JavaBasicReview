package org.desviante.introduction.whiledowhileloops.PowerOfTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();

        long result = 1;


        while ( result < num ) {
            System.out.println(result);
            result *= 2;
        }
    }
}
