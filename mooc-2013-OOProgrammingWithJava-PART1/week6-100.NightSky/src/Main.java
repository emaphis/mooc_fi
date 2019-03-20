
public class Main {

    public static void testPrintLine() {
        NightSky nightSky = new NightSky(0.1, 40, 10);
        nightSky.printLine();
    }

    public static void testPrint() {
        NightSky nightSky = new NightSky(8, 4);
        nightSky.print();        
    }

    public static void testCountStars() {
        NightSky NightSky = new NightSky(8, 4);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
     }

    public static void testNightSky() {
        NightSky NightSky = new NightSky(0.1, 40, 10);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky = new NightSky(0.2, 15, 6);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());  
    }

    public static void main(String[] args) {
        // Test your code here
        //testPrintLine();
        //testPrint();
        //testCountStars();
        testNightSky();
    }
}