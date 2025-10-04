package org.desviante.operators.CheckTheValue;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println(value<10?"true":"false");
    }
}
