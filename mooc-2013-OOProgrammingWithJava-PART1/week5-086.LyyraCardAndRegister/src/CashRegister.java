
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000.0;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        double price = 2.50;
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        if (cashGiven >= price) {
            economicalSold++;
            cashInRegister += price;
            return cashGiven - price;
        }

        // if not enough money given, all is returned and nothing else happens        
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        double price = 4.00;
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price
        if (cashGiven >= price) {
            gourmetSold++;
            cashInRegister += price;
            return cashGiven - price;
        } 
        // if not enough money given, all is returned and nothing else happens
        return cashGiven;
    }
    
    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        double price = 2.50;
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        if (card.balance() >= price) {
            economicalSold++;
            card.pay(price);
            return true;
        }

        // if not, the method returns false
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        double price = 4.00;
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        if (card.balance() >= price) {
            gourmetSold++;
            card.pay(price);
            return true;
        }

        // if not, the method returns false
        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            cashInRegister += sum;
            card.loadMoney(sum);
        }
    }

    @Override
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
