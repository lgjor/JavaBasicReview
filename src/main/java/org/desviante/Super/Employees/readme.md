# Employees

Develop a class hierarchy of employees. The hierarchy should include three classes:

Employee is the base class. It includes three fields (name, email and integer variable experience), one constructor with three arguments and three getters: getName(), getEmail(), getExperience().
Developer is a subclass. It includes fields from the base class and two additional fields (mainLanguage, skills), one constructor with five arguments and two getters: getMainLanguage(), getSkills().
DataAnalyst is another subclass. It includes fields from the base class and two additional fields (phd, methods), one constructor with five arguments and two getters: isPhd(), getMethods().
You need to define types of the fields and write suitable constructors. To understand it see the code below.

String[] skills = { "git", "Scala", "JBoss", "UML" };
Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);

String[] methods = { "neural networks", "decision tree", "bayesian algorithms" };
DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, methods);
Explain code
It should work correctly with your class hierarchy. Do not forget to write getters with the specified name (otherwise the test system won't be able to check your solution).

Do not make your classes public!

```Java
class Employee {

    // write fields

    // write constructor

    // write getters
}

class Developer extends Employee {

    // write fields

    // write constructor

    // write getters
}

class DataAnalyst extends Employee {

    // write fields

    // write constructor

    // write getters
}
```