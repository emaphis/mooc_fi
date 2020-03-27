
public class Main {

    public static void main(String[] args) {
        // write your test code here
        part1();
        System.out.println("oooooo");
        part2();
    }

    static void part1() {
        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();
    }

    static void part2() {
        C c = new C();

        c.a();
        c.b();
        c.c();
    }
}
