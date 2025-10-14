# Fix the non-compiled hierarchy

Fiona created a hierarchy consisting of three classes: Employee, RegularEmployee and ContractEmployee.

But here is one problem: her code doesn't compile.

Examine the constructor chaining and the use of super and this. Without removing any lines of code, make the necessary additions and adjustments to resolve the compilation errors and accurately represent the employee hierarchy.

```Java
class Employee {

    protected String name;
    protected String birthDate;

    public Employee(String name, String birthDate) {
        super.name = name;
        super.birthDate = birthDate;
    }
}

class RegularEmployee extends Employee {

    protected long salary;
    protected String hireDate;

    public RegularEmployee(String name, String birthDate, long salary, String hireDate) {
        this(name, birthDate);
        super.salary = salary;
        this.hireDate = hireDate;
    }
}

class ContractEmployee extends Employee {

    protected long payPerHour;
    protected String contractPeriod;

    public ContractEmployee(String name, String birthDate, long payPerHour, String contractPeriod) {
        this.payPerHour = payPerHour;
        super.contractPeriod = contractPeriod;
    }
}
```