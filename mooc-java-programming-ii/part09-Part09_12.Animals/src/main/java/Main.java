
public class Main {

    public static void main(String[] args) {
        // you can test how your classes work here
        //part2()
        //part3();
        part4();
    }

    private static void part2() {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.bark();
    }

    private static void part3() {
        Cat cat = new Cat();
        cat.purr();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.purr();
    }

    private static void part4() {
        NoiseCapable dog = new Dog();
        dog.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        Cat c = (Cat)cat;
        c.purr();
    }

}
