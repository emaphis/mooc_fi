
/**
 * Part 5 example
 *
 * @author emaphis
 */
public class AmusementParkRideDemo {

    static void ride() {
        Person2 matt = new Person2("Matt");
        matt.setWeight(180);
        matt.setHeight(180);

        Person2 jasper = new Person2("Jasper");
        jasper.setWeight(34);
        jasper.setHeight(132);

        AmusementParkRide waterSlide = new AmusementParkRide("Watter slide", 140);

        if (waterSlide.allowedToRide(matt)) {
            System.out.println(matt.getName() + " may enter the ride");
        } else {
            System.out.println(matt.getName() + " may not enter the ride");
        }

        if (waterSlide.allowedToRide(jasper)) {
            System.out.println(jasper.getName() + " may enter the ride");
        } else {
            System.out.println(jasper.getName() + " may not enter the ride");
        }

        System.out.println(waterSlide);
    }

    public static void main(String[] args) {
        ride();
    }
}
