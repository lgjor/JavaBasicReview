package org.desviante.array.CheckIfAnArrayContainsTwoNumbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        boolean found = false;
        for (int i = 0; i < array.length-1; i++){
            if ( ( (array[i] == n && array[i+1] == m) ) || (array[i] == m && array[i+1] == n) ) {
                found=true;
                break;
            }
        }
        System.out.println(found);
    }
}