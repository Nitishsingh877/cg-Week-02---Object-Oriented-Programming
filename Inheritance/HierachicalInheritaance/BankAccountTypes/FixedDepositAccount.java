package BankAccountTypes;

public class FixedDepositAccount extends BankAccount {
    private final double FDrate = 8;
    private String accountType;


    public FixedDepositAccount(double accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public double getTotalBalance(){
        return (super.getBalance() + (super.getBalance()*FDrate)/100);

    }

    @Override
    public void displayAccountType() {
        System.out.println("this is fd type account");
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("fd rate is " + FDrate);
        System.out.println("total balance after interest is " + getTotalBalance());
    }
}
