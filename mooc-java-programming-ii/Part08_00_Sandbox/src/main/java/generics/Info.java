
package generics;

/**
 *
 * @author emaphis
 */
public class Info<A, B> {
    A a;
    B b;

    public Info(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return this.a.toString() + " " + this.b.toString();
    }

}
