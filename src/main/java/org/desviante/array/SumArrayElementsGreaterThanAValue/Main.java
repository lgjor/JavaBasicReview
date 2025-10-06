package org.desviante.array.SumArrayElementsGreaterThanAValue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int value = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > value) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}