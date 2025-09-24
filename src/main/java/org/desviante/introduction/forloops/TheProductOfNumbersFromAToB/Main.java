package org.desviante.introduction.forloops.TheProductOfNumbersFromAToB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int productFromAtoB = 1;
        for (int i = a; i<b; i++){
            productFromAtoB *= i;
        }
        System.out.println(productFromAtoB);
    }
}