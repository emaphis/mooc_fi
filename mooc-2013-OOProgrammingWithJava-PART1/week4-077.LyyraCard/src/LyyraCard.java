
public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    @Override
    public String toString() {
        return "The card has " + balance + " euros";
    }

    public void payEconomical() {
        // write code here
        if (balance >= 2.50)
            balance -= 2.50;
    }

    public void payGourmet() {
        // write code here
        if (balance >= 4.00)
            balance -= 4.00;
    }

    public void loadMoney(double amount) {
        // write code here
        if (amount < 0.0)
            return;

        double newBalance =  balance + amount;
        if (newBalance <= 150.0)
            balance = newBalance;
        else
            balance = 150.0;
    }
}
