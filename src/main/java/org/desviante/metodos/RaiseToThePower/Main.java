package org.desviante.metodos.RaiseToThePower;

import java.util.Scanner;

public class Main {

    public static long power(int n, int m) {
        /*
        * Caso base da recursão. Qualquer número elevado a zero é 1.
        * Quando o expoente m chega a 0,
        * a função para de chamar a si mesma e retorna 1,
        * o que impede um loop infinito.
        * */
        if (m == 0) {
            return 1;
        /*
        * else é o passo recursivo. Se m não for 0, a função retorna o produto de n por ela mesma,
        * mas com o expoente reduzido em 1 (m - 1).
        * Isso continua até que o expoente atinja 0,
        * quando o caso base é acionado e a cadeia de chamadas é resolvida,
        * multiplicando n por si mesmo m vezes.
        * A conversão para (long) garante que o resultado possa acomodar números grandes sem causar um overflow de dados.
        * */
        } else {
            return (long) n * power(n, m - 1);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}
