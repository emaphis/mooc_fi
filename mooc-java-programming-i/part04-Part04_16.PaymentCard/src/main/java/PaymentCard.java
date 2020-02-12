
public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public void eatAffordably() {
        if (balance >= 2.60) {
            balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (balance >= 4.60) {
            balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if (amount < 0) return;
        balance += amount;
        if (balance > 150.0) {
            balance = 150.0;
        }
    }

    @Override
    public String toString() {
        return "the card has a balance of " + balance + " euros";
    }

}
