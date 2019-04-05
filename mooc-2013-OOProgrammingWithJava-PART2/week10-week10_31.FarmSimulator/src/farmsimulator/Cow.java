
package farmsimulator;

import java.util.Random;


public class Cow implements Milkable, Alive {
    private String name;
    private double capacity;
    private double amount;
    private Random rand;

    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        rand = new Random();
        this.name = genName();
        this.capacity = genCapacity();
        this.amount = 0.0;
    }

    public Cow(String name) {
        rand = new Random();
        this.name = name;
        this.capacity = genCapacity();
        this.amount = 0.0;
    }

    private int genCapacity() {
        return 15 + rand.nextInt(25);
    }
    
    private String genName() {
        int index = 0 + rand.nextInt(NAMES.length);
        return NAMES[index];
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return name + " "  + Math.ceil(amount) + "/" + Math.ceil(capacity); 
    }

    @Override
    public double milk() {
        double amt = amount;
        amount = 0.0;
        return amt;
    }

    @Override
    public void liveHour() {
        double add = rand.nextDouble() * (2.0 - 0.7) + 0.7;
        if (amount + add > capacity) {
            amount = capacity;
        } else {
            amount += add;
        }
    }

}
