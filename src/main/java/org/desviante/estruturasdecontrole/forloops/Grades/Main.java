package org.desviante.estruturasdecontrole.forloops.Grades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicita o número de notas ao usuário
        int numeroDeNotas = scanner.nextInt();

        // Corrige o problema do newline restante
        scanner.nextLine();

        int a = 0, b = 0, c = 0, d = 0;

        for (int i = 0; i < numeroDeNotas; i++) {
            String nota = scanner.nextLine();
            switch (nota.toUpperCase()) { // Garante que a comparação seja sempre em maiúsculas
                case "A" -> a++;
                case "B" -> b++;
                case "C" -> c++;
                case "D" -> d++;
                default -> {
                    // do nothing
                }
            }
        }

        System.out.println(d + " " + c + " " + b + " " + a);
        scanner.close();
    }
}
