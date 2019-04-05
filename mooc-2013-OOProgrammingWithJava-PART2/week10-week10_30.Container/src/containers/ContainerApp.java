
package containers;


public class ContainerApp {

    static void testProductContainer() {
        ProductContainer juice = new ProductContainer("Juice", 1000.0);
        juice.addToTheContainer(1000.0);
        juice.takeFromTheContainer(11.3);
        System.out.println(juice.getName()); // Juice
        System.out.println(juice);           // volume = 988.7, free space 11.3
    }

    static void testProductContainer2() {
        ProductContainer juice = new ProductContainer("Juice", 1000.0);
        juice.addToTheContainer(1000.0);
        juice.takeFromTheContainer(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToTheContainer(1.0);
        System.out.println(juice);           // Juice: volume = 989.7, space 10.2999999
    }

    static void testHistory1() {
        // the well known way:
        ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
        juice.takeFromTheContainer(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToTheContainer(1.0);
        System.out.println(juice);           // Juice: volume = 989.7, free space 10.3

        // history() does not work properly, yet:
        System.out.println(juice.history()); // [1000.0]
        // in fact, we only retrieve the original value which was given to the constructor...
        juice.printAnalysis();
    }


    static void testHistory2() {
        ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
        juice.takeFromTheContainer(11.3);
        juice.addToTheContainer(1.0);
        //System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        juice.printAnalysis();
    }

    public static void main(String[] args) {
        //testProductContainer();
        //testProductContainer2();
        testHistory1();
    }
}
