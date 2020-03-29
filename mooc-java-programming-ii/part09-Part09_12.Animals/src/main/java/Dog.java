
/**
 *
 * @author emaphis
 */
public class Dog extends Animal implements NoiseCapable {

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        this("Dog");
    }

    public void bark() {
        System.out.println(getName() + " barks");
    }

    @Override
    public void makeNoise() {
        bark();
    }

}
