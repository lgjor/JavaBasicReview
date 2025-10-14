package org.desviante.Super.Employees;

public class DataAnalyst extends Employee {
    // write fields
    private boolean phd;
    private String[] methods;

    // write constructor
    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods){
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }

    // write getters
    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        return methods;
    }
}
