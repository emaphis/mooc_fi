
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int newCents = cents + addition.cents();
        int newEuros = euros + addition.euros();
        if (newCents > 100) {
            newEuros++;
            newCents -= 100;
        }

        return new Money(newEuros, newCents);
    }

    public Money minus(Money subtraction) {
        int newCents = cents - subtraction.cents();
        int newEuros = euros - subtraction.euros();
        if (newCents < 0) {
            newEuros--;
            newCents += 100;
        }

        Money newMoney = new Money(newEuros, newCents);
        Money zero = new Money(0, 0);

        if (newMoney.lessThan(zero)) {
            return zero;
        } else {
            return newMoney;
        }
    }

    public boolean lessThan(Money compared) {
        if (euros < compared.euros()) {
            return true;
        }
        if (euros > compared.euros()) {
            return false;
        }

        if (cents < compared.cents()) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
