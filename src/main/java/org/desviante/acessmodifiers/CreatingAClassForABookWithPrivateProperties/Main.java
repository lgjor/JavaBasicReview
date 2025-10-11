package org.desviante.acessmodifiers.CreatingAClassForABookWithPrivateProperties;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an object of the Book class
        Book book = new Book();

        // Take Title, Author and numberOfPages as next inputs and set them using the mutator methods
        book.setTitle(scanner.nextLine());
        book.setAuthor(scanner.nextLine());
        book.setNumberOfPages(scanner.nextInt());

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getNumberOfPages());

        scanner.close();
    }
}
