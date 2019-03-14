
public class CounterApp {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.grow();
        counter.grow();

        System.out.println(counter);

        Counter clone = counter.clone();

        System.out.println(counter);
        System.out.println(clone);

        counter.grow();
        counter.grow();
        counter.grow();
        counter.grow();

        System.out.println(counter);
        System.out.println(clone);

        clone.grow();

        System.out.println(counter);
        System.out.println(clone);
    }
}
