package example03;

public class Person {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void PrintPerson() {
        System.out.println(name + ", " + age + " years");
    }
}
