
public class Main {

    public static void main(String[] args) {
        // You can test your program here
        part1();
        System.out.println("oooooo");
        part2();
        System.out.println("oooooo");
        part3();
        System.out.println("oooooo");
        part4();
    }

    static void part1() {
        Item first = new Item("Rock", 5);
        boolean bool = first.equals(new Item("Rock"));
        System.out.println("true = " + bool);
    }

    private static void part2() {
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));
    }

    private static void part3() {
        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.getContents());

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
    }

    private static void part4() {
        MisplacingBox box = new MisplacingBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
    }
}
