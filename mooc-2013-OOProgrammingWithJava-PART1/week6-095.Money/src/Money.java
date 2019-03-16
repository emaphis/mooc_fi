
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int newEuros = this.euros + added.euros;
        int newCents = this.cents + added.cents;

        if (newCents > 100) {
            newEuros++;
            newCents -= 100;
        }

        return new Money(newEuros, newCents);
    }

    public boolean less(Money compared) {
        if (euros < compared.euros) {
            return true;
        } else if (euros == compared.euros && cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decremented) {
        int newEuros = this.euros - decremented.euros;
        int newCents = this.cents - decremented.cents;

        if (newCents < 0) {
            newEuros--;
            newCents += 100;
        }
    
        // if negative return zero
        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }

        return new Money(newEuros, newCents);
    }
}
