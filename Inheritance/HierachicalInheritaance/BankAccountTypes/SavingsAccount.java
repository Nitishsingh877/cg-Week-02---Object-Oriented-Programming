package BankAccountTypes;

public class SavingsAccount extends  BankAccount{

    private double interestRate;
    private double totalBalance;


    public SavingsAccount(double accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;

    }

    public double getTotalBalance() {
        double interest = (super.getBalance()*interestRate)/100;
        return super.getBalance()+interest;
    }

    @Override
    public void displayAccountType() {
        System.out.println("it is saving account type");
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("balance after intreset " + getTotalBalance());
    }
}
