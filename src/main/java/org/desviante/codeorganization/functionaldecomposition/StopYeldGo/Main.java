package org.desviante.codeorganization.functionaldecomposition.StopYeldGo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentState = scanner.nextInt();
        scanner.close();

        String nextState = getNextState(currentState);
        String action = getAction(currentState);

        System.out.println(nextState);
        System.out.println(action);
    }

    public static String getNextState(int currentState) {
        return switch (currentState) {
            case 0 -> "1";
            case 1 -> "2";
            case 2 -> "0";
            default -> "Invalid state";
        };
    }

    public static String getAction(int currentState) {
        return switch (currentState) {
            case 0 -> "Change to Yellow";
            case 1 -> "Change to Green";
            case 2 -> "Change to Red";
            default -> "Invalid state";
        };
    }
}