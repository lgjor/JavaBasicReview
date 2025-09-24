package org.desviante.introduction.forloops.NumbersDivisibleBySix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        int actualnumber = 0;
        int soma = 0;
        for (int i=0;i<iterations; i++){
            actualnumber = scanner.nextInt();
            if (actualnumber % 6 == 0) {
                soma += actualnumber;
            }
        }
        System.out.println(soma);
    }
}

