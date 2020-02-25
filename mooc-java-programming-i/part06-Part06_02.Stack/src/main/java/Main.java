
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        //example1();
        //example2();
        example3();
    }

    static void example1() {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
    }

    static void example2() {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println("***** ok ok  here here two ***");
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);
    }

    static void example3() {
        Stack s = new Stack();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");

        while (!s.isEmpty()) {
            System.out.println(s.take());
        }
    }
}
