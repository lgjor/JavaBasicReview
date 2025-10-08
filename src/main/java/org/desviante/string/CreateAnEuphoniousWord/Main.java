package org.desviante.string.CreateAnEuphoniousWord;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(createEuphoniousWord(word));
        scanner.close();
    }
    public static String createEuphoniousWord(String word) {
        String vowels = "aeiouy";
        int insertions = 0;
        int count = 1;
        
        for (int i = 1; i < word.length(); i++) {
            boolean prevIsVowel = vowels.contains(String.valueOf(word.charAt(i - 1)));
            boolean currIsVowel = vowels.contains(String.valueOf(word.charAt(i)));
            
            if (prevIsVowel == currIsVowel) {
                count++;
                if (count == 3) {
                    insertions++;
                    count = 1;
                }
            } else {
                count = 1;
            }
        }
        
        return String.valueOf(insertions);
    }
}