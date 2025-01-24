package BankAccountTypes;

public class BankAccount {
    private double accountNumber;
    private double balance;


    public BankAccount(double accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayAccountType() {
        System.out.println("genric bank account");
    }

    public void displayAccountDetails(){
        System.out.println("account number is " + accountNumber);
        System.out.println("balance is " + balance);
    }



    public double getBalance() {
        return balance;
    }
}
