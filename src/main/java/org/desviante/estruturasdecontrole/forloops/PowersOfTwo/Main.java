package org.desviante.estruturasdecontrole.forloops.PowersOfTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();

        for(long i = 1; i < num; i*= 2) {
            System.out.println(i);
        }

    }
}