package org.desviante.acessmodifiers.CreatingAClassForABookWithPrivateProperties;

import java.util.Scanner;

// Creating class
public class Book {
    private String title;
    private String author;
    private int numberOfPages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages > 0){
            this.numberOfPages = numberOfPages;
        }

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}

