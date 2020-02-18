
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter();
        System.out.println(counter.value());

        counter.increase();
        System.out.println(counter.value());

        counter.increase(5);
        System.out.println(counter.value());

        counter.decrease();
        System.out.println(counter.value());

        counter.decrease(4);
        System.out.println(counter.value());
    }
}
