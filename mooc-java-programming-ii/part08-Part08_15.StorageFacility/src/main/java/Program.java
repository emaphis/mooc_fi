
public class Program {

    public static void main(String[] args) {
        // Test your program here
        example1();
        System.out.println("oooooooo");
        example2();
    }

    static void example1() {
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

//        facility.remove("f156", "rollerblades");
        System.out.println(facility.contents("a14"));
        System.out.println(facility.contents("f156"));
        //      System.out.println(facility.storageUnits());
    }

    static void example2() {
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("f156"));

        facility.remove("f156", "rollerblades");

        System.out.println(facility.storageUnits());
    }
}
