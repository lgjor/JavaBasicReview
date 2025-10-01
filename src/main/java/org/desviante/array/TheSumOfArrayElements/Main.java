package org.desviante.array.TheSumOfArrayElements;

import java.util.Scanner;

// Desnecessário usar array para essa solução.
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += scanner.nextInt();
        }
        System.out.println(sum);
    }
}
