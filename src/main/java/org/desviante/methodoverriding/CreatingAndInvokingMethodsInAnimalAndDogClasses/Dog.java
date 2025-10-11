package org.desviante.methodoverriding.CreatingAndInvokingMethodsInAnimalAndDogClasses;

public class Dog extends Animal {
    // Write override annotation and the makeSound method here
    @Override
    public String makeSound() {
        // Method to return animal sound
        return "bark";
    }
}