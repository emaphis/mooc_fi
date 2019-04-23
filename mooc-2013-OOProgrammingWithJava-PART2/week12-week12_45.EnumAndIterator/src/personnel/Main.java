package personnel;

public class Main {

    static void testPerson() {
        Person arto = new Person("Arto", Education.D);
        System.out.println(arto);
    }

    static void testEmployees() {
        Employees university = new Employees();
        university.add(new Person("Matti", Education.D));
        university.add(new Person("Pekka", Education.GRAD));
        university.add(new Person("Arto", Education.D));

        university.print();

        university.fire(Education.GRAD);

        System.out.println("==");

        university.print();
    }

    public static void main(String[] args) {
        // write test code here
        //testPerson();
        testEmployees();
    }
}
