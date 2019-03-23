
public class Main {

    public static void testThing() {
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing t = new Thing("Book", 2);

        System.out.println("Book name: " + book.getName());
        System.out.println("Book weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Mobile: " + mobile);
        String str = t.toString();
        System.out.println(str);
    }

    public static void testSuitCase() {
        Thing book = new Thing("Happiness in three steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addThing(book);
        System.out.println(suitcase);

        suitcase.addThing(mobile);
        System.out.println(suitcase);

        suitcase.addThing(brick);
        System.out.println(suitcase);
    }

    public static void testEveryThing() {
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addThing(book);
        suitcase.addThing(mobile);
        suitcase.addThing(brick);

        System.out.println("Your suitcase contains the following things:");
        suitcase.printThings();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");
    }

    public static void testHeaviest() {
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addThing(book);
        suitcase.addThing(mobile);
        suitcase.addThing(brick);

        Thing heaviest = suitcase.heaviestThing();
        System.out.println("The heaviest thing: " + heaviest);
    }

    public static void testContainer() {
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);

        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);

        System.out.println(container);
    }

    public static void testContainerThings() {
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);

        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);

        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);

        System.out.println("There are the following things in the container suitcases:");
        container.printThings();
    }

    
    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        for (int weight = 1; weight <= 100; weight++) {
            Suitcase suitcase = new Suitcase(100);
            Thing brick = new Thing("Brick", weight);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    }

    public static void testAddBricks() {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }


    public static void main(String[] args) {
        // use this main class to test your program!
        //testThing();
        //testSuitCase();
        //testEveryThing();
        //testHeaviest();
        //testContainer();
        //testContainerThings();
        testAddBricks();
    }

}
