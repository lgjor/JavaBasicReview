# Invalid method invocations

There is a class hierarchy that includes three classes:

```Java
class Animal {

    protected int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Pet extends Animal {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cat extends Pet {

    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
```

Given the following object:

`Pet cat = new Cat();`

Select all invalid method invocations.

Select one or more options from the list

- cat.getColor();
- cat.getName();
- cat.setAge(5);
- cat.getAge();
- cat.setColor("Gray");
- cat.setName("Pharaoh");