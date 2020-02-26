
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
        //example1();
        example2();
    }

    static void example1() {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);
    }

    static void example2() {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        Package package1 = new Package();
        package1.addGift(book);
        System.out.println(package1.totalWeight());
    }
}
