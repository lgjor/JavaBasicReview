package org.desviante.Super.Employees;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] skills = { "git", "Scala", "JBoss", "UML" };
        Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);

        String[] methods = { "neural networks", "decision tree", "bayesian algorithms" };
        DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, methods);

        System.out.println(developer.getName());
        System.out.println(developer.getEmail());
        System.out.println(developer.getExperience());
        System.out.println(developer.getMainLanguage());
        System.out.println(Arrays.toString(developer.getSkills()));

        System.out.println(analyst.getName());
        System.out.println(analyst.getEmail());
        System.out.println(analyst.getExperience());
        System.out.println(analyst.isPhd());
        System.out.println(Arrays.toString(analyst.getMethods()));
    }
}
