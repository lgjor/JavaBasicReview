package org.desviante.estruturasdecontrole.forloops.TheCountOfNumbersDivisibleByN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfNumbersDivisibleByN = 0;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                countOfNumbersDivisibleByN++;
            }

        }
        System.out.println(countOfNumbersDivisibleByN);
    }
}