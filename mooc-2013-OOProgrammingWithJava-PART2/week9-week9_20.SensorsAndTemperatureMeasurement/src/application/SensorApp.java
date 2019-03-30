
package application;


public class SensorApp {

    static void testConstantSensor() {
        ConstantSensor ten = new ConstantSensor(10);
        ConstantSensor minusFive = new ConstantSensor(-5);

        System.out.println( ten.measure() );
        System.out.println( minusFive.measure() );

        System.out.println( ten.isOn() );
        ten.off();
        System.out.println( ten.isOn() );        
    }

    static void testAverage() {
        Sensor kumpula = new Thermometer();
        kumpula.on();
        System.out.println("the temperature in Kumpula is "+kumpula.measure() + " degrees");

        Sensor kaisaniemi = new Thermometer();
        Sensor helsinkiVantaa = new Thermometer();

        AverageSensor helsinkiArea = new AverageSensor();
        helsinkiArea.addSensor(kumpula);
        helsinkiArea.addSensor(kaisaniemi);
        helsinkiArea.addSensor(helsinkiVantaa);

        helsinkiArea.on();
        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
    }

    static void testAllReadings() {
        Sensor kumpula = new Thermometer();
        Sensor kaisaniemi = new Thermometer();
        Sensor helsinkiVantaa = new Thermometer();

        AverageSensor helsinkiArea = new AverageSensor();
        helsinkiArea.addSensor(kumpula);
        helsinkiArea.addSensor(kaisaniemi);
        helsinkiArea.addSensor(helsinkiVantaa);

        helsinkiArea.on();
        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");

        System.out.println("readings: "+helsinkiArea.readings());
    }


    public static void main(String[] args) {
        //testConstantSensor();
        //testAverage();
        testAllReadings();
    }

}
