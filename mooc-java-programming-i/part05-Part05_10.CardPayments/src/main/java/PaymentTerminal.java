
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment < 2.50) return payment;
        affordableMeals++;
        money += 2.50;
        return payment - 2.50;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment < 4.30) return payment;
        heartyMeals++;
        money += 4.30;
        return payment - 4.30;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() < 2.50) return false;
        affordableMeals++;
        card.takeMoney(2.50);
        return true;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() < 4.30) return false;
        heartyMeals++;
        card.takeMoney(4.30);
        return true;
    }

     public void addMoneyToCard(PaymentCard card, double summa) {
         if (summa > money || summa < 0) return;
         card.addMoney(summa);
         money += summa;
     }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
