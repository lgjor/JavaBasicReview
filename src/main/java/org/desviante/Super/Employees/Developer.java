package org.desviante.Super.Employees;

public class Developer extends Employee {
    // write fields
    private String mainLanguage;
    private String[] skills;

    // write constructor
    public Developer(String name, String email, int experience, String mainLanguage, String[] skills){
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    // write getters
    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }
}
