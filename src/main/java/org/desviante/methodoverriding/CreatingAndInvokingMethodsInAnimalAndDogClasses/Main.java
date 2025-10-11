package org.desviante.methodoverriding.CreatingAndInvokingMethodsInAnimalAndDogClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animalType = scanner.nextLine();

        // Depending on the input create instance of Animal or Dog and call it's makeSound method
        if (animalType.equals("Animal")) {
            Animal animal = new Animal();
            System.out.println(animal.makeSound());
        } else if (animalType.equals("Dog")) {
            Dog dog = new Dog();
            System.out.println(dog.makeSound());
        }
    }
}