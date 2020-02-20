
/**
 *
 * @author emaphis
 */
public class CounterApp {

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increase();
        counter.increase();

        System.out.println(counter);

        Counter clone = counter.clone();

        System.out.println(counter);
        System.out.println(clone);

        counter.increase();
        counter.increase();
        counter.increase();
        counter.increase();

        System.out.println(counter);
        System.out.println(clone);

        clone.increase();

        System.out.println(counter);
        System.out.println(clone);
    }
}
