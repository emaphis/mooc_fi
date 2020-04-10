package example06;


public class Person {
    private String name;
    private int age;
    private Book book;

    public Person(String name, int age, Book book) {
        this.name = name;
        this.age = age;
        this.book = book;
    }

    public void printPerson() {
        System.out.println(name + ", " + age + " years");
    }

    public String getName() {
        return name;
    }

}
