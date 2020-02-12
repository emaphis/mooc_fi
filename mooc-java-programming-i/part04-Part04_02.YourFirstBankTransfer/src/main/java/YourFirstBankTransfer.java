
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matti = new Account("Matthews account", 1000);
        Account personal = new Account("My account", 0);
        matti.withdrawal(100.0);
        personal.deposit(100.0);
        System.out.println(matti);
        System.out.println(personal);
    }
}
