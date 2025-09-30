package org.desviante.array.InitializingAnArrayOfLongs;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Declaração e inicialização correta
        long[] longNumbers = {100000000001L, 100000000002L, 100_000_000_003L};

        System.out.println(Arrays.toString(longNumbers));
    }
}