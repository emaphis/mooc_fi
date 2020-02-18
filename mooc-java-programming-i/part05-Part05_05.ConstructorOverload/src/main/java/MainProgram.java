
public class MainProgram {

    public static void main(String[] args) {
        // Test your class here
        Product tapeMeasuer = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement");
        Product tyre = new Product("Tyre", 5);

        System.out.println(tapeMeasuer);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}
