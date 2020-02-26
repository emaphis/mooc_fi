
/**
 *
 * @author emaphis
 */
public class AmusementParkRideDemo2 {

    public static void main(String[] args) {
        // example1();
        //example2();
        example3();
    }

    static void example1() {
        Person2 matti = new Person2("Matti");
        matti.setWeight(86);
        matti.setHeight(180);

        Person2 juhana = new Person2("Juhana");
        juhana.setWeight(34);
        juhana.setHeight(132);

        AmusementParkRide hurjakuru = new AmusementParkRide("Hurjakuru", 140);
        System.out.println(hurjakuru);

        System.out.println();

        if (hurjakuru.allowedToRide(matti)) {
            System.out.println(matti.getName() + " is allowed on the ride");
        } else {
            System.out.println(matti.getName() + " is not allowed on the ride");
        }

        if (hurjakuru.allowedToRide(juhana)) {
            System.out.println(juhana.getName() + " is allowed on the ride");
        } else {
            System.out.println(juhana.getName() + " is not allowed on the ride");
        }

        System.out.println(hurjakuru);
    }

    static void example2() {
        Person2 matti = new Person2("Matti");
        matti.setHeight(180);

        Person2 juhana = new Person2("Juhana");
        juhana.setHeight(132);

        Person2 awak = new Person2("Awak");
        awak.setHeight(194);

        AmusementParkRide2 hurjakuru = new AmusementParkRide2("Hurjakuru", 140);

        hurjakuru.isAllowedOn(matti);
        hurjakuru.isAllowedOn(juhana);
        hurjakuru.isAllowedOn(awak);

        System.out.println(hurjakuru);
        System.out.println(hurjakuru.averageHeightOfPeopleOnRide());
    }

    static void example3() {
        Person2 matti = new Person2("Matti");
        matti.setHeight(180);

        Person2 juhana = new Person2("Juhana");
        juhana.setHeight(132);

        Person2 awak = new Person2("Awak");
        awak.setHeight(194);

        AmusementParkRide2 hurjakuru = new AmusementParkRide2("Hurjakuru", 140);

        hurjakuru.isAllowedOn(matti);
        hurjakuru.isAllowedOn(juhana);
        hurjakuru.isAllowedOn(awak);

        System.out.println(hurjakuru);
        System.out.println(hurjakuru.averageHeightOfPeopleOnRide());

        System.out.println();
        System.out.println(hurjakuru.getTallest().getName());
        Person2 tallest = hurjakuru.getTallest();
        System.out.println(tallest.getName());
    }
}
