package BankAndAccountHolders;

public class Main {
    public static void main(String[] args) {
        Customer Nitish = new Customer("nitish", "20");
        Bank b1 = new Bank();
        b1.openAccount();
        Bank b2 = new Bank();
        b2.openAccount();

        b1.withdrawal(1000);
        b2.deposit(8665);

        Nitish.addAccount(b1);
        Nitish.addAccount(b2);

        Nitish.viewBalance();

    }
}
