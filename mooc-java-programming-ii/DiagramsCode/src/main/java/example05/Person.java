package example05;


public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printPerson() {
        System.out.println(name + ", " + age + " years");
    }

    public String getName() {
        return name;
    }

}
