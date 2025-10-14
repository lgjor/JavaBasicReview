package org.desviante.method.InvalidMethodInvocations;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Cat();
        //cat.getColor(); incorrect
        cat.getName();
        cat.setAge(5);
        cat.getAge();
        //cat.setColor("Gray");  incorrect
        cat.setName("Pharaoh");
    }
}
