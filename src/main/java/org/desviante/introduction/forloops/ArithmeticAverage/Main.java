package org.desviante.introduction.forloops.ArithmeticAverage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double sumOfNumbersDivisibleBy3 = 0;
        double countOfNumbersDivisibleBy3 = 0;
        for (int i = a; i <=b; i++){
            if (i%3==0){
                sumOfNumbersDivisibleBy3+=i;
                countOfNumbersDivisibleBy3++;
            }
        }
        double arithimeticAvarage = sumOfNumbersDivisibleBy3/countOfNumbersDivisibleBy3;
        System.out.println(arithimeticAvarage);
    }
}
