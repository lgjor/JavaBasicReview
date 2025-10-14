package org.desviante.method.IcorrectStatements;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(); // (1)

        car.setRegNumber("ABC-123"); // (2)
        // car.setNumberOfSeats(5); // (3) incorrect

        String regNumber = car.getRegNumber(); // (4)
        // int seats = car.getNumberOfSeats(); // (5) incorrect
    }
}
