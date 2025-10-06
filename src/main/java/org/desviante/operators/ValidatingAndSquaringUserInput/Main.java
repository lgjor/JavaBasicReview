package org.desviante.operators.ValidatingAndSquaringUserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] argos){
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        scanner.close();
        System.out.println(value<0?"Invalid input!":value*value);
        // using math.pow instead.
        //System.out.println(value >= 0 ? (int) Math.pow(value, 2) : "Invalid input!");
    }
}
