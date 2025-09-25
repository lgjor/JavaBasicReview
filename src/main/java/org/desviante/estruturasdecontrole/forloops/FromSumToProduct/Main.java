package org.desviante.estruturasdecontrole.forloops.FromSumToProduct;

public class Main {
    public static void main(String[] args){
        int start = 1;
        int end = 2;
        int accumulator = 1;                    // (1)
        for (int i = start; i <= end; i++) {    // (2)
            accumulator *= i;                   // (3) Acumulador não pode ser iniciado com zero, pois qualquer número múltiplicado por zero é zero.
        }
    }
}
